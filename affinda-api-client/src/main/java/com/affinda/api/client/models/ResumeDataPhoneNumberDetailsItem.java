package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResumeDataPhoneNumberDetailsItem model. */
@Fluent
public final class ResumeDataPhoneNumberDetailsItem {
    /*
     * The rawText property.
     */
    @JsonProperty(value = "rawText")
    private String rawText;

    /*
     * The formattedNumber property.
     */
    @JsonProperty(value = "formattedNumber")
    private String formattedNumber;

    /*
     * The countryCode property.
     */
    @JsonProperty(value = "countryCode")
    private String countryCode;

    /*
     * The internationalCountryCode property.
     */
    @JsonProperty(value = "internationalCountryCode")
    private Integer internationalCountryCode;

    /*
     * The nationalNumber property.
     */
    @JsonProperty(value = "nationalNumber")
    private String nationalNumber;

    /**
     * Get the rawText property: The rawText property.
     *
     * @return the rawText value.
     */
    public String getRawText() {
        return this.rawText;
    }

    /**
     * Set the rawText property: The rawText property.
     *
     * @param rawText the rawText value to set.
     * @return the ResumeDataPhoneNumberDetailsItem object itself.
     */
    public ResumeDataPhoneNumberDetailsItem setRawText(String rawText) {
        this.rawText = rawText;
        return this;
    }

    /**
     * Get the formattedNumber property: The formattedNumber property.
     *
     * @return the formattedNumber value.
     */
    public String getFormattedNumber() {
        return this.formattedNumber;
    }

    /**
     * Set the formattedNumber property: The formattedNumber property.
     *
     * @param formattedNumber the formattedNumber value to set.
     * @return the ResumeDataPhoneNumberDetailsItem object itself.
     */
    public ResumeDataPhoneNumberDetailsItem setFormattedNumber(String formattedNumber) {
        this.formattedNumber = formattedNumber;
        return this;
    }

    /**
     * Get the countryCode property: The countryCode property.
     *
     * @return the countryCode value.
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Set the countryCode property: The countryCode property.
     *
     * @param countryCode the countryCode value to set.
     * @return the ResumeDataPhoneNumberDetailsItem object itself.
     */
    public ResumeDataPhoneNumberDetailsItem setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Get the internationalCountryCode property: The internationalCountryCode property.
     *
     * @return the internationalCountryCode value.
     */
    public Integer getInternationalCountryCode() {
        return this.internationalCountryCode;
    }

    /**
     * Set the internationalCountryCode property: The internationalCountryCode property.
     *
     * @param internationalCountryCode the internationalCountryCode value to set.
     * @return the ResumeDataPhoneNumberDetailsItem object itself.
     */
    public ResumeDataPhoneNumberDetailsItem setInternationalCountryCode(Integer internationalCountryCode) {
        this.internationalCountryCode = internationalCountryCode;
        return this;
    }

    /**
     * Get the nationalNumber property: The nationalNumber property.
     *
     * @return the nationalNumber value.
     */
    public String getNationalNumber() {
        return this.nationalNumber;
    }

    /**
     * Set the nationalNumber property: The nationalNumber property.
     *
     * @param nationalNumber the nationalNumber value to set.
     * @return the ResumeDataPhoneNumberDetailsItem object itself.
     */
    public ResumeDataPhoneNumberDetailsItem setNationalNumber(String nationalNumber) {
        this.nationalNumber = nationalNumber;
        return this;
    }
}
