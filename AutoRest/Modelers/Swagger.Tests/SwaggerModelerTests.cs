﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net;
using Microsoft.Rest.Generator;
using Microsoft.Rest.Generator.ClientModel;
using Xunit;

namespace Microsoft.Rest.Modeler.Swagger.Tests
{
    [Collection("AutoRest Tests")]
    public class SwaggerModelerTests
    {
        [Fact]
        public void TestClientModelFromSimpleSwagger()
        {
            Generator.Modeler modeler = new SwaggerModeler(new Settings
            {
                Namespace = "Test",
                Input = Path.Combine("Swagger", "swagger-simple-spec.json")
            });
            var clientModel = modeler.Build();

            var description = "The Products endpoint returns information about the Uber products offered at a given location. The response includes the display name and other details about each product, and lists the products in the proper display order.";
            var summary = "Product Types";

            Assert.NotNull(clientModel);
            Assert.Equal(2, clientModel.Properties.Count);
            Assert.True(clientModel.Properties.Any(p => p.Name.Equals("subscriptionId", StringComparison.OrdinalIgnoreCase)));
            Assert.True(clientModel.Properties.Any(p => p.Name.Equals("apiVersion", StringComparison.OrdinalIgnoreCase)));
            Assert.Equal("2014-04-01-preview", clientModel.ApiVersion);
            Assert.Equal("https://management.azure.com/", clientModel.BaseUrl);
            Assert.Equal("Some cool documentation.", clientModel.Documentation);
            Assert.Equal(0, clientModel.Methods.Count(m => m.Group != null));
            Assert.Equal(2, clientModel.Methods.Count);
            Assert.Equal("list", clientModel.Methods[0].Name);
            Assert.NotEmpty(clientModel.Methods[0].Description);
            Assert.Equal(description, clientModel.Methods[0].Description);
            Assert.NotEmpty(clientModel.Methods[0].Summary);
            Assert.Equal(summary, clientModel.Methods[0].Summary);
            Assert.Equal(HttpMethod.Get, clientModel.Methods[0].HttpMethod);
            Assert.Equal(3, clientModel.Methods[0].Parameters.Count);
            Assert.Equal("subscriptionId", clientModel.Methods[0].Parameters[0].Name);
            Assert.NotNull(clientModel.Methods[0].Parameters[0].ClientProperty);
            Assert.Equal("resourceGroupName", clientModel.Methods[0].Parameters[1].Name);
            Assert.Equal("resourceGroupName", clientModel.Methods[0].Parameters[1].SerializedName);
            Assert.Equal("Resource Group ID.", clientModel.Methods[0].Parameters[1].Documentation);
            Assert.Equal(true, clientModel.Methods[0].Parameters[0].IsRequired);
            Assert.Equal(ParameterLocation.Path, clientModel.Methods[0].Parameters[0].Location);
            Assert.Equal("String", clientModel.Methods[0].Parameters[0].Type.ToString());
            Assert.Equal("reset", clientModel.Methods[1].Name);
            Assert.Equal("Product", clientModel.ModelTypes.First(m=>m.Name == "Product").Name);
            Assert.Equal("Product", clientModel.ModelTypes.First(m => m.Name == "Product").SerializedName);
            Assert.Equal("The product documentation.", clientModel.ModelTypes.First(m => m.Name == "Product").Documentation);
            Assert.Equal("product_id", clientModel.ModelTypes.First(m=>m.Name == "Product").Properties[0].Name);
            Assert.Equal("product_id", clientModel.ModelTypes.First(m => m.Name == "Product").Properties[0].SerializedName);
            Assert.Null(clientModel.Methods[1].ReturnType.Body);
            Assert.Null(clientModel.Methods[1].Responses[HttpStatusCode.NoContent].Body);
            Assert.Equal(3, clientModel.Methods[1].Parameters.Count);
            Assert.Equal("subscriptionId", clientModel.Methods[1].Parameters[0].Name);
            Assert.Null(clientModel.Methods[1].Parameters[0].ClientProperty);
            Assert.Equal("resourceGroupName", clientModel.Methods[1].Parameters[1].Name);
            Assert.Equal("apiVersion", clientModel.Methods[1].Parameters[2].Name);

            Assert.Equal("capacity", clientModel.ModelTypes.First(m => m.Name == "Product").Properties[3].Name);
            Assert.Equal("100", clientModel.ModelTypes.First(m => m.Name == "Product").Properties[3].DefaultValue);
        }

