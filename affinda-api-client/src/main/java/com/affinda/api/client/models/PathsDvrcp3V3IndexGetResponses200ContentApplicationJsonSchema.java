package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PathsDvrcp3V3IndexGetResponses200ContentApplicationJsonSchema model. */
@Fluent
public final class PathsDvrcp3V3IndexGetResponses200ContentApplicationJsonSchema extends PaginatedResponse {
    /*
     * The results property.
     */
    @JsonProperty(value = "results")
    private List<Index> results;

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public List<Index> getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the PathsDvrcp3V3IndexGetResponses200ContentApplicationJsonSchema object itself.
     */
    public PathsDvrcp3V3IndexGetResponses200ContentApplicationJsonSchema setResults(List<Index> results) {
        this.results = results;
        return this;
    }
}
