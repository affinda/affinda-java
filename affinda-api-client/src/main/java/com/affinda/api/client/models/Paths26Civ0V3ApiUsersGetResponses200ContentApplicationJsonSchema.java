package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Paths26Civ0V3ApiUsersGetResponses200ContentApplicationJsonSchema model. */
@Fluent
public final class Paths26Civ0V3ApiUsersGetResponses200ContentApplicationJsonSchema extends PaginatedResponse {
    /*
     * The results property.
     */
    @JsonProperty(value = "results")
    private List<ApiUserWithoutKey> results;

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public List<ApiUserWithoutKey> getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the Paths26Civ0V3ApiUsersGetResponses200ContentApplicationJsonSchema object itself.
     */
    public Paths26Civ0V3ApiUsersGetResponses200ContentApplicationJsonSchema setResults(
            List<ApiUserWithoutKey> results) {
        this.results = results;
        return this;
    }
}