        [Fact]
        public void TestExternalReferences()
        {
            Generator.Modeler modeler = new SwaggerModeler(new Settings
            {
                Namespace = "Test",
                Input = Path.Combine("Swagger", "swagger-external-ref-no-definitions.json")
            });
            var clientModel = modeler.Build();

            Assert.NotNull(clientModel);
            Assert.Equal(2, clientModel.ModelTypes.Count);
        }

        [Fact]
        public void TestExternalReferencesWithAllOf()
        {
            Generator.Modeler modeler = new SwaggerModeler(new Settings
            {
                Namespace = "Test",
                Input = Path.Combine("Swagger", "swagger-external-ref.json")
            });
            var clientModel = modeler.Build();

            Assert.NotNull(clientModel);
            Assert.Equal(3, clientModel.ModelTypes.Count);
            Assert.Equal("ChildProduct", clientModel.ModelTypes.First(m => m.Name == "ChildProduct").Name);
            Assert.Equal("Product", clientModel.ModelTypes.First(m => m.Name == "ChildProduct").BaseModelType.Name);
        }

        [Fact]
        public void TestExternalReferencesWithReferencesInProperties()
        {
            Generator.Modeler modeler = new SwaggerModeler(new Settings
            {
                Namespace = "Test",
                Input = Path.Combine("Swagger", "swagger-external-ref.json")
            });
            var clientModel = modeler.Build();

            Assert.NotNull(clientModel);
            Assert.Equal(3, clientModel.ModelTypes.Count);
            Assert.Equal("ChildProduct", clientModel.ModelTypes.First(m => m.Name == "ChildProduct").Name);
            Assert.Equal("Product", clientModel.ModelTypes.First(m => m.Name == "ChildProduct").Properties[1].Type.Name);
        }

        [Fact]
        public void TestExternalReferencesWithExtension()
        {
            Generator.Modeler modeler = new SwaggerModeler(new Settings
            {
                Namespace = "Test",
                Input = Path.Combine("Swagger", "swagger-external-ref-no-definitions.json")
            });
            var clientModel = modeler.Build();

            Assert.NotNull(clientModel);
            Assert.True(clientModel.ModelTypes.First().Extensions.ContainsKey("x-ms-external"));
        }

        [Fact]
        public void TestClientModelWithInheritance()
        {
            var modeler = new SwaggerModeler(new Settings
            {
                Namespace = "Test",
                Input = Path.Combine("Swagger", "swagger-allOf.json")
            });
            var clientModel = modeler.Build();

            Assert.NotNull(clientModel);
            Assert.Equal("pet", clientModel.ModelTypes.First(m => m.Name == "pet").Name);
            Assert.Equal("cat", clientModel.ModelTypes.First(m => m.Name == "cat").Name);
            Assert.Equal("pet", clientModel.ModelTypes.First(m => m.Name == "cat").BaseModelType.Name);
            Assert.Equal("breed", clientModel.ModelTypes.First(m => m.Name == "cat").Properties[0].Name);
            Assert.Equal(true, clientModel.ModelTypes.First(m => m.Name == "cat").Properties[0].IsRequired);
            Assert.Equal("color", clientModel.ModelTypes.First(m => m.Name == "cat").Properties[1].Name);
            Assert.Equal("siamese", clientModel.ModelTypes.First(m => m.Name == "siamese").Name);
            Assert.Equal("cat", clientModel.ModelTypes.First(m => m.Name == "siamese").BaseModelType.Name);
        }

        [Fact]
        public void TestClientModelPolymorhism()
        {
            var modeler = new SwaggerModeler(new Settings
            {
                Namespace = "Test",
                Input = Path.Combine("Swagger", "swagger-polymorphism.json")
            });
            var clientModel = modeler.Build();

            Assert.NotNull(clientModel);
            Assert.Equal("Pet", clientModel.ModelTypes.First(m => m.Name == "Pet").Name);
            Assert.Equal("dtype", clientModel.ModelTypes.First(m => m.Name == "Pet").PolymorphicDiscriminator);
            Assert.Equal(2, clientModel.ModelTypes.First(m => m.Name == "Pet").Properties.Count);
            Assert.Equal("id", clientModel.ModelTypes.First(m => m.Name == "Pet").Properties[0].Name);
            Assert.Equal("description", clientModel.ModelTypes.First(m => m.Name == "Pet").Properties[1].Name);
            Assert.Equal("Cat", clientModel.ModelTypes.First(m => m.Name == "Cat").Name);
            Assert.Equal("Pet", clientModel.ModelTypes.First(m => m.Name == "Cat").BaseModelType.Name);
            Assert.Equal(1, clientModel.ModelTypes.First(m => m.Name == "Cat").Properties.Count);
            Assert.Equal("Lizard", clientModel.ModelTypes.First(m => m.Name == "Lizard").Name);
            Assert.Equal("lzd", clientModel.ModelTypes.First(m => m.Name == "Lizard").SerializedName);
        }

