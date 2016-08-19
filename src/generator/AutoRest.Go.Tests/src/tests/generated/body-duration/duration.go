package durationgroup

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

import (
    "github.com/Azure/go-autorest/autorest"
    "github.com/Azure/go-autorest/autorest/azure"
    "net/http"
)

// DurationClient is the test Infrastructure for AutoRest
type DurationClient struct {
    ManagementClient
}
// NewDurationClient creates an instance of the DurationClient client.
func NewDurationClient() DurationClient {
    return NewDurationClientWithBaseURI(DefaultBaseURI, )
}

// NewDurationClientWithBaseURI creates an instance of the DurationClient
// client.
func NewDurationClientWithBaseURI(baseURI string, ) DurationClient {
    return DurationClient{NewWithBaseURI(baseURI, )}
}

// GetInvalid get an invalid duration value
func (client DurationClient) GetInvalid() (result TimeSpan, err error) {
    req, err := client.GetInvalidPreparer()
    if err != nil {
        return result, autorest.NewErrorWithError(err, "durationgroup.DurationClient", "GetInvalid", nil , "Failure preparing request")
    }

    resp, err := client.GetInvalidSender(req)
    if err != nil {
        result.Response = autorest.Response{Response: resp}
        return result, autorest.NewErrorWithError(err, "durationgroup.DurationClient", "GetInvalid", resp, "Failure sending request")
    }

    result, err = client.GetInvalidResponder(resp)
    if err != nil {
        err = autorest.NewErrorWithError(err, "durationgroup.DurationClient", "GetInvalid", resp, "Failure responding to request")
    }

    return
}

// GetInvalidPreparer prepares the GetInvalid request.
func (client DurationClient) GetInvalidPreparer() (*http.Request, error) {
    preparer := autorest.CreatePreparer(
                        autorest.AsGet(),
                        autorest.WithBaseURL(client.BaseURI),
                        autorest.WithPath("/duration/invalid"))
    return preparer.Prepare(&http.Request{})
}

// GetInvalidSender sends the GetInvalid request. The method will close the
// http.Response Body if it receives an error.
func (client DurationClient) GetInvalidSender(req *http.Request) (*http.Response, error) {
    return autorest.SendWithSender(client, req)
}

// GetInvalidResponder handles the response to the GetInvalid request. The method always
// closes the http.Response Body.
func (client DurationClient) GetInvalidResponder(resp *http.Response) (result TimeSpan, err error) { 
    err = autorest.Respond(
            resp,
            client.ByInspecting(),
            azure.WithErrorUnlessStatusCode(http.StatusOK),
            autorest.ByUnmarshallingJSON(&result.Value),
            autorest.ByClosing())
    result.Response = autorest.Response{Response: resp}
    return
}

// GetNull get null duration value
func (client DurationClient) GetNull() (result TimeSpan, err error) {
    req, err := client.GetNullPreparer()
    if err != nil {
        return result, autorest.NewErrorWithError(err, "durationgroup.DurationClient", "GetNull", nil , "Failure preparing request")
    }

    resp, err := client.GetNullSender(req)
    if err != nil {
        result.Response = autorest.Response{Response: resp}
        return result, autorest.NewErrorWithError(err, "durationgroup.DurationClient", "GetNull", resp, "Failure sending request")
    }

    result, err = client.GetNullResponder(resp)
    if err != nil {
        err = autorest.NewErrorWithError(err, "durationgroup.DurationClient", "GetNull", resp, "Failure responding to request")
    }

    return
}

// GetNullPreparer prepares the GetNull request.
func (client DurationClient) GetNullPreparer() (*http.Request, error) {
    preparer := autorest.CreatePreparer(
                        autorest.AsGet(),
                        autorest.WithBaseURL(client.BaseURI),
                        autorest.WithPath("/duration/null"))
    return preparer.Prepare(&http.Request{})
}

// GetNullSender sends the GetNull request. The method will close the
// http.Response Body if it receives an error.
func (client DurationClient) GetNullSender(req *http.Request) (*http.Response, error) {
    return autorest.SendWithSender(client, req)
}

// GetNullResponder handles the response to the GetNull request. The method always
// closes the http.Response Body.
func (client DurationClient) GetNullResponder(resp *http.Response) (result TimeSpan, err error) { 
    err = autorest.Respond(
            resp,
            client.ByInspecting(),
            azure.WithErrorUnlessStatusCode(http.StatusOK),
            autorest.ByUnmarshallingJSON(&result.Value),
            autorest.ByClosing())
    result.Response = autorest.Response{Response: resp}
    return
}

