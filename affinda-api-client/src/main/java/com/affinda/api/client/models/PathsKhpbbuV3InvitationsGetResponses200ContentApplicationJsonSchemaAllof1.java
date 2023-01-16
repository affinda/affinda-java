package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PathsKhpbbuV3InvitationsGetResponses200ContentApplicationJsonSchemaAllof1 model. */
@Fluent
public class PathsKhpbbuV3InvitationsGetResponses200ContentApplicationJsonSchemaAllof1 {
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
     * @return the PathsKhpbbuV3InvitationsGetResponses200ContentApplicationJsonSchemaAllof1 object itself.
     */
    public PathsKhpbbuV3InvitationsGetResponses200ContentApplicationJsonSchemaAllof1 setResults(
            List<Invitation> results) {
        this.results = results;
        return this;
    }
}
