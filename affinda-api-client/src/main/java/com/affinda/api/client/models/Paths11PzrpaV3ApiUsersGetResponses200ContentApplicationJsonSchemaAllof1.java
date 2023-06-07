package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Paths11PzrpaV3ApiUsersGetResponses200ContentApplicationJsonSchemaAllof1 model. */
@Fluent
public class Paths11PzrpaV3ApiUsersGetResponses200ContentApplicationJsonSchemaAllof1 {
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
     * @return the Paths11PzrpaV3ApiUsersGetResponses200ContentApplicationJsonSchemaAllof1 object itself.
     */
    public Paths11PzrpaV3ApiUsersGetResponses200ContentApplicationJsonSchemaAllof1 setResults(
            List<ApiUserWithoutKey> results) {
        this.results = results;
        return this;
    }
}
