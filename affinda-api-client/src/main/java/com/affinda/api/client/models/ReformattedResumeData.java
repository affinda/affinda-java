package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ReformattedResumeData model. */
@Fluent
public final class ReformattedResumeData {
    /*
     * The reformattedFile property.
     */
    @JsonProperty(value = "reformattedFile")
    private String reformattedFile;

    /**
     * Get the reformattedFile property: The reformattedFile property.
     *
     * @return the reformattedFile value.
     */
    public String getReformattedFile() {
        return this.reformattedFile;
    }

    /**
     * Set the reformattedFile property: The reformattedFile property.
     *
     * @param reformattedFile the reformattedFile value to set.
     * @return the ReformattedResumeData object itself.
     */
    public ReformattedResumeData setReformattedFile(String reformattedFile) {
        this.reformattedFile = reformattedFile;
        return this;
    }
}
