package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The User model. */
@Fluent
public class User {
    /*
     * The id property.
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
    @JsonProperty(value = "username", required = true)
    private String username;

    /*
     * The email property.
     */
    @JsonProperty(value = "email")
    private String email;

    /*
     * The apiKey property.
     */
    @JsonProperty(value = "apiKey")
    private String apiKey;

    /**
     * Get the id property: The id property.
     *
     * @return the id value.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Set the id property: The id property.
     *
     * @param id the id value to set.
     * @return the User object itself.
     */
    public User setId(Integer id) {
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
     * @return the User object itself.
     */
    public User setName(String name) {
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
     * @return the User object itself.
     */
    public User setUsername(String username) {
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
     * @return the User object itself.
     */
    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get the apiKey property: The apiKey property.
     *
     * @return the apiKey value.
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * Set the apiKey property: The apiKey property.
     *
     * @param apiKey the apiKey value to set.
     * @return the User object itself.
     */
    public User setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
}
