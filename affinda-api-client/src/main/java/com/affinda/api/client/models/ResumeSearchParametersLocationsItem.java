package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResumeSearchParametersLocationsItem model. */
@Fluent
public final class ResumeSearchParametersLocationsItem {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The coordinates property.
     */
    @JsonProperty(value = "coordinates")
    private ResumeSearchParametersLocationsItemCoordinates coordinates;

    /*
     * The distance property.
     */
    @JsonProperty(value = "distance")
    private Integer distance;

    /*
     * The unit property.
     */
    @JsonProperty(value = "unit")
    private SearchLocationUnit unit;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the ResumeSearchParametersLocationsItem object itself.
     */
    public ResumeSearchParametersLocationsItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the coordinates property: The coordinates property.
     *
     * @return the coordinates value.
     */
    public ResumeSearchParametersLocationsItemCoordinates getCoordinates() {
        return this.coordinates;
    }

    /**
     * Set the coordinates property: The coordinates property.
     *
     * @param coordinates the coordinates value to set.
     * @return the ResumeSearchParametersLocationsItem object itself.
     */
    public ResumeSearchParametersLocationsItem setCoordinates(
            ResumeSearchParametersLocationsItemCoordinates coordinates) {
        this.coordinates = coordinates;
        return this;
    }

    /**
     * Get the distance property: The distance property.
     *
     * @return the distance value.
     */
    public Integer getDistance() {
        return this.distance;
    }

    /**
     * Set the distance property: The distance property.
     *
     * @param distance the distance value to set.
     * @return the ResumeSearchParametersLocationsItem object itself.
     */
    public ResumeSearchParametersLocationsItem setDistance(Integer distance) {
        this.distance = distance;
        return this;
    }

    /**
     * Get the unit property: The unit property.
     *
     * @return the unit value.
     */
    public SearchLocationUnit getUnit() {
        return this.unit;
    }

    /**
     * Set the unit property: The unit property.
     *
     * @param unit the unit value to set.
     * @return the ResumeSearchParametersLocationsItem object itself.
     */
    public ResumeSearchParametersLocationsItem setUnit(SearchLocationUnit unit) {
        this.unit = unit;
        return this;
    }
}
