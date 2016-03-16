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


class ParameterGroupingPostOptionalParameters(Model):
    """
    Additional parameters for the postOptional operation.

    :param custom_header:
    :type custom_header: str
    :param query: Query parameter with default. Default value: 30 .
    :type query: int
    """ 

    def __init__(self, custom_header=None, query=30, **kwargs):
        self.custom_header = custom_header
        self.query = query
