// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.
// 

using Xunit;
using System.IO;
using AutoRest.Core.Parsing;
using AutoRest.Core.Utilities;

namespace AutoRest.Core.Tests
{
    public class LiterateYamlParserTests
    {
        /// <summary>
        /// Checks whether literate YAML is parsed precisely as the merged equivalent.
        /// </summary>
        [Fact]
        public void Compare()
        {
            var input1 = File.ReadAllText(Path.Combine(Extensions.CodeBaseDirectory, "Resource", "literateSwagger.json"));
            var input2 = LiterateYamlParser.Parse(File.ReadAllText(Path.Combine(Extensions.CodeBaseDirectory, "Resource", "literateSwagger.json.md")));

            var normalized1 = input1.EnsureYamlIsJson();
            var normalized2 = input2.EnsureYamlIsJson();
            Assert.Equal(normalized1, normalized2);
        }
    }
}