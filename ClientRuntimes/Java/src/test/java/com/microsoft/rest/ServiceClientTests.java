/**
 *
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 *
 */

package com.microsoft.rest;

import com.microsoft.rest.retry.ExponentialBackoffRetryStrategy;
import com.microsoft.rest.retry.RetryHandler;
import com.microsoft.rest.retry.RetryStrategy;
import junit.framework.Assert;
import org.apache.http.impl.client.AbstractHttpClient;
import org.glassfish.jersey.apache.connector.ApacheClientProperties;
import org.glassfish.jersey.apache.connector.ApacheConnectorProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import org.junit.Test;

import javax.annotation.Priority;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.client.WebTarget;
import java.io.IOException;

public class ServiceClientTests {

    @Test
    public void FilterTests() throws Exception {
        ServiceClient serviceClient = new ServiceClient() {};
        serviceClient.addRequestFilter(new FirstFilter());
        serviceClient.addRequestFilter(new SecondFilter());
        serviceClient.addRequestFilter(new ClientRequestFilter() {
            @Override
            public void filter(ClientRequestContext requestContext) throws IOException {
                Assert.assertEquals("1", requestContext.getHeaderString("filter1"));
                Assert.assertEquals("2", requestContext.getHeaderString("filter2"));
            }
        });
        WebTarget target = serviceClient.getClient().target("http://www.microsoft.com");
        String response = target.request().get(String.class);
    }

    @Test
    public void RetryTests() throws Exception {
        ClientConfig config = new ClientConfig();
        ServiceClient serviceClient = new ServiceClient() {};
        WebTarget target = serviceClient.getClient().target("http://www.microsoft.com/thispagedoesnotexist.htm");
    }

    @Priority(1)
    public class FirstFilter implements ClientRequestFilter {
        @Override
        public void filter(ClientRequestContext requestContext) throws IOException {
            requestContext.getHeaders().add("filter1", "1");
        }
    }

    @Priority(2)
    public class SecondFilter implements ClientRequestFilter {
        @Override
        public void filter(ClientRequestContext requestContext) throws IOException {
            requestContext.getHeaders().add("filter2", "2");
        }
    }
}
