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
from msrest.pipeline import ClientRawResponse
from . import models


class AutoRestReportServiceConfiguration(Configuration):
    """Configuration for AutoRestReportService
    Note that all parameters used to create this instance are saved as instance
    attributes.

    :param str base_url: Service URL
    :param str filepath: Existing config
    """

    def __init__(
            self, base_url=None, filepath=None):

        if not base_url:
            base_url = 'http://localhost'

        super(AutoRestReportServiceConfiguration, self).__init__(base_url, filepath)

        self.add_user_agent('autorestreportservice/{}'.format(VERSION))


class AutoRestReportService(object):
    """Test Infrastructure for AutoRest

    :ivar config: Configuration for client.
    :vartype config: AutoRestReportServiceConfiguration

    :param str base_url: Service URL
    :param str filepath: Existing config
    """

    def __init__(
            self, base_url=None, filepath=None):

        self.config = AutoRestReportServiceConfiguration(base_url, filepath)
        self._client = ServiceClient(None, self.config)

        client_models = {k: v for k, v in models.__dict__.items() if isinstance(v, type)}
        self._serialize = Serializer()
        self._deserialize = Deserializer(client_models)


    def get_report(
            self, custom_headers={}, raw=False, **operation_config):
        """
        Get test coverage report

        :param dict custom_headers: headers that will be added to the request
        :param bool raw: returns the direct response alongside the
         deserialized response
        :param operation_config: :ref:`Operation configuration
         overrides<msrest:optionsforoperations>`.
        :rtype: dict
        :rtype: :class:`ClientRawResponse<msrest.pipeline.ClientRawResponse>`
         if raw=true
        """
        # Construct URL
        url = '/report'

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
            deserialized = self._deserialize('{int}', response)

        if raw:
            client_raw_response = ClientRawResponse(deserialized, response)
            return client_raw_response

        return deserialized
