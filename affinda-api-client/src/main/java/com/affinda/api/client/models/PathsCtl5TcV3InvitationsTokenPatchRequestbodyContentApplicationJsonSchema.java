package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PathsCtl5TcV3InvitationsTokenPatchRequestbodyContentApplicationJsonSchema model. */
@Fluent
public final class PathsCtl5TcV3InvitationsTokenPatchRequestbodyContentApplicationJsonSchema {
    /*
     * The status property.
     */
    @JsonProperty(value = "status")
    private PatchContentSchemaStatus status;

    /**
     * Get the status property: The status property.
     *
     * @return the status value.
     */
    public PatchContentSchemaStatus getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status property.
     *
     * @param status the status value to set.
     * @return the PathsCtl5TcV3InvitationsTokenPatchRequestbodyContentApplicationJsonSchema object itself.
     */
    public PathsCtl5TcV3InvitationsTokenPatchRequestbodyContentApplicationJsonSchema setStatus(
            PatchContentSchemaStatus status) {
        this.status = status;
        return this;
    }
}
