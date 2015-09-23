// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System;
using System.Globalization;
using System.IO;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.Rest.Generator.Azure.NodeJS.Properties;
using Microsoft.Rest.Generator.Azure.NodeJS.Templates;
using Microsoft.Rest.Generator.ClientModel;
using Microsoft.Rest.Generator.NodeJS;
using Microsoft.Rest.Generator.NodeJS.Templates;
using Microsoft.Rest.Generator.Utilities;

namespace Microsoft.Rest.Generator.Azure.NodeJS
{
    public class AzureNodeJSCodeGenerator : NodeJSCodeGenerator
    {
        private const string ClientRuntimePackage = "ms-rest-azure version 1.0.0";
        public const string LongRunningExtension = "x-ms-long-running-operation";

        public AzureNodeJSCodeGenerator(Settings settings)
            : base(settings)
        {
        }

        public override string Name
        {
            get { return "Azure.NodeJS"; }
        }

        public override string Description
        {
            // TODO resource string.
            get { return "Azure NodeJS for Http Client Libraries"; }
        }

        public override string UsageInstructions
        {
            get
            {
                return string.Format(CultureInfo.InvariantCulture,
                    Resources.UsageInformation, ClientRuntimePackage);
            }
        }

        public override string ImplementationFileExtension
        {
            get { return ".js"; }
        }

        /// <summary>
        /// Normalizes client model by updating names and types to be language specific.
        /// </summary>
        /// <param name="serviceClient"></param>
        public override void NormalizeClientModel(ServiceClient serviceClient)
        {
            //please do not change the following sequence as it may have undesirable results.
            Settings.AddCredentials = true;
            AzureCodeGenerator.UpdateHeadMethods(serviceClient);
            AzureCodeGenerator.ParseODataExtension(serviceClient);
            AzureCodeGenerator.FlattenResourceProperties(serviceClient);
            AzureCodeGenerator.AddPageableMethod(serviceClient);
            AzureCodeGenerator.AddAzureProperties(serviceClient);
            AzureCodeGenerator.SetDefaultResponses(serviceClient);
            base.NormalizeClientModel(serviceClient);
            AzureCodeGenerator.AddLongRunningOperations(serviceClient);
            NormalizeApiVersion(serviceClient);
            NormalizeCredentials(serviceClient);
        }

        /// <summary>
        /// Creates long running operation methods.
        /// </summary>
        /// <param name="serviceClient"></param>
        public void AddLongRunningOperations(ServiceClient serviceClient)
        {
            if (serviceClient == null)
            {
                throw new ArgumentNullException("serviceClient");
            }

            for (int i = 0; i < serviceClient.Methods.Count; i++)
            {
                var method = serviceClient.Methods[i];
                if (method.Extensions.ContainsKey(LongRunningExtension))
                {
                    var isLongRunning = method.Extensions[LongRunningExtension];
                    if (isLongRunning is bool && (bool)isLongRunning)
                    {
                        serviceClient.Methods.Insert(i, (Method)method.Clone());
                        method.Name = "begin" + Namer.GetMethodName(method.Name.ToPascalCase());
                        i++;
                    }

                    method.Extensions.Remove(LongRunningExtension);
                }
            }
        }

        private static void NormalizeCredentials(ServiceClient serviceClient)
        {
            var property = serviceClient.Properties.FirstOrDefault(
                p => p.Name.Equals("credentials", StringComparison.OrdinalIgnoreCase));
            if (property != null)
            {
                ((CompositeType) property.Type).Name = "ServiceClientCredentials";
            }
        }

        private static void NormalizeApiVersion(ServiceClient serviceClient)
        {
            serviceClient.Properties.Where(
                p => p.SerializedName.Equals(AzureCodeGenerator.ApiVersion, StringComparison.OrdinalIgnoreCase))
                .ForEach(p => p.DefaultValue = p.DefaultValue.Replace("\"", "'"));

            serviceClient.Properties.Where(
                p => p.SerializedName.Equals(AzureCodeGenerator.AcceptLanguage, StringComparison.OrdinalIgnoreCase))
                .ForEach(p => p.DefaultValue = p.DefaultValue.Replace("\"", "'"));
        }

        /// <summary>
        /// Generate Azure NodeJS client code for given ServiceClient.
        /// </summary>
        /// <param name="serviceClient"></param>
        /// <returns></returns>
        public override async Task Generate(ServiceClient serviceClient)
        {
            var serviceClientTemplateModel = new AzureServiceClientTemplateModel(serviceClient);
            // Service client
            var serviceClientTemplate = new Microsoft.Rest.Generator.Azure.NodeJS.Templates.AzureServiceClientTemplate
            {
                Model = serviceClientTemplateModel
            };
            await Write(serviceClientTemplate, serviceClient.Name.ToCamelCase() + ".js");

            //Models
            if (serviceClient.ModelTypes.Any())
            {
                var modelIndexTemplate = new AzureModelIndexTemplate
                {
                    Model = serviceClientTemplateModel
                };
                await Write(modelIndexTemplate, Path.Combine("models", "index.js"));
                foreach (var modelType in serviceClientTemplateModel.ModelTemplateModels)
                {
                    var modelTemplate = new ModelTemplate
                    {
                        Model = modelType
                    };
                    await Write(modelTemplate, Path.Combine("models", modelType.Name.ToCamelCase() + ".js"));
                }
            }

            //MethodGroups
            if (serviceClientTemplateModel.MethodGroupModels.Any())
            {
                var methodGroupIndexTemplate = new MethodGroupIndexTemplate
                {
                    Model = serviceClientTemplateModel
                };
                await Write(methodGroupIndexTemplate, Path.Combine("operations", "index.js"));
                foreach (var methodGroupModel in serviceClientTemplateModel.MethodGroupModels)
                {
                    var methodGroupTemplate = new AzureMethodGroupTemplate
                    {
                        Model = methodGroupModel as AzureMethodGroupTemplateModel
                    };
                    await Write(methodGroupTemplate, Path.Combine("operations", methodGroupModel.MethodGroupType.ToCamelCase() + ".js"));
                }
            }
        }
    }
}
