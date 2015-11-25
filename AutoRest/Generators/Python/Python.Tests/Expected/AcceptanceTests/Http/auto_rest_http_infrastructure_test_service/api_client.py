# coding=utf-8
# --------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
#
# Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.service_client import ServiceClient
from msrest import Configuration, Serializer, Deserializer
from .operations.http_failure import http_failure
from .operations.http_success import http_success
from .operations.http_redirects import http_redirects
from .operations.http_client_failure import http_client_failure
from .operations.http_server_failure import http_server_failure
from .operations.http_retry import http_retry
from .operations.multiple_responses import multiple_responses
from . import models


class AutoRestHttpInfrastructureTestServiceConfiguration(Configuration):

    def __init__(
            self, base_url=None, filepath=None):

        if not base_url:
            base_url = 'http://localhost'

        super(AutoRestHttpInfrastructureTestServiceConfiguration, self).__init__(base_url, filepath)


class AutoRestHttpInfrastructureTestService(object):

    def __init__(self, config):

        self._client = ServiceClient(None, config)

        client_models = {k: v for k, v in models.__dict__.items() if isinstance(v, type)}
        self._serialize = Serializer()
        self._deserialize = Deserializer(client_models)

        self.config = config
        self.http_failure = http_failure(
            self._client, self.config, self._serialize, self._deserialize)
        self.http_success = http_success(
            self._client, self.config, self._serialize, self._deserialize)
        self.http_redirects = http_redirects(
            self._client, self.config, self._serialize, self._deserialize)
        self.http_client_failure = http_client_failure(
            self._client, self.config, self._serialize, self._deserialize)
        self.http_server_failure = http_server_failure(
            self._client, self.config, self._serialize, self._deserialize)
        self.http_retry = http_retry(
            self._client, self.config, self._serialize, self._deserialize)
        self.multiple_responses = multiple_responses(
            self._client, self.config, self._serialize, self._deserialize)
