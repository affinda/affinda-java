package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The UserNullable model. */
@Fluent
public final class UserNullable {
    /*
     * Uniquely identify a user.
     */
    @JsonProperty(value = "id")
    private Integer id;

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
     * Get the id property: Uniquely identify a user.
     *
     * @return the id value.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Set the id property: Uniquely identify a user.
     *
     * @param id the id value to set.
     * @return the UserNullable object itself.
     */
    public UserNullable setId(Integer id) {
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
     * @return the UserNullable object itself.
     */
    public UserNullable setName(String name) {
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
     * @return the UserNullable object itself.
     */
    public UserNullable setUsername(String username) {
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
     * @return the UserNullable object itself.
     */
    public UserNullable setEmail(String email) {
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
     * @return the UserNullable object itself.
     */
    public UserNullable setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
}
