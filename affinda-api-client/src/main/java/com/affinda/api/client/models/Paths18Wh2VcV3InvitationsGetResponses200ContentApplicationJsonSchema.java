package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Paths18Wh2VcV3InvitationsGetResponses200ContentApplicationJsonSchema model. */
@Fluent
public final class Paths18Wh2VcV3InvitationsGetResponses200ContentApplicationJsonSchema extends PaginatedResponse {
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
     * @return the Paths18Wh2VcV3InvitationsGetResponses200ContentApplicationJsonSchema object itself.
     */
    public Paths18Wh2VcV3InvitationsGetResponses200ContentApplicationJsonSchema setResults(List<Invitation> results) {
        this.results = results;
        return this;
    }
}
