/**
 *
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 *
 */

package com.microsoft.rest;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.reflect.FieldUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

import javax.xml.ws.Service;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

/**
 * ServiceClient is the abstraction for accessing REST operations and their payload data types.
 */
public class Validator {
    public static void validate(Object parameter) throws ServiceException {
        // Validation of top level payload is done outside
        if (parameter == null) {
            return;
        }

        Field[] fields = FieldUtils.getAllFields(parameter.getClass());
        for (Field field : fields) {
            field.setAccessible(true);
            JsonProperty annotation = field.getAnnotation(JsonProperty.class);
            Object property = null;
            try {
                property = field.get(parameter);
            } catch (IllegalAccessException e) {
                throw new ServiceException(e);
            }
            if (property == null) {
                if (annotation != null && annotation.required()) {
                    throw new ServiceException(
                            new IllegalArgumentException(field.getName() + " is required and cannot be null."));
                }
            } else {
                try {
                    Class propertyType = property.getClass();
                    if (ClassUtils.isAssignable(propertyType, List.class)) {
                        List<?> items = (List<?>)property;
                        for (Object item : items) {
                            Validator.validate(item);
                        }
                    }
                    if (ClassUtils.isAssignable(propertyType, Map.class)) {
                        Map<?, ?> entries = (Map<?, ?>)property;
                        for (Map.Entry<?, ?> entry : entries.entrySet()) {
                            Validator.validate(entry.getKey());
                            Validator.validate(entry.getValue());
                        }
                    }
                    else if (!(ClassUtils.isPrimitiveOrWrapper(propertyType) ||
                            propertyType.isEnum() ||
                            ClassUtils.isAssignable(propertyType, LocalDate.class) ||
                            ClassUtils.isAssignable(propertyType, DateTime.class) ||
                            ClassUtils.isAssignable(propertyType, String.class))) {
                        Validator.validate(property);
                    }
                } catch (ServiceException ex) {
                    IllegalArgumentException cause = (IllegalArgumentException)(ex.getCause());
                    if (cause != null) {
                        // Build property chain
                        throw new ServiceException(
                                new IllegalArgumentException(field.getName() + "." + cause.getMessage()));
                    } else {
                        throw ex;
                    }
                }
            }
        }
    }

    public static void validate(Object parameter, ServiceCallback<?> serviceCallback) {
        try {
            validate(parameter);
        } catch (ServiceException ex) {
            serviceCallback.failure(ex);
        }
    }
}
