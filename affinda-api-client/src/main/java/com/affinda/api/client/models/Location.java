package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Location model. */
@Fluent
public class Location {
    /*
     * The formatted property.
     */
    @JsonProperty(value = "formatted", access = JsonProperty.Access.WRITE_ONLY)
    private String formatted;

    /*
     * The postalCode property.
     */
    @JsonProperty(value = "postalCode", access = JsonProperty.Access.WRITE_ONLY)
    private String postalCode;

    /*
     * The state property.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /*
     * The stateCode property.
     */
    @JsonProperty(value = "stateCode", access = JsonProperty.Access.WRITE_ONLY)
    private String stateCode;

    /*
     * The country property.
     */
    @JsonProperty(value = "country", access = JsonProperty.Access.WRITE_ONLY)
    private String country;

    /*
     * Two letter country code (ISO 3166-1 alpha-2)
     */
    @JsonProperty(value = "countryCode", access = JsonProperty.Access.WRITE_ONLY)
    private String countryCode;

    /*
     * The rawInput property.
     */
    @JsonProperty(value = "rawInput", required = true)
    private String rawInput;

    /*
     * The streetNumber property.
     */
    @JsonProperty(value = "streetNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String streetNumber;

    /*
     * The street property.
     */
    @JsonProperty(value = "street", access = JsonProperty.Access.WRITE_ONLY)
    private String street;

    /*
     * The apartmentNumber property.
     */
    @JsonProperty(value = "apartmentNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String apartmentNumber;

    /*
     * The city property.
     */
    @JsonProperty(value = "city", access = JsonProperty.Access.WRITE_ONLY)
    private String city;

    /*
     * The latitude property.
     */
    @JsonProperty(value = "latitude", access = JsonProperty.Access.WRITE_ONLY)
    private Float latitude;

    /*
     * The longitude property.
     */
    @JsonProperty(value = "longitude", access = JsonProperty.Access.WRITE_ONLY)
    private Float longitude;

    /*
     * The poBox property.
     */
    @JsonProperty(value = "poBox", access = JsonProperty.Access.WRITE_ONLY)
    private String poBox;

    /**
     * Get the formatted property: The formatted property.
     *
     * @return the formatted value.
     */
    public String getFormatted() {
        return this.formatted;
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
     * Get the state property: The state property.
     *
     * @return the state value.
     */
    public String getState() {
        return this.state;
    }

    /**
     * Get the stateCode property: The stateCode property.
     *
     * @return the stateCode value.
     */
    public String getStateCode() {
        return this.stateCode;
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
     * Get the countryCode property: Two letter country code (ISO 3166-1 alpha-2).
     *
     * @return the countryCode value.
     */
    public String getCountryCode() {
        return this.countryCode;
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
     * Get the street property: The street property.
     *
     * @return the street value.
     */
    public String getStreet() {
        return this.street;
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
     * Get the city property: The city property.
     *
     * @return the city value.
     */
    public String getCity() {
        return this.city;
    }

    /**
     * Get the latitude property: The latitude property.
     *
     * @return the latitude value.
     */
    public Float getLatitude() {
        return this.latitude;
    }

    /**
     * Get the longitude property: The longitude property.
     *
     * @return the longitude value.
     */
    public Float getLongitude() {
        return this.longitude;
    }

    /**
     * Get the poBox property: The poBox property.
     *
     * @return the poBox value.
     */
    public String getPoBox() {
        return this.poBox;
    }
}
