﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using Microsoft.Rest.Generator.AzureResourceSchema;
using Microsoft.Rest.Generator.ClientModel;
using System;
using System.Collections.Generic;
using System.Linq;
using Xunit;

namespace AutoRest.Generator.AzureResourceSchema.Tests
{
    public class ResourceSchemaParserTests
    {
        [Fact]
        public void ParseWithNullServiceClient()
        {
            Assert.Throws<ArgumentNullException>(() => { ResourceSchemaParser.Parse(null); });
        }

        [Fact]
        public void ParseWithEmptyServiceClient()
        {
            ServiceClient serviceClient = new ServiceClient();
            IDictionary<string, ResourceSchema> schemas = ResourceSchemaParser.Parse(serviceClient);
            Assert.NotNull(schemas);
            Assert.Equal(0, schemas.Count);
        }

        [Fact]
        public void ParseWithServiceClientWithCreateResourceMethod()
        {
            ServiceClient serviceClient = new ServiceClient();

            Parameter body = new Parameter()
            {
                Location = ParameterLocation.Body,
                Type = new CompositeType(),
            };

            CompositeType responseBody = new CompositeType();
            responseBody.Extensions.Add("x-ms-azure-resource", true);

            const string url = "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Mock.Provider/mockResourceNames/{mockResourceName}";

            Method method = CreateMethod(body: body, responseBody: responseBody, url: url);

            serviceClient.Methods.Add(method);

            IDictionary<string, ResourceSchema> schemas = ResourceSchemaParser.Parse(serviceClient);
            Assert.NotNull(schemas);
            Assert.Equal(1, schemas.Count);

            ResourceSchema schema = schemas["Mock.Provider"];
            Assert.Null(schema.Id);
            Assert.Equal("http://json-schema.org/draft-04/schema#", schema.Schema);
            Assert.Equal("Mock.Provider", schema.Title);
            Assert.Equal("Mock Provider Resource Types", schema.Description);
            Assert.Equal(1, schema.ResourceDefinitions.Count);
            Assert.Equal("mockResourceNames", schema.ResourceDefinitions.Keys.Single());
            Assert.Equal(
                new JsonSchema()
                {
                    JsonType = "object",
                    Description = "Mock.Provider/mockResourceNames"
                }
                .AddProperty("type", new JsonSchema()
                    {
                        JsonType = "string"
                    }
                    .AddEnum("Mock.Provider/mockResourceNames"),
                    true),
                schema.ResourceDefinitions["mockResourceNames"]);
            Assert.NotNull(schema.Definitions);
            Assert.Equal(0, schema.Definitions.Count);
        }

        [Fact]
        public void IsCreateResourceMethodWithNullMethod()
        {
            Assert.Throws<ArgumentNullException>(() => { ResourceSchemaParser.IsCreateResourceMethod(null); });
        }

        [Fact]
        public void IsCreateResourceMethodWithGetHttpMethod()
        {
            Assert.False(ResourceSchemaParser.IsCreateResourceMethod(CreateMethod(HttpMethod.Get)));
        }

        [Fact]
        public void IsCreateResourceMethodWithNoBody()
        {
            Assert.False(ResourceSchemaParser.IsCreateResourceMethod(CreateMethod()));
        }

        [Fact]
        public void IsCreateResourceMethodNoReturnType()
        {
            Assert.False(ResourceSchemaParser.IsCreateResourceMethod(CreateMethod(body: new Parameter()
            {
                Location = ParameterLocation.Body
            })));
        }

        [Fact]
        public void IsCreateResourceMethodWithNonResourceReturnType()
        {
            Assert.False(ResourceSchemaParser.IsCreateResourceMethod(CreateMethod(
                body: new Parameter()
                {
                    Location = ParameterLocation.Body
                },
                responseBody: new PrimaryType(KnownPrimaryType.Int))));
        }

        [Fact]
        public void IsCreateResourceMethodWithCompositeNonResourceReturnType()
        {
            Assert.False(ResourceSchemaParser.IsCreateResourceMethod(CreateMethod(
                body: new Parameter()
                {
                    Location = ParameterLocation.Body
                },
                responseBody: new CompositeType())));
        }

        [Fact]
        public void IsCreateResourceMethodWithResourceReturnTypeButNoUrl()
        {
            CompositeType responseBody = new CompositeType();
            responseBody.Extensions.Add("x-ms-azure-resource", true);

            Assert.False(ResourceSchemaParser.IsCreateResourceMethod(CreateMethod(
                body: new Parameter()
                {
                    Location = ParameterLocation.Body
                },
                responseBody: responseBody)));
        }



        [Fact]
        public void IsCreateResourceMethodWithResourceReturnTypeAndUrl()
        {
            CompositeType responseBody = new CompositeType();
            responseBody.Extensions.Add("x-ms-azure-resource", true);

            Assert.True(ResourceSchemaParser.IsCreateResourceMethod(CreateMethod(
                body: new Parameter()
                {
                    Location = ParameterLocation.Body
                },
                responseBody: responseBody,
                url: "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Mock.Provider/mockResourceNames/{mockResourceName}")));
        }

        [Fact]
        public void IsCreateResourceMethodWhenUrlDoesntEndWithResourceNamePlaceholder()
        {
            CompositeType responseBody = new CompositeType();
            responseBody.Extensions.Add("x-ms-azure-resource", true);

            Assert.False(ResourceSchemaParser.IsCreateResourceMethod(CreateMethod(
                body: new Parameter()
                {
                    Location = ParameterLocation.Body
                },
                responseBody: responseBody,
                url: "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/sites/{name}/config/slotConfigNames")));
        }

        [Fact]
        public void GetResourceTypeWithOneLevelOfResources()
        {
            Assert.Equal("Microsoft.Cdn/profiles", ResourceSchemaParser.GetResourceType("Microsoft.Cdn", "profiles/{profileName}"));
        }

        [Fact]
        public void GetResourceTypeWithMultipleLevelsOfResources()
        {
            Assert.Equal("Microsoft.Cdn/profiles/endpoints/customDomains", ResourceSchemaParser.GetResourceType("Microsoft.Cdn", "profiles/{profileName}/endpoints/{endpointName}/customDomains/{customDomainName}"));
        }

        private static Method CreateMethod(HttpMethod httpMethod = HttpMethod.Put, Parameter body = null, IType responseBody = null, string url = null)
        {
            Method method = new Method()
            {
                HttpMethod = httpMethod,
                ReturnType = new Response(responseBody, null),
                Url = url,
            };
            method.Parameters.Add(body);

            return method;
        }
    }
}
