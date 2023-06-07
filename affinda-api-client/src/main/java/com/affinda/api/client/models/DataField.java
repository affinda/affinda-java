package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DataField model. */
@Fluent
public final class DataField {
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
    private DataFieldField field;

    /*
     * The data point to be created for this field. If a data point with the
     * same slug and collection already exists, it will be reused.
     */
    @JsonProperty(value = "dataPoint", required = true)
    private DataFieldDataPoint dataPoint;

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
     * @return the DataField object itself.
     */
    public DataField setCategoryLabel(String categoryLabel) {
        this.categoryLabel = categoryLabel;
        return this;
    }

    /**
     * Get the field property: The field to be created.
     *
     * @return the field value.
     */
    public DataFieldField getField() {
        return this.field;
    }

    /**
     * Set the field property: The field to be created.
     *
     * @param field the field value to set.
     * @return the DataField object itself.
     */
    public DataField setField(DataFieldField field) {
        this.field = field;
        return this;
    }

    /**
     * Get the dataPoint property: The data point to be created for this field. If a data point with the same slug and
     * collection already exists, it will be reused.
     *
     * @return the dataPoint value.
     */
    public DataFieldDataPoint getDataPoint() {
        return this.dataPoint;
    }

    /**
     * Set the dataPoint property: The data point to be created for this field. If a data point with the same slug and
     * collection already exists, it will be reused.
     *
     * @param dataPoint the dataPoint value to set.
     * @return the DataField object itself.
     */
    public DataField setDataPoint(DataFieldDataPoint dataPoint) {
        this.dataPoint = dataPoint;
        return this;
    }
}