        [Fact]
        public void ClientModelWithCircularDependencyThrowsError()
        {
            var modeler = new SwaggerModeler(new Settings
            {
                Namespace = "Test",
                Input = Path.Combine("Swagger", "swagger-allOf-circular.json")
            });
            Assert.Throws<ArgumentException>(() => modeler.Build());
        }

        [Fact]
        public void TestClientModelWithRecursiveTypes()
        {
            var modeler = new SwaggerModeler(new Settings
            {
                Namespace = "Test",
                Input = Path.Combine("Swagger", "swagger-recursive-type.json")
            });
            var clientModel = modeler.Build();

            Assert.NotNull(clientModel);
            Assert.Equal("Product", clientModel.ModelTypes.First(m => m.Name == "Product").Name);
            Assert.Equal("product_id", clientModel.ModelTypes.First(m => m.Name == "Product").Properties[0].Name);
            Assert.Equal("String", clientModel.ModelTypes.First(m => m.Name == "Product").Properties[0].Type.ToString());
        }

        [Fact]
        public void TestClientModelWithNoContent()
        {
            var modeler = new SwaggerModeler(new Settings
            {
                Namespace = "Test",
                Input = @"Swagger\swagger-no-content.json"
            });
            var clientModel = modeler.Build();

            Assert.Equal("DeleteBlob", clientModel.Methods[4].Name);
            Assert.Equal(PrimaryType.Object, clientModel.Methods[4].ReturnType.Body);
            Assert.Equal(PrimaryType.Object, clientModel.Methods[4].Responses[HttpStatusCode.OK].Body);
            Assert.Null(clientModel.Methods[4].Responses[HttpStatusCode.BadRequest].Body);
        }

        [Fact]
        public void TestClientModelWithDifferentReturnsTypesBasedOnStatusCode()
        {
            var modeler = new SwaggerModeler(new Settings
            {
                Namespace = "Test",
                Input = Path.Combine("Swagger", "swagger-multiple-response-schemas.json")
            });
            var clientModel = modeler.Build();

            Assert.NotNull(clientModel);
            Assert.Equal("getSameResponse", clientModel.Methods[0].Name);
            Assert.Equal("IList<pet>", clientModel.Methods[0].ReturnType.ToString());
            Assert.Equal("IList<pet>", clientModel.Methods[0].Responses[HttpStatusCode.OK].ToString());
            Assert.Equal("IList<pet>", clientModel.Methods[0].Responses[HttpStatusCode.Accepted].ToString());

            Assert.Equal("postInheretedTypes", clientModel.Methods[1].Name);
            Assert.Equal("pet", clientModel.Methods[1].ReturnType.ToString());
            Assert.Equal("dog", clientModel.Methods[1].Responses[HttpStatusCode.OK].ToString());
            Assert.Equal("cat", clientModel.Methods[1].Responses[HttpStatusCode.Accepted].ToString());

            Assert.Equal("patchDifferentStreamTypesNoContent", clientModel.Methods[6].Name);
            Assert.Equal("VirtualMachineGetRemoteDesktopFileResponse", clientModel.Methods[6].ReturnType.ToString());
            Assert.Equal("VirtualMachineGetRemoteDesktopFileResponse",
                clientModel.Methods[6].Responses[HttpStatusCode.OK].ToString());
            Assert.Null(clientModel.Methods[6].Responses[HttpStatusCode.NoContent].Body);
        }

        [Fact]
        public void DefaultReturnsCorrectType()
        {
            var modeler = new SwaggerModeler(new Settings
            {
                Namespace = "Test",
                Input = Path.Combine("Swagger", "swagger-multiple-response-schemas.json")
            });
            var clientModel = modeler.Build();

            var retType = clientModel.Methods.First(m => m.Name == "patchDefaultResponse");

            Assert.Equal("pet", retType.ReturnType.ToString());
        }

