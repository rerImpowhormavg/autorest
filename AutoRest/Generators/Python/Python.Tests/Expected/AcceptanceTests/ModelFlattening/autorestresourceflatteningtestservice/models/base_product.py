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


class BaseProduct(Model):
    """
    The product documentation.

    :param str base_product_id: Unique identifier representing a specific
     product for a given latitude & longitude. For example, uberX in San
     Francisco will have a different product_id than uberX in Los Angeles.
    :param str base_product_description: Description of product.
    """

    _required = ['base_product_id']

    _attribute_map = {
        'base_product_id': {'key': 'base_product_id', 'type': 'str'},
        'base_product_description': {'key': 'base_product_description', 'type': 'str'},
    }

    def __init__(self, base_product_id, base_product_description=None):
        self.base_product_id = base_product_id
        self.base_product_description = base_product_description
