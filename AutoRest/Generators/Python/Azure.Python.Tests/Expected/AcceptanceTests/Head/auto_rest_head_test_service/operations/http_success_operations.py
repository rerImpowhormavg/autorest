# coding=utf-8
# --------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
#
# Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.service_client import async_request
from msrest.pipeline import ClientRawResponse
from msrestazure.azure_exceptions import CloudError
import uuid


class HttpSuccessOperations(object):

    def __init__(self, client, config, serializer, derserializer):

        self._client = client
        self._serialize = serializer
        self._deserialize = derserializer

        self.config = config

    @async_request
    def head200(
            self, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Return 200 status code if successful

        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: bool or (bool, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/http/success/200'

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        header_parameters['x-ms-client-request-id'] = str(uuid.uuid1())
        if custom_headers:
            header_parameters.update(custom_headers)
        if self.config.accept_language is not None:
            header_parameters['accept-language'] = self._serialize.header("self.config.accept_language", self.config.accept_language, 'str')

        # Construct and send request
        request = self._client.head(url, query_parameters)
        response = self._client.send(request, header_parameters, **operation_config)

        if response.status_code not in [200, 404]:
            raise CloudError(response)

        deserialized = (response.status_code == 200)
        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response
        return deserialized

    @async_request
    def head204(
            self, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Return 204 status code if successful

        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: bool or (bool, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/http/success/204'

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        header_parameters['x-ms-client-request-id'] = str(uuid.uuid1())
        if custom_headers:
            header_parameters.update(custom_headers)
        if self.config.accept_language is not None:
            header_parameters['accept-language'] = self._serialize.header("self.config.accept_language", self.config.accept_language, 'str')

        # Construct and send request
        request = self._client.head(url, query_parameters)
        response = self._client.send(request, header_parameters, **operation_config)

        if response.status_code not in [204, 404]:
            raise CloudError(response)

        deserialized = (response.status_code == 204)
        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response
        return deserialized

    @async_request
    def head404(
            self, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Return 404 status code if successful

        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: bool or (bool, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/http/success/404'

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        header_parameters['x-ms-client-request-id'] = str(uuid.uuid1())
        if custom_headers:
            header_parameters.update(custom_headers)
        if self.config.accept_language is not None:
            header_parameters['accept-language'] = self._serialize.header("self.config.accept_language", self.config.accept_language, 'str')

        # Construct and send request
        request = self._client.head(url, query_parameters)
        response = self._client.send(request, header_parameters, **operation_config)

        if response.status_code not in [204, 404]:
            raise CloudError(response)

        deserialized = (response.status_code == 204)
        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response
        return deserialized
