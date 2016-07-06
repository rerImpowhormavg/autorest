﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

namespace AutoRest.Core.ClientModel
{
    /// <summary>
    /// Defines an interface for client model types.
    /// </summary>
    public interface IType
    {
        /// <summary>
        /// Gets or sets the IType name.
        /// </summary>
        string Name { get; }
    }
}