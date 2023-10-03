package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DataPointChoiceReplaceResponse model. */
@Fluent
public final class DataPointChoiceReplaceResponse {
    /*
     * Uniquely identify a data point.
     */
    @JsonProperty(value = "dataPoint", required = true)
    private String dataPoint;

    /*
     * Uniquely identify a collection.
     */
    @JsonProperty(value = "collection", required = true)
    private String collection;

    /*
     * Uniquely identify an organization.
     */
    @JsonProperty(value = "organization", required = true)
    private String organization;

    /*
     * The choices property.
     */
    @JsonProperty(value = "choices", required = true)
    private List<DataPointChoiceReplaceResponseChoicesItem> choices;

    /**
     * Get the dataPoint property: Uniquely identify a data point.
     *
     * @return the dataPoint value.
     */
    public String getDataPoint() {
        return this.dataPoint;
    }

    /**
     * Set the dataPoint property: Uniquely identify a data point.
     *
     * @param dataPoint the dataPoint value to set.
     * @return the DataPointChoiceReplaceResponse object itself.
     */
    public DataPointChoiceReplaceResponse setDataPoint(String dataPoint) {
        this.dataPoint = dataPoint;
        return this;
    }

    /**
     * Get the collection property: Uniquely identify a collection.
     *
     * @return the collection value.
     */
    public String getCollection() {
        return this.collection;
    }

    /**
     * Set the collection property: Uniquely identify a collection.
     *
     * @param collection the collection value to set.
     * @return the DataPointChoiceReplaceResponse object itself.
     */
    public DataPointChoiceReplaceResponse setCollection(String collection) {
        this.collection = collection;
        return this;
    }

    /**
     * Get the organization property: Uniquely identify an organization.
     *
     * @return the organization value.
     */
    public String getOrganization() {
        return this.organization;
    }

    /**
     * Set the organization property: Uniquely identify an organization.
     *
     * @param organization the organization value to set.
     * @return the DataPointChoiceReplaceResponse object itself.
     */
    public DataPointChoiceReplaceResponse setOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get the choices property: The choices property.
     *
     * @return the choices value.
     */
    public List<DataPointChoiceReplaceResponseChoicesItem> getChoices() {
        return this.choices;
    }

    /**
     * Set the choices property: The choices property.
     *
     * @param choices the choices value to set.
     * @return the DataPointChoiceReplaceResponse object itself.
     */
    public DataPointChoiceReplaceResponse setChoices(List<DataPointChoiceReplaceResponseChoicesItem> choices) {
        this.choices = choices;
        return this;
    }
}
