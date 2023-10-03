package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Request body for replacing choices of a data point. Either `collection` or `organization` is required. */
@Fluent
public final class DataPointChoiceReplaceRequest {
    /*
     * Uniquely identify a data point.
     */
    @JsonProperty(value = "dataPoint", required = true)
    private String dataPoint;

    /*
     * Uniquely identify a collection.
     */
    @JsonProperty(value = "collection")
    private String collection;

    /*
     * Uniquely identify an organization.
     */
    @JsonProperty(value = "organization")
    private String organization;

    /*
     * Incoming choices to replace existing choices of a data point. Existing
     * choices and incoming choices are matched base on their `value`. New
     * `value` will be created, existing `value` will be updated, and `value`
     * not in incoming choices will be deleted.
     */
    @JsonProperty(value = "choices", required = true)
    private List<DataPointChoiceForReplace> choices;

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
     * @return the DataPointChoiceReplaceRequest object itself.
     */
    public DataPointChoiceReplaceRequest setDataPoint(String dataPoint) {
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
     * @return the DataPointChoiceReplaceRequest object itself.
     */
    public DataPointChoiceReplaceRequest setCollection(String collection) {
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
     * @return the DataPointChoiceReplaceRequest object itself.
     */
    public DataPointChoiceReplaceRequest setOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get the choices property: Incoming choices to replace existing choices of a data point. Existing choices and
     * incoming choices are matched base on their `value`. New `value` will be created, existing `value` will be
     * updated, and `value` not in incoming choices will be deleted.
     *
     * @return the choices value.
     */
    public List<DataPointChoiceForReplace> getChoices() {
        return this.choices;
    }

    /**
     * Set the choices property: Incoming choices to replace existing choices of a data point. Existing choices and
     * incoming choices are matched base on their `value`. New `value` will be created, existing `value` will be
     * updated, and `value` not in incoming choices will be deleted.
     *
     * @param choices the choices value to set.
     * @return the DataPointChoiceReplaceRequest object itself.
     */
    public DataPointChoiceReplaceRequest setChoices(List<DataPointChoiceForReplace> choices) {
        this.choices = choices;
        return this;
    }
}
