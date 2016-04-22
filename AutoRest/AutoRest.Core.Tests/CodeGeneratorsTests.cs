﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System.IO;
using System.Text;
using Microsoft.Rest.Generator.ClientModel;
using Microsoft.Rest.Generator.Logging;
using Microsoft.Rest.Generator.Test.Resource;
using Microsoft.Rest.Generator.Test.Templates;
using Microsoft.Rest.Generator.Utilities;
using Xunit;

namespace Microsoft.Rest.Generator.Test
{
    [Collection("AutoRest Tests")]
    public class CodeGeneratorsTests
    {
        private readonly MemoryFileSystem _fileSystem = new MemoryFileSystem();

        public CodeGeneratorsTests()
        {
            Logger.Entries.Clear();
            SetupMock();
        }

        private void SetupMock()
        {
            _fileSystem.WriteFile("AutoRest.json", File.ReadAllText(Path.Combine("Resource", "AutoRest.json")));
            _fileSystem.WriteFile("RedisResource.json", File.ReadAllText(Path.Combine("Resource", "RedisResource.json")));
        }

        [Fact]
        public void CodeWriterCreatesDirectory()
        {
            var settings = new Settings
            {
                CodeGenerator = "CSharp",
                FileSystem = _fileSystem,
                OutputDirectory = Path.GetTempPath()
            };
            SampleCodeGenerator codeGenerator = new SampleCodeGenerator(settings);
            codeGenerator.Generate(new ServiceClient()).GetAwaiter().GetResult();
            Assert.Contains(Path.Combine(settings.OutputDirectory, "Models"), _fileSystem.VirtualStore.Keys);
        }

        [Fact]
        public void CodeWriterWrapsComments()
        {
            var sampleModelTemplate = new SampleModel();
            var sampleViewModel = new SampleViewModel();

            sampleModelTemplate.Model = sampleViewModel;
            var output = sampleModelTemplate.ToString();
            Assert.True(output.ContainsMultiline(@"/// Deserialize current type to Json object because today is Friday
        /// and there is a sun outside the window."));
        }

        [Fact]
        public void CodeWriterOverwritesExistingFile()
        {
            var settings = new Settings
            {
                CodeGenerator = "CSharp",
                FileSystem = _fileSystem,
                OutputDirectory = Path.GetTempPath()
            };
            string existingContents = "this is dummy";
            string path = Path.Combine(settings.OutputDirectory, "Models", "Pet.cs");
            _fileSystem.VirtualStore[path] = new StringBuilder(existingContents);
            var codeGenerator = new SampleCodeGenerator(settings);
            codeGenerator.Generate(new ServiceClient()).GetAwaiter().GetResult();
            Assert.NotEqual(existingContents, _fileSystem.VirtualStore[path].ToString());
        }

        [Fact]
        public void OutputToSingleFile()
        {
            var settings = new Settings
            {
                Modeler = "Swagger",
                CodeGenerator = "CSharp",
                Input = "RedisResource.json",
                FileSystem = _fileSystem,
                OutputDirectory = Path.GetTempPath(),
                OutputFileName = "test.file.cs"
            };

            string path = Path.Combine(settings.OutputDirectory, "test.file.cs");
            string existingContents = "this is dummy";
            _fileSystem.VirtualStore[path] = new StringBuilder(existingContents);
            var codeGenerator = new SampleCodeGenerator(settings);
            codeGenerator.Generate(new ServiceClient()).GetAwaiter().GetResult();
            Assert.DoesNotContain(existingContents, _fileSystem.VirtualStore[path].ToString());
            Assert.Equal(4, _fileSystem.VirtualStore.Count);
            Assert.True(_fileSystem.VirtualStore.ContainsKey(path));
            Assert.True(_fileSystem.VirtualStore.ContainsKey("AutoRest.json"));
            Assert.True(_fileSystem.VirtualStore.ContainsKey("RedisResource.json"));
        }
    }
}
