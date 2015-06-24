﻿// Copyright (c) Microsoft Open Technologies, Inc. All rights reserved.
// Licensed under the Apache License, Version 2.0. See License.txt in the project root for license information.

using Microsoft.Rest.Generator.ClientModel;
using Microsoft.Rest.Generator.Utilities;

namespace Microsoft.Rest.Generator.CSharp
{
    public class EnumTemplateModel : EnumType
    {
        public EnumTemplateModel(EnumType source)
        {
            this.LoadFrom(source);
        }
        /// <summary>
        /// Trim the Trailing '?' from the Type Name so that it 
        /// does not occur in the type definition
        /// </summary>
        public string TypeDefinitionName
        {
            get
            {
                return this.Name.TrimEnd('?');
            }
        }
    }
}