        [Fact]
        public void GlobalResponsesReference()
        {
            var modeler = new SwaggerModeler(new Settings
            {
                Namespace = "Test",
                Input = Path.Combine("Swagger", "swagger-global-responses.json")
            });
            var clientModel = modeler.Build();

            Assert.Equal(1, clientModel.Methods[0].Responses.Count);
            Assert.NotNull(clientModel.Methods[0].Responses[HttpStatusCode.OK]);
        }

        [Fact]
        public void TestClientModelWithStreamAndByteArray()
        {
            var modeler = new SwaggerModeler(new Settings
            {
                Namespace = "Test",
                Input = Path.Combine("Swagger", "swagger-streaming.json")
            });
            var clientModel = modeler.Build();

            Assert.NotNull(clientModel);
            Assert.Equal("GetWithStreamFormData", clientModel.Methods[0].Name);
            Assert.Equal("Stream", clientModel.Methods[0].Parameters[0].Type.Name);
            Assert.Equal("Stream", clientModel.Methods[0].ReturnType.ToString());
            Assert.Equal("Stream", clientModel.Methods[0].Responses[HttpStatusCode.OK].ToString());

            Assert.Equal("PostWithByteArrayFormData", clientModel.Methods[1].Name);
            Assert.Equal("ByteArray", clientModel.Methods[1].Parameters[0].Type.Name);
            Assert.Equal("ByteArray", clientModel.Methods[1].ReturnType.ToString());
            Assert.Equal("ByteArray", clientModel.Methods[1].Responses[HttpStatusCode.OK].ToString());

            Assert.Equal("GetWithStream", clientModel.Methods[2].Name);
            Assert.Equal("Stream", clientModel.Methods[2].ReturnType.ToString());
            Assert.Equal("Stream", clientModel.Methods[2].Responses[HttpStatusCode.OK].ToString());

            Assert.Equal("PostWithByteArray", clientModel.Methods[3].Name);
            Assert.Equal("ByteArray", clientModel.Methods[3].ReturnType.ToString());
            Assert.Equal("ByteArray", clientModel.Methods[3].Responses[HttpStatusCode.OK].ToString());
        }

        [Fact]
        public void TestClientModelWithMethodGroups()
        {
            var modeler = new SwaggerModeler(new Settings
            {
                Namespace = "Test",
                Input = @"Swagger\swagger-optional-params.json"
            });
            var clientModel = modeler.Build();

            Assert.NotNull(clientModel);
            Assert.Equal(0, clientModel.Methods.Count(m => m.Group == null));
            Assert.Equal(2, clientModel.Methods.Count(m => m.Group == "Widgets"));
            Assert.Equal("List", clientModel.Methods[0].Name);
        }

