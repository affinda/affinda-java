package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A mapping data source is used to map from raw data found by our AI models to records in your database. */
@Fluent
public final class MappingDataSource {
    /*
     * Uniquely identify a mapping data source.
     */
    @JsonProperty(value = "identifier", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String identifier;

    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Attribute in the schema which uniquely identifiers the value
     */
    @JsonProperty(value = "keyProperty", required = true)
    private String keyProperty;

    /*
     * Attribute in the schema which is used to display the value
     */
    @JsonProperty(value = "displayProperty", required = true)
    private String displayProperty;

    /*
     * The organization that this mapping data source belongs to.
     */
    @JsonProperty(value = "organization", required = true)
    private String organization;

    /*
     * The schema of the mapping data source.
     */
    @JsonProperty(value = "schema")
    private Object schema;

    /**
     * Get the identifier property: Uniquely identify a mapping data source.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

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
     * @return the MappingDataSource object itself.
     */
    public MappingDataSource setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the keyProperty property: Attribute in the schema which uniquely identifiers the value.
     *
     * @return the keyProperty value.
     */
    public String getKeyProperty() {
        return this.keyProperty;
    }

    /**
     * Set the keyProperty property: Attribute in the schema which uniquely identifiers the value.
     *
     * @param keyProperty the keyProperty value to set.
     * @return the MappingDataSource object itself.
     */
    public MappingDataSource setKeyProperty(String keyProperty) {
        this.keyProperty = keyProperty;
        return this;
    }

    /**
     * Get the displayProperty property: Attribute in the schema which is used to display the value.
     *
     * @return the displayProperty value.
     */
    public String getDisplayProperty() {
        return this.displayProperty;
    }

    /**
     * Set the displayProperty property: Attribute in the schema which is used to display the value.
     *
     * @param displayProperty the displayProperty value to set.
     * @return the MappingDataSource object itself.
     */
    public MappingDataSource setDisplayProperty(String displayProperty) {
        this.displayProperty = displayProperty;
        return this;
    }

    /**
     * Get the organization property: The organization that this mapping data source belongs to.
     *
     * @return the organization value.
     */
    public String getOrganization() {
        return this.organization;
    }

    /**
     * Set the organization property: The organization that this mapping data source belongs to.
     *
     * @param organization the organization value to set.
     * @return the MappingDataSource object itself.
     */
    public MappingDataSource setOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get the schema property: The schema of the mapping data source.
     *
     * @return the schema value.
     */
    public Object getSchema() {
        return this.schema;
    }

    /**
     * Set the schema property: The schema of the mapping data source.
     *
     * @param schema the schema value to set.
     * @return the MappingDataSource object itself.
     */
    public MappingDataSource setSchema(Object schema) {
        this.schema = schema;
        return this;
    }
}
