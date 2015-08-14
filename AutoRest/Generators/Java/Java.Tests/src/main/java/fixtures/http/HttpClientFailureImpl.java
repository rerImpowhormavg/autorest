// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.


package fixtures.http;

import com.google.gson.reflect.TypeToken;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseBuilder;
import com.microsoft.rest.ServiceResponseCallback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import fixtures.http.models.Error;

public class HttpClientFailureImpl implements HttpClientFailure {
    private HttpClientFailureService service;

    public HttpClientFailureImpl(RestAdapter restAdapter) {
        service = restAdapter.create(HttpClientFailureService.class);
    }

    public Error head400() throws ServiceException {
        try {
            ServiceResponse<Error> response = head400Delegate(service.head400(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = head400Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void head400Async(final ServiceCallback<Error> serviceCallback) {
        service.head400Async(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(head400Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> head400Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public Error get400() throws ServiceException {
        try {
            ServiceResponse<Error> response = get400Delegate(service.get400(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = get400Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void get400Async(final ServiceCallback<Error> serviceCallback) {
        service.get400Async(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(get400Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> get400Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public Error put400(boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Error> response = put400Delegate(service.put400(booleanValue), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = put400Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void put400Async(boolean booleanValue, final ServiceCallback<Error> serviceCallback) {
        service.put400Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(put400Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> put400Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public Error patch400(boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Error> response = patch400Delegate(service.patch400(booleanValue), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = patch400Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void patch400Async(boolean booleanValue, final ServiceCallback<Error> serviceCallback) {
        service.patch400Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(patch400Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> patch400Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public Error post400(boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Error> response = post400Delegate(service.post400(booleanValue), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = post400Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void post400Async(boolean booleanValue, final ServiceCallback<Error> serviceCallback) {
        service.post400Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(post400Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> post400Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public Error delete400(boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Error> response = delete400Delegate(service.delete400(booleanValue), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = delete400Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void delete400Async(boolean booleanValue, final ServiceCallback<Error> serviceCallback) {
        service.delete400Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(delete400Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> delete400Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public Error head401() throws ServiceException {
        try {
            ServiceResponse<Error> response = head401Delegate(service.head401(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = head401Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void head401Async(final ServiceCallback<Error> serviceCallback) {
        service.head401Async(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(head401Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> head401Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public Error get402() throws ServiceException {
        try {
            ServiceResponse<Error> response = get402Delegate(service.get402(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = get402Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void get402Async(final ServiceCallback<Error> serviceCallback) {
        service.get402Async(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(get402Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> get402Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public Error get403() throws ServiceException {
        try {
            ServiceResponse<Error> response = get403Delegate(service.get403(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = get403Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void get403Async(final ServiceCallback<Error> serviceCallback) {
        service.get403Async(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(get403Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> get403Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public Error put404(boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Error> response = put404Delegate(service.put404(booleanValue), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = put404Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void put404Async(boolean booleanValue, final ServiceCallback<Error> serviceCallback) {
        service.put404Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(put404Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> put404Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public Error patch405(boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Error> response = patch405Delegate(service.patch405(booleanValue), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = patch405Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void patch405Async(boolean booleanValue, final ServiceCallback<Error> serviceCallback) {
        service.patch405Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(patch405Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> patch405Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public Error post406(boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Error> response = post406Delegate(service.post406(booleanValue), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = post406Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void post406Async(boolean booleanValue, final ServiceCallback<Error> serviceCallback) {
        service.post406Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(post406Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> post406Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public Error delete407(boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Error> response = delete407Delegate(service.delete407(booleanValue), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = delete407Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void delete407Async(boolean booleanValue, final ServiceCallback<Error> serviceCallback) {
        service.delete407Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(delete407Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> delete407Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public Error put409(boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Error> response = put409Delegate(service.put409(booleanValue), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = put409Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void put409Async(boolean booleanValue, final ServiceCallback<Error> serviceCallback) {
        service.put409Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(put409Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> put409Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public Error head410() throws ServiceException {
        try {
            ServiceResponse<Error> response = head410Delegate(service.head410(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = head410Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void head410Async(final ServiceCallback<Error> serviceCallback) {
        service.head410Async(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(head410Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> head410Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public Error get411() throws ServiceException {
        try {
            ServiceResponse<Error> response = get411Delegate(service.get411(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = get411Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void get411Async(final ServiceCallback<Error> serviceCallback) {
        service.get411Async(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(get411Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> get411Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public Error get412() throws ServiceException {
        try {
            ServiceResponse<Error> response = get412Delegate(service.get412(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = get412Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void get412Async(final ServiceCallback<Error> serviceCallback) {
        service.get412Async(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(get412Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> get412Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public Error put413(boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Error> response = put413Delegate(service.put413(booleanValue), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = put413Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void put413Async(boolean booleanValue, final ServiceCallback<Error> serviceCallback) {
        service.put413Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(put413Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> put413Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public Error patch414(boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Error> response = patch414Delegate(service.patch414(booleanValue), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = patch414Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void patch414Async(boolean booleanValue, final ServiceCallback<Error> serviceCallback) {
        service.patch414Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(patch414Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> patch414Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public Error post415(boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Error> response = post415Delegate(service.post415(booleanValue), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = post415Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void post415Async(boolean booleanValue, final ServiceCallback<Error> serviceCallback) {
        service.post415Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(post415Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> post415Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public Error get416() throws ServiceException {
        try {
            ServiceResponse<Error> response = get416Delegate(service.get416(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = get416Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void get416Async(final ServiceCallback<Error> serviceCallback) {
        service.get416Async(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(get416Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> get416Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public Error delete417(boolean booleanValue) throws ServiceException {
        try {
            ServiceResponse<Error> response = delete417Delegate(service.delete417(booleanValue), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = delete417Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void delete417Async(boolean booleanValue, final ServiceCallback<Error> serviceCallback) {
        service.delete417Async(booleanValue, new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(delete417Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> delete417Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

    public Error head429() throws ServiceException {
        try {
            ServiceResponse<Error> response = head429Delegate(service.head429(), null);
            return response.getBody();
        } catch (RetrofitError error) {
            ServiceResponse<Error> response = head429Delegate(error.getResponse(), error);
            return response.getBody();
        }
    }

    public void head429Async(final ServiceCallback<Error> serviceCallback) {
        service.head429Async(new ServiceResponseCallback() {
            @Override
            public void response(Response response, RetrofitError error) {
                try {
                    serviceCallback.success(head429Delegate(response, error));
                } catch (ServiceException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
    }

    private ServiceResponse<Error> head429Delegate(Response response, RetrofitError error) throws ServiceException {
        return new ServiceResponseBuilder<Error>()
                .registerError(new TypeToken<Error>(){}.getType())
                .build(response, error);
    }

}
