package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AnnotationBatchUpdate model. */
@Fluent
public final class AnnotationBatchUpdate extends AnnotationUpdate {
    /*
     * Annotation's ID
     */
    @JsonProperty(value = "id", required = true)
    private int id;

    /**
     * Get the id property: Annotation's ID.
     *
     * @return the id value.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Set the id property: Annotation's ID.
     *
     * @param id the id value to set.
     * @return the AnnotationBatchUpdate object itself.
     */
    public AnnotationBatchUpdate setId(int id) {
        this.id = id;
        return this;
    }
}
