package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Paths1Dgz0V9V3AnnotationsGetResponses200ContentApplicationJsonSchemaAllof1 model. */
@Fluent
public class Paths1Dgz0V9V3AnnotationsGetResponses200ContentApplicationJsonSchemaAllof1 {
    /*
     * The results property.
     */
    @JsonProperty(value = "results")
    private List<Annotation> results;

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public List<Annotation> getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the Paths1Dgz0V9V3AnnotationsGetResponses200ContentApplicationJsonSchemaAllof1 object itself.
     */
    public Paths1Dgz0V9V3AnnotationsGetResponses200ContentApplicationJsonSchemaAllof1 setResults(
            List<Annotation> results) {
        this.results = results;
        return this;
    }
}
