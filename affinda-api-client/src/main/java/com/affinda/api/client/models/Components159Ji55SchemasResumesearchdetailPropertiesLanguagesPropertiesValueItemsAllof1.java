package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components159Ji55SchemasResumesearchdetailPropertiesLanguagesPropertiesValueItemsAllof1 model. */
@Fluent
public class Components159Ji55SchemasResumesearchdetailPropertiesLanguagesPropertiesValueItemsAllof1 {
    /*
     * The match property.
     */
    @JsonProperty(value = "match")
    private Boolean match;

    /**
     * Get the match property: The match property.
     *
     * @return the match value.
     */
    public Boolean isMatch() {
        return this.match;
    }

    /**
     * Set the match property: The match property.
     *
     * @param match the match value to set.
     * @return the Components159Ji55SchemasResumesearchdetailPropertiesLanguagesPropertiesValueItemsAllof1 object
     *     itself.
     */
    public Components159Ji55SchemasResumesearchdetailPropertiesLanguagesPropertiesValueItemsAllof1 setMatch(
            Boolean match) {
        this.match = match;
        return this;
    }
}
