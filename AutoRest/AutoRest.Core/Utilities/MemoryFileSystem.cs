﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Text.RegularExpressions;

namespace Microsoft.Rest.Generator.Utilities
{
    // TODO: MemoryFileSystem is for testing. Consider moving to test project.
    public class MemoryFileSystem : IFileSystem
    {
        private const string FolderKey = "Folder";

        private Dictionary<string, StringBuilder> _virtualStore =
            new Dictionary<string, StringBuilder>(StringComparer.InvariantCultureIgnoreCase);

        public Dictionary<string, StringBuilder> VirtualStore
        {
            get { return _virtualStore; }
            set { _virtualStore = value; }
        }

        public void WriteFile(string path, string contents)
        {
            var directory = Path.GetDirectoryName(path);
            if (!string.IsNullOrEmpty((directory)) && !VirtualStore.ContainsKey(directory))
            {
                throw new IOException(string.Format("Directory {0} does not exist.", directory));
            }

            VirtualStore[path] = new StringBuilder(contents);
        }

        public string ReadFileAsText(string path)
        {
            if (VirtualStore.ContainsKey(path))
            {
                return VirtualStore[path].ToString();
            }
            throw new IOException("File not found: " + path);
        }

        public TextWriter WriteFileAsStream(string path)
        {
            if (path.IsNullOrEmpty())
            {
                throw new ArgumentException("path");
            }
            var directory = Path.GetDirectoryName(path);
            if (!VirtualStore.ContainsKey(directory))
            {
                throw new IOException(string.Format("Directory {0} does not exist.", directory));
            }

            var stringBuilder = new StringBuilder();
            var stringWriter = new StringWriter(stringBuilder);
            VirtualStore[path] = stringBuilder;
            return stringWriter;
        }

        public bool FileExists(string path)
        {
            return VirtualStore.ContainsKey(path);
        }

        public void DeleteFile(string path)
        {
            if (VirtualStore.ContainsKey(path))
            {
                VirtualStore.Remove(path);
            }
            else
            {
                throw new IOException("File not found: " + path);
            }
        }

        public void DeleteDirectory(string dir)
        {
            foreach (var key in VirtualStore.Keys.ToArray())
            {
                if (key.StartsWith(dir))
                {
                    VirtualStore.Remove(key);
                }
            }
        }

        public void EmptyDirectory(string dirPath)
        {
            foreach (var key in VirtualStore.Keys.ToArray())
            {
                if (key.StartsWith(dirPath))
                {
                    VirtualStore.Remove(key);
                }
            }
        }

        public bool DirectoryExists(string path)
        {
            foreach (var key in VirtualStore.Keys.ToArray())
            {
                if (key.StartsWith(path))
                {
                    return true;
                }
            }
            return false;
        }

        public void CreateDirectory(string path)
        {
            VirtualStore[path] = new StringBuilder(FolderKey);
        }

        public string[] GetDirectories(string startDirectory, string filePattern, SearchOption options)
        {
            HashSet<string> dirs = new HashSet<string>();
            foreach (var key in VirtualStore.Keys.ToArray())
            {
                if (key.StartsWith(startDirectory) &&
                    Regex.IsMatch(key, WildcardToRegex(filePattern), RegexOptions.IgnoreCase))
                {
                    var directoryName = Path.GetDirectoryName(key);
                    if (!dirs.Contains(directoryName))
                    {
                        dirs.Add(directoryName);
                    }
                }
            }
            return dirs.ToArray();
        }

        public string[] GetFiles(string startDirectory, string filePattern, SearchOption options)
        {
            HashSet<string> files = new HashSet<string>();
            foreach (var key in VirtualStore.Keys.ToArray())
            {
                if (key.StartsWith(startDirectory) && VirtualStore[key].ToString() != FolderKey &&
                    Regex.IsMatch(key, WildcardToRegex(filePattern), RegexOptions.IgnoreCase))
                {
                    if (!files.Contains(key))
                    {
                        files.Add(key);
                    }
                }
            }
            return files.ToArray();
        }

        /// <summary>
        /// Converts unix asterisk based file pattern to regex
        /// </summary>
        /// <param name="wildcard">Asterisk based pattern</param>
        /// <returns>Regeular expression of null is empty</returns>
        private static string WildcardToRegex(string wildcard)
        {
            if (string.IsNullOrEmpty(wildcard)) return wildcard;

            var sb = new StringBuilder();

            char[] chars = wildcard.ToCharArray();
            for (int i = 0; i < chars.Length; ++i)
            {
                if (chars[i] == '*')
                    sb.Append(".*");
                else if (chars[i] == '?')
                    sb.Append(".");
                else if ("+()^$.{}|\\".IndexOf(chars[i]) != -1)
                    sb.Append('\\').Append(chars[i]); // prefix all metacharacters with backslash
                else
                    sb.Append(chars[i]);
            }
            return sb.ToString().ToLowerInvariant();
        }
    }
}