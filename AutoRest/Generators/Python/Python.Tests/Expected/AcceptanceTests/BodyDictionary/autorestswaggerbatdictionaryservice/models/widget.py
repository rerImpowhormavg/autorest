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


class Widget(Model):
    """Widget

    :param int integer:
    :param str string:
    """ 

    _attribute_map = {
        'integer': {'key': 'integer', 'type': 'int'},
        'string': {'key': 'string', 'type': 'str'},
    }

    def __init__(self, integer=None, string=None, **kwargs):
        self.integer = integer
        self.string = string
