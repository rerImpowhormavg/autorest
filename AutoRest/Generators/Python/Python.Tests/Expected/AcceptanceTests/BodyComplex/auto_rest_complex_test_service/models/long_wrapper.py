# --------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
#
# Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class LongWrapper(Model):

    _required = []

    _attribute_map = {
        'field1': {'key': 'field1', 'type': 'long'},
        'field2': {'key': 'field2', 'type': 'long'},
    }

    def __init__(self, *args, **kwargs):

        self.field1 = None
        self.field2 = None

        super(LongWrapper, self).__init__(*args, **kwargs)
