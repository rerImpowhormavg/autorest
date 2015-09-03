﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System;
using System.Collections.Generic;
using System.Linq;
using Microsoft.Rest.Generator.ClientModel;
using Microsoft.Rest.Generator.NodeJS.TemplateModels;
using Microsoft.Rest.Generator.Utilities;
using System.Globalization;

namespace Microsoft.Rest.Generator.NodeJS
{
    public class ModelTemplateModel : CompositeType
    {
        private readonly IScopeProvider _scope = new ScopeProvider();
        private ModelTemplateModel _parent = null;
        
        public ModelTemplateModel(CompositeType source, ServiceClient serviceClient)
        {
            this.LoadFrom(source);
            ServiceClient = serviceClient;
            if(source.BaseModelType != null)
            {
                _parent = new ModelTemplateModel(source.BaseModelType, serviceClient);
            }
        }

        public IScopeProvider Scope
        {
            get { return _scope; }
        }

        public ServiceClient ServiceClient { get; set; }

        public virtual IEnumerable<string> Usings
        {
            get { return Enumerable.Empty<string>(); }
        }

        public IEnumerable<Property> ComposedProperties
        {
            get
            {
                if(this._parent != null)
                {
                    return _parent.ComposedProperties
                                  .Union(this.Properties);
                }
                return this.Properties;
            }
        }

        public bool IsPolymorphic
        {
            get
            {
                if(!string.IsNullOrEmpty(this.PolymorphicDiscriminator))
                {
                    return true;
                }
                else if(this._parent != null)
                {
                    return _parent.IsPolymorphic;
                }

                return false;
            }
        }

        public bool ContainsPropertiesInSequenceType()
        {
            var sample = ComposedProperties.FirstOrDefault(p => p.Type is SequenceType);
            return sample != null;
        }

        public bool ContainsPropertiesInCompositeType()
        {
            var sample = ComposedProperties.FirstOrDefault(p => 
                p.Type is CompositeType || p.Type is SequenceType && (p.Type as SequenceType).ElementType is CompositeType);
            return sample != null;
        }

        public string InitializeProperty(string objectName, string valueName, Property property)
        {
            if (property == null || property.Type == null)
            {
                throw new ArgumentNullException("property");
            }

            return property.Type.InitializeType(_scope, objectName + "." + property.Name, valueName + "." + property.SerializedName);
        }

        public string SerializeProperty(string objectName, string serializedName, Property property)
        {
            if (property == null || property.Type == null)
            {
                throw new ArgumentNullException("property");
            }

            var propertyName = string.Format(CultureInfo.InvariantCulture, 
                "{0}['{1}']", objectName, property.Name);
            var serializedPropertyName = string.Format(CultureInfo.InvariantCulture,
                "{0}['{1}']", serializedName, property.SerializedName.Replace(".", "']['"));

            return property.Type.SerializeType(_scope, propertyName, serializedPropertyName, property.IsRequired, "models");
        }

        public string DeserializeProperty(string objectName, string valueName, Property property)
        {
            if (property == null || property.Type == null)
            {
                throw new ArgumentNullException("property");
            }

            return property.Type.DeserializeType(_scope, objectName + "." + property.Name, valueName + "." + property.SerializedName, "models");
        }

        /// <summary>
        /// Returns list of properties that needs to be explicitly deserializes for a model.
        /// </summary>
        public IEnumerable<Property> SpecialProperties
        {
            get
            {
                foreach (var property in ComposedProperties)
                {
                    if (isSpecial(property.Type))
                    {
                        yield return property;
                    }
                }
            }
        }

        private bool isSpecial(IType type)
        {
            if (type == PrimaryType.DateTime || type == PrimaryType.Date || type == PrimaryType.ByteArray || type is CompositeType)
            {
                return true;
            }
            else if (type is SequenceType)
            {
                return isSpecial(((SequenceType)type).ElementType);
            }
            else if (type is DictionaryType)
            {
                return isSpecial(((DictionaryType)type).ValueType);
            }
            return false;
        }

        /// <summary>
        /// Provides the property name in the correct jsdoc notation depending on 
        /// whether it is required or optional
        /// </summary>
        /// <param name="property">Parameter to be documented</param>
        /// <returns>Parameter name in the correct jsdoc notation</returns>
        public static string GetPropertyDocumentationName(Property property)
        {
            if (property == null)
            {
                throw new ArgumentNullException("property");
            }
            if (property.IsRequired)
            {
                return property.Name;
            }
            else
            {
                return string.Format(CultureInfo.InvariantCulture, "[{0}]", property.Name);
            }
        }

        /// <summary>
        /// Provides the type of the property
        /// </summary>
        /// <param name="property">Parameter to be documented</param>
        /// <returns>Parameter name in the correct jsdoc notation</returns>
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Globalization", "CA1308:NormalizeStringsToUppercase")]
        public static string GetPropertyDocumentationType(Property property)
        {
            if (property == null)
            {
                throw new ArgumentNullException("property");
            }
            string typeName = PrimaryType.Object.Name;
            if (property.Type is PrimaryType)
            {
                typeName = property.Type.Name;
            }
            else if (property.Type is SequenceType)
            {
                typeName = "array";
            }
            else if (property.Type is EnumType)
            {
                typeName = PrimaryType.String.Name;
            }

            return typeName.ToLower(CultureInfo.InvariantCulture);
        }
    }
}