/**
 *
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 *
 */

package com.microsoft.rest.serializer;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import com.microsoft.rest.BaseResource;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Custom serializer for serializing {@link BaseResource} with wrapped properties.
 * For example, a property with annotation @JsonProperty(value = "properties.name")
 * will be mapped from a top level "name" property in the POJO model to
 * {'properties' : { 'name' : 'my_name' }} in the serialized payload.
 */
public class FlatteningSerializer<T> extends StdSerializer<T> implements ResolvableSerializer {
    private final JsonSerializer<?> defaultSerializer;

    protected FlatteningSerializer(Class<T> vc, JsonSerializer<?> defaultDeserializer) {
        super(vc);
        this.defaultSerializer = defaultDeserializer;
    }

    public static SimpleModule getModule() {
        SimpleModule module = new SimpleModule();
        module.setSerializerModifier(new BeanSerializerModifier() {
            @Override
            public JsonSerializer<?> modifySerializer(SerializationConfig config, BeanDescription beanDesc, JsonSerializer<?> serializer) {
                if (BaseResource.class.isAssignableFrom(beanDesc.getBeanClass()) && BaseResource.class != beanDesc.getBeanClass())
                    return new FlatteningSerializer<BaseResource>(BaseResource.class, serializer);
                return serializer;
            }
        });
        return module;
    }

    @Override
    public void serialize(T value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonGenerationException {
        if (value == null) {
            jgen.writeNull();
            return;
        }

        // BFS for all collapsed properties
        ObjectMapper mapper = new JacksonUtils().getObjectMapper();
        ObjectNode root = mapper.valueToTree(value);
        ObjectNode res = root.deepCopy();
        Queue<ObjectNode> source = new LinkedBlockingQueue<ObjectNode>();
        Queue<ObjectNode> target = new LinkedBlockingQueue<ObjectNode>();
        source.add(root);
        target.add(res);
        while (!source.isEmpty()) {
            ObjectNode current = source.poll();
            ObjectNode resCurrent = target.poll();
            Iterator<Map.Entry<String, JsonNode>> fields = current.fields();
            while (fields.hasNext()) {
                Map.Entry<String, JsonNode> field = fields.next();
                ObjectNode node = resCurrent;
                JsonNode outNode = resCurrent.get(field.getKey());
                if (field.getKey().contains(".")) {
                    String[] values = field.getKey().split("\\.");
                    for (int i = 0; i < values.length - 1; ++i) {
                        String val = values[i];
                        if (node.has(val)) {
                            node = (ObjectNode)node.get(val);
                        } else {
                            ObjectNode child = new ObjectNode(JsonNodeFactory.instance);
                            node.put(val, child);
                            node = child;
                        }
                    }
                    node.set(values[values.length - 1], resCurrent.get(field.getKey()));
                    resCurrent.remove(field.getKey());
                    outNode = node.get(values[values.length - 1]);
                }
                if (field.getValue() instanceof ObjectNode) {
                    source.add((ObjectNode)field.getValue());
                    target.add((ObjectNode)outNode);
                } else if (field.getValue() instanceof ArrayNode &&
                    (field.getValue()).size() > 0 &&
                    (field.getValue()).get(0) instanceof ObjectNode) {
                    Iterator<JsonNode> sourceIt = field.getValue().elements();
                    Iterator<JsonNode> targetIt = outNode.elements();
                    while (sourceIt.hasNext()) {
                        source.add((ObjectNode)sourceIt.next());
                        target.add((ObjectNode)targetIt.next());
                    }
                }
            }
        }
        jgen.writeTree(res);
    }

    @Override
    public void resolve(SerializerProvider provider) throws JsonMappingException {
        ((ResolvableSerializer) defaultSerializer).resolve(provider);
    }
}
