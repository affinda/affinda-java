package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The BatchRemoveTagRequest model. */
@Fluent
public final class BatchRemoveTagRequest {
    /*
     * List of documents to remove tag from
     */
    @JsonProperty(value = "identifiers")
    private List<String> identifiers;

    /*
     * The tag's ID
     */
    @JsonProperty(value = "tag")
    private Integer tag;

    /**
     * Get the identifiers property: List of documents to remove tag from.
     *
     * @return the identifiers value.
     */
    public List<String> getIdentifiers() {
        return this.identifiers;
    }

    /**
     * Set the identifiers property: List of documents to remove tag from.
     *
     * @param identifiers the identifiers value to set.
     * @return the BatchRemoveTagRequest object itself.
     */
    public BatchRemoveTagRequest setIdentifiers(List<String> identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    /**
     * Get the tag property: The tag's ID.
     *
     * @return the tag value.
     */
    public Integer getTag() {
        return this.tag;
    }

    /**
     * Set the tag property: The tag's ID.
     *
     * @param tag the tag value to set.
     * @return the BatchRemoveTagRequest object itself.
     */
    public BatchRemoveTagRequest setTag(Integer tag) {
        this.tag = tag;
        return this;
    }
}
