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
from msrest import Configuration, Serializer, Deserializer
from .operations.dictionary import Dictionary
from . import models


class AutoRestSwaggerBATdictionaryServiceConfiguration(Configuration):
    """Configuration for AutoRestSwaggerBATdictionaryService

    :param str base_url: Service URL
    :param str filepath: Existing config
    """

    def __init__(
            self, base_url=None, filepath=None):

        if not base_url:
            base_url = 'http://localhost'

        super(AutoRestSwaggerBATdictionaryServiceConfiguration, self).__init__(base_url, filepath)

        self.user_agent = 'auto_rest_swagger_ba_tdictionary_service/1.0.0'


class AutoRestSwaggerBATdictionaryService(object):
    """Test Infrastructure for AutoRest Swagger BAT

    :param config: Configuration for client.
    :type config: AutoRestSwaggerBATdictionaryServiceConfiguration
    """

    def __init__(self, config):

        self._client = ServiceClient(None, config)

        client_models = {k: v for k, v in models.__dict__.items() if isinstance(v, type)}
        self._serialize = Serializer()
        self._deserialize = Deserializer(client_models)

        self.config = config
        self.dictionary = Dictionary(
            self._client, self.config, self._serialize, self._deserialize)
