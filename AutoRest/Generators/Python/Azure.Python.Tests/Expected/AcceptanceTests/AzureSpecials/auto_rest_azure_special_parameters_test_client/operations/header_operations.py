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


class headerOperations(object):

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
    def custom_named_request_id(self, foo_client_request_id, custom_headers={}, raw=False, callback=None):
        """

        Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in
        the header of the request

        :param foo_client_request_id: The fooRequestId
        :param custom_headers: headers that will be added to the request
        :param raw: returns the direct response alongside the deserialized
        response
        :param callback: if provided, the call will run asynchronously and
        call the callback when complete.  When specified the function returns
        a concurrent.futures.Future
        :type foo_client_request_id: str
        :type custom_headers: dict
        :type raw: boolean
        :type callback: Callable[[concurrent.futures.Future], None] or None
        :rtype: None or (None, requests.response) or concurrent.futures.Future
        """

        # Construct URL
        url = '/azurespecials/customNamedRequestId'

        # Construct parameters
        query = {}

        # Construct headers
        headers = {}
        if foo_client_request_id is not None:
            headers['foo-client-request-id'] = self._serialize.serialize_data(foo_client_request_id, 'str')
        if self.config.accept_language is not None:
            headers['accept-language'] = self._serialize.serialize_data(self.config.accept_language, 'str')
        headers.update(custom_headers)
        headers['foo-client-request-id'] = str(uuid.uuid1())
        headers['Content-Type'] = 'application/json; charset=utf-8'

        # Construct and send request
        request = self._client.post(url, query)
        response = self._client.send(request, headers)

        if response.status_code not in [200]:
            raise ErrorException(self._deserialize, response)

        if raw:
            return None, response
