package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The FieldsLayout model. */
@Fluent
public final class FieldsLayout {
    /*
     * The defaultCategory property.
     */
    @JsonProperty(value = "defaultCategory", required = true)
    private FieldCategory defaultCategory;

    /*
     * The categories property.
     */
    @JsonProperty(value = "categories", required = true)
    private List<FieldCategory> categories;

    /**
     * Get the defaultCategory property: The defaultCategory property.
     *
     * @return the defaultCategory value.
     */
    public FieldCategory getDefaultCategory() {
        return this.defaultCategory;
    }

    /**
     * Set the defaultCategory property: The defaultCategory property.
     *
     * @param defaultCategory the defaultCategory value to set.
     * @return the FieldsLayout object itself.
     */
    public FieldsLayout setDefaultCategory(FieldCategory defaultCategory) {
        this.defaultCategory = defaultCategory;
        return this;
    }

    /**
     * Get the categories property: The categories property.
     *
     * @return the categories value.
     */
    public List<FieldCategory> getCategories() {
        return this.categories;
    }

    /**
     * Set the categories property: The categories property.
     *
     * @param categories the categories value to set.
     * @return the FieldsLayout object itself.
     */
    public FieldsLayout setCategories(List<FieldCategory> categories) {
        this.categories = categories;
        return this;
    }
}
