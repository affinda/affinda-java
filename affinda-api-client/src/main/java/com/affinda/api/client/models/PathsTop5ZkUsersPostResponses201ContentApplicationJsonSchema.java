package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PathsTop5ZkUsersPostResponses201ContentApplicationJsonSchema model. */
@Fluent
public final class PathsTop5ZkUsersPostResponses201ContentApplicationJsonSchema extends User {
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
     * @return the PathsTop5ZkUsersPostResponses201ContentApplicationJsonSchema object itself.
     */
    public PathsTop5ZkUsersPostResponses201ContentApplicationJsonSchema setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
}
