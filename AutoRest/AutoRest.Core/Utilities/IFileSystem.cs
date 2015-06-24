﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System;
using System.IO;

namespace Microsoft.Rest.Generator.Utilities
{
    public interface IFileSystem
    {
        void WriteFile(string path, string contents);

        string ReadFileAsText(string path);

        TextWriter WriteFileAsStream(string path);

        bool FileExists(string path);

        void DeleteFile(string path);

        void DeleteDirectory(string dir);

        void EmptyDirectory(string dirPath);

        bool DirectoryExists(string path);

        void CreateDirectory(string path);

        string[] GetDirectories(string startDirectory, string filePattern, SearchOption options);

        string[] GetFiles(string startDirectory, string filePattern, SearchOption options);
    }
}