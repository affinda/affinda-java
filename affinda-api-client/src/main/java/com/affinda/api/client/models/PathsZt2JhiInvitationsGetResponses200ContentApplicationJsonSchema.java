package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PathsZt2JhiInvitationsGetResponses200ContentApplicationJsonSchema model. */
@Fluent
public final class PathsZt2JhiInvitationsGetResponses200ContentApplicationJsonSchema extends PaginatedResponse {
    /*
     * The results property.
     */
    @JsonProperty(value = "results")
    private List<Invitation> results;

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public List<Invitation> getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the PathsZt2JhiInvitationsGetResponses200ContentApplicationJsonSchema object itself.
     */
    public PathsZt2JhiInvitationsGetResponses200ContentApplicationJsonSchema setResults(List<Invitation> results) {
        this.results = results;
        return this;
    }
}
