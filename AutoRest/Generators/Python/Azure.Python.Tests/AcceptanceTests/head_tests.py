import unittest
import subprocess
import sys
import isodate
import tempfile
import json
from uuid import uuid4
from datetime import date, datetime, timedelta
import os
from os.path import dirname, pardir, join, realpath, sep, pardir

cwd = dirname(realpath(__file__))
root = realpath(join(cwd , pardir, pardir, pardir, pardir, pardir))
sys.path.append(join(root, "ClientRuntimes" , "Python", "msrest"))
sys.path.append(join(root, "ClientRuntimes" , "Python", "msrestazure"))

tests = realpath(join(cwd, pardir, "Expected", "AcceptanceTests"))
sys.path.append(join(tests, "Head"))

from msrest.serialization import Deserializer
from msrest.exceptions import DeserializationError
from msrestazure.azure_active_directory import UserPassCredentials

from auto_rest_head_test_service import (
    AutoRestHeadTestService, 
    AutoRestHeadTestServiceConfiguration)


class HeadTests(unittest.TestCase):

    def test_head(self):
        
        config = AutoRestHeadTestServiceConfiguration(None, base_url="http://localhost:3000")

        # TODO: investigate how to use TokenAuth in testing
        #creds = UserPassCredentials(config, client_id, "user", "password")
        #creds.get_token()

        config.log_level = 10
        client = AutoRestHeadTestService(config)

        # TODO - Not generating any response
        #self.assertTrue(client.http_success.head200())

        # TODO - Not generating any response
        #self.assertTrue(client.http_success.head204())

        # TODO - Not generating any response
        #self.assertFalse(client.http_success.head404())


if __name__ == '__main__':
    unittest.main()