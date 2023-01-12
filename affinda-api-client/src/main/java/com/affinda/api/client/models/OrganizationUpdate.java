package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;

/** The OrganizationUpdate model. */
@Fluent
public final class OrganizationUpdate {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Upload avatar for the organization.
     */
    @JsonProperty(value = "avatar")
    private Flux<ByteBuffer> avatar;

    /*
     * Used to sign webhook payloads so you can verify their integrity.
     */
    @JsonProperty(value = "resthookSignatureKey")
    private String resthookSignatureKey;

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
     * @return the OrganizationUpdate object itself.
     */
    public OrganizationUpdate setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the avatar property: Upload avatar for the organization.
     *
     * @return the avatar value.
     */
    public Flux<ByteBuffer> getAvatar() {
        return this.avatar;
    }

    /**
     * Set the avatar property: Upload avatar for the organization.
     *
     * @param avatar the avatar value to set.
     * @return the OrganizationUpdate object itself.
     */
    public OrganizationUpdate setAvatar(Flux<ByteBuffer> avatar) {
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
     * @return the OrganizationUpdate object itself.
     */
    public OrganizationUpdate setResthookSignatureKey(String resthookSignatureKey) {
        this.resthookSignatureKey = resthookSignatureKey;
        return this;
    }
}
