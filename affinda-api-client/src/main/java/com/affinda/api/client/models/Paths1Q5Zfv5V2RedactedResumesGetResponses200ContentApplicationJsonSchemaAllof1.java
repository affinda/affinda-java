package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Paths1Q5Zfv5V2RedactedResumesGetResponses200ContentApplicationJsonSchemaAllof1 model. */
@Fluent
public class Paths1Q5Zfv5V2RedactedResumesGetResponses200ContentApplicationJsonSchemaAllof1 {
    /*
     * The results property.
     */
    @JsonProperty(value = "results")
    private List<Resume> results;

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public List<Resume> getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the Paths1Q5Zfv5V2RedactedResumesGetResponses200ContentApplicationJsonSchemaAllof1 object itself.
     */
    public Paths1Q5Zfv5V2RedactedResumesGetResponses200ContentApplicationJsonSchemaAllof1 setResults(
            List<Resume> results) {
        this.results = results;
        return this;
    }
}
