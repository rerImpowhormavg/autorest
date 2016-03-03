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

from .shark import Shark


class Goblinshark(Shark):
    """Goblinshark

    :param str species:
    :param float length:
    :param list siblings:
    :param str fishtype: Polymorphic Discriminator
    :param int age:
    :param datetime birthday:
    :param int jawsize:
    """ 

    _validation = {
        'length': {'required': True},
        'fishtype': {'required': True},
        'birthday': {'required': True},
    }

    _attribute_map = {
        'species': {'key': 'species', 'type': 'str'},
        'length': {'key': 'length', 'type': 'float'},
        'siblings': {'key': 'siblings', 'type': '[Fish]'},
        'fishtype': {'key': 'fishtype', 'type': 'str'},
        'age': {'key': 'age', 'type': 'int'},
        'birthday': {'key': 'birthday', 'type': 'iso-8601'},
        'jawsize': {'key': 'jawsize', 'type': 'int'},
    }

    def __init__(self, length, birthday, species=None, siblings=None, age=None, jawsize=None):
        super(Goblinshark, self).__init__(species=species, length=length, siblings=siblings, age=age, birthday=birthday)
        self.jawsize = jawsize
        self.fishtype = 'goblin'
