﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Reflection;
using AutoRest.Core.Logging;
using AutoRest.Core.Utilities;
using Newtonsoft.Json.Linq;
using Xunit;
using static AutoRest.Core.Utilities.DependencyInjection;

namespace AutoRest.Core.Tests
{
    [Collection("AutoRest Tests")]
    public class AutoRestSettingsTests
    {
        [Fact]
        public void CreateWithoutArgumentsReturnsBlankSettings()
        {
            using (NewContext)
            {
                var settings = Settings.Create((string[]) null);
                Assert.NotNull(settings);
            }
            using (NewContext)
            {
                var settings = Settings.Create((IDictionary<string, object>) null);
                Assert.NotNull(settings);
            }
            using (NewContext)
            {
                var settings = Settings.Create(new string[0]);
                Assert.NotNull(settings);
            }
            using (NewContext)
            {
                var settings = Settings.Create(new Dictionary<string, object>());
                Assert.NotNull(settings);
            }
        }

        [Fact]
        public void CreateWithMultipleEmptyKeysStoreInCustomDictonary()
        {
            using (NewContext)
            {
                var settings = Settings.Create(new[] {"-Help", " -Bar ", " -Foo"});
                Assert.True(settings.ShowHelp);
                Assert.Equal("", settings.CustomSettings["Foo"]);
                Assert.Equal("", settings.CustomSettings["Bar"]);
            }
        }

        [Fact(Skip = "Travis failure (Invalid URI: The format of the URI could not be determined.)")]
        public void LoadCodeGenSettingsFromJsonFile()
        {
            using (NewContext)
            {
                var codeBaseUrl = new Uri(Utilities.Extensions.CodeBaseDirectory); // travis error here... I guess the constructor isn't happy 'bout linux paths?
                var codeBasePath = Uri.UnescapeDataString(codeBaseUrl.AbsolutePath);
                var settingsFile = Path.Combine(codeBasePath, Path.Combine("Resource", "SampleSettings.json"));
                var settings = Settings.Create(new[] {"-cgs", settingsFile});
                Assert.False((bool) settings.CustomSettings["sampleSwitchFalse"]);
                Assert.True((bool) settings.CustomSettings["sampleSwitchTrue"]);
                Assert.Equal("Foo", settings.CustomSettings["sampleString"]);
                Assert.Equal(typeof(JArray), settings.CustomSettings["filePathArray"].GetType());
                Assert.Equal(2, ((JArray) settings.CustomSettings["filePathArray"]).Count);
                Assert.Equal(typeof(JArray), settings.CustomSettings["intArray"].GetType());
                Assert.Equal(typeof(long), settings.CustomSettings["intFoo"].GetType());
            }
        }

        [Fact]
        public void EmptyCredentialsSettingIsSetToTrueIfPassed()
        {
            using (NewContext)
            {
                var settings = Settings.Create(new[] {"-AddCredentials"});
                Assert.True(settings.AddCredentials);
            }
        }

        [Fact]
        public void NonEmptyCredentialsSettingIsSetToValueIfPassed()
        {
            using (NewContext)
            {
                var settings = Settings.Create(new[] {"-AddCredentials false"});
                Assert.False(settings.AddCredentials);
            }
        }

        [Fact]
        public void NonEmptyPackageVersionIsSet()
        {
            using (NewContext)
            {
                var settings = Settings.Create(new[] {"-pv", "1.2.1"});
                Assert.Equal("1.2.1", settings.PackageVersion);
            }
        }

        [Fact]
        public void NonEmptyPackageNameIsSet()
        {
            using (NewContext)
            {
                var settings = Settings.Create(new[] {"-pn", "HelloWorld"});
                Assert.Equal("HelloWorld", settings.PackageName);
            }
        }

        [Fact]
        public void CreateWithValidParametersWorks()
        {
            using (NewContext)
            {
                var settings = Settings.Create(new[]
                {
                    "-Help", " -Input", "c:\\input",
                    "-outputDirectory", " c:\\output", "-clientName", "MyClient",
                    "-ModelsName", "MyModels"
                });
                Assert.True(settings.ShowHelp);
                Assert.Equal("c:\\input", settings.Input);
                Assert.Equal("c:\\output", settings.OutputDirectory);
                Assert.Equal("MyClient", settings.ClientName);
                Assert.Equal("MyModels", settings.ModelsName);
            }
        }

        [Fact]
        public void CreateWithAliasedParametersWorks()
        {
            using (NewContext)
            {
                var settings = Settings.Create(new[]
                {
                    "-h", " --i", "/c/input",
                    "-output", " c:\\output", "-clientName", "MyClient",
                    "-mname", "MyModels"
                });
                Assert.True(settings.ShowHelp);
                Assert.Equal("/c/input", settings.Input);
                Assert.Equal("c:\\output", settings.OutputDirectory);
                Assert.Equal("MyClient", settings.ClientName);
                Assert.Equal("MyModels", settings.ModelsName);
            }
        }

        [Fact]
        public void IntegerParameterWorks()
        {
            using (NewContext)
            {
                var settings = Settings.Create(new[]
                {
                    "-ft", "3", "-PayloadFlatteningThreshold", "4"
                });
                Assert.Equal(4, settings.PayloadFlatteningThreshold);
            }
        }

        [Fact]
        public void MissingParameterThrowsException()
        {
            using (NewContext)
            {
                var settings = Settings.Create(new[] {"-Modeler", "foo"});
                try
                {
                    settings.Validate();
                    Assert.True(false);
                }
                catch (CodeGenerationException e)
                {
                    Assert.NotNull(e.InnerExceptions);
                    Assert.True(e.Message.Equals(string.Format("Parameter '{0}' is required.", "Input")));
                }
            }
        }
    }
}
