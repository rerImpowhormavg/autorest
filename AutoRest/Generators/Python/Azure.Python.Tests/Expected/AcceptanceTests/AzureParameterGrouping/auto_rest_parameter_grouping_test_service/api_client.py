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

from msrest.service_client import ServiceClient
from msrest import Serializer, Deserializer
from msrestazure import AzureConfiguration
from .operations.parameter_grouping_operations import ParameterGroupingOperations
from . import models


class AutoRestParameterGroupingTestServiceConfiguration(AzureConfiguration):

    def __init__(
            self, credentials, accept_language=en-US, long_running_operation_retry_timeout=30, generate_client_request_id=True, base_url=None, filepath=None):

        if credentials is None:
            raise ValueError('credentials must not be None.')
        if not base_url:
            base_url = 'https://localhost'

        super(AutoRestParameterGroupingTestServiceConfiguration, self).__init__(base_url, filepath)

        self.user_agent = 'auto_rest_parameter_grouping_test_service/1.0.0'

        self.credentials = credentials
        self.accept_language = accept_language
        self.long_running_operation_retry_timeout = long_running_operation_retry_timeout
        self.generate_client_request_id = generate_client_request_id


class AutoRestParameterGroupingTestService(object):

    def __init__(self, config):

        self._client = ServiceClient(config.credentials, config)

        client_models = {k: v for k, v in models.__dict__.items() if isinstance(v, type)}
        self._serialize = Serializer()
        self._deserialize = Deserializer(client_models)

        self.config = config
        self.parameter_grouping = ParameterGroupingOperations(
            self._client, self.config, self._serialize, self._deserialize)
