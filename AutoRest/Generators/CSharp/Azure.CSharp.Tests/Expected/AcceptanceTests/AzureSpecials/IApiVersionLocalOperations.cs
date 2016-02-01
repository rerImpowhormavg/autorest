// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

namespace Fixtures.Azure.AcceptanceTestsAzureSpecials
{
    using System;
    using System.Collections.Generic;
    using System.Net.Http;
    using System.Threading;
    using System.Threading.Tasks;
    using Microsoft.Rest;
    using Microsoft.Rest.Azure;
    using Models;

    /// <summary>
    /// ApiVersionLocalOperations operations.
    /// </summary>
    public partial interface IApiVersionLocalOperations
    {
        /// <summary>
        /// Get method with api-version modeled in the method.  pass in
        /// api-version = '2.0' to succeed
        /// </summary>
        /// <param name='apiVersion'>
        /// This should appear as a method parameter, use value '2.0'.
        /// Possible values for this parameter include: '2.0'
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<AzureOperationResponse> GetMethodLocalValidWithHttpMessagesAsync(string apiVersion, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get method with api-version modeled in the method.  pass in
        /// api-version = null to succeed
        /// </summary>
        /// <param name='apiVersion'>
        /// This should appear as a method parameter, use value null, this
        /// should result in no serialized parameter
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<AzureOperationResponse> GetMethodLocalNullWithHttpMessagesAsync(string apiVersion = default(string), Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get method with api-version modeled in the method.  pass in
        /// api-version = '2.0' to succeed
        /// </summary>
        /// <param name='apiVersion'>
        /// This should appear as a method parameter, use value '2.0'.
        /// Possible values for this parameter include: '2.0'
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<AzureOperationResponse> GetPathLocalValidWithHttpMessagesAsync(string apiVersion, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
        /// <summary>
        /// Get method with api-version modeled in the method.  pass in
        /// api-version = '2.0' to succeed
        /// </summary>
        /// <param name='apiVersion'>
        /// The api version, which appears in the query, the value is always
        /// '2.0'. Possible values for this parameter include: '2.0'
        /// </param>
        /// <param name='customHeaders'>
        /// The headers that will be added to request.
        /// </param>
        /// <param name='cancellationToken'>
        /// The cancellation token.
        /// </param>
        Task<AzureOperationResponse> GetSwaggerLocalValidWithHttpMessagesAsync(string apiVersion, Dictionary<string, List<string>> customHeaders = null, CancellationToken cancellationToken = default(CancellationToken));
    }
}
