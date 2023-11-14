package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The user who created this index. */
@Fluent
public final class IndexUser {
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
     * The email property.
     */
    @JsonProperty(value = "email", required = true)
    private String email;

    /*
     * URL of the user's avatar.
     */
    @JsonProperty(value = "avatar", required = true)
    private String avatar;

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
     * @return the IndexUser object itself.
     */
    public IndexUser setId(int id) {
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
     * @return the IndexUser object itself.
     */
    public IndexUser setName(String name) {
        this.name = name;
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
     * @return the IndexUser object itself.
     */
    public IndexUser setEmail(String email) {
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
     * @return the IndexUser object itself.
     */
    public IndexUser setAvatar(String avatar) {
        this.avatar = avatar;
        return this;
    }
}