        [Fact]
        public void TestDataTypes()
        {
            var modeler = new SwaggerModeler(new Settings
            {
                Namespace = "Test",
                Input = Path.Combine("Swagger", "swagger-data-types.json")
            });
            var clientModel = modeler.Build();

            Assert.NotNull(clientModel);
            Assert.Equal("Int integer", clientModel.Methods[0].Parameters[0].ToString());
            Assert.Equal("Int int", clientModel.Methods[0].Parameters[1].ToString());
            Assert.Equal("Long long", clientModel.Methods[0].Parameters[2].ToString());
            Assert.Equal("Double number", clientModel.Methods[0].Parameters[3].ToString());
            Assert.Equal("Double float", clientModel.Methods[0].Parameters[4].ToString());
            Assert.Equal("Double double", clientModel.Methods[0].Parameters[5].ToString());
            Assert.Equal("Decimal decimal", clientModel.Methods[0].Parameters[6].ToString());
            Assert.Equal("String string", clientModel.Methods[0].Parameters[7].ToString());
            Assert.Equal("enum color", clientModel.Methods[0].Parameters[8].ToString());
            Assert.Equal("ByteArray byte", clientModel.Methods[0].Parameters[9].ToString());
            Assert.Equal("Boolean boolean", clientModel.Methods[0].Parameters[10].ToString());
            Assert.Equal("Date date", clientModel.Methods[0].Parameters[11].ToString());
            Assert.Equal("DateTime dateTime", clientModel.Methods[0].Parameters[12].ToString());
            Assert.Equal("IList<String> array", clientModel.Methods[0].Parameters[13].ToString());

            var variableEnumInPath =
                clientModel.Methods.First(m => m.Name == "list" && m.Group == null).Parameters.First(p => p.Name == "color" && p.Location == ParameterLocation.Path).Type as EnumType;
            Assert.NotNull(variableEnumInPath);
            Assert.Equal(variableEnumInPath.Values,
                new[] { new EnumValue { Name = "red" }, new EnumValue { Name = "blue" }, new EnumValue { Name = "green" } }.ToList());
            Assert.True(variableEnumInPath.ModelAsString);
            Assert.Empty(variableEnumInPath.Name);

            var variableEnumInQuery =
                clientModel.Methods.First(m => m.Name == "list" && m.Group == null).Parameters.First(p => p.Name == "color" && p.Location == ParameterLocation.Query).Type as EnumType;
            Assert.NotNull(variableEnumInQuery);
            Assert.Equal(variableEnumInQuery.Values,
                new[] { new EnumValue { Name = "red" }, new EnumValue { Name = "blue" }, new EnumValue { Name = "green" }, new EnumValue { Name = "purple" } }.ToList());
            Assert.True(variableEnumInQuery.ModelAsString);
            Assert.Empty(variableEnumInQuery.Name);

            var differentEnum =
                clientModel.Methods.First(m => m.Name == "list" && m.Group == "DiffEnums").Parameters.First(p => p.Name == "color" && p.Location == ParameterLocation.Query).Type as EnumType;
            Assert.NotNull(differentEnum);
            Assert.Equal(differentEnum.Values,
                new[] { new EnumValue { Name = "cyan" }, new EnumValue { Name = "yellow" } }.ToList());
            Assert.True(differentEnum.ModelAsString);
            Assert.Empty(differentEnum.Name);

            var sameEnum =
                clientModel.Methods.First(m => m.Name == "get" && m.Group == "SameEnums").Parameters.First(p => p.Name == "color2" && p.Location == ParameterLocation.Query).Type as EnumType;
            Assert.NotNull(sameEnum);
            Assert.Equal(sameEnum.Values,
                new[] { new EnumValue { Name = "blue" }, new EnumValue { Name = "green" }, new EnumValue { Name = "red" } }.ToList());
            Assert.True(sameEnum.ModelAsString);
            Assert.Empty(sameEnum.Name);

            var modelEnum =
                clientModel.ModelTypes.First(m => m.Name == "Product").Properties.First(p => p.Name == "color2").Type as EnumType;
            Assert.NotNull(modelEnum);
            Assert.Equal(modelEnum.Values,
                new[] { new EnumValue { Name = "red" }, new EnumValue { Name = "blue" }, new EnumValue { Name = "green" } }.ToList());
            Assert.True(modelEnum.ModelAsString);
            Assert.Empty(modelEnum.Name);

            var fixedEnum =
                clientModel.ModelTypes.First(m => m.Name == "Product").Properties.First(p => p.Name == "color").Type as EnumType;
            Assert.NotNull(fixedEnum);
            Assert.Equal(fixedEnum.Values,
                new[] { new EnumValue { Name = "red" }, new EnumValue { Name = "blue" }, new EnumValue { Name = "green" } }.ToList());
            Assert.False(fixedEnum.ModelAsString);
            Assert.Equal("Colors", fixedEnum.Name);

            var fixedEnum2 =
                clientModel.ModelTypes.First(m => m.Name == "Product").Properties.First(p => p.Name == "color3").Type as EnumType;
            Assert.Equal(fixedEnum2, fixedEnum);

            Assert.Equal(1, clientModel.EnumTypes.Count);
            Assert.Equal("Colors", clientModel.EnumTypes.First().Name);
        }

