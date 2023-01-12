package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PathsW51LnrInvitationsTokenPatchRequestbodyContentApplicationJsonSchema model. */
@Fluent
public final class PathsW51LnrInvitationsTokenPatchRequestbodyContentApplicationJsonSchema {
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
     * @return the PathsW51LnrInvitationsTokenPatchRequestbodyContentApplicationJsonSchema object itself.
     */
    public PathsW51LnrInvitationsTokenPatchRequestbodyContentApplicationJsonSchema setStatus(
            PatchContentSchemaStatus status) {
        this.status = status;
        return this;
    }
}
