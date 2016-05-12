/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azureparametergrouping.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Additional parameters for one or more operations.
 */
public class ParameterGroupingPostRequiredParameters {
    /**
     * The body property.
     */
    @JsonProperty(value = "", required = true)
    private int body;

    /**
     * The customHeader property.
     */
    @JsonProperty(value = "")
    private String customHeader;

    /**
     * Query parameter with default.
     */
    @JsonProperty(value = "")
    private Integer query;

    /**
     * Path parameter.
     */
    @JsonProperty(value = "", required = true)
    private String path;

    /**
     * Get the body value.
     *
     * @return the body value
     */
    public int getBody() {
        return this.body;
    }

    /**
     * Set the body value.
     *
     * @param body the body value to set
     */
    public void setBody(int body) {
        this.body = body;
    }

    /**
     * Get the customHeader value.
     *
     * @return the customHeader value
     */
    public String getCustomHeader() {
        return this.customHeader;
    }

    /**
     * Set the customHeader value.
     *
     * @param customHeader the customHeader value to set
     */
    public void setCustomHeader(String customHeader) {
        this.customHeader = customHeader;
    }

    /**
     * Get the query value.
     *
     * @return the query value
     */
    public Integer getQuery() {
        return this.query;
    }

    /**
     * Set the query value.
     *
     * @param query the query value to set
     */
    public void setQuery(Integer query) {
        this.query = query;
    }

    /**
     * Get the path value.
     *
     * @return the path value
     */
    public String getPath() {
        return this.path;
    }

    /**
     * Set the path value.
     *
     * @param path the path value to set
     */
    public void setPath(String path) {
        this.path = path;
    }

}
