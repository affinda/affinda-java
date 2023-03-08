package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PathsMda0LlV2ResthookSubscriptionsGetResponses200ContentApplicationJsonSchema model. */
@Fluent
public final class PathsMda0LlV2ResthookSubscriptionsGetResponses200ContentApplicationJsonSchema
        extends PaginatedResponse {
    /*
     * The results property.
     */
    @JsonProperty(value = "results")
    private List<ResthookSubscription> results;

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public List<ResthookSubscription> getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the PathsMda0LlV2ResthookSubscriptionsGetResponses200ContentApplicationJsonSchema object itself.
     */
    public PathsMda0LlV2ResthookSubscriptionsGetResponses200ContentApplicationJsonSchema setResults(
            List<ResthookSubscription> results) {
        this.results = results;
        return this;
    }
}
