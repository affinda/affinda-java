package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Paths1Y6A2MfUsersPostResponses201ContentApplicationJsonSchemaAllof1 model. */
@Fluent
public class Paths1Y6A2MfUsersPostResponses201ContentApplicationJsonSchemaAllof1 {
    /*
     * API key used to authenticate for future requests.  This key is only
     * retrievable at the initial creation of the user.
     */
    @JsonProperty(value = "apiKey")
    private String apiKey;

    /**
     * Get the apiKey property: API key used to authenticate for future requests. This key is only retrievable at the
     * initial creation of the user.
     *
     * @return the apiKey value.
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * Set the apiKey property: API key used to authenticate for future requests. This key is only retrievable at the
     * initial creation of the user.
     *
     * @param apiKey the apiKey value to set.
     * @return the Paths1Y6A2MfUsersPostResponses201ContentApplicationJsonSchemaAllof1 object itself.
     */
    public Paths1Y6A2MfUsersPostResponses201ContentApplicationJsonSchemaAllof1 setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
}
