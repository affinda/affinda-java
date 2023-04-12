package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DocumentEditRequest model. */
@Fluent
public final class DocumentEditRequest {
    /*
     * The splits property.
     */
    @JsonProperty(value = "splits", required = true)
    private List<DocumentSplit> splits;

    /**
     * Get the splits property: The splits property.
     *
     * @return the splits value.
     */
    public List<DocumentSplit> getSplits() {
        return this.splits;
    }

    /**
     * Set the splits property: The splits property.
     *
     * @param splits the splits value to set.
     * @return the DocumentEditRequest object itself.
     */
    public DocumentEditRequest setSplits(List<DocumentSplit> splits) {
        this.splits = splits;
        return this;
    }
}
