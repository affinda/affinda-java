package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ApiUserWithoutKeyOrganizationsItem model. */
@Fluent
public final class ApiUserWithoutKeyOrganizationsItem {
    /*
     * Uniquely identify an organization.
     */
    @JsonProperty(value = "identifier", required = true)
    private String identifier;

    /*
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the identifier property: Uniquely identify an organization.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Uniquely identify an organization.
     *
     * @param identifier the identifier value to set.
     * @return the ApiUserWithoutKeyOrganizationsItem object itself.
     */
    public ApiUserWithoutKeyOrganizationsItem setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
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
     * @return the ApiUserWithoutKeyOrganizationsItem object itself.
     */
    public ApiUserWithoutKeyOrganizationsItem setName(String name) {
        this.name = name;
        return this;
    }
}
