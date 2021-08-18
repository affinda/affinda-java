package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URL;

/** The ReformattedResumeData model. */
@Fluent
public final class ReformattedResumeData {
    /*
     * The reformattedFile property.
     */
    @JsonProperty(value = "reformattedFile")
    private URL reformattedFile;

    /**
     * Get the reformattedFile property: The reformattedFile property.
     *
     * @return the reformattedFile value.
     */
    public URL getReformattedFile() {
        return this.reformattedFile;
    }

    /**
     * Set the reformattedFile property: The reformattedFile property.
     *
     * @param reformattedFile the reformattedFile value to set.
     * @return the ReformattedResumeData object itself.
     */
    public ReformattedResumeData setReformattedFile(URL reformattedFile) {
        this.reformattedFile = reformattedFile;
        return this;
    }
}
