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
from .version import VERSION
from .operations.paths_operations import PathsOperations
from . import models


class AutoRestParameterizedCustomHostTestClientConfiguration(Configuration):
    """Configuration for AutoRestParameterizedCustomHostTestClient
    Note that all parameters used to create this instance are saved as instance
    attributes.

    :param subscription_id: The subscription id with value 'test12'.
    :type subscription_id: str
    :param dns_suffix: A string value that is used as a global part of the
     parameterized host. Default value 'host'.
    :type dns_suffix: str
    :param str filepath: Existing config
    """

    def __init__(
            self, subscription_id, dns_suffix, filepath=None):

        if subscription_id is None:
            raise ValueError("Parameter 'subscription_id' must not be None.")
        if not isinstance(subscription_id, str):
            raise TypeError("Parameter 'subscription_id' must be str.")
        if dns_suffix is None:
            raise ValueError("Parameter 'dns_suffix' must not be None.")
        if not isinstance(dns_suffix, str):
            raise TypeError("Parameter 'dns_suffix' must be str.")
        base_url = '{vault}{secret}{dnsSuffix}'

        super(AutoRestParameterizedCustomHostTestClientConfiguration, self).__init__(base_url, filepath)

        self.add_user_agent('autorestparameterizedcustomhosttestclient/{}'.format(VERSION))

        self.subscription_id = subscription_id
        self.dns_suffix = dns_suffix


class AutoRestParameterizedCustomHostTestClient(object):
    """Test Infrastructure for AutoRest

    :ivar config: Configuration for client.
    :vartype config: AutoRestParameterizedCustomHostTestClientConfiguration

    :ivar paths: Paths operations
    :vartype paths: .operations.PathsOperations

    :param subscription_id: The subscription id with value 'test12'.
    :type subscription_id: str
    :param dns_suffix: A string value that is used as a global part of the
     parameterized host. Default value 'host'.
    :type dns_suffix: str
    :param str filepath: Existing config
    """

    def __init__(
            self, subscription_id, dns_suffix, filepath=None):

        self.config = AutoRestParameterizedCustomHostTestClientConfiguration(subscription_id, dns_suffix, filepath)
        self._client = ServiceClient(None, self.config)

        client_models = {k: v for k, v in models.__dict__.items() if isinstance(v, type)}
        self._serialize = Serializer(client_models)
        self._deserialize = Deserializer(client_models)

        self.paths = PathsOperations(
            self._client, self.config, self._serialize, self._deserialize)
