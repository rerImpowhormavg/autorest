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

from msrest.serialization import Model


class SampleResourceGroup(Model):

    _required = []

    _attribute_map = {
        'name': {'key': 'name', 'type': 'str'},
        'location': {'key': 'location', 'type': 'str'},
    }

    def __init__(self, *args, **kwargs):
        """SampleResourceGroup

        :param str name: resource group name 'testgroup101'
        :param str location: resource group location 'West US'
        """
        self.name = None
        self.location = None

        super(SampleResourceGroup, self).__init__(*args, **kwargs)
