#--------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
# 
# Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
#--------------------------------------------------------------------------

class Salmon(Fish):

    _required = []

    _attribute_map = {
        'location':{'key':'location', 'type':'str'},
        'iswild':{'key':'iswild', 'type':'bool'},
    }

    def __init__(self, *args, **kwargs):

        self.location = None
        self.iswild = None

        for k in kwargs:
            if hasattr(self, k):
                setattr(self, k, kwargs[k])
