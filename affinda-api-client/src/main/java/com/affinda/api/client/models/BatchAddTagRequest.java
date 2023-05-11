package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The BatchAddTagRequest model. */
@Fluent
public final class BatchAddTagRequest {
    /*
     * List of documents to tag
     */
    @JsonProperty(value = "identifiers")
    private List<String> identifiers;

    /*
     * The tag's ID
     */
    @JsonProperty(value = "tag")
    private Integer tag;

    /**
     * Get the identifiers property: List of documents to tag.
     *
     * @return the identifiers value.
     */
    public List<String> getIdentifiers() {
        return this.identifiers;
    }

    /**
     * Set the identifiers property: List of documents to tag.
     *
     * @param identifiers the identifiers value to set.
     * @return the BatchAddTagRequest object itself.
     */
    public BatchAddTagRequest setIdentifiers(List<String> identifiers) {
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
     * @return the BatchAddTagRequest object itself.
     */
    public BatchAddTagRequest setTag(Integer tag) {
        this.tag = tag;
        return this;
    }
}
