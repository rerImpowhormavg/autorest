﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.
// 

using AutoRest.Core.Logging;
using AutoRest.Core.Properties;
using AutoRest.Swagger.Model;
using AutoRest.Swagger.Validation.Core;

namespace AutoRest.Swagger.Validation
{
    public class ValidFormats : TypedRule<string>
    {
        /// <summary>
        /// Id of the Rule.
        /// </summary>
        public override string Id => "R2003";

        /// <summary>
        /// Violation category of the Rule.
        /// </summary>
        public override ValidationCategory ValidationCategory => ValidationCategory.SDKViolation;

        /// <summary>
        /// What kind of open api document type this rule should be applied to
        /// </summary>
        public override ServiceDefinitionDocumentType ServiceDefinitionDocumentType => ServiceDefinitionDocumentType.ARM | ServiceDefinitionDocumentType.DataPlane;

        /// <summary>
        /// The rule could be violated by a porperty of a model referenced by many jsons belonging to the same
        /// composed state, to reduce duplicate messages, run validation rule in composed state
        /// </summary>
        public override ServiceDefinitionDocumentState ValidationRuleMergeState => ServiceDefinitionDocumentState.Composed;

        /// <summary>
        /// An <paramref name="entity" /> fails this rule if it has a format that we can't handle
        /// </summary>
        /// <param name="entity"></param>
        /// <returns></returns>
        public override bool IsValid(string format, RuleContext context, out object[] formatParams)
        {
            var swaggerObject = (context.Parent?.Value as SwaggerObject);
            var knownFormat = swaggerObject?.KnownFormat;

            if(knownFormat != null && knownFormat == AutoRest.Core.Model.KnownFormat.unknown)
            {
                formatParams = new string[] { swaggerObject?.Format };
                return false;
            }

            formatParams = new object[0];
            return true;
        }

        /// <summary>
        ///     The template message for this Rule.
        /// </summary>
        /// <remarks>
        ///     This may contain placeholders '{0}' for parameterized messages.
        /// </remarks>
        public override string MessageTemplate => Resources.UnknownFormat;

        /// <summary>
        ///     The severity of this message (ie, debug/info/warning/error/fatal, etc)
        /// </summary>
        public override Category Severity => Category.Error;
    }
}