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


class Explicit(object):
    """Explicit operations.

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

    def post_required_integer_parameter(
            self, body_parameter, custom_headers={}, raw=False, **operation_config):
        """
        Test explicitly required integer. Please put null and the client
        library should throw before the request is sent.

        :param body_parameter:
        :type body_parameter: int
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: Error
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        # Construct URL
        url = '/reqopt/requied/integer/parameter'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        body_content = self._serialize.body(body_parameter, 'int')

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code < 200 or response.status_code >= 300:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def post_optional_integer_parameter(
            self, body_parameter=None, custom_headers={}, raw=False, **operation_config):
        """
        Test explicitly optional integer. Please put null.

        :param body_parameter:
        :type body_parameter: int
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: None
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        # Construct URL
        url = '/reqopt/optional/integer/parameter'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        if body_parameter is not None:
            body_content = self._serialize.body(body_parameter, 'int')
        else:
            body_content = None

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def post_required_integer_property(
            self, value, custom_headers={}, raw=False, **operation_config):
        """
        Test explicitly required integer. Please put a valid int-wrapper with
        'value' = null and the client library should throw before the request
        is sent.

        :param value:
        :type value: int
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: Error
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        body_parameter = models.IntWrapper(value=value)

        # Construct URL
        url = '/reqopt/requied/integer/property'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        body_content = self._serialize.body(body_parameter, 'IntWrapper')

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code < 200 or response.status_code >= 300:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def post_optional_integer_property(
            self, value=None, custom_headers={}, raw=False, **operation_config):
        """
        Test explicitly optional integer. Please put a valid int-wrapper with
        'value' = null.

        :param value:
        :type value: int
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: None
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        body_parameter = models.IntOptionalWrapper(value=value)

        # Construct URL
        url = '/reqopt/optional/integer/property'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        if body_parameter is not None:
            body_content = self._serialize.body(body_parameter, 'IntOptionalWrapper')
        else:
            body_content = None

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def post_required_integer_header(
            self, header_parameter, custom_headers={}, raw=False, **operation_config):
        """
        Test explicitly required integer. Please put a header
        'headerParameter' => null and the client library should throw before
        the request is sent.

        :param header_parameter:
        :type header_parameter: int
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: Error
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        # Construct URL
        url = '/reqopt/requied/integer/header'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)
        header_parameters['headerParameter'] = self._serialize.header("header_parameter", header_parameter, 'int')

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(request, header_parameters, **operation_config)

        if response.status_code < 200 or response.status_code >= 300:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def post_optional_integer_header(
            self, header_parameter=None, custom_headers={}, raw=False, **operation_config):
        """
        Test explicitly optional integer. Please put a header
        'headerParameter' => null.

        :param header_parameter:
        :type header_parameter: int
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: None
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        # Construct URL
        url = '/reqopt/optional/integer/header'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)
        if header_parameter is not None:
            header_parameters['headerParameter'] = self._serialize.header("header_parameter", header_parameter, 'int')

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(request, header_parameters, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def post_required_string_parameter(
            self, body_parameter, custom_headers={}, raw=False, **operation_config):
        """
        Test explicitly required string. Please put null and the client
        library should throw before the request is sent.

        :param body_parameter:
        :type body_parameter: str
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: Error
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        # Construct URL
        url = '/reqopt/requied/string/parameter'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        body_content = self._serialize.body(body_parameter, 'str')

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code < 200 or response.status_code >= 300:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def post_optional_string_parameter(
            self, body_parameter=None, custom_headers={}, raw=False, **operation_config):
        """
        Test explicitly optional string. Please put null.

        :param body_parameter:
        :type body_parameter: str
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: None
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        # Construct URL
        url = '/reqopt/optional/string/parameter'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        if body_parameter is not None:
            body_content = self._serialize.body(body_parameter, 'str')
        else:
            body_content = None

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def post_required_string_property(
            self, value, custom_headers={}, raw=False, **operation_config):
        """
        Test explicitly required string. Please put a valid string-wrapper
        with 'value' = null and the client library should throw before the
        request is sent.

        :param value:
        :type value: str
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: Error
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        body_parameter = models.StringWrapper(value=value)

        # Construct URL
        url = '/reqopt/requied/string/property'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        body_content = self._serialize.body(body_parameter, 'StringWrapper')

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code < 200 or response.status_code >= 300:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def post_optional_string_property(
            self, value=None, custom_headers={}, raw=False, **operation_config):
        """
        Test explicitly optional integer. Please put a valid string-wrapper
        with 'value' = null.

        :param value:
        :type value: str
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: None
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        body_parameter = models.StringOptionalWrapper(value=value)

        # Construct URL
        url = '/reqopt/optional/string/property'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        if body_parameter is not None:
            body_content = self._serialize.body(body_parameter, 'StringOptionalWrapper')
        else:
            body_content = None

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def post_required_string_header(
            self, header_parameter, custom_headers={}, raw=False, **operation_config):
        """
        Test explicitly required string. Please put a header 'headerParameter'
        => null and the client library should throw before the request is
        sent.

        :param header_parameter:
        :type header_parameter: str
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: Error
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        # Construct URL
        url = '/reqopt/requied/string/header'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)
        header_parameters['headerParameter'] = self._serialize.header("header_parameter", header_parameter, 'str')

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(request, header_parameters, **operation_config)

        if response.status_code < 200 or response.status_code >= 300:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def post_optional_string_header(
            self, body_parameter=None, custom_headers={}, raw=False, **operation_config):
        """
        Test explicitly optional string. Please put a header 'headerParameter'
        => null.

        :param body_parameter:
        :type body_parameter: str
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: None
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        # Construct URL
        url = '/reqopt/optional/string/header'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)
        if body_parameter is not None:
            header_parameters['bodyParameter'] = self._serialize.header("body_parameter", body_parameter, 'str')

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(request, header_parameters, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def post_required_class_parameter(
            self, body_parameter, custom_headers={}, raw=False, **operation_config):
        """
        Test explicitly required complex object. Please put null and the
        client library should throw before the request is sent.

        :param body_parameter:
        :type body_parameter: Product
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: Error
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        # Construct URL
        url = '/reqopt/requied/class/parameter'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        body_content = self._serialize.body(body_parameter, 'Product')

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code < 200 or response.status_code >= 300:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def post_optional_class_parameter(
            self, body_parameter=None, custom_headers={}, raw=False, **operation_config):
        """
        Test explicitly optional complex object. Please put null.

        :param body_parameter:
        :type body_parameter: Product
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: None
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        # Construct URL
        url = '/reqopt/optional/class/parameter'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        if body_parameter is not None:
            body_content = self._serialize.body(body_parameter, 'Product')
        else:
            body_content = None

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def post_required_class_property(
            self, value, custom_headers={}, raw=False, **operation_config):
        """
        Test explicitly required complex object. Please put a valid
        class-wrapper with 'value' = null and the client library should throw
        before the request is sent.

        :param value:
        :type value: Product
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: Error
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        body_parameter = models.ClassWrapper(value=value)

        # Construct URL
        url = '/reqopt/requied/class/property'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        body_content = self._serialize.body(body_parameter, 'ClassWrapper')

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code < 200 or response.status_code >= 300:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def post_optional_class_property(
            self, value=None, custom_headers={}, raw=False, **operation_config):
        """
        Test explicitly optional complex object. Please put a valid
        class-wrapper with 'value' = null.

        :param value:
        :type value: Product
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: None
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        body_parameter = models.ClassOptionalWrapper(value=value)

        # Construct URL
        url = '/reqopt/optional/class/property'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        if body_parameter is not None:
            body_content = self._serialize.body(body_parameter, 'ClassOptionalWrapper')
        else:
            body_content = None

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def post_required_array_parameter(
            self, body_parameter, custom_headers={}, raw=False, **operation_config):
        """
        Test explicitly required array. Please put null and the client library
        should throw before the request is sent.

        :param body_parameter:
        :type body_parameter: list
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: Error
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        # Construct URL
        url = '/reqopt/requied/array/parameter'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        body_content = self._serialize.body(body_parameter, '[str]')

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code < 200 or response.status_code >= 300:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def post_optional_array_parameter(
            self, body_parameter=None, custom_headers={}, raw=False, **operation_config):
        """
        Test explicitly optional array. Please put null.

        :param body_parameter:
        :type body_parameter: list
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: None
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        # Construct URL
        url = '/reqopt/optional/array/parameter'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        if body_parameter is not None:
            body_content = self._serialize.body(body_parameter, '[str]')
        else:
            body_content = None

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def post_required_array_property(
            self, value, custom_headers={}, raw=False, **operation_config):
        """
        Test explicitly required array. Please put a valid array-wrapper with
        'value' = null and the client library should throw before the request
        is sent.

        :param value:
        :type value: list
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: Error
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        body_parameter = models.ArrayWrapper(value=value)

        # Construct URL
        url = '/reqopt/requied/array/property'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        body_content = self._serialize.body(body_parameter, 'ArrayWrapper')

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code < 200 or response.status_code >= 300:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def post_optional_array_property(
            self, value=None, custom_headers={}, raw=False, **operation_config):
        """
        Test explicitly optional array. Please put a valid array-wrapper with
        'value' = null.

        :param value:
        :type value: list
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: None
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        body_parameter = models.ArrayOptionalWrapper(value=value)

        # Construct URL
        url = '/reqopt/optional/array/property'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        if body_parameter is not None:
            body_content = self._serialize.body(body_parameter, 'ArrayOptionalWrapper')
        else:
            body_content = None

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def post_required_array_header(
            self, header_parameter, custom_headers={}, raw=False, **operation_config):
        """
        Test explicitly required array. Please put a header 'headerParameter'
        => null and the client library should throw before the request is
        sent.

        :param header_parameter:
        :type header_parameter: list
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: Error
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        # Construct URL
        url = '/reqopt/requied/array/header'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)
        header_parameters['headerParameter'] = self._serialize.header("header_parameter", header_parameter, '[str]', div=',')

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(request, header_parameters, **operation_config)

        if response.status_code < 200 or response.status_code >= 300:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    def post_optional_array_header(
            self, header_parameter=None, custom_headers={}, raw=False, **operation_config):
        """
        Test explicitly optional integer. Please put a header
        'headerParameter' => null.

        :param header_parameter:
        :type header_parameter: list
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
         deserialized response
        :rtype: None
        :rtype: msrest.pipeline.ClientRawResponse if raw=True
        """
        # Construct URL
        url = '/reqopt/optional/array/header'
        url = self._client.format_url(url)

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)
        if header_parameter is not None:
            header_parameters['headerParameter'] = self._serialize.header("header_parameter", header_parameter, '[str]', div=',')

        # Construct and send request
        request = self._client.post(url, query_parameters)
        response = self._client.send(request, header_parameters, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response
