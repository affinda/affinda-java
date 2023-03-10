package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PathsGfm23QV2InvoicesGetResponses200ContentApplicationJsonSchema model. */
@Fluent
public final class PathsGfm23QV2InvoicesGetResponses200ContentApplicationJsonSchema extends PaginatedResponse {
    /*
     * The results property.
     */
    @JsonProperty(value = "results")
    private List<Meta> results;

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public List<Meta> getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the PathsGfm23QV2InvoicesGetResponses200ContentApplicationJsonSchema object itself.
     */
    public PathsGfm23QV2InvoicesGetResponses200ContentApplicationJsonSchema setResults(List<Meta> results) {
        this.results = results;
        return this;
    }
}
