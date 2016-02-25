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


class FlattenParameterGroup(Model):
    """
    Additional parameters for the postFlattenedSimpleProduct operation.

    :param str base_product_id: Unique identifier representing a specific
     product for a given latitude & longitude. For example, uberX in San
     Francisco will have a different product_id than uberX in Los Angeles.
    :param str base_product_description: Description of product.
    :param str max_product_display_name: Display name of product.
    :param str odatavalue: URL value.
    :param str name: Product name
    """

    _required = ['base_product_id', 'max_product_display_name', 'name']

    def __init__(self, base_product_id, max_product_display_name, name, base_product_description=None, odatavalue=None):
        self.base_product_id = base_product_id
        self.base_product_description = base_product_description
        self.max_product_display_name = max_product_display_name
        self.odatavalue = odatavalue
        self.name = name