// GetPositiveDuration get a positive duration value
func (client DurationClient) GetPositiveDuration() (result TimeSpan, err error) {
    req, err := client.GetPositiveDurationPreparer()
    if err != nil {
        return result, autorest.NewErrorWithError(err, "durationgroup.DurationClient", "GetPositiveDuration", nil , "Failure preparing request")
    }

    resp, err := client.GetPositiveDurationSender(req)
    if err != nil {
        result.Response = autorest.Response{Response: resp}
        return result, autorest.NewErrorWithError(err, "durationgroup.DurationClient", "GetPositiveDuration", resp, "Failure sending request")
    }

    result, err = client.GetPositiveDurationResponder(resp)
    if err != nil {
        err = autorest.NewErrorWithError(err, "durationgroup.DurationClient", "GetPositiveDuration", resp, "Failure responding to request")
    }

    return
}

// GetPositiveDurationPreparer prepares the GetPositiveDuration request.
func (client DurationClient) GetPositiveDurationPreparer() (*http.Request, error) {
    preparer := autorest.CreatePreparer(
                        autorest.AsGet(),
                        autorest.WithBaseURL(client.BaseURI),
                        autorest.WithPath("/duration/positiveduration"))
    return preparer.Prepare(&http.Request{})
}

// GetPositiveDurationSender sends the GetPositiveDuration request. The method will close the
// http.Response Body if it receives an error.
func (client DurationClient) GetPositiveDurationSender(req *http.Request) (*http.Response, error) {
    return autorest.SendWithSender(client, req)
}

// GetPositiveDurationResponder handles the response to the GetPositiveDuration request. The method always
// closes the http.Response Body.
func (client DurationClient) GetPositiveDurationResponder(resp *http.Response) (result TimeSpan, err error) { 
    err = autorest.Respond(
            resp,
            client.ByInspecting(),
            azure.WithErrorUnlessStatusCode(http.StatusOK),
            autorest.ByUnmarshallingJSON(&result.Value),
            autorest.ByClosing())
    result.Response = autorest.Response{Response: resp}
    return
}

// PutPositiveDuration put a positive duration value
//
func (client DurationClient) PutPositiveDuration(durationBody string) (result autorest.Response, err error) {
    req, err := client.PutPositiveDurationPreparer(durationBody)
    if err != nil {
        return result, autorest.NewErrorWithError(err, "durationgroup.DurationClient", "PutPositiveDuration", nil , "Failure preparing request")
    }

    resp, err := client.PutPositiveDurationSender(req)
    if err != nil {
        result.Response = resp
        return result, autorest.NewErrorWithError(err, "durationgroup.DurationClient", "PutPositiveDuration", resp, "Failure sending request")
    }

    result, err = client.PutPositiveDurationResponder(resp)
    if err != nil {
        err = autorest.NewErrorWithError(err, "durationgroup.DurationClient", "PutPositiveDuration", resp, "Failure responding to request")
    }

    return
}

// PutPositiveDurationPreparer prepares the PutPositiveDuration request.
func (client DurationClient) PutPositiveDurationPreparer(durationBody string) (*http.Request, error) {
    preparer := autorest.CreatePreparer(
                        autorest.AsJSON(),
                        autorest.AsPut(),
                        autorest.WithBaseURL(client.BaseURI),
                        autorest.WithPath("/duration/positiveduration"),
                        autorest.WithJSON(durationBody))
    return preparer.Prepare(&http.Request{})
}

// PutPositiveDurationSender sends the PutPositiveDuration request. The method will close the
// http.Response Body if it receives an error.
func (client DurationClient) PutPositiveDurationSender(req *http.Request) (*http.Response, error) {
    return autorest.SendWithSender(client, req)
}

// PutPositiveDurationResponder handles the response to the PutPositiveDuration request. The method always
// closes the http.Response Body.
func (client DurationClient) PutPositiveDurationResponder(resp *http.Response) (result autorest.Response, err error) { 
    err = autorest.Respond(
            resp,
            client.ByInspecting(),
            azure.WithErrorUnlessStatusCode(http.StatusOK),
            autorest.ByClosing())
    result.Response = resp
    return
}

