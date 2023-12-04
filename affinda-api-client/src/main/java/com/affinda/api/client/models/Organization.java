package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Organization model. */
@Fluent
public final class Organization {
    /*
     * Uniquely identify an organization.
     */
    @JsonProperty(value = "identifier")
    private String identifier;

    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The role of the logged in user within the organization.
     */
    @JsonProperty(value = "userRole")
    private OrganizationUserRole userRole;

    /*
     * URL of the organization's avatar.
     */
    @JsonProperty(value = "avatar")
    private String avatar;

    /*
     * Used to sign webhook payloads so you can verify their integrity.
     */
    @JsonProperty(value = "resthookSignatureKey")
    private String resthookSignatureKey;

    /*
     * The isTrial property.
     */
    @JsonProperty(value = "isTrial")
    private Boolean isTrial;

    /*
     * Configuration of the embeddable validation tool.
     */
    @JsonProperty(value = "validationToolConfig")
    private OrganizationValidationToolConfig validationToolConfig;

    /*
     * Whether to show the custom field creation in the UI.
     */
    @JsonProperty(value = "showCustomFieldCreation")
    private Boolean showCustomFieldCreation;

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
     * @return the Organization object itself.
     */
    public Organization setIdentifier(String identifier) {
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
     * @return the Organization object itself.
     */
    public Organization setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the userRole property: The role of the logged in user within the organization.
     *
     * @return the userRole value.
     */
    public OrganizationUserRole getUserRole() {
        return this.userRole;
    }

    /**
     * Set the userRole property: The role of the logged in user within the organization.
     *
     * @param userRole the userRole value to set.
     * @return the Organization object itself.
     */
    public Organization setUserRole(OrganizationUserRole userRole) {
        this.userRole = userRole;
        return this;
    }

    /**
     * Get the avatar property: URL of the organization's avatar.
     *
     * @return the avatar value.
     */
    public String getAvatar() {
        return this.avatar;
    }

    /**
     * Set the avatar property: URL of the organization's avatar.
     *
     * @param avatar the avatar value to set.
     * @return the Organization object itself.
     */
    public Organization setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    /**
     * Get the resthookSignatureKey property: Used to sign webhook payloads so you can verify their integrity.
     *
     * @return the resthookSignatureKey value.
     */
    public String getResthookSignatureKey() {
        return this.resthookSignatureKey;
    }

    /**
     * Set the resthookSignatureKey property: Used to sign webhook payloads so you can verify their integrity.
     *
     * @param resthookSignatureKey the resthookSignatureKey value to set.
     * @return the Organization object itself.
     */
    public Organization setResthookSignatureKey(String resthookSignatureKey) {
        this.resthookSignatureKey = resthookSignatureKey;
        return this;
    }

    /**
     * Get the isTrial property: The isTrial property.
     *
     * @return the isTrial value.
     */
    public Boolean isTrial() {
        return this.isTrial;
    }

    /**
     * Set the isTrial property: The isTrial property.
     *
     * @param isTrial the isTrial value to set.
     * @return the Organization object itself.
     */
    public Organization setIsTrial(Boolean isTrial) {
        this.isTrial = isTrial;
        return this;
    }

    /**
     * Get the validationToolConfig property: Configuration of the embeddable validation tool.
     *
     * @return the validationToolConfig value.
     */
    public OrganizationValidationToolConfig getValidationToolConfig() {
        return this.validationToolConfig;
    }

    /**
     * Set the validationToolConfig property: Configuration of the embeddable validation tool.
     *
     * @param validationToolConfig the validationToolConfig value to set.
     * @return the Organization object itself.
     */
    public Organization setValidationToolConfig(OrganizationValidationToolConfig validationToolConfig) {
        this.validationToolConfig = validationToolConfig;
        return this;
    }

    /**
     * Get the showCustomFieldCreation property: Whether to show the custom field creation in the UI.
     *
     * @return the showCustomFieldCreation value.
     */
    public Boolean isShowCustomFieldCreation() {
        return this.showCustomFieldCreation;
    }

    /**
     * Set the showCustomFieldCreation property: Whether to show the custom field creation in the UI.
     *
     * @param showCustomFieldCreation the showCustomFieldCreation value to set.
     * @return the Organization object itself.
     */
    public Organization setShowCustomFieldCreation(Boolean showCustomFieldCreation) {
        this.showCustomFieldCreation = showCustomFieldCreation;
        return this;
    }
}
