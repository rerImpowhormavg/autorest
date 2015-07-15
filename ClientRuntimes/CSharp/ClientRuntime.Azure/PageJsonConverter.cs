﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System;
using System.Globalization;
using System.Linq;
using System.Reflection;
using Microsoft.Rest.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Linq;
using Newtonsoft.Json.Serialization;

namespace Microsoft.Azure
{
    /// <summary>
    /// JsonConverter that provides custom serialization for resource-based objects.
    /// </summary>
    public class PageJsonConverter : JsonConverter
    {
        private const string PropertiesNode = "properties";

        /// <summary>
        /// Returns true if the object being serialized is assignable from the Resource type. False otherwise.
        /// </summary>
        /// <param name="objectType">The type of the object to check.</param>
        /// <returns>True if the object being serialized is assignable from the base type. False otherwise.</returns>
        public override bool CanConvert(Type objectType)
        {
            return objectType.IsGenericType && objectType.GetGenericTypeDefinition() == typeof(Page<>);
        }

        /// <summary>
        /// Deserializes an object from a JSON string and flattens out Properties.
        /// </summary>
        /// <param name="reader">The JSON reader.</param>
        /// <param name="objectType">The type of the object.</param>
        /// <param name="existingValue">The existing value.</param>
        /// <param name="serializer">The JSON serializer.</param>
        /// <returns></returns>
        public override object ReadJson(JsonReader reader,
            Type objectType, object existingValue, JsonSerializer serializer)
        {
            if (reader == null)
            {
                throw new ArgumentNullException("reader");
            }
            if (objectType == null)
            {
                throw new ArgumentNullException("objectType");
            }
            if (serializer == null)
            {
                throw new ArgumentNullException("serializer");
            }

            try
            {

                // Initialize appropriate type instance
                //var result = Activator.CreateInstance(objectType);
                //var obj = serializer.Deserialize<JToken>(reader);
                var jObject = new JObject();
                var result = jObject.ToObject(objectType, serializer);
                return null;
            }
            catch (JsonException)
            {
                return null;
            }
        }

        /// <summary>
        /// Serializes an object into a JSON string adding Properties. 
        /// </summary>
        /// <param name="writer">The JSON writer.</param>
        /// <param name="value">The value to serialize.</param>
        /// <param name="serializer">The JSON serializer.</param>
        public override void WriteJson(JsonWriter writer,
            object value, JsonSerializer serializer)
        {
            throw new NotImplementedException();
        }

        /// <summary>
        /// Gets a JsonSerializer without current converter.
        /// </summary>
        /// <param name="serializer">JsonSerializer</param>
        /// <returns></returns>
        protected JsonSerializer GetSerializerWithoutCurrentConverter(JsonSerializer serializer)
        {
            if (serializer == null)
            {
                throw new ArgumentNullException("serializer");
            }
            JsonSerializer newSerializer = new JsonSerializer();
            PropertyInfo[] properties = typeof(JsonSerializer).GetProperties();
            foreach (var property in properties.Where(p => p.GetSetMethod() != null))
            {
                property.SetValue(newSerializer, property.GetValue(serializer, null), null);
            }
            foreach (var converter in serializer.Converters)
            {
                if (converter != this)
                {
                    newSerializer.Converters.Add(converter);
                }
            }
            return newSerializer;
        }
    }
}