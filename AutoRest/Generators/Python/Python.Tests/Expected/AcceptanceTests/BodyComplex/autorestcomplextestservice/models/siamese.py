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

from .cat import Cat


class Siamese(Cat):
    """Siamese

    :param int id:
    :param str name:
    :param str color:
    :param list hates:
    :param str breed:
    """ 

    _attribute_map = {
        'id': {'key': 'id', 'type': 'int'},
        'name': {'key': 'name', 'type': 'str'},
        'color': {'key': 'color', 'type': 'str'},
        'hates': {'key': 'hates', 'type': '[Dog]'},
        'breed': {'key': 'breed', 'type': 'str'},
    }

    def __init__(self, id=None, name=None, color=None, hates=None, breed=None, **kwargs):
        super(Siamese, self).__init__(id=id, name=name, color=color, hates=hates, **kwargs)
        self.breed = breed
