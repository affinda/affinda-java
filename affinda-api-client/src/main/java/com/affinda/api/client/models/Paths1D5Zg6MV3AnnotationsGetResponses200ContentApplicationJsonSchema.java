package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Paths1D5Zg6MV3AnnotationsGetResponses200ContentApplicationJsonSchema model. */
@Fluent
public final class Paths1D5Zg6MV3AnnotationsGetResponses200ContentApplicationJsonSchema extends PaginatedResponse {
    /*
     * The results property.
     */
    @JsonProperty(value = "results")
    private List<Annotation> results;

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public List<Annotation> getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the Paths1D5Zg6MV3AnnotationsGetResponses200ContentApplicationJsonSchema object itself.
     */
    public Paths1D5Zg6MV3AnnotationsGetResponses200ContentApplicationJsonSchema setResults(List<Annotation> results) {
        this.results = results;
        return this;
    }
}
