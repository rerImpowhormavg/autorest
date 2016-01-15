﻿import unittest
import subprocess
import sys
import isodate
import tempfile
from datetime import date, datetime, timedelta
import os
from os.path import dirname, pardir, join, realpath, sep, pardir

cwd = dirname(realpath(__file__))
root = realpath(join(cwd , pardir, pardir, pardir, pardir, pardir))
sys.path.append(join(root, "ClientRuntimes" , "Python", "msrest"))
log_level = int(os.environ.get('PythonLogLevel', 30))

tests = realpath(join(cwd, pardir, "Expected", "AcceptanceTests"))
sys.path.append(join(tests, "BodyFile"))

from msrest.exceptions import DeserializationError

from auto_rest_swagger_bat_file_service import AutoRestSwaggerBATFileService, AutoRestSwaggerBATFileServiceConfiguration
from auto_rest_swagger_bat_file_service.models import ErrorException


class FileTests(unittest.TestCase):

    def test_files(self):

        config = AutoRestSwaggerBATFileServiceConfiguration(base_url="http://localhost:3000")
        config.log_level = log_level
        client = AutoRestSwaggerBATFileService(config)

        temp_file = tempfile.mktemp()
        file_length = 0
        with open(temp_file, mode='wb') as file_handle:

            stream = client.files.get_file()

            for data in stream:
                file_length += len(data)
                file_handle.write(data)

            self.assertNotEqual(file_length, 0)

        sample_file = realpath(
            join(cwd, pardir, pardir, pardir, "NodeJS", 
                 "NodeJS.Tests", "AcceptanceTests", "sample.png"))

        with open(sample_file, 'rb') as data:
            sample_data = hash(data.read())

        with open(temp_file, 'rb') as data:
            result_data = hash(data.read())

        self.assertEqual(sample_data, result_data)
        os.remove(temp_file)

        temp_file = tempfile.mktemp()
        file_length = 0
        with open(temp_file, mode='wb') as file_handle:

            stream = client.files.get_empty_file()

            for data in stream:
                file_length += len(data)
                file_handle.write(data)

            self.assertEqual(file_length, 0)

        os.remove(temp_file)

    def test_files_raw(self):

        config = AutoRestSwaggerBATFileServiceConfiguration(base_url="http://localhost:3000")
        config.log_level = log_level
        client = AutoRestSwaggerBATFileService(config)

        temp_file = tempfile.mktemp()
        file_length = 0
        with open(temp_file, mode='wb') as file_handle:

            response = client.files.get_file(raw=True)
            stream = response.output

            for data in stream:
                file_length += len(data)
                file_handle.write(data)

            self.assertNotEqual(file_length, 0)

        sample_file = realpath(
            join(cwd, pardir, pardir, pardir, "NodeJS", 
                 "NodeJS.Tests", "AcceptanceTests", "sample.png"))

        with open(sample_file, 'rb') as data:
            sample_data = hash(data.read())

        with open(temp_file, 'rb') as data:
            result_data = hash(data.read())

        self.assertEqual(sample_data, result_data)
        os.remove(temp_file)

        temp_file = tempfile.mktemp()
        file_length = 0
        with open(temp_file, mode='wb') as file_handle:

            response = client.files.get_empty_file(raw=True)
            stream = response.output

            for data in stream:
                file_length += len(data)
                file_handle.write(data)

            self.assertEqual(file_length, 0)

        os.remove(temp_file)
            

if __name__ == '__main__':
    unittest.main()