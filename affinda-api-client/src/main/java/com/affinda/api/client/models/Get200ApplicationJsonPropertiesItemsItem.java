package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URL;

/** The Get200ApplicationJsonPropertiesItemsItem model. */
@Fluent
public final class Get200ApplicationJsonPropertiesItemsItem {
    /*
     * Unique identifier for the resume. If creating a document and left blank,
     * one will be automatically generated.
     */
    @JsonProperty(value = "identifier", required = true)
    private String identifier;

    /*
     * The template to apply
     */
    @JsonProperty(value = "formatFile", required = true)
    private URL formatFile;

    /**
     * Get the identifier property: Unique identifier for the resume. If creating a document and left blank, one will be
     * automatically generated.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Unique identifier for the resume. If creating a document and left blank, one will be
     * automatically generated.
     *
     * @param identifier the identifier value to set.
     * @return the Get200ApplicationJsonPropertiesItemsItem object itself.
     */
    public Get200ApplicationJsonPropertiesItemsItem setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the formatFile property: The template to apply.
     *
     * @return the formatFile value.
     */
    public URL getFormatFile() {
        return this.formatFile;
    }

    /**
     * Set the formatFile property: The template to apply.
     *
     * @param formatFile the formatFile value to set.
     * @return the Get200ApplicationJsonPropertiesItemsItem object itself.
     */
    public Get200ApplicationJsonPropertiesItemsItem setFormatFile(URL formatFile) {
        this.formatFile = formatFile;
        return this;
    }
}
