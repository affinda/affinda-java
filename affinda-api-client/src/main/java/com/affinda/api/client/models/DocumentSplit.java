package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describe a split of a document. */
@Fluent
public final class DocumentSplit {
    /*
     * Anything
     */
    @JsonProperty(value = "identifier")
    private Object identifier;

    /*
     * The pages property.
     */
    @JsonProperty(value = "pages", required = true)
    private List<DocumentSplitPage> pages;

    /**
     * Get the identifier property: Anything.
     *
     * @return the identifier value.
     */
    public Object getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Anything.
     *
     * @param identifier the identifier value to set.
     * @return the DocumentSplit object itself.
     */
    public DocumentSplit setIdentifier(Object identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the pages property: The pages property.
     *
     * @return the pages value.
     */
    public List<DocumentSplitPage> getPages() {
        return this.pages;
    }

    /**
     * Set the pages property: The pages property.
     *
     * @param pages the pages value to set.
     * @return the DocumentSplit object itself.
     */
    public DocumentSplit setPages(List<DocumentSplitPage> pages) {
        this.pages = pages;
        return this;
    }
}
