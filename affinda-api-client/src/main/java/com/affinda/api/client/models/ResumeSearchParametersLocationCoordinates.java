package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResumeSearchParametersLocationCoordinates model. */
@Fluent
public final class ResumeSearchParametersLocationCoordinates {
    /*
     * The latitude property.
     */
    @JsonProperty(value = "latitude")
    private Float latitude;

    /*
     * The longitude property.
     */
    @JsonProperty(value = "longitude")
    private Float longitude;

    /**
     * Get the latitude property: The latitude property.
     *
     * @return the latitude value.
     */
    public Float getLatitude() {
        return this.latitude;
    }

    /**
     * Set the latitude property: The latitude property.
     *
     * @param latitude the latitude value to set.
     * @return the ResumeSearchParametersLocationCoordinates object itself.
     */
    public ResumeSearchParametersLocationCoordinates setLatitude(Float latitude) {
        this.latitude = latitude;
        return this;
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
     * Set the longitude property: The longitude property.
     *
     * @param longitude the longitude value to set.
     * @return the ResumeSearchParametersLocationCoordinates object itself.
     */
    public ResumeSearchParametersLocationCoordinates setLongitude(Float longitude) {
        this.longitude = longitude;
        return this;
    }
}
