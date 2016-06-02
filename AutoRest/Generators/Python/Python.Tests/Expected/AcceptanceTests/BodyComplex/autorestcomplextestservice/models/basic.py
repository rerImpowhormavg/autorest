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


class Basic(Model):
    """Basic

    :param id:
    :type id: int
    :param name:
    :type name: str
    :param color: Possible values include: 'cyan', 'Magenta', 'YELLOW',
     'blacK'
    :type color: str or :class:`CMYKColors
     <fixtures.acceptancetestsbodycomplex.models.CMYKColors>`
    """ 

    _attribute_map = {
        'id': {'key': 'id', 'type': 'int'},
        'name': {'key': 'name', 'type': 'str'},
        'color': {'key': 'color', 'type': 'str'},
    }

    def __init__(self, id=None, name=None, color=None):
        self.id = id
        self.name = name
        self.color = color
