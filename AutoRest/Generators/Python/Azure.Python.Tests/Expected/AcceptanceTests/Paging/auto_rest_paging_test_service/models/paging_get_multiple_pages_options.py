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

from msrest.serialization import Model


class PagingGetMultiplePagesOptions(Model):
    """
    Additional parameters for the getMultiplePages operation.
    """

    _required = []

    def __init__(self, *args, **kwargs):
        """PagingGetMultiplePagesOptions

        :param int maxresults: Sets the maximum number of items to return in
        the response.
        :param int timeout: Sets the maximum time that the server can spend
        processing the request, in seconds. The default is 30 seconds.
        Default value: 30 .
        """
        self.maxresults = None
        self.timeout = None

        super(PagingGetMultiplePagesOptions, self).__init__(*args, **kwargs)
