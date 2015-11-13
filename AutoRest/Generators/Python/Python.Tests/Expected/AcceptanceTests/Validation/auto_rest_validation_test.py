#--------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
# 
# Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
#--------------------------------------------------------------------------


from msrest import ServiceClient, Configuration
from msrest import Serializer, Deserializer
from msrest.exceptions import (
    SerializationError,
    DeserializationError,
    TokenExpiredError,
    ClientRequestError,
    HttpOperationError)
import models

class AutoRestValidationTestConfiguration(Configuration):

    def __init__(self, subscription_id, api_version, base_url=None, filepath=None):

        if not base_url:
            base_url = 'http://localhost'

        super(AutoRestValidationTestConfiguration, self).__init__(base_url, filepath)

        self.subscription_id = subscription_id;
        self.api_version = api_version;


class AutoRestValidationTest(object):

    def __init__(self, config):

        self._client = ServiceClient(None, config) 

        client_models = {k:v for k,v in models.__dict__.items() if isinstance(v, type)}
        self._serialize = Serializer()
        self._deserialize = Deserializer(client_models)

        self.config = config


    def _parse_url(self, name, value, datatype):

        try:
            value = self._serialize.serialize_data(value, str(datatype))

        except ValueError:
            raise ValueError("{} must not be None.".format(name))

        except DeserializationError:
            raise TypeError("{} must be type {}.".format(name, datatype))

        else:
            return value

    @ServiceClient.async_request
    def validation_of_method_parameters(self, resource_group_name, id, custom_headers = {}, raw = False, callback = None):
        """

        Validates input parameters on the method. See swagger for details.
        """

        # Construct URL
        url = '/fakepath/{subscriptionId}/{resourceGroupName}/{id}?api-version={apiVersion}'
        path_format_arguments = {
            'subscriptionId' : self._parse_url("self.config.subscription_id", self.config.subscription_id, 'str', False),
            'resourceGroupName' : self._parse_url("resource_group_name", resource_group_name, 'str', False),
            'id' : self._parse_url("id", id, 'int', False)}
        url = url.format(**path_format_arguments)

        # Construct parameters
        query = {}
        if self.config.api_version is not None:
            query['apiVersion'] = self._parse_url("self.config.api_version", self.config.api_version, 'str', False)

        # Construct headers
        headers = {}
        headers.update(custom_headers)
        headers['Content-Type'] = 'application/json; charset=utf-8'

        # Construct and send request
        request = self._client.get(url, query)
        response = self._client.send(request, headers)

        if response.status_code not in [200]:
            raise ErrorException(self._deserialize, response)

        deserialized = None

        if response.status_code == 200:
            deserialized = self._deserialize('Product', response)

        if raw:
            return deserialized, response

        return deserialized

    @ServiceClient.async_request
    def validation_of_body(self, resource_group_name, id, body, custom_headers = {}, raw = False, callback = None):
        """

        Validates body parameters on the method. See swagger for details.
        """

        # Construct URL
        url = '/fakepath/{subscriptionId}/{resourceGroupName}/{id}?api-version={apiVersion}'
        path_format_arguments = {
            'subscriptionId' : self._parse_url("self.config.subscription_id", self.config.subscription_id, 'str', False),
            'resourceGroupName' : self._parse_url("resource_group_name", resource_group_name, 'str', False),
            'id' : self._parse_url("id", id, 'int', False)}
        url = url.format(**path_format_arguments)

        # Construct parameters
        query = {}
        if self.config.api_version is not None:
            query['apiVersion'] = self._parse_url("self.config.api_version", self.config.api_version, 'str', False)

        # Construct headers
        headers = {}
        headers.update(custom_headers)
        headers['Content-Type'] = 'application/json; charset=utf-8'

        # Construct body
        content = self._serialize(body)

        # Construct and send request
        request = self._client.put(url, query)
        response = self._client.send(request, headers, content)

        if response.status_code not in [200]:
            raise ErrorException(self._deserialize, response)

        deserialized = None

        if response.status_code == 200:
            deserialized = self._deserialize('Product', response)

        if raw:
            return deserialized, response

        return deserialized
