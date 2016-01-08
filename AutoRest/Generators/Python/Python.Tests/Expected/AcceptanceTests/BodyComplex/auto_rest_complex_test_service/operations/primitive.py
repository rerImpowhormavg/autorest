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

from .. import models


class Primitive(object):

    def __init__(self, client, config, serializer, derserializer):

        self._client = client
        self._serialize = serializer
        self._deserialize = derserializer

        self.config = config

    @async_request
    def get_int(
            self, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Get complex types with integer properties

        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: intwrapper or (intwrapper, requests.response) or
        concurrent.futures.Future
        """
        # Construct URL
        url = '/complex/primitive/integer'

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
            deserialized = self._deserialize('IntWrapper', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized

    @async_request
    def put_int(
            self, complex_body, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Put complex types with integer properties

        :param complex_body: Please put -1 and 2
        :type complex_body: intwrapper
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/complex/primitive/integer'

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        body_content = self._serialize.body(complex_body, 'IntWrapper')

        # Construct and send request
        request = self._client.put(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    @async_request
    def get_long(
            self, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Get complex types with long properties

        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: longwrapper or (longwrapper, requests.response) or
        concurrent.futures.Future
        """
        # Construct URL
        url = '/complex/primitive/long'

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
            deserialized = self._deserialize('LongWrapper', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized

    @async_request
    def put_long(
            self, complex_body, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Put complex types with long properties

        :param complex_body: Please put 1099511627775 and -999511627788
        :type complex_body: longwrapper
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/complex/primitive/long'

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        body_content = self._serialize.body(complex_body, 'LongWrapper')

        # Construct and send request
        request = self._client.put(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    @async_request
    def get_float(
            self, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Get complex types with float properties

        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: floatwrapper or (floatwrapper, requests.response) or
        concurrent.futures.Future
        """
        # Construct URL
        url = '/complex/primitive/float'

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
            deserialized = self._deserialize('FloatWrapper', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized

    @async_request
    def put_float(
            self, complex_body, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Put complex types with float properties

        :param complex_body: Please put 1.05 and -0.003
        :type complex_body: floatwrapper
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/complex/primitive/float'

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        body_content = self._serialize.body(complex_body, 'FloatWrapper')

        # Construct and send request
        request = self._client.put(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    @async_request
    def get_double(
            self, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Get complex types with double properties

        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: doublewrapper or (doublewrapper, requests.response) or
        concurrent.futures.Future
        """
        # Construct URL
        url = '/complex/primitive/double'

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
            deserialized = self._deserialize('DoubleWrapper', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized

    @async_request
    def put_double(
            self, complex_body, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Put complex types with double properties

        :param complex_body: Please put 3e-100 and
        -0.000000000000000000000000000000000000000000000000000000005
        :type complex_body: doublewrapper
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/complex/primitive/double'

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        body_content = self._serialize.body(complex_body, 'DoubleWrapper')

        # Construct and send request
        request = self._client.put(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    @async_request
    def get_bool(
            self, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Get complex types with bool properties

        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: booleanwrapper or (booleanwrapper, requests.response) or
        concurrent.futures.Future
        """
        # Construct URL
        url = '/complex/primitive/bool'

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
            deserialized = self._deserialize('BooleanWrapper', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized

    @async_request
    def put_bool(
            self, complex_body, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Put complex types with bool properties

        :param complex_body: Please put true and false
        :type complex_body: booleanwrapper
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/complex/primitive/bool'

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        body_content = self._serialize.body(complex_body, 'BooleanWrapper')

        # Construct and send request
        request = self._client.put(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    @async_request
    def get_string(
            self, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Get complex types with string properties

        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: stringwrapper or (stringwrapper, requests.response) or
        concurrent.futures.Future
        """
        # Construct URL
        url = '/complex/primitive/string'

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
            deserialized = self._deserialize('StringWrapper', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized

    @async_request
    def put_string(
            self, complex_body, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Put complex types with string properties

        :param complex_body: Please put 'goodrequest', '', and null
        :type complex_body: stringwrapper
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/complex/primitive/string'

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        body_content = self._serialize.body(complex_body, 'StringWrapper')

        # Construct and send request
        request = self._client.put(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    @async_request
    def get_date(
            self, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Get complex types with date properties

        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: datewrapper or (datewrapper, requests.response) or
        concurrent.futures.Future
        """
        # Construct URL
        url = '/complex/primitive/date'

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
            deserialized = self._deserialize('DateWrapper', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized

    @async_request
    def put_date(
            self, complex_body, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Put complex types with date properties

        :param complex_body: Please put '0001-01-01' and '2016-02-29'
        :type complex_body: datewrapper
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/complex/primitive/date'

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        body_content = self._serialize.body(complex_body, 'DateWrapper')

        # Construct and send request
        request = self._client.put(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    @async_request
    def get_date_time(
            self, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Get complex types with datetime properties

        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: datetimewrapper or (datetimewrapper, requests.response) or
        concurrent.futures.Future
        """
        # Construct URL
        url = '/complex/primitive/datetime'

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
            deserialized = self._deserialize('DatetimeWrapper', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized

    @async_request
    def put_date_time(
            self, complex_body, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Put complex types with datetime properties

        :param complex_body: Please put '0001-01-01T12:00:00-04:00' and
        '2015-05-18T11:38:00-08:00'
        :type complex_body: datetimewrapper
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/complex/primitive/datetime'

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        body_content = self._serialize.body(complex_body, 'DatetimeWrapper')

        # Construct and send request
        request = self._client.put(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    @async_request
    def get_date_time_rfc1123(
            self, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Get complex types with datetimeRfc1123 properties

        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: datetimerfc1123wrapper or (datetimerfc1123wrapper,
        requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/complex/primitive/datetimerfc1123'

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
            deserialized = self._deserialize('Datetimerfc1123Wrapper', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized

    @async_request
    def put_date_time_rfc1123(
            self, complex_body, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Put complex types with datetimeRfc1123 properties

        :param complex_body: Please put 'Mon, 01 Jan 0001 12:00:00 GMT' and
        'Mon, 18 May 2015 11:38:00 GMT'
        :type complex_body: datetimerfc1123wrapper
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """
        # Construct URL
        url = '/complex/primitive/datetimerfc1123'

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        body_content = self._serialize.body(complex_body, 'Datetimerfc1123Wrapper')

        # Construct and send request
        request = self._client.put(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    @async_request
    def get_duration(
            self, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Get complex types with duration properties

        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: durationwrapper or (durationwrapper, requests.response) or
        concurrent.futures.Future
        """
        # Construct URL
        url = '/complex/primitive/duration'

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
            deserialized = self._deserialize('DurationWrapper', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized

    @async_request
    def put_duration(
            self, field=None, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Put complex types with duration properties

        :param field:
        :type field: timedelta or none
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """
        complex_body = models.DurationWrapper()
        if field is not None:
            complex_body.field = field

        # Construct URL
        url = '/complex/primitive/duration'

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        body_content = self._serialize.body(complex_body, 'DurationWrapper')

        # Construct and send request
        request = self._client.put(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response

    @async_request
    def get_byte(
            self, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Get complex types with byte properties

        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: bytewrapper or (bytewrapper, requests.response) or
        concurrent.futures.Future
        """
        # Construct URL
        url = '/complex/primitive/byte'

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
            deserialized = self._deserialize('ByteWrapper', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized

    @async_request
    def put_byte(
            self, field=None, custom_headers={}, raw=False, callback=None, **operation_config):
        """
        Put complex types with byte properties

        :param field:
        :type field: bytearray or none
        :param dict custom_headers: headers that will be added to the request
        :param boolean raw: returns the direct response alongside the
        deserialized response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """
        complex_body = models.ByteWrapper()
        if field is not None:
            complex_body.field = field

        # Construct URL
        url = '/complex/primitive/byte'

        # Construct parameters
        query_parameters = {}

        # Construct headers
        header_parameters = {}
        header_parameters['Content-Type'] = 'application/json; charset=utf-8'
        if custom_headers:
            header_parameters.update(custom_headers)

        # Construct body
        body_content = self._serialize.body(complex_body, 'ByteWrapper')

        # Construct and send request
        request = self._client.put(url, query_parameters)
        response = self._client.send(
            request, header_parameters, body_content, **operation_config)

        if response.status_code not in [200]:
            raise models.ErrorException(self._deserialize, response)

        if raw:
            client_raw_response = ClientRawResponse(None, response)
            return client_raw_response
