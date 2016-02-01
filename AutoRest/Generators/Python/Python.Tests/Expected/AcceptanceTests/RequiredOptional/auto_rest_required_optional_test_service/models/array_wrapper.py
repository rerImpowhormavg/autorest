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


class ArrayWrapper(Model):

    _required = ['value']

    _attribute_map = {
        'value': {'key': 'value', 'type': '[str]'},
    }

    def __init__(self, *args, **kwargs):
        """ArrayWrapper

        :param list value
        """
        self.value = None

        super(ArrayWrapper, self).__init__(*args, **kwargs)
