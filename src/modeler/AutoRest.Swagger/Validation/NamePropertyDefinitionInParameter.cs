﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using AutoRest.Swagger.Validation.Core;
using AutoRest.Core.Properties;
using AutoRest.Swagger.Model;
using AutoRest.Core.Logging;
using System;

namespace AutoRest.Swagger.Validation
{
    public class NamePropertyDefinitionInParameter : TypedRule<SwaggerParameter>
    {
        /// <summary>
        /// Id of the Rule.
        /// </summary>
        public override string Id => "R2047";

        /// <summary>
        /// Violation category of the Rule.
        /// </summary>
        public override ValidationCategory ValidationCategory => ValidationCategory.SDKViolation;

        /// <summary>
        /// The template message for this Rule. 
        /// </summary>
        /// <remarks>
        /// This may contain placeholders '{0}' for parameterized messages.
        /// </remarks>
        public override string MessageTemplate => Resources.ParametersPropertiesValidation;

        /// <summary>
        /// The severity of this message (ie, debug/info/warning/error/fatal, etc)
        /// </summary>
        public override Category Severity => Category.Error;

        /// <summary>
        /// What kind of open api document type this rule should be applied to
        /// </summary>
        public override ServiceDefinitionDocumentType ServiceDefinitionDocumentType => ServiceDefinitionDocumentType.Default;

        /// <summary>
        /// The rule could be violated by a parameter referenced by many jsons belonging to the same
        /// composed state, to reduce duplicate messages, run validation rule in composed state
        /// </summary>
        public override ServiceDefinitionDocumentState ValidationRuleMergeState => ServiceDefinitionDocumentState.Composed;

        /// <summary>
        /// Validates if the swagger parameter has the "name" property set
        /// </summary>
        /// <param name="swaggerParameter"></param>
        /// <returns></returns>
        public override bool IsValid(SwaggerParameter swaggerParameter) 
            => !string.IsNullOrWhiteSpace(swaggerParameter.Reference) || !string.IsNullOrWhiteSpace(swaggerParameter.Name);
    }
}
