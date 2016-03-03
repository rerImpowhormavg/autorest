﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System.IO;
using System.Linq;
using Microsoft.Rest.Generator.ClientModel;
using Microsoft.Rest.Modeler.Swagger;
using Xunit;

namespace Microsoft.Rest.Generator.Tests
{
    public class ExtensionsTests
    {
        [Fact]
        public void TestClientModelWithPayloadFlattening()
        {
            var setting = new Settings
            {
                Namespace = "Test",
                Input = Path.Combine("Swagger", "swagger-payload-flatten.json"),
                PayloadFlatteningThreshold = 3
            };
            var modeler = new SwaggerModeler(setting);
            var clientModel = modeler.Build();
            Extensions.NormalizeClientModel(clientModel, setting);

            Assert.NotNull(clientModel);
            Assert.Equal(4, clientModel.Methods[0].Parameters.Count);
            Assert.Equal("String subscriptionId", clientModel.Methods[0].Parameters[0].ToString());
            Assert.Equal("String resourceGroupName", clientModel.Methods[0].Parameters[1].ToString());
            Assert.Equal("String apiVersion", clientModel.Methods[0].Parameters[2].ToString());
            Assert.Equal("MaxProduct max_product", clientModel.Methods[0].Parameters[3].ToString());
            Assert.Equal(6, clientModel.Methods[1].Parameters.Count);
            Assert.Equal("String subscriptionId", clientModel.Methods[1].Parameters[0].ToString());
            Assert.Equal("String resourceGroupName", clientModel.Methods[1].Parameters[1].ToString());
            Assert.Equal("String apiVersion", clientModel.Methods[1].Parameters[2].ToString());
            Assert.Equal("String base_product_id", clientModel.Methods[1].Parameters[3].ToString());
            Assert.Equal(true, clientModel.Methods[1].Parameters[3].IsRequired);
            Assert.Equal("String base_product_description", clientModel.Methods[1].Parameters[4].ToString());
            Assert.Equal(false, clientModel.Methods[1].Parameters[4].IsRequired);
            Assert.Equal("MaxProduct max_product_reference", clientModel.Methods[1].Parameters[5].ToString());
            Assert.Equal(false, clientModel.Methods[1].Parameters[5].IsRequired);
            Assert.Equal(1, clientModel.Methods[1].InputParameterTransformation.Count);
            Assert.Equal(3, clientModel.Methods[1].InputParameterTransformation[0].ParameterMappings.Count);
        }

        [Fact]
        public void TestClientModelWithPayloadFlatteningViaXMSClientFlatten()
        {
            var setting = new Settings
            {
                Namespace = "Test",
                Input = Path.Combine("Swagger", "swagger-x-ms-client-flatten.json")
            };
            var modeler = new SwaggerModeler(setting);
            var clientModel = modeler.Build();
            Extensions.NormalizeClientModel(clientModel, setting);

            Assert.NotNull(clientModel);
            Assert.Equal(8, clientModel.ModelTypes.Count);
            Assert.True(clientModel.ModelTypes.Any(m => m.Name == "BaseProduct"));
            Assert.True(clientModel.ModelTypes.Any(m => m.Name == "SimpleProduct"));
            Assert.True(clientModel.ModelTypes.Any(m => m.Name == "ConflictedProduct"));
            Assert.True(clientModel.ModelTypes.Any(m => m.Name == "ConflictedProductProperties")); // Since it's referenced in the response
            Assert.True(clientModel.ModelTypes.Any(m => m.Name == "RecursiveProduct"));
            Assert.True(clientModel.ModelTypes.Any(m => m.Name == "Error"));
            Assert.True(clientModel.ModelTypes.Any(m => m.Name == "ProductWithInheritance"));
            Assert.True(clientModel.ModelTypes.Any(m => m.Name == "BaseFlattenedProduct"));

            var simpleProduct = clientModel.ModelTypes.First(m => m.Name == "SimpleProduct");
            Assert.True(simpleProduct.Properties.Any(p => p.SerializedName == "details.max_product_display_name"
                                                       && p.Name == "max_product_display_name"));
            Assert.True(simpleProduct.Properties.Any(p => p.SerializedName == "details.max_product_capacity"
                                                       && p.Name == "max_product_capacity"));
            Assert.True(simpleProduct.Properties.Any(p => p.SerializedName == "details.max_product_image.@odata\\\\.value"
                                                       && p.Name == "@odata.value"));

            var conflictedProduct = clientModel.ModelTypes.First(m => m.Name == "ConflictedProduct");
            Assert.True(conflictedProduct.Properties.Any(p => p.SerializedName == "max_product_display_name"
                                                       && p.Name == "max_product_display_name"));
            Assert.True(conflictedProduct.Properties.Any(p => p.SerializedName == "details.max_product_display_name"
                                                       && p.Name == "ConflictedProductProperties_max_product_display_name"));
            Assert.True(conflictedProduct.Properties.Any(p => p.SerializedName == "simpleDetails.max_product_display_name"
                                                       && p.Name == "SimpleProductProperties_max_product_display_name"));
            Assert.True(conflictedProduct.Properties.Any(p => p.SerializedName == "details.base_product_description"
                                                       && p.Name == "ConflictedProduct_base_product_description"));

            var recursiveProduct = clientModel.ModelTypes.First(m => m.Name == "RecursiveProduct");
            Assert.True(recursiveProduct.Properties.Any(p => p.SerializedName == "properties.name"
                                                       && p.Name == "name"));
            Assert.True(recursiveProduct.Properties.Any(p => p.SerializedName == "properties.parent"
                                                       && p.Name == "parent"));

            var error = clientModel.ModelTypes.First(m => m.Name == "Error");
            Assert.Equal(3, error.Properties.Count);
            Assert.True(error.Properties.Any(p => p.SerializedName == "code" && p.Name == "code"));
            Assert.True(error.Properties.Any(p => p.SerializedName == "message" && p.Name == "message"));
            Assert.True(error.Properties.Any(p => p.SerializedName == "parentError" && p.Name == "parentError"));
            Assert.True(error.Properties.First(p => p.SerializedName == "parentError" && p.Name == "parentError").Type == error);
        }
    }
}
