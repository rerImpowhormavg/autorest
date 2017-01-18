﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System.Collections.Generic;
using System.IO;
using System.Threading.Tasks;
using AutoRest.Core;
using AutoRest.Core.Model;
using static AutoRest.Core.Utilities.DependencyInjection;

namespace AutoRest.AzureResourceSchema
{
    public class CodeGeneratorArs : CodeGenerator
    {
        public CodeGeneratorArs()
        {
        }

        public override string ImplementationFileExtension => ".json";

        public override string UsageInstructions => $"Your Azure Resource Schema(s) can be found in {Settings.Instance.OutputDirectory}";

 
        public override async Task Generate(CodeModel serviceClient)
        {
            IDictionary<string, ResourceSchema> resourceSchemas = ResourceSchemaParser.Parse(serviceClient);

            foreach (string resourceProvider in resourceSchemas.Keys)
            {
                StringWriter stringWriter = new StringWriter();
                ResourceSchemaWriter.Write(stringWriter, resourceSchemas[resourceProvider]);
                await Write(stringWriter.ToString(), resourceProvider + Path.DirectorySeparatorChar + resourceProvider + ".json", true);

                stringWriter = new StringWriter();
                var md = ResourceMarkdownGenerator.Generate(resourceSchemas[resourceProvider]);

                foreach (var m in md)
                {
                    var content = m.Content.Replace("\"boolean\"", "boolean");
                    await Write(content, EnsureUniqueFileName(resourceProvider, m.Type + ".md"), false);
                }
            }
        }

        private string EnsureUniqueFileName(string subdir, string fileName)
        {
            int i = 0;
            var filePath = Path.Combine(Settings.Instance.OutputDirectory, subdir, fileName);
            while (File.Exists(filePath))
            {
                var name = Path.GetFileNameWithoutExtension(fileName);
                var ext = Path.GetExtension(fileName);

                fileName = string.Format("{0}{1}{2}{3}{4}", subdir, Path.DirectorySeparatorChar, name, i, ext);
                filePath = Path.Combine(Settings.Instance.OutputDirectory, subdir, fileName);

                ++i;
            }

            return string.Format("{0}{1}{2}", subdir, Path.DirectorySeparatorChar, fileName);
        }
    }
}
