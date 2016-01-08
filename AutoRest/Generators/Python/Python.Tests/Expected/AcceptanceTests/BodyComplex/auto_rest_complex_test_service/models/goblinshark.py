# coding=utf-8
# --------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
#
# Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from .shark import Shark


class Goblinshark(Shark):

    _required = []

    _attribute_map = {
        'jawsize': {'key': 'jawsize', 'type': 'int'},
    }

    def __init__(self, *args, **kwargs):

        self.jawsize = None

        super(Goblinshark, self).__init__(*args, **kwargs)

        self.fishtype = 'goblin'
