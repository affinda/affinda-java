package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Paths11QdcofV3MappingDataSourcesGetResponses200ContentApplicationJsonSchema model. */
@Fluent
public final class Paths11QdcofV3MappingDataSourcesGetResponses200ContentApplicationJsonSchema
        extends PaginatedResponse {
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
     * @return the Paths11QdcofV3MappingDataSourcesGetResponses200ContentApplicationJsonSchema object itself.
     */
    public Paths11QdcofV3MappingDataSourcesGetResponses200ContentApplicationJsonSchema setResults(
            List<MappingDataSource> results) {
        this.results = results;
        return this;
    }
}
