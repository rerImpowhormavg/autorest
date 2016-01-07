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

from msrest.serialization import Model


class StorageAccountRegenerateKeyParameters(Model):

    _required = []

    _attribute_map = {
        'key_name': {'key': 'keyName', 'type': 'KeyName'},
    }

    def __init__(self, *args, **kwargs):

        self.key_name = None

        super(StorageAccountRegenerateKeyParameters, self).__init__(*args, **kwargs)
