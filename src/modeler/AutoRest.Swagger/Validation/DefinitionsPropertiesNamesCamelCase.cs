﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;
using AutoRest.Core.Logging;
using AutoRest.Core.Properties;
using AutoRest.Swagger.Validation.Core;
using AutoRest.Swagger.Model;
using AutoRest.Swagger.Model.Utilities;

namespace AutoRest.Swagger.Validation
{
    /// <summary>
    /// Property names must be camelCase style
    /// </summary>
    public class DefinitionsPropertiesNamesCamelCase : TypedRule<Dictionary<string, Schema>>
    {

        /// <summary>
        /// Id of the Rule.
        /// </summary>
        public override string Id => "M3016";

        /// <summary>
        /// Violation category of the Rule.
        /// </summary>
        public override ValidationCategory ValidationCategory => ValidationCategory.RPCViolation;

        /// <summary>;
        /// The template message for this Rule. 
        /// </summary>
        /// <remarks>
        /// This may contain placeholders '{0}' for parameterized messages.
        /// </remarks>
        public override string MessageTemplate => Resources.DefinitionsPropertiesNameCamelCase;

        /// <summary>
        /// The severity of this message (ie, debug/info/warning/error/fatal, etc)
        /// </summary>
        public override Category Severity => Category.Error;

        /// <summary>
        /// Validates whether property names are camelCase for definitions.
        /// </summary>
        public override IEnumerable<ValidationMessage> GetValidationMessages(Dictionary<string, Schema> definitions, RuleContext context)
        {
            foreach (KeyValuePair<string, Schema> definition in definitions)
            {
                if (definition.Value.Properties != null)
                {
                    foreach (KeyValuePair<string, Schema> prop in definition.Value.Properties)
                    {
                        if (!ValidationUtilities.isNameCamelCase(prop.Key))
                        {
                            yield return new ValidationMessage(new FileObjectPath(context.File, context.Path), this, prop.Key, definition.Key, ValidationUtilities.ToCamelCase(prop.Key));
                        }
                    }
                }
            }
        }
    }
}