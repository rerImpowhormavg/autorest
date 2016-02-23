﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.


using System;
using Microsoft.Rest.Generator.ClientModel;

namespace Microsoft.Rest.Generator
{
    /// <summary>
    /// Extensions methods for client model.
    /// </summary>
    public static class ClientModelHelpers
    {
        /// <summary>
        /// Returns true if property has x-ms-client-flatten extension and its value is true.
        /// </summary>
        /// <param name="propertyToCheck">Property to check.</param>
        /// <returns></returns>
        public static bool ShouldBeFlattened(this IParameter propertyToCheck)
        {
            if (propertyToCheck == null)
            {
                throw new ArgumentNullException("propertyToCheck");
            }

            return propertyToCheck.Extensions.ContainsKey(Extensions.FlattenExtension) &&
                (bool)propertyToCheck.Extensions[Extensions.FlattenExtension];
        }

        /// <summary>
        /// Returns true if property was flattened via x-ms-client-flatten extension.
        /// </summary>
        /// <param name="propertyToCheck">Property to check.</param>
        /// <returns></returns>
        public static bool WasFlattened(this IParameter propertyToCheck)
        {
            if (propertyToCheck == null)
            {
                throw new ArgumentNullException("propertyToCheck");
            }

            return propertyToCheck.Extensions.ContainsKey(Extensions.FlattenOriginalTypeName);
        }
    }
}