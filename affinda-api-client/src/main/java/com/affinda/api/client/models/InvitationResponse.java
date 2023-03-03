package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The InvitationResponse model. */
@Fluent
public final class InvitationResponse {
    /*
     * The status property.
     */
    @JsonProperty(value = "status")
    private InvitationResponseStatus status;

    /**
     * Get the status property: The status property.
     *
     * @return the status value.
     */
    public InvitationResponseStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status property.
     *
     * @param status the status value to set.
     * @return the InvitationResponse object itself.
     */
    public InvitationResponse setStatus(InvitationResponseStatus status) {
        this.status = status;
        return this;
    }
}
