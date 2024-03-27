package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** The ChangedValidationResults model. */
@Fluent
public final class ChangedValidationResults {
    /*
     * List of validation results created during this operation.
     */
    @JsonProperty(value = "created")
    private List<ValidationResult> created;

    /*
     * List of validation results updated during this operation.
     */
    @JsonProperty(value = "updated")
    private List<ValidationResult> updated;

    /*
     * List of validation results deleted during this operation.
     */
    @JsonProperty(value = "deleted")
    private List<ValidationResult> deleted;

    /*
     * Dictionary of <any>
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the created property: List of validation results created during this operation.
     *
     * @return the created value.
     */
    public List<ValidationResult> getCreated() {
        return this.created;
    }

    /**
     * Set the created property: List of validation results created during this operation.
     *
     * @param created the created value to set.
     * @return the ChangedValidationResults object itself.
     */
    public ChangedValidationResults setCreated(List<ValidationResult> created) {
        this.created = created;
        return this;
    }

    /**
     * Get the updated property: List of validation results updated during this operation.
     *
     * @return the updated value.
     */
    public List<ValidationResult> getUpdated() {
        return this.updated;
    }

    /**
     * Set the updated property: List of validation results updated during this operation.
     *
     * @param updated the updated value to set.
     * @return the ChangedValidationResults object itself.
     */
    public ChangedValidationResults setUpdated(List<ValidationResult> updated) {
        this.updated = updated;
        return this;
    }

    /**
     * Get the deleted property: List of validation results deleted during this operation.
     *
     * @return the deleted value.
     */
    public List<ValidationResult> getDeleted() {
        return this.deleted;
    }

    /**
     * Set the deleted property: List of validation results deleted during this operation.
     *
     * @param deleted the deleted value to set.
     * @return the ChangedValidationResults object itself.
     */
    public ChangedValidationResults setDeleted(List<ValidationResult> deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * Get the additionalProperties property: Dictionary of &lt;any&gt;.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Dictionary of &lt;any&gt;.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the ChangedValidationResults object itself.
     */
    public ChangedValidationResults setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
