package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PathsChbpqfV2JobDescriptionsGetResponses200ContentApplicationJsonSchema model. */
@Fluent
public final class PathsChbpqfV2JobDescriptionsGetResponses200ContentApplicationJsonSchema extends PaginatedResponse {
    /*
     * The results property.
     */
    @JsonProperty(value = "results")
    private List<JobDescription> results;

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public List<JobDescription> getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the PathsChbpqfV2JobDescriptionsGetResponses200ContentApplicationJsonSchema object itself.
     */
    public PathsChbpqfV2JobDescriptionsGetResponses200ContentApplicationJsonSchema setResults(
            List<JobDescription> results) {
        this.results = results;
        return this;
    }
}
