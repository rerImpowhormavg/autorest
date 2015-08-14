﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System;
using System.Globalization;
using System.Diagnostics;
using System.IO;

namespace Microsoft.Rest.Generator.CSharp.Tests
{
    /// <summary>
    /// Control creation and execution of node.js deserialization service
    /// </summary>
    public class ServiceController : IDisposable
    {
        private const string NpmCommand = "npm.cmd";
        private const string NpmArgument = "install";
        private const string NodeCommand = "node.exe";
        private const string NodeArgument = "./startup/www";

        private ProcessOutputListener _listener;

        private object _sync = new object();
        public ServiceController()
        {
            Port = GetRandomPortNumber();
            EnsureService();
        }

        /// <summary>
        /// Directory containing the acceptance test files.
        /// </summary>
        private static string AcceptanceTestsPath
        {
            get { return @"..\..\..\..\AcceptanceTests\server"; }
        }

        /// <summary>
        /// Port number the service is listenig on.
        /// </summary>
        private int Port { get; set; }

        public Uri Uri
        {
            get { return new Uri(string.Format(CultureInfo.InvariantCulture, "http://localhost:{0}", Port)); }
        }

        /// <summary>
        /// The process running the service.
        /// </summary>
        private Process ServiceProcess { get; set; }

        public void Dispose()
        {
            Dispose(true);
            GC.SuppressFinalize(this);
        }

        protected virtual void Dispose(bool disposing)
        {
            if (disposing && ServiceProcess != null && !ServiceProcess.HasExited)
            {
                EndServiceProcess(ServiceProcess);
                ServiceProcess = null;
            }
        }

        /// <summary>
        /// Ensure that the node service is running - either create it, or track it if it is already running.
        /// </summary>
        public void EnsureService()
        {
            lock (_sync)
            {
                if (ServiceProcess == null)
                {
                    StartServiceProcess();
                }
            }
        }

        public static string GetPathToExecutable(string executableName)
        {
            var paths = Environment.GetEnvironmentVariable("PATH");
            foreach (var path in paths.Split(new[] {Path.PathSeparator}, StringSplitOptions.RemoveEmptyEntries))
            {
                var fullPath = "";
                if(ServiceController.IsUnix)
                {
                    var ext = Path.GetExtension(executableName);
                    var exec = (ext == ".cmd" || ext == ".exe") ? Path.GetFileNameWithoutExtension(executableName) : executableName;
                    fullPath = Path.Combine(path, exec);
                }
                else
                {
                    fullPath = Path.Combine(path, Path.GetFileName(executableName));
                }

                if (File.Exists(fullPath))
                {
                    return fullPath;
                }
            }

            return null;
        }

        private static bool IsUnix
        {
          get
          {
            int p = (int) Environment.OSVersion.Platform;
            if ((p == 4) || (p == 128))
            {
                return true;
            }

            return false;
          }
        }

        private static int GetRandomPortNumber()
        {
            var rand = new Random();
            return rand.Next(3000, 3999);
        }

        public void StartServiceProcess()
        {
            var npmPath = GetPathToExecutable(NpmCommand);
            if (npmPath == null)
            {
                throw new InvalidOperationException("Could not find path to " + NpmCommand);
            }

            using ( var prepareProcess = StartServiceProcess(npmPath, NpmArgument, AcceptanceTestsPath,
                    waitForServerStart:false))
            {
                // Wait for maximum of two minutes; One-time preparation.
                if (prepareProcess.WaitForExit(120000))
                {
                    var nodePath = GetPathToExecutable(NodeCommand);
                    if (nodePath == null)
                    {
                        throw new InvalidOperationException("Could not find path to " + NodeCommand);
                    }

                    ServiceProcess = StartServiceProcess(nodePath, NodeArgument, AcceptanceTestsPath);
                }
                else
                {
                    throw new InvalidOperationException(string.Format(CultureInfo.CurrentCulture,
                        "Failed to start {0} {1} .",
                        npmPath, NpmArgument));
                }
            }
        }

        /// <summary>
        /// Run the given command with arguments. Return the result in standard output.
        /// </summary>
        /// <param name="path">The path to the command to execute.</param>
        /// <param name="arguments">The arguments to pass to the command.</param>
        /// <param name="workingDirectory">The working directory for the process being launched.</param>
        /// <param name="waitForServerStart">Wait for the service to print a start message</param>
        /// <returns>The process</returns>
        private Process StartServiceProcess(
            string path,
            string arguments,
            string workingDirectory,
            bool waitForServerStart = true)
        {
            _listener = new ProcessOutputListener();
            var process = new Process();
            var startInfo = process.StartInfo;
            startInfo.CreateNoWindow = false;
            startInfo.RedirectStandardOutput = true;
            startInfo.RedirectStandardError = true;
            startInfo.WorkingDirectory = workingDirectory;
            startInfo.UseShellExecute = false;
            startInfo.FileName = path;
            startInfo.Arguments = arguments;
            startInfo.EnvironmentVariables["PORT"] = Port.ToString(CultureInfo.InvariantCulture);
            process.OutputDataReceived += _listener.ProcessOutput;
            process.ErrorDataReceived += _listener.ProcessError;
            process.Start();
            process.BeginOutputReadLine();
            if (waitForServerStart)
            {
                _listener.ProcessStarted.WaitOne(TimeSpan.FromSeconds(30));
            }
            return process;
        }

        private static void EndServiceProcess(Process process)
        {
            process.Kill();
            process.WaitForExit(2000);
            process.Dispose();
        }
    }
}
