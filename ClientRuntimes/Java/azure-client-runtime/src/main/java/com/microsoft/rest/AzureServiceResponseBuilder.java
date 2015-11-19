/**
 *
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 *
 */

package com.microsoft.rest;

import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.reflect.TypeToken;
import com.microsoft.rest.serializer.JacksonUtils;
import retrofit.Response;
import retrofit.Retrofit;

import java.util.HashMap;
import java.util.Map;

/**
 * The builder for building a {@link ServiceResponse}.
 */
public class AzureServiceResponseBuilder<T> extends ServiceResponseBuilder<T> {
    /**
     * Create a ServiceResponseBuilder instance.
     */
    public AzureServiceResponseBuilder() {
        this(new JacksonUtils());
    }

    /**
     * Create a ServiceResponseBuilder instance.
     *
     * @param deserializer the serialization utils to use for deserialization operations
     */
    public AzureServiceResponseBuilder(JacksonUtils deserializer) {
        this(deserializer, new HashMap<Integer, TypeReference<?>>());
    }

    /**
     * Create a ServiceResponseBuilder instance.
     *
     * @param deserializer the serialization utils to use for deserialization operations
     * @param responseTypes a mapping of response status codes and response destination types.
     */
    public AzureServiceResponseBuilder(JacksonUtils deserializer, Map<Integer, TypeReference<?>> responseTypes) {
        super(deserializer, responseTypes);
    }

    public ServiceResponse<Boolean> buildHead(Response<Void> response, Retrofit retrofit) throws ServiceException {
        int statusCode = response.code();
        if (responseTypes.containsKey(statusCode)) {
            return new ServiceResponse<Boolean>(responseTypes.keySet().iterator().next() == response.code(), response);
        } else {
            ServiceException exception = new ServiceException();
            exception.setResponse(response);
            throw exception;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public ServiceResponse<T> buildEmpty(Response<Void> response, Retrofit retrofit) throws ServiceException {
        int statusCode = response.code();
        if (responseTypes.containsKey(statusCode)) {
            if (new TypeToken<T>(getClass()){}.getRawType().isAssignableFrom(Boolean.class)) {
                return new ServiceResponse<T>((T)(Object)(statusCode / 100 == 2), response);
            } else {
                return new ServiceResponse<T>(null, response);
            }
        } else {
            ServiceException exception = new ServiceException();
            exception.setResponse(response);
            throw exception;
        }
    }
}
