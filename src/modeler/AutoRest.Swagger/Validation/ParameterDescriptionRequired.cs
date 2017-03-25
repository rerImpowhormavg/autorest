﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using AutoRest.Swagger.Model;
using AutoRest.Swagger.Validation.Core;

namespace AutoRest.Swagger.Validation
{
    public class ParameterDescriptionRequired : DescriptionRequired<SwaggerParameter>
    {
        private static readonly string ParameterTypeFormatter = "'{0}' parameter";

        /// <summary>
        /// This rule fails if the description is null and the reference is null (since the reference could have a description)
        /// </summary>
        /// <param name="entity">Entity being validated</param>
        /// <param name="context">Rule context</param>
        /// <param name="formatParameters">formatted parameters</param>
        /// <returns><c>true</c> if entity contains description, <c>false</c> otherwise</returns>
        public override bool IsValid(SwaggerParameter entity, RuleContext context, out object[] formatParameters)
        {
            formatParameters = new string[] { string.Format(ParameterTypeFormatter, entity.Name) };
            return !string.IsNullOrWhiteSpace(entity.Description) || !string.IsNullOrWhiteSpace(entity.Reference);
        }
    }
}
