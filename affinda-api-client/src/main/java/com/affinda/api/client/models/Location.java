package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Location model. */
@Fluent
public final class Location {
    /*
     * The formatted property.
     */
    @JsonProperty(value = "formatted")
    private String formatted;

    /*
     * The postalCode property.
     */
    @JsonProperty(value = "postalCode")
    private String postalCode;

    /*
     * The state property.
     */
    @JsonProperty(value = "state")
    private String state;

    /*
     * The country property.
     */
    @JsonProperty(value = "country")
    private String country;

    /*
     * Two letter country code (ISO 3166-1 alpha-2)
     */
    @JsonProperty(value = "countryCode")
    private String countryCode;

    /*
     * The rawInput property.
     */
    @JsonProperty(value = "rawInput", required = true)
    private String rawInput;

    /*
     * The streetNumber property.
     */
    @JsonProperty(value = "streetNumber")
    private String streetNumber;

    /*
     * The street property.
     */
    @JsonProperty(value = "street")
    private String street;

    /*
     * The apartmentNumber property.
     */
    @JsonProperty(value = "apartmentNumber")
    private String apartmentNumber;

    /*
     * The city property.
     */
    @JsonProperty(value = "city")
    private String city;

    /**
     * Get the formatted property: The formatted property.
     *
     * @return the formatted value.
     */
    public String getFormatted() {
        return this.formatted;
    }

    /**
     * Set the formatted property: The formatted property.
     *
     * @param formatted the formatted value to set.
     * @return the Location object itself.
     */
    public Location setFormatted(String formatted) {
        this.formatted = formatted;
        return this;
    }

    /**
     * Get the postalCode property: The postalCode property.
     *
     * @return the postalCode value.
     */
    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * Set the postalCode property: The postalCode property.
     *
     * @param postalCode the postalCode value to set.
     * @return the Location object itself.
     */
    public Location setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Get the state property: The state property.
     *
     * @return the state value.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Set the state property: The state property.
     *
     * @param state the state value to set.
     * @return the Location object itself.
     */
    public Location setState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the country property: The country property.
     *
     * @return the country value.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Set the country property: The country property.
     *
     * @param country the country value to set.
     * @return the Location object itself.
     */
    public Location setCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get the countryCode property: Two letter country code (ISO 3166-1 alpha-2).
     *
     * @return the countryCode value.
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * Set the countryCode property: Two letter country code (ISO 3166-1 alpha-2).
     *
     * @param countryCode the countryCode value to set.
     * @return the Location object itself.
     */
    public Location setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Get the rawInput property: The rawInput property.
     *
     * @return the rawInput value.
     */
    public String getRawInput() {
        return this.rawInput;
    }

    /**
     * Set the rawInput property: The rawInput property.
     *
     * @param rawInput the rawInput value to set.
     * @return the Location object itself.
     */
    public Location setRawInput(String rawInput) {
        this.rawInput = rawInput;
        return this;
    }

    /**
     * Get the streetNumber property: The streetNumber property.
     *
     * @return the streetNumber value.
     */
    public String getStreetNumber() {
        return this.streetNumber;
    }

    /**
     * Set the streetNumber property: The streetNumber property.
     *
     * @param streetNumber the streetNumber value to set.
     * @return the Location object itself.
     */
    public Location setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    /**
     * Get the street property: The street property.
     *
     * @return the street value.
     */
    public String getStreet() {
        return this.street;
    }

    /**
     * Set the street property: The street property.
     *
     * @param street the street value to set.
     * @return the Location object itself.
     */
    public Location setStreet(String street) {
        this.street = street;
        return this;
    }

    /**
     * Get the apartmentNumber property: The apartmentNumber property.
     *
     * @return the apartmentNumber value.
     */
    public String getApartmentNumber() {
        return this.apartmentNumber;
    }

    /**
     * Set the apartmentNumber property: The apartmentNumber property.
     *
     * @param apartmentNumber the apartmentNumber value to set.
     * @return the Location object itself.
     */
    public Location setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
        return this;
    }

    /**
     * Get the city property: The city property.
     *
     * @return the city value.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Set the city property: The city property.
     *
     * @param city the city value to set.
     * @return the Location object itself.
     */
    public Location setCity(String city) {
        this.city = city;
        return this;
    }
}
