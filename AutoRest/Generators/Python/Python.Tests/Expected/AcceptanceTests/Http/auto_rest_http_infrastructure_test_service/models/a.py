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
from msrest.exceptions import HttpOperationError


class A(Model):
    """A

    :param str status_code
    """

    _required = []

    _attribute_map = {
        'status_code': {'key': 'statusCode', 'type': 'str'},
    }

    def __init__(self, *args, **kwargs):
        self.status_code = None

        super(A, self).__init__(*args, **kwargs)


class MyException(HttpOperationError):
    """Server responsed with exception of type: 'A'.

    :param deserialize: A deserializer
    :param response: Server response to be deserialized.
    """

    def __init__(self, deserialize, response, *args):

        super(MyException, self).__init__(deserialize, response, 'A', *args)
