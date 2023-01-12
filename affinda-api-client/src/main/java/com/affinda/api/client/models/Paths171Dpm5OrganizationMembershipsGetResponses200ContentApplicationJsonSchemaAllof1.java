package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Paths171Dpm5OrganizationMembershipsGetResponses200ContentApplicationJsonSchemaAllof1 model. */
@Fluent
public class Paths171Dpm5OrganizationMembershipsGetResponses200ContentApplicationJsonSchemaAllof1 {
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
     * @return the Paths171Dpm5OrganizationMembershipsGetResponses200ContentApplicationJsonSchemaAllof1 object itself.
     */
    public Paths171Dpm5OrganizationMembershipsGetResponses200ContentApplicationJsonSchemaAllof1 setResults(
            List<OrganizationMembership> results) {
        this.results = results;
        return this;
    }
}
