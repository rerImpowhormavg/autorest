// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.
// 

using AutoRest.Core;
using AutoRest.Core.Extensibility;

namespace AutoRest.CSharp.JsonRpcClient
{
    public class GeneratorSettingsCs : IGeneratorSettings
    {
        public virtual string Name => "CSharp.JsonRpcClient";

        public virtual string Description => "Generic C# code generator.";

        /// <summary>
        ///     Indicates whether ctor needs to be generated with internal protection level.
        /// </summary>
        [SettingsAlias("internal")]
        public bool InternalConstructors { get; set; }

        /// <summary>
        ///     Specifies mode for generating sync wrappers.
        /// </summary>
        [SettingsAlias("syncMethods")]
        public SyncMethodsGenerationMode SyncMethods { get; set; }

        public bool UseDateTimeOffset { get; set; }
    }
}