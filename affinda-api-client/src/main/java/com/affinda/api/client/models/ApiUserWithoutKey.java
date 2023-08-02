package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ApiUserWithoutKey model. */
@Fluent
public final class ApiUserWithoutKey {
    /*
     * Uniquely identify a user.
     */
    @JsonProperty(value = "id", required = true)
    private int id;

    /*
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The username property.
     */
    @JsonProperty(value = "username", required = true)
    private String username;

    /*
     * The email property.
     */
    @JsonProperty(value = "email", required = true)
    private String email;

    /*
     * URL of the user's avatar.
     */
    @JsonProperty(value = "avatar", required = true)
    private String avatar;

    /*
     * The organizations property.
     */
    @JsonProperty(value = "organizations", required = true)
    private List<ApiUserWithoutKeyOrganizationsItem> organizations;

    /*
     * The last 4 characters of the API key.
     */
    @JsonProperty(value = "apiKeyLastChars")
    private String apiKeyLastChars;

    /**
     * Get the id property: Uniquely identify a user.
     *
     * @return the id value.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Set the id property: Uniquely identify a user.
     *
     * @param id the id value to set.
     * @return the ApiUserWithoutKey object itself.
     */
    public ApiUserWithoutKey setId(int id) {
        this.id = id;
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
     * @return the ApiUserWithoutKey object itself.
     */
    public ApiUserWithoutKey setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the username property: The username property.
     *
     * @return the username value.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Set the username property: The username property.
     *
     * @param username the username value to set.
     * @return the ApiUserWithoutKey object itself.
     */
    public ApiUserWithoutKey setUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the email property: The email property.
     *
     * @return the email value.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Set the email property: The email property.
     *
     * @param email the email value to set.
     * @return the ApiUserWithoutKey object itself.
     */
    public ApiUserWithoutKey setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get the avatar property: URL of the user's avatar.
     *
     * @return the avatar value.
     */
    public String getAvatar() {
        return this.avatar;
    }

    /**
     * Set the avatar property: URL of the user's avatar.
     *
     * @param avatar the avatar value to set.
     * @return the ApiUserWithoutKey object itself.
     */
    public ApiUserWithoutKey setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    /**
     * Get the organizations property: The organizations property.
     *
     * @return the organizations value.
     */
    public List<ApiUserWithoutKeyOrganizationsItem> getOrganizations() {
        return this.organizations;
    }

    /**
     * Set the organizations property: The organizations property.
     *
     * @param organizations the organizations value to set.
     * @return the ApiUserWithoutKey object itself.
     */
    public ApiUserWithoutKey setOrganizations(List<ApiUserWithoutKeyOrganizationsItem> organizations) {
        this.organizations = organizations;
        return this;
    }

    /**
     * Get the apiKeyLastChars property: The last 4 characters of the API key.
     *
     * @return the apiKeyLastChars value.
     */
    public String getApiKeyLastChars() {
        return this.apiKeyLastChars;
    }

    /**
     * Set the apiKeyLastChars property: The last 4 characters of the API key.
     *
     * @param apiKeyLastChars the apiKeyLastChars value to set.
     * @return the ApiUserWithoutKey object itself.
     */
    public ApiUserWithoutKey setApiKeyLastChars(String apiKeyLastChars) {
        this.apiKeyLastChars = apiKeyLastChars;
        return this;
    }
}
