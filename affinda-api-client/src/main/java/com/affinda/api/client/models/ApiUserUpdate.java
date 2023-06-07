package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ApiUserUpdate model. */
@Fluent
public final class ApiUserUpdate {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The username property.
     */
    @JsonProperty(value = "username")
    private String username;

    /*
     * The email property.
     */
    @JsonProperty(value = "email")
    private String email;

    /*
     * URL of the user's avatar.
     */
    @JsonProperty(value = "avatar")
    private String avatar;

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
     * @return the ApiUserUpdate object itself.
     */
    public ApiUserUpdate setName(String name) {
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
     * @return the ApiUserUpdate object itself.
     */
    public ApiUserUpdate setUsername(String username) {
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
     * @return the ApiUserUpdate object itself.
     */
    public ApiUserUpdate setEmail(String email) {
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
     * @return the ApiUserUpdate object itself.
     */
    public ApiUserUpdate setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
}
