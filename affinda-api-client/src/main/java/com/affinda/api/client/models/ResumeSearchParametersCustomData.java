package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResumeSearchParametersCustomData model. */
@Fluent
public final class ResumeSearchParametersCustomData {
    /*
     * The filterType property.
     */
    @JsonProperty(value = "filterType", required = true)
    private ResumeSearchParametersCustomDataFilterType filterType;

    /*
     * The dataPoint property.
     */
    @JsonProperty(value = "dataPoint", required = true)
    private String dataPoint;

    /*
     * 'equals' searches require the 'value' key inside the query, and 'range'
     * searches require at least one of 'gte' (greater than or equal) and 'lte'
     * (less than or equal)
     */
    @JsonProperty(value = "query", required = true)
    private Object query;

    /*
     * The required property.
     */
    @JsonProperty(value = "required")
    private Boolean required;

    /*
     * The weight property.
     */
    @JsonProperty(value = "weight")
    private Float weight;

    /**
     * Get the filterType property: The filterType property.
     *
     * @return the filterType value.
     */
    public ResumeSearchParametersCustomDataFilterType getFilterType() {
        return this.filterType;
    }

    /**
     * Set the filterType property: The filterType property.
     *
     * @param filterType the filterType value to set.
     * @return the ResumeSearchParametersCustomData object itself.
     */
    public ResumeSearchParametersCustomData setFilterType(ResumeSearchParametersCustomDataFilterType filterType) {
        this.filterType = filterType;
        return this;
    }

    /**
     * Get the dataPoint property: The dataPoint property.
     *
     * @return the dataPoint value.
     */
    public String getDataPoint() {
        return this.dataPoint;
    }

    /**
     * Set the dataPoint property: The dataPoint property.
     *
     * @param dataPoint the dataPoint value to set.
     * @return the ResumeSearchParametersCustomData object itself.
     */
    public ResumeSearchParametersCustomData setDataPoint(String dataPoint) {
        this.dataPoint = dataPoint;
        return this;
    }

    /**
     * Get the query property: 'equals' searches require the 'value' key inside the query, and 'range' searches require
     * at least one of 'gte' (greater than or equal) and 'lte' (less than or equal).
     *
     * @return the query value.
     */
    public Object getQuery() {
        return this.query;
    }

    /**
     * Set the query property: 'equals' searches require the 'value' key inside the query, and 'range' searches require
     * at least one of 'gte' (greater than or equal) and 'lte' (less than or equal).
     *
     * @param query the query value to set.
     * @return the ResumeSearchParametersCustomData object itself.
     */
    public ResumeSearchParametersCustomData setQuery(Object query) {
        this.query = query;
        return this;
    }

    /**
     * Get the required property: The required property.
     *
     * @return the required value.
     */
    public Boolean isRequired() {
        return this.required;
    }

    /**
     * Set the required property: The required property.
     *
     * @param required the required value to set.
     * @return the ResumeSearchParametersCustomData object itself.
     */
    public ResumeSearchParametersCustomData setRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * Get the weight property: The weight property.
     *
     * @return the weight value.
     */
    public Float getWeight() {
        return this.weight;
    }

    /**
     * Set the weight property: The weight property.
     *
     * @param weight the weight value to set.
     * @return the ResumeSearchParametersCustomData object itself.
     */
    public ResumeSearchParametersCustomData setWeight(Float weight) {
        this.weight = weight;
        return this;
    }
}
