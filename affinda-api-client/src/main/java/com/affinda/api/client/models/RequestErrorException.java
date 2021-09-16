package com.affinda.api.client.models;

import com.azure.core.exception.HttpResponseException;
import com.azure.core.http.HttpResponse;

/** Exception thrown for an invalid response with RequestError information. */
public final class RequestErrorException extends HttpResponseException {
    /**
     * Initializes a new instance of the RequestErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     */
    public RequestErrorException(String message, HttpResponse response) {
        super(message, response);
    }

    /**
     * Initializes a new instance of the RequestErrorException class.
     *
     * @param message the exception message or the response content if a message is not available.
     * @param response the HTTP response.
     * @param value the deserialized response value.
     */
    public RequestErrorException(String message, HttpResponse response, RequestError value) {
        super(message, response, value);
    }

    @Override
    public RequestError getValue() {
        return (RequestError) super.getValue();
    }
}
