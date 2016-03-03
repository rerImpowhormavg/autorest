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


class Endpoints(Model):
    """
    The URIs that are used to perform a retrieval of a public blob, queue or
    table object.

    :param str blob: Gets the blob endpoint.
    :param str queue: Gets the queue endpoint.
    :param str table: Gets the table endpoint.
    :param Endpoints dummy_end_point: Dummy EndPoint
    :param Foo foo_point: Foo point
    """ 

    _attribute_map = {
        'blob': {'key': 'blob', 'type': 'str'},
        'queue': {'key': 'queue', 'type': 'str'},
        'table': {'key': 'table', 'type': 'str'},
        'dummy_end_point': {'key': 'dummyEndPoint', 'type': 'Endpoints'},
        'foo_point': {'key': 'FooPoint', 'type': 'Foo'},
    }

    def __init__(self, blob=None, queue=None, table=None, dummy_end_point=None, foo_point=None):
        self.blob = blob
        self.queue = queue
        self.table = table
        self.dummy_end_point = dummy_end_point
        self.foo_point = foo_point
