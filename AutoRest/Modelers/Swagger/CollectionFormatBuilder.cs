﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System;
using System.Diagnostics;
using System.Text;
using Microsoft.Rest.Generator.ClientModel;
using Microsoft.Rest.Modeler.Swagger.Model;
using Microsoft.Rest.Modeler.Swagger.Properties;
using ParameterLocation = Microsoft.Rest.Modeler.Swagger.Model.ParameterLocation;

namespace Microsoft.Rest.Modeler.Swagger
{
    public class CollectionFormatBuilder
    {
        public StringBuilder OnBuildMethodParameter(Method method,
            SwaggerParameter currentSwaggerParam,
            StringBuilder paramNameBuilder)
        {
            bool hasCollectionFormat = currentSwaggerParam.CollectionFormat != CollectionFormat.None;

            if (currentSwaggerParam.Type == DataType.Array && !hasCollectionFormat)
            {
                // If the parameter type is array default the collectionFormat to csv
                currentSwaggerParam.CollectionFormat = CollectionFormat.Csv;
            }

            if (hasCollectionFormat)
            {
                AddCollectionFormat(currentSwaggerParam, paramNameBuilder);
                if (currentSwaggerParam.In == ParameterLocation.Path)
                {
                    method.Url = method.Url.Replace(
                        string.Format("{0}", currentSwaggerParam.Name),
                        string.Format("{0}", paramNameBuilder));
                }
            }
            return paramNameBuilder;
        }

        private void AddCollectionFormat(SwaggerParameter swaggerParameter, StringBuilder parameterName)
        {
            if (swaggerParameter.In == ParameterLocation.FormData)
            {
                // http://vstfrd:8080/Azure/RD/_workitems/edit/3172874
                throw new NotImplementedException();
            }

            //Debug.Assert(!string.IsNullOrEmpty(swaggerParameter.CollectionFormat));
            Debug.Assert(swaggerParameter.CollectionFormat != CollectionFormat.None);
            parameterName.Append(":");

            switch (swaggerParameter.CollectionFormat)
            {
                case CollectionFormat.Csv:
                    parameterName.Append("commaSeparated");
                    break;

                case CollectionFormat.Pipes:
                    parameterName.Append("pipeSeparated");
                    break;

                case CollectionFormat.Ssv:
                    parameterName.Append("spaceSeparated");
                    break;

                case CollectionFormat.Tsv:
                    parameterName.Append("tabSeparated");
                    break;

                case CollectionFormat.Multi:
                    // TODO multi is not supported yet: http://vstfrd:8080/Azure/RD/_workitems/edit/3172867
                    throw new NotSupportedException(string.Format(Resources.MultiCollectionFormatNotSupported,
                        swaggerParameter.Name));
                default:
                    throw new ArgumentException(string.Format(Resources.InvalidCollectionFormat,
                        swaggerParameter.CollectionFormat, swaggerParameter.Name));
            }
        }
    }
}