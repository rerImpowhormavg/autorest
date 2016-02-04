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


class Product(Model):
    """
    The product documentation.

    :param list display_names: Non required array of unique items from 0 to 6
     elements.
    :param int capacity: Non required int betwen 0 and 100 exclusive.
    :param str image: Image URL representing the product.
    :param ChildProduct child
    :param int const_int: Constant int. Default value: 0 .
    :param str const_string: Constant string. Default value: "constant" .
    """

    _required = []

    _attribute_map = {
        'display_names': {'key': 'display_names', 'type': '[str]'},
        'capacity': {'key': 'capacity', 'type': 'int'},
        'image': {'key': 'image', 'type': 'str'},
        'child': {'key': 'child', 'type': 'ChildProduct'},
        'const_int': {'key': 'constInt', 'type': 'int'},
        'const_string': {'key': 'constString', 'type': 'str'},
    }

    def __init__(self, *args, **kwargs):
        self.display_names = None
        self.capacity = None
        self.image = None
        self.child = None
        self.const_int = None
        self.const_string = None

        super(Product, self).__init__(*args, **kwargs)
