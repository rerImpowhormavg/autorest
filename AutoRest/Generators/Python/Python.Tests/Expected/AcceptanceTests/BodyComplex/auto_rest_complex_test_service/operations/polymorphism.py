# --------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
#
# Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Serializer, Deserializer
from msrest.service_client import async_request
from msrest.exceptions import (
    DeserializationError,
    HttpOperationError)

from ..models import *


class polymorphism(object):

    def __init__(self, client, config, serializer, derserializer):

        self._client = client
        self._serialize = serializer
        self._deserialize = derserializer

        self.config = config

    def _serialize_data(self, name, value, datatype, **kwargs):

        try:
            value = self._serialize.serialize_data(value, datatype, **kwargs)

        except ValueError:
            raise ValueError("{} must not be None.".format(name))

        except DeserializationError:
            raise TypeError("{} must be type {}.".format(name, datatype))

        else:
            return value

    @async_request
    def get_valid(self, custom_headers={}, raw=False, callback=None):
        """

        Get complex types that are polymorphic

        :param custom_headers: headers that will be added to the request
        :param raw: returns the direct response alongside the deserialized
        response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type custom_headers: dict
        :type raw: boolean
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: object or (object, requests.response) or
        concurrent.futures.Future
        """

        # Construct URL
        url = '/complex/polymorphism/valid'

        # Construct parameters
        query = {}

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
            deserialized = self._deserialize('Fish', response)

        if raw:
            return deserialized, response

        return deserialized

    @async_request
    def put_valid(self, complex_body, custom_headers={}, raw=False, callback=None):
        """

        Put complex types that are polymorphic

        :param complex_body: Please put a salmon that looks like this:
        {
        'fishtype':'Salmon',
        'location':'alaska',
        'iswild':true,
        'species':'king',
        'length':1.0,
        'siblings':[
        {
        'fishtype':'Shark',
        'age':6,
        'birthday': '2012-01-05T01:00:00Z',
        'length':20.0,
        'species':'predator',
        },
        {
        'fishtype':'Sawshark',
        'age':105,
        'birthday': '1900-01-05T01:00:00Z',
        'length':10.0,
        'picture': new Buffer([255, 255, 255, 255,
        254]).toString('base64'),
        'species':'dangerous',
        },
        {
        'fishtype': 'goblin',
        'age': 1,
        'birthday': '2015-08-08T00:00:00Z',
        'length': 30.0,
        'species': 'scary',
        'jawsize': 5
        }
        ]
        };
        :param custom_headers: headers that will be added to the request
        :param raw: returns the direct response alongside the deserialized
        response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type complex_body: object
        :type custom_headers: dict
        :type raw: boolean
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """

        # Construct URL
        url = '/complex/polymorphism/valid'

        # Construct parameters
        query = {}

        # Construct headers
        headers = {}
        headers.update(custom_headers)
        headers['Content-Type'] = 'application/json; charset=utf-8'

        # Construct body
        content = self._serialize(complex_body, 'Fish')

        # Construct and send request
        request = self._client.put(url, query)
        response = self._client.send(request, headers, content)

        if response.status_code not in [200]:
            raise ErrorException(self._deserialize, response)

        if raw:
            return None, response

    @async_request
    def put_valid_missing_required(self, complex_body, custom_headers={}, raw=False, callback=None):
        """

        Put complex types that are polymorphic, attempting to omit required
        'birthday' field - the request should not be allowed from the client

        :param complex_body: Please attempt put a sawshark that looks like
        this, the client should not allow this data to be sent:
        {
        "fishtype": "sawshark",
        "species": "snaggle toothed",
        "length": 18.5,
        "age": 2,
        "birthday": "2013-06-01T01:00:00Z",
        "location": "alaska",
        "picture": base64(FF FF FF FF FE),
        "siblings": [
        {
        "fishtype": "shark",
        "species": "predator",
        "birthday": "2012-01-05T01:00:00Z",
        "length": 20,
        "age": 6
        },
        {
        "fishtype": "sawshark",
        "species": "dangerous",
        "picture": base64(FF FF FF FF FE),
        "length": 10,
        "age": 105
        }
        ]
        }
        :param custom_headers: headers that will be added to the request
        :param raw: returns the direct response alongside the deserialized
        response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type complex_body: object
        :type custom_headers: dict
        :type raw: boolean
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """

        # Construct URL
        url = '/complex/polymorphism/missingrequired/invalid'

        # Construct parameters
        query = {}

        # Construct headers
        headers = {}
        headers.update(custom_headers)
        headers['Content-Type'] = 'application/json; charset=utf-8'

        # Construct body
        content = self._serialize(complex_body, 'Fish')

        # Construct and send request
        request = self._client.put(url, query)
        response = self._client.send(request, headers, content)

        if response.status_code not in [200]:
            raise ErrorException(self._deserialize, response)

        if raw:
            return None, response
