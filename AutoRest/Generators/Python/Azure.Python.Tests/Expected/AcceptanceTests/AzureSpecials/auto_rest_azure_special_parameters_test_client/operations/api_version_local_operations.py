# --------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
#
# Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

import sys


from msrest.serialization import Serializer, Deserializer
from msrest.service_client import async_request
from msrest.exceptions import (
    DeserializationError,
    HttpOperationError)
import uuid

from ..models import *


class api_version_localOperations(object):

    def __init__(self, client, config, serializer, derserializer):

        self._client = client
        self._serialize = serializer
        self._deserialize = derserializer

        self.config = config

    def _parse_url(self, name, value, datatype):

        try:
            value = self._serialize.serialize_data(value, datatype)

        except ValueError:
            raise ValueError("{} must not be None.".format(name))

        except DeserializationError:
            raise TypeError("{} must be type {}.".format(name, datatype))

        else:
            return value

    @async_request
    def get_method_local_valid(self, api_version, custom_headers={}, raw=False, callback=None):
        """

        Get method with api-version modeled in the method.  pass in
        api-version = '2.0' to succeed

        :param api_version: This should appear as a method parameter, use
        value '2.0'. Possible values for this parameter include: '2.0'
        :param custom_headers: headers that will be added to the request
        :param raw: returns the direct response alongside the deserialized
        response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type api_version: str
        :type custom_headers: dict
        :type raw: boolean
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """

        # Construct URL
        url = '/azurespecials/apiVersion/method/string/none/query/local/2.0'

        # Construct parameters
        query = {}
        if api_version is not None:
            query['api-version'] = self._parse_url("api_version", api_version, 'str', False)

        # Construct headers
        headers = {}
        if self.config.accept_language is not None:
            headers['accept-language'] = self._serialize.serialize_data(self.config.accept_language, 'str')
        headers.update(custom_headers)
        headers['x-ms-client-request-id'] = str(uuid.uuid1())
        headers['Content-Type'] = 'application/json; charset=utf-8'

        # Construct and send request
        request = self._client.get(url, query)
        response = self._client.send(request, headers)

        if response.status_code not in [200]:
            raise ErrorException(self._deserialize, response)

        if raw:
            return None, response

    @async_request
    def get_method_local_null(self, api_version, custom_headers={}, raw=False, callback=None):
        """

        Get method with api-version modeled in the method.  pass in
        api-version = null to succeed

        :param api_version: This should appear as a method parameter, use
        value null, this should result in no serialized parameter
        :param custom_headers: headers that will be added to the request
        :param raw: returns the direct response alongside the deserialized
        response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type api_version: str or none
        :type custom_headers: dict
        :type raw: boolean
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """

        # Construct URL
        url = '/azurespecials/apiVersion/method/string/none/query/local/null'

        # Construct parameters
        query = {}
        if api_version is not None:
            query['api-version'] = self._parse_url("api_version", api_version, 'str', False)

        # Construct headers
        headers = {}
        if self.config.accept_language is not None:
            headers['accept-language'] = self._serialize.serialize_data(self.config.accept_language, 'str')
        headers.update(custom_headers)
        headers['x-ms-client-request-id'] = str(uuid.uuid1())
        headers['Content-Type'] = 'application/json; charset=utf-8'

        # Construct and send request
        request = self._client.get(url, query)
        response = self._client.send(request, headers)

        if response.status_code not in [200]:
            raise ErrorException(self._deserialize, response)

        if raw:
            return None, response

    @async_request
    def get_path_local_valid(self, api_version, custom_headers={}, raw=False, callback=None):
        """

        Get method with api-version modeled in the method.  pass in
        api-version = '2.0' to succeed

        :param api_version: This should appear as a method parameter, use
        value '2.0'. Possible values for this parameter include: '2.0'
        :param custom_headers: headers that will be added to the request
        :param raw: returns the direct response alongside the deserialized
        response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type api_version: str
        :type custom_headers: dict
        :type raw: boolean
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """

        # Construct URL
        url = '/azurespecials/apiVersion/path/string/none/query/local/2.0'

        # Construct parameters
        query = {}
        if api_version is not None:
            query['api-version'] = self._parse_url("api_version", api_version, 'str', False)

        # Construct headers
        headers = {}
        if self.config.accept_language is not None:
            headers['accept-language'] = self._serialize.serialize_data(self.config.accept_language, 'str')
        headers.update(custom_headers)
        headers['x-ms-client-request-id'] = str(uuid.uuid1())
        headers['Content-Type'] = 'application/json; charset=utf-8'

        # Construct and send request
        request = self._client.get(url, query)
        response = self._client.send(request, headers)

        if response.status_code not in [200]:
            raise ErrorException(self._deserialize, response)

        if raw:
            return None, response

    @async_request
    def get_swagger_local_valid(self, api_version, custom_headers={}, raw=False, callback=None):
        """

        Get method with api-version modeled in the method.  pass in
        api-version = '2.0' to succeed

        :param api_version: The api version, which appears in the query, the
        value is always '2.0'. Possible values for this parameter include:
        '2.0'
        :param custom_headers: headers that will be added to the request
        :param raw: returns the direct response alongside the deserialized
        response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type api_version: str
        :type custom_headers: dict
        :type raw: boolean
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """

        # Construct URL
        url = '/azurespecials/apiVersion/swagger/string/none/query/local/2.0'

        # Construct parameters
        query = {}
        if api_version is not None:
            query['api-version'] = self._parse_url("api_version", api_version, 'str', False)

        # Construct headers
        headers = {}
        if self.config.accept_language is not None:
            headers['accept-language'] = self._serialize.serialize_data(self.config.accept_language, 'str')
        headers.update(custom_headers)
        headers['x-ms-client-request-id'] = str(uuid.uuid1())
        headers['Content-Type'] = 'application/json; charset=utf-8'

        # Construct and send request
        request = self._client.get(url, query)
        response = self._client.send(request, headers)

        if response.status_code not in [200]:
            raise ErrorException(self._deserialize, response)

        if raw:
            return None, response
