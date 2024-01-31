package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Paths1UmoszuV3MappingDataSourcesGetResponses200ContentApplicationJsonSchemaAllof1 model. */
@Fluent
public class Paths1UmoszuV3MappingDataSourcesGetResponses200ContentApplicationJsonSchemaAllof1 {
    /*
     * The results property.
     */
    @JsonProperty(value = "results")
    private List<MappingDataSource> results;

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public List<MappingDataSource> getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the Paths1UmoszuV3MappingDataSourcesGetResponses200ContentApplicationJsonSchemaAllof1 object itself.
     */
    public Paths1UmoszuV3MappingDataSourcesGetResponses200ContentApplicationJsonSchemaAllof1 setResults(
            List<MappingDataSource> results) {
        this.results = results;
        return this;
    }
}
