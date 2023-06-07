package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DataFieldCreate model. */
@Fluent
public final class DataFieldCreate {
    /*
     * The label of the category that this field will be put into. If not
     * provided, the field will be put into the default category. If no
     * category exists with the specified label, a new category will be
     * created.
     */
    @JsonProperty(value = "categoryLabel")
    private String categoryLabel;

    /*
     * The field to be created.
     */
    @JsonProperty(value = "field", required = true)
    private DataFieldCreateField field;

    /*
     * The data point to be created for this field. If a data point with the
     * same slug and collection already exists, it will be reused.
     */
    @JsonProperty(value = "dataPoint", required = true)
    private DataFieldCreateDataPoint dataPoint;

    /**
     * Get the categoryLabel property: The label of the category that this field will be put into. If not provided, the
     * field will be put into the default category. If no category exists with the specified label, a new category will
     * be created.
     *
     * @return the categoryLabel value.
     */
    public String getCategoryLabel() {
        return this.categoryLabel;
    }

    /**
     * Set the categoryLabel property: The label of the category that this field will be put into. If not provided, the
     * field will be put into the default category. If no category exists with the specified label, a new category will
     * be created.
     *
     * @param categoryLabel the categoryLabel value to set.
     * @return the DataFieldCreate object itself.
     */
    public DataFieldCreate setCategoryLabel(String categoryLabel) {
        this.categoryLabel = categoryLabel;
        return this;
    }

    /**
     * Get the field property: The field to be created.
     *
     * @return the field value.
     */
    public DataFieldCreateField getField() {
        return this.field;
    }

    /**
     * Set the field property: The field to be created.
     *
     * @param field the field value to set.
     * @return the DataFieldCreate object itself.
     */
    public DataFieldCreate setField(DataFieldCreateField field) {
        this.field = field;
        return this;
    }

    /**
     * Get the dataPoint property: The data point to be created for this field. If a data point with the same slug and
     * collection already exists, it will be reused.
     *
     * @return the dataPoint value.
     */
    public DataFieldCreateDataPoint getDataPoint() {
        return this.dataPoint;
    }

    /**
     * Set the dataPoint property: The data point to be created for this field. If a data point with the same slug and
     * collection already exists, it will be reused.
     *
     * @param dataPoint the dataPoint value to set.
     * @return the DataFieldCreate object itself.
     */
    public DataFieldCreate setDataPoint(DataFieldCreateDataPoint dataPoint) {
        this.dataPoint = dataPoint;
        return this;
    }
}
