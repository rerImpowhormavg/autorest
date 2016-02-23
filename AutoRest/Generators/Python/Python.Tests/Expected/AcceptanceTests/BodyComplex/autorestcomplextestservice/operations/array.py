# coding=utf-8
# --------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
#
# Code generated by Microsoft (R) AutoRest Code Generator.
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.pipeline import ClientRawResponse

from .. import models


class Array(object):
    """Array operations.

    :param client: Client for service requests.
    :param config: Configuration of service client.
    :param serializer: An object model serializer.
    :param deserializer: An objec model deserializer.
    """

    def __init__(self, client, config, serializer, deserializer):

        self._client = client
        self._serialize = serializer
        self._deserialize = deserializer

        self.config = config

    def get_valid(
            self, custom_headers={}, raw=False, **operation_config):
        """
        Get complex types with array property

        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: ArrayWrapper
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        # Construct URL
        url = '/complex/array/valid'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct and send request
        request = self._client.get(url, query_parameters)
        response = self._client.send(request, header_parameters, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        deserialized = None

        if response.status_code == 200:
            deserialized = self._deserialize('ArrayWrapper', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized

    def put_valid(
            self, array=None, custom_headers={}, raw=False, **operation_config):
        """
        Put complex types with array property

        :param array:
        :type array: list
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: None
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        complex_body = models.ArrayWrapper(array=array)

        # Construct URL
        url = '/complex/array/valid'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        body_content = self._serialize.body(complex_body, 'ArrayWrapper')

        # Construct and send request
        request = self._client.put(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def get_empty(
            self, custom_headers={}, raw=False, **operation_config):
        """
        Get complex types with array property which is empty

        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: ArrayWrapper
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        # Construct URL
        url = '/complex/array/empty'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct and send request
        request = self._client.get(url, query_parameters)
        response = self._client.send(request, header_parameters, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        deserialized = None

        if response.status_code == 200:
            deserialized = self._deserialize('ArrayWrapper', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized

    def put_empty(
            self, array=None, custom_headers={}, raw=False, **operation_config):
        """
        Put complex types with array property which is empty

        :param array:
        :type array: list
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: None
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        complex_body = models.ArrayWrapper(array=array)

        # Construct URL
        url = '/complex/array/empty'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        body_content = self._serialize.body(complex_body, 'ArrayWrapper')

        # Construct and send request
        request = self._client.put(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def get_not_provided(
            self, custom_headers={}, raw=False, **operation_config):
        """
        Get complex types with array property while server doesn't provide a
        response payload

        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: ArrayWrapper
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        # Construct URL
        url = '/complex/array/notprovided'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct and send request
        request = self._client.get(url, query_parameters)
        response = self._client.send(request, header_parameters, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        deserialized = None

        if response.status_code == 200:
            deserialized = self._deserialize('ArrayWrapper', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized
