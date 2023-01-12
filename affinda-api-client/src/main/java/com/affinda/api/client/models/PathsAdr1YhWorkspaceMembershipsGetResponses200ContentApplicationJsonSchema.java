package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PathsAdr1YhWorkspaceMembershipsGetResponses200ContentApplicationJsonSchema model. */
@Fluent
public final class PathsAdr1YhWorkspaceMembershipsGetResponses200ContentApplicationJsonSchema extends ListResult {
    /*
     * The results property.
     */
    @JsonProperty(value = "results", required = true)
    private List<WorkspaceMembership> results;

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public List<WorkspaceMembership> getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the PathsAdr1YhWorkspaceMembershipsGetResponses200ContentApplicationJsonSchema object itself.
     */
    public PathsAdr1YhWorkspaceMembershipsGetResponses200ContentApplicationJsonSchema setResults(
            List<WorkspaceMembership> results) {
        this.results = results;
        return this;
    }
}
