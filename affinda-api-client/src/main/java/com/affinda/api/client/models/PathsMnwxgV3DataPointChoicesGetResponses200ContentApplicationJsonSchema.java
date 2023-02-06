package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PathsMnwxgV3DataPointChoicesGetResponses200ContentApplicationJsonSchema model. */
@Fluent
public final class PathsMnwxgV3DataPointChoicesGetResponses200ContentApplicationJsonSchema extends PaginatedResponse {
    /*
     * The results property.
     */
    @JsonProperty(value = "results")
    private List<DataPointChoice> results;

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public List<DataPointChoice> getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the PathsMnwxgV3DataPointChoicesGetResponses200ContentApplicationJsonSchema object itself.
     */
    public PathsMnwxgV3DataPointChoicesGetResponses200ContentApplicationJsonSchema setResults(
            List<DataPointChoice> results) {
        this.results = results;
        return this;
    }
}
