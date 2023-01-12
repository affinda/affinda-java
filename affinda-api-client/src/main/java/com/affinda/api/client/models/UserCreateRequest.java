package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;

/** The UserCreateRequest model. */
@Fluent
public final class UserCreateRequest {
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
    @JsonProperty(value = "email", required = true)
    private String email;

    /*
     * Upload avatar for the user.
     */
    @JsonProperty(value = "avatar")
    private Flux<ByteBuffer> avatar;

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
     * @return the UserCreateRequest object itself.
     */
    public UserCreateRequest setName(String name) {
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
     * @return the UserCreateRequest object itself.
     */
    public UserCreateRequest setUsername(String username) {
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
     * @return the UserCreateRequest object itself.
     */
    public UserCreateRequest setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get the avatar property: Upload avatar for the user.
     *
     * @return the avatar value.
     */
    public Flux<ByteBuffer> getAvatar() {
        return this.avatar;
    }

    /**
     * Set the avatar property: Upload avatar for the user.
     *
     * @param avatar the avatar value to set.
     * @return the UserCreateRequest object itself.
     */
    public UserCreateRequest setAvatar(Flux<ByteBuffer> avatar) {
        this.avatar = avatar;
        return this;
    }
}
