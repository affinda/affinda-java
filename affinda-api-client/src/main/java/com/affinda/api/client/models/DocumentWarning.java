package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DocumentWarning model. */
@Fluent
public final class DocumentWarning {
    /*
     * The warningCode property.
     */
    @JsonProperty(value = "warningCode")
    private String warningCode;

    /*
     * The warningDetail property.
     */
    @JsonProperty(value = "warningDetail")
    private String warningDetail;

    /**
     * Get the warningCode property: The warningCode property.
     *
     * @return the warningCode value.
     */
    public String getWarningCode() {
        return this.warningCode;
    }

    /**
     * Set the warningCode property: The warningCode property.
     *
     * @param warningCode the warningCode value to set.
     * @return the DocumentWarning object itself.
     */
    public DocumentWarning setWarningCode(String warningCode) {
        this.warningCode = warningCode;
        return this;
    }

    /**
     * Get the warningDetail property: The warningDetail property.
     *
     * @return the warningDetail value.
     */
    public String getWarningDetail() {
        return this.warningDetail;
    }

    /**
     * Set the warningDetail property: The warningDetail property.
     *
     * @param warningDetail the warningDetail value to set.
     * @return the DocumentWarning object itself.
     */
    public DocumentWarning setWarningDetail(String warningDetail) {
        this.warningDetail = warningDetail;
        return this;
    }
}
