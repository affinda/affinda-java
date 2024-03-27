package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RegionBias model. */
@Fluent
public final class RegionBias {
    /*
     * A single alpha-2 country code (e.g. AU) used by google geocoding service
     */
    @JsonProperty(value = "country")
    private String country;

    /*
     * A list of alpha-2 country codes used by Pelias
     */
    @JsonProperty(value = "countries")
    private List<String> countries;

    /*
     * A list of coordinates used by Pelias in the shape of [min_lon, min_lat,
     * max_lon, max_lat]
     */
    @JsonProperty(value = "squareCoordinates")
    private List<Float> squareCoordinates;

    /*
     * If true, the location must be within the region, as opposed to prefering
     * locations within the region.
     * Default to false.
     *
     */
    @JsonProperty(value = "strict")
    private Boolean strict;

    /**
     * Get the country property: A single alpha-2 country code (e.g. AU) used by google geocoding service.
     *
     * @return the country value.
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * Set the country property: A single alpha-2 country code (e.g. AU) used by google geocoding service.
     *
     * @param country the country value to set.
     * @return the RegionBias object itself.
     */
    public RegionBias setCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get the countries property: A list of alpha-2 country codes used by Pelias.
     *
     * @return the countries value.
     */
    public List<String> getCountries() {
        return this.countries;
    }

    /**
     * Set the countries property: A list of alpha-2 country codes used by Pelias.
     *
     * @param countries the countries value to set.
     * @return the RegionBias object itself.
     */
    public RegionBias setCountries(List<String> countries) {
        this.countries = countries;
        return this;
    }

    /**
     * Get the squareCoordinates property: A list of coordinates used by Pelias in the shape of [min_lon, min_lat,
     * max_lon, max_lat].
     *
     * @return the squareCoordinates value.
     */
    public List<Float> getSquareCoordinates() {
        return this.squareCoordinates;
    }

    /**
     * Set the squareCoordinates property: A list of coordinates used by Pelias in the shape of [min_lon, min_lat,
     * max_lon, max_lat].
     *
     * @param squareCoordinates the squareCoordinates value to set.
     * @return the RegionBias object itself.
     */
    public RegionBias setSquareCoordinates(List<Float> squareCoordinates) {
        this.squareCoordinates = squareCoordinates;
        return this;
    }

    /**
     * Get the strict property: If true, the location must be within the region, as opposed to prefering locations
     * within the region. Default to false.
     *
     * @return the strict value.
     */
    public Boolean isStrict() {
        return this.strict;
    }

    /**
     * Set the strict property: If true, the location must be within the region, as opposed to prefering locations
     * within the region. Default to false.
     *
     * @param strict the strict value to set.
     * @return the RegionBias object itself.
     */
    public RegionBias setStrict(Boolean strict) {
        this.strict = strict;
        return this;
    }
}
