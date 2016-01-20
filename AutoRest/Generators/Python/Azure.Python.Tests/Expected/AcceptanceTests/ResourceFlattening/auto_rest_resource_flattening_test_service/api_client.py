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

from msrest.service_client import ServiceClient
from msrest import Serializer, Deserializer
from msrestazure import AzureConfiguration
from msrest.pipeline import ClientRawResponse
import uuid
from . import models


class AutoRestResourceFlatteningTestServiceConfiguration(AzureConfiguration):

    def __init__(
            self, credentials, accept_language='en-US', long_running_operation_retry_timeout=None, base_url=None, filepath=None):

        if credentials is None:
            raise ValueError('credentials must not be None.')
        if not base_url:
            base_url = 'http://localhost'

        super(AutoRestResourceFlatteningTestServiceConfiguration, self).__init__(base_url, filepath)

        self.user_agent = 'auto_rest_resource_flattening_test_service/1.0.0'

        self.credentials = credentials
        self.accept_language = accept_language
        self.long_running_operation_retry_timeout = long_running_operation_retry_timeout


class AutoRestResourceFlatteningTestService(object):

    def __init__(self, config):

        self._client = ServiceClient(config.credentials, config)

        client_models = {k: v for k, v in models.__dict__.items() if isinstance(v, type)}
        self._serialize = Serializer()
        self._deserialize = Deserializer(client_models)

        self.config = config

    def put_array(
            self, resource_array=None, custom_headers={}, raw=False, **operation_config):
        """
        Put External Resource as an Array

        :param resource_array: External Resource as an Array to put
        :type resource_array: list or None
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/azure/resource-flatten/array'

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

        # Construct body
        if resource_array is not None:
            body_content = self._serialize.body(resource_array, '[Resource]')
        else:
            body_content = None

        # Construct and send request
        request = self._client.put(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def get_array(
            self, custom_headers={}, raw=False, **operation_config):
        """
        Get External Resource as an Array

        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :rtype: list or (list, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/azure/resource-flatten/array'

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
        request = self._client.get(url, query_parameters)
        response = self._client.send(request, header_parameters, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        deserialized = None

        if response.status_code == 200:
            deserialized = self._deserialize('[FlattenedProduct]', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized

    def put_dictionary(
            self, resource_dictionary=None, custom_headers={}, raw=False, **operation_config):
        """
        Put External Resource as a Dictionary

        :param resource_dictionary: External Resource as a Dictionary to put
        :type resource_dictionary: dict or None
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/azure/resource-flatten/dictionary'

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

        # Construct body
        if resource_dictionary is not None:
            body_content = self._serialize.body(resource_dictionary, '{FlattenedProduct}')
        else:
            body_content = None

        # Construct and send request
        request = self._client.put(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def get_dictionary(
            self, custom_headers={}, raw=False, **operation_config):
        """
        Get External Resource as a Dictionary

        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :rtype: dict or (dict, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/azure/resource-flatten/dictionary'

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
        request = self._client.get(url, query_parameters)
        response = self._client.send(request, header_parameters, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        deserialized = None

        if response.status_code == 200:
            deserialized = self._deserialize('{FlattenedProduct}', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized

    def put_resource_collection(
            self, resource_complex_object=None, custom_headers={}, raw=False, **operation_config):
        """
        Put External Resource as a ResourceCollection

        :param resource_complex_object: External Resource as a
        ResourceCollection to put
        :type resource_complex_object: ResourceCollection or None
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/azure/resource-flatten/resourcecollection'

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

        # Construct body
        if resource_complex_object is not None:
            body_content = self._serialize.body(resource_complex_object, 'ResourceCollection')
        else:
            body_content = None

        # Construct and send request
        request = self._client.put(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def get_resource_collection(
            self, custom_headers={}, raw=False, **operation_config):
        """
        Get External Resource as a ResourceCollection

        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :rtype: ResourceCollection or (ResourceCollection, requests.response)
        or concurrent.futures.Future
        """
        # Construct URL
        url = '/azure/resource-flatten/resourcecollection'

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
        request = self._client.get(url, query_parameters)
        response = self._client.send(request, header_parameters, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        deserialized = None

        if response.status_code == 200:
            deserialized = self._deserialize('ResourceCollection', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized
