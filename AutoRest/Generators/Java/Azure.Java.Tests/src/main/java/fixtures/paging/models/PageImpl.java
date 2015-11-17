/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.paging.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.Page;
import java.util.List;

public class PageImpl<T> implements Page<T> {
    /*
     * The link to the next page.
     */
    @JsonProperty("nextLink")
    private String nextPageLink;

    /*
     * The list of items.
     */
    @JsonProperty("value")
    private List<T> items;

    @Override
    public String getNextPageLink() {
        return this.nextPageLink;
    }

    @Override
    public List<T> getItems() {
        return items;
    }
}
