package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PathsDd1FapV2ResthookSubscriptionsGetResponses200ContentApplicationJsonSchemaAllof1 model. */
@Fluent
public class PathsDd1FapV2ResthookSubscriptionsGetResponses200ContentApplicationJsonSchemaAllof1 {
    /*
     * The results property.
     */
    @JsonProperty(value = "results")
    private List<ResthookSubscription> results;

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public List<ResthookSubscription> getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the PathsDd1FapV2ResthookSubscriptionsGetResponses200ContentApplicationJsonSchemaAllof1 object itself.
     */
    public PathsDd1FapV2ResthookSubscriptionsGetResponses200ContentApplicationJsonSchemaAllof1 setResults(
            List<ResthookSubscription> results) {
        this.results = results;
        return this;
    }
}
