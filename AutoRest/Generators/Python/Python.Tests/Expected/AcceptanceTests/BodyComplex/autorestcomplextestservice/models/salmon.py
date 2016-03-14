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

from .fish import Fish


class Salmon(Fish):
    """Salmon

    :param species:
    :type species: str
    :param length:
    :type length: float
    :param siblings:
    :type siblings: list of :class:`Fish
     <fixtures.acceptancetestsbodycomplex.models.Fish>`
    :param fishtype: Polymorphic Discriminator
    :type fishtype: str
    :param location:
    :type location: str
    :param iswild:
    :type iswild: bool
    """ 

    _validation = {
        'length': {'required': True},
        'fishtype': {'required': True},
    }

    _attribute_map = {
        'species': {'key': 'species', 'type': 'str'},
        'length': {'key': 'length', 'type': 'float'},
        'siblings': {'key': 'siblings', 'type': '[Fish]'},
        'fishtype': {'key': 'fishtype', 'type': 'str'},
        'location': {'key': 'location', 'type': 'str'},
        'iswild': {'key': 'iswild', 'type': 'bool'},
    }

    def __init__(self, length, species=None, siblings=None, location=None, iswild=None, **kwargs):
        super(Salmon, self).__init__(species=species, length=length, siblings=siblings, **kwargs)
        self.location = location
        self.iswild = iswild
        self.fishtype = 'salmon'
