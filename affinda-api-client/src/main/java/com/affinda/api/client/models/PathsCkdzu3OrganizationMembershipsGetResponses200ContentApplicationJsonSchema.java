package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PathsCkdzu3OrganizationMembershipsGetResponses200ContentApplicationJsonSchema model. */
@Fluent
public final class PathsCkdzu3OrganizationMembershipsGetResponses200ContentApplicationJsonSchema
        extends PaginatedResponse {
    /*
     * The results property.
     */
    @JsonProperty(value = "results")
    private List<OrganizationMembership> results;

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public List<OrganizationMembership> getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the PathsCkdzu3OrganizationMembershipsGetResponses200ContentApplicationJsonSchema object itself.
     */
    public PathsCkdzu3OrganizationMembershipsGetResponses200ContentApplicationJsonSchema setResults(
            List<OrganizationMembership> results) {
        this.results = results;
        return this;
    }
}
