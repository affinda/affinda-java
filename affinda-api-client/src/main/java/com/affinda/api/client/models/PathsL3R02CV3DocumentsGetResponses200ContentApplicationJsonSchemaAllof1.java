package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PathsL3R02CV3DocumentsGetResponses200ContentApplicationJsonSchemaAllof1 model. */
@Fluent
public class PathsL3R02CV3DocumentsGetResponses200ContentApplicationJsonSchemaAllof1 {
    /*
     * The results property.
     */
    @JsonProperty(value = "results")
    private List<Document> results;

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public List<Document> getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the PathsL3R02CV3DocumentsGetResponses200ContentApplicationJsonSchemaAllof1 object itself.
     */
    public PathsL3R02CV3DocumentsGetResponses200ContentApplicationJsonSchemaAllof1 setResults(List<Document> results) {
        this.results = results;
        return this;
    }
}
