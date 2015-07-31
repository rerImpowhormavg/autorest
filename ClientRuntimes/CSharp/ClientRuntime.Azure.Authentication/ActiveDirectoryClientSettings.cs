﻿// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for license information.

using System;
using Microsoft.IdentityModel.Clients.ActiveDirectory;
using Microsoft.Rest.Azure.Authentication.Properties;

namespace Microsoft.Rest.Azure.Authentication
{
    /// <summary>
    /// Settings for authentication with an Azure or Azure Stack service using Active Directory.
    /// </summary>
    public sealed class ActiveDirectoryClientSettings
    {
        /// <summary>
        /// Query string allowing use of cookies in user login dialog
        /// </summary>
        public const string EnableEbdMagicCookie = "site_id=501358&display=popup";

        /// <summary>
        /// Initializes default active directory dialog parameters.
        /// </summary>
        public ActiveDirectoryClientSettings()
        {
            this.PromptBehavior = PromptBehavior.Auto;
            this.AdditionalQueryParameters = EnableEbdMagicCookie;
        }

        public ActiveDirectoryClientSettings(string clientId, Uri clientRedirectUri) : this()
        {
            this.ClientId = clientId;
            this.ClientRedirectUri = clientRedirectUri;
        }

        /// <summary>
        /// Gets or sets prompt behavior.
        /// </summary>
        public PromptBehavior PromptBehavior { get; set; }

        /// <summary>
        /// Gets or sets owner window.
        /// </summary>
        public object OwnerWindow { get; set; }

        /// <summary>
        /// Additional query parameters sent with the AD request
        /// </summary>
        public string AdditionalQueryParameters { get; set; }

        /// <summary>
        /// The active directory client id for this application.
        /// </summary>
        public string ClientId { get; set; }

        /// <summary>
        /// The client redirect uri associated with this application.
        /// </summary>
        public Uri ClientRedirectUri { get; set; }

        /// <summary>
        /// Returns active directory cient settings that suppresses user credential prompts. Authentication 
        /// will succeed if and only if previous authentication results are cached in the TokenCache or 
        /// client cookies. 
        /// </summary>
        /// <param name="clientId">The client Id associated with this active directory application.</param>
        /// <param name="clientRedirectUri">The client redirect Uri associated with this active directory application.</param>
        /// <returns>active directory client settings that suppress user credential prompts.</returns>
        public static ActiveDirectoryClientSettings UseCacheOrCookiesOnly(string clientId, Uri clientRedirectUri)
        {
            return new ActiveDirectoryClientSettings(clientId, clientRedirectUri)
            {
                PromptBehavior = PromptBehavior.Never,
            };
        }

        /// <summary>
        /// Returns active directory client settings that prompt the user for credentials only when 
        /// no matching cookies or cached tokens are found.  Authentication will succeed if valid cookies 
        /// or cached tokens are found, or, if no valid tokens are found, the user enters valid 
        /// active directory user credentials.
        /// </summary>
        /// <param name="clientId">The client Id associated with this active directory application.</param>
        /// <param name="clientRedirectUri">The client redirect Uri associated with this active directory application.</param>
        /// <returns>Settings that prefer cached tokens or cookies over user prompting.</returns>
        public static ActiveDirectoryClientSettings UseCacheCookiesOrPrompt(string clientId, Uri clientRedirectUri)
        {
            return new ActiveDirectoryClientSettings(clientId , clientRedirectUri)
            {
                PromptBehavior = PromptBehavior.Auto,
            };
        }

        /// <summary>
        /// Ignore authentication cookies or cached tokens and force the user to enter valid credentials. 
        /// Authentication will succeed if and only if the user enters valid credentials.
        /// </summary>
        /// <param name="clientId">The client Id associated with this active directory application.</param>
        /// <param name="clientRedirectUri">The client redirect Uri associated with this active directory application.</param>
        /// <returns>Settings that require the user to input credentials,</returns>
        public static ActiveDirectoryClientSettings UsePromptOnly(string clientId, Uri clientRedirectUri)
        {
            return new ActiveDirectoryClientSettings(clientId, clientRedirectUri)
            {
                PromptBehavior = PromptBehavior.Always
            };
        }


    }
}
