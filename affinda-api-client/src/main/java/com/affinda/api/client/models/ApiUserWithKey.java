package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ApiUserWithKey model. */
@Fluent
public final class ApiUserWithKey {
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
    private List<ApiUserWithKeyOrganizationsItem> organizations;

    /*
     * Use this key to authenticate with the API.
     */
    @JsonProperty(value = "apiKey", required = true)
    private String apiKey;

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
     * @return the ApiUserWithKey object itself.
     */
    public ApiUserWithKey setId(int id) {
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
     * @return the ApiUserWithKey object itself.
     */
    public ApiUserWithKey setName(String name) {
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
     * @return the ApiUserWithKey object itself.
     */
    public ApiUserWithKey setUsername(String username) {
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
     * @return the ApiUserWithKey object itself.
     */
    public ApiUserWithKey setEmail(String email) {
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
     * @return the ApiUserWithKey object itself.
     */
    public ApiUserWithKey setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }

    /**
     * Get the organizations property: The organizations property.
     *
     * @return the organizations value.
     */
    public List<ApiUserWithKeyOrganizationsItem> getOrganizations() {
        return this.organizations;
    }

    /**
     * Set the organizations property: The organizations property.
     *
     * @param organizations the organizations value to set.
     * @return the ApiUserWithKey object itself.
     */
    public ApiUserWithKey setOrganizations(List<ApiUserWithKeyOrganizationsItem> organizations) {
        this.organizations = organizations;
        return this;
    }

    /**
     * Get the apiKey property: Use this key to authenticate with the API.
     *
     * @return the apiKey value.
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * Set the apiKey property: Use this key to authenticate with the API.
     *
     * @param apiKey the apiKey value to set.
     * @return the ApiUserWithKey object itself.
     */
    public ApiUserWithKey setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
}
