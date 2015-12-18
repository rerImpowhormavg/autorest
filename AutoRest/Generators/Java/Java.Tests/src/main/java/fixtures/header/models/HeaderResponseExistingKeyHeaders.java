/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.header.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for responseExistingKey operation.
 */
public class HeaderResponseExistingKeyHeaders {
    /**
     * response with header value "User-Agent": "overwrite".
     */
    @JsonProperty(value = "User-Agent")
    private String userAgent;

    /**
     * Get the userAgent value.
     *
     * @return the userAgent value
     */
    public String getUserAgent() {
        return this.userAgent;
    }

    /**
     * Set the userAgent value.
     *
     * @param userAgent the userAgent value to set
     */
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

}
