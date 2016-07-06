﻿// Copyright (c) Microsoft Open Technologies, Inc. All rights reserved.
// Licensed under the Apache License, Version 2.0. See License.txt in the project root for license information.

using AutoRest.Core.ClientModel;
using AutoRest.Core.Utilities;

namespace AutoRest.CSharp.TemplateModels
{
    public class PropertyTemplateModel : Property
    {
        public PropertyTemplateModel(Property source)
        {
            this.LoadFrom(source);
        }
    }
}