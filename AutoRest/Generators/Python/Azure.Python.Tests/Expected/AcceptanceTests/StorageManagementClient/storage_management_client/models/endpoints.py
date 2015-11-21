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

from msrest.serialization import Model


class Endpoints(Model):

    _required = []

    _attribute_map = {
        'blob': {'key': 'blob', 'type': 'str'},
        'queue': {'key': 'queue', 'type': 'str'},
        'table': {'key': 'table', 'type': 'str'},
        'dummy_end_point': {'key': 'dummyEndPoint', 'type': 'Endpoints'},
        'foo_point': {'key': 'FooPoint', 'type': 'Foo'},
    }

    def __init__(self, *args, **kwargs):

        self.blob = None
        self.queue = None
        self.table = None
        self.dummy_end_point = None
        self.foo_point = None

        super(Endpoints, self).__init__(*args, **kwargs)
