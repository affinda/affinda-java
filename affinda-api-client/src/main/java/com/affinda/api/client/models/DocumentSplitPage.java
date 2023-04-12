package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** List the pages within this split. Not including a page here will signal that the page should be deleted. */
@Fluent
public final class DocumentSplitPage {
    /*
     * Page's ID
     */
    @JsonProperty(value = "id", required = true)
    private int id;

    /*
     * Specify a degree of rotation if you want to rotate a page. Possitive
     * number for clockwise rotation, and negative number for counter-clockwise
     * rotation.
     */
    @JsonProperty(value = "rotation")
    private Integer rotation;

    /**
     * Get the id property: Page's ID.
     *
     * @return the id value.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Set the id property: Page's ID.
     *
     * @param id the id value to set.
     * @return the DocumentSplitPage object itself.
     */
    public DocumentSplitPage setId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Get the rotation property: Specify a degree of rotation if you want to rotate a page. Possitive number for
     * clockwise rotation, and negative number for counter-clockwise rotation.
     *
     * @return the rotation value.
     */
    public Integer getRotation() {
        return this.rotation;
    }

    /**
     * Set the rotation property: Specify a degree of rotation if you want to rotate a page. Possitive number for
     * clockwise rotation, and negative number for counter-clockwise rotation.
     *
     * @param rotation the rotation value to set.
     * @return the DocumentSplitPage object itself.
     */
    public DocumentSplitPage setRotation(Integer rotation) {
        this.rotation = rotation;
        return this;
    }
}