        [Fact]
        public void TestClientWithValidation()
        {
            var modeler = new SwaggerModeler(new Settings
            {
                Namespace = "Test",
                Input = @"Swagger\swagger-validation.json"
            });
            var clientModel = modeler.Build();

            Assert.Equal("resourceGroupName", clientModel.Methods[0].Parameters[1].Name);
            Assert.Equal(true, clientModel.Methods[0].Parameters[1].IsRequired);
            Assert.Equal(3, clientModel.Methods[0].Parameters[1].Constraints.Count);
            Assert.Equal("10", clientModel.Methods[0].Parameters[1].Constraints[Constraint.MaxLength]);
            Assert.Equal("3", clientModel.Methods[0].Parameters[1].Constraints[Constraint.MinLength]);
            Assert.Equal("[a-zA-Z0-9]+", clientModel.Methods[0].Parameters[1].Constraints[Constraint.Pattern]);

            Assert.Equal("id", clientModel.Methods[0].Parameters[2].Name);
            Assert.Equal(3, clientModel.Methods[0].Parameters[2].Constraints.Count);
            Assert.Equal("10", clientModel.Methods[0].Parameters[2].Constraints[Constraint.MultipleOf]);
            Assert.Equal("100", clientModel.Methods[0].Parameters[2].Constraints[Constraint.InclusiveMinimum]);
            Assert.Equal("1000", clientModel.Methods[0].Parameters[2].Constraints[Constraint.InclusiveMaximum]);

            Assert.Equal("apiVersion", clientModel.Methods[0].Parameters[3].Name);
            Assert.NotNull(clientModel.Methods[0].Parameters[3].ClientProperty);
            Assert.Equal(1, clientModel.Methods[0].Parameters[3].Constraints.Count);
            Assert.Equal("\\d{2}-\\d{2}-\\d{4}", clientModel.Methods[0].Parameters[3].Constraints[Constraint.Pattern]);

            Assert.Equal("Product", clientModel.ModelTypes.First(m => m.Name == "Product").Name);
            Assert.Equal("display_names", clientModel.ModelTypes.First(m => m.Name == "Product").Properties[2].Name);
            Assert.Equal(3, clientModel.ModelTypes.First(m => m.Name == "Product").Properties[2].Constraints.Count);
            Assert.Equal("6", clientModel.ModelTypes.First(m => m.Name == "Product").Properties[2].Constraints[Constraint.MaxItems]);
            Assert.Equal("0", clientModel.ModelTypes.First(m => m.Name == "Product").Properties[2].Constraints[Constraint.MinItems]);
            Assert.Equal("true", clientModel.ModelTypes.First(m => m.Name == "Product").Properties[2].Constraints[Constraint.UniqueItems]);

            Assert.Equal("capacity", clientModel.ModelTypes.First(m => m.Name == "Product").Properties[3].Name);
            Assert.Equal(2, clientModel.ModelTypes.First(m => m.Name == "Product").Properties[3].Constraints.Count);
            Assert.Equal("100", clientModel.ModelTypes.First(m => m.Name == "Product").Properties[3].Constraints[Constraint.ExclusiveMaximum]);
            Assert.Equal("0", clientModel.ModelTypes.First(m => m.Name == "Product").Properties[3].Constraints[Constraint.ExclusiveMinimum]);
        }

        [Fact]
        public void TestClientModelWithResponseHeaders()
        {
            var modeler = new SwaggerModeler(new Settings
            {
                Namespace = "Test",
                Input = Path.Combine("Swagger", "swagger-response-headers.json")
            });
            var clientModel = modeler.Build();

            Assert.NotNull(clientModel);
            Assert.Equal(2, clientModel.Methods.Count);
            Assert.Equal(2, clientModel.Methods[0].Responses.Count);
            Assert.Equal("list-Headers", clientModel.Methods[0].Responses[HttpStatusCode.OK].Headers.Name);
            Assert.Equal(3, ((CompositeType)clientModel.Methods[0].Responses[HttpStatusCode.OK].Headers).Properties.Count);
            Assert.Equal("list-Headers", clientModel.Methods[0].Responses[HttpStatusCode.Created].Headers.Name);
            Assert.Equal(3, ((CompositeType)clientModel.Methods[0].Responses[HttpStatusCode.Created].Headers).Properties.Count);
            Assert.Equal("list-Headers", clientModel.Methods[0].ReturnType.Headers.Name);
            Assert.Equal(3, ((CompositeType)clientModel.Methods[0].ReturnType.Headers).Properties.Count);

            Assert.Equal(1, clientModel.Methods[1].Responses.Count);
            Assert.Equal("create-Headers", clientModel.Methods[1].Responses[HttpStatusCode.OK].Headers.Name);
            Assert.Equal(3, ((CompositeType)clientModel.Methods[1].Responses[HttpStatusCode.OK].Headers).Properties.Count);
            Assert.Equal("create-Headers", clientModel.Methods[1].ReturnType.Headers.Name);
            Assert.Equal(3, ((CompositeType)clientModel.Methods[1].ReturnType.Headers).Properties.Count);
            Assert.True(clientModel.HeaderTypes.Any(c => c.Name == "list-Headers"));
            Assert.True(clientModel.HeaderTypes.Any(c => c.Name == "create-Headers"));
        }
    }
}
