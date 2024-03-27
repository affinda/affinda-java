package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ValidationResultUpdate model. */
@Fluent
public final class ValidationResultUpdate {
    /*
     * List of annotation ids that were validated
     */
    @JsonProperty(value = "annotations")
    private List<Integer> annotations;

    /*
     * Whether the validation passed or not
     */
    @JsonProperty(value = "passed")
    private Boolean passed;

    /*
     * The hot-dog case slug of the validation rule that was applied
     */
    @JsonProperty(value = "ruleSlug")
    private String ruleSlug;

    /*
     * Message explaining why the validation failed
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * Unique identifier for the document
     */
    @JsonProperty(value = "document")
    private String document;

    /**
     * Get the annotations property: List of annotation ids that were validated.
     *
     * @return the annotations value.
     */
    public List<Integer> getAnnotations() {
        return this.annotations;
    }

    /**
     * Set the annotations property: List of annotation ids that were validated.
     *
     * @param annotations the annotations value to set.
     * @return the ValidationResultUpdate object itself.
     */
    public ValidationResultUpdate setAnnotations(List<Integer> annotations) {
        this.annotations = annotations;
        return this;
    }

    /**
     * Get the passed property: Whether the validation passed or not.
     *
     * @return the passed value.
     */
    public Boolean isPassed() {
        return this.passed;
    }

    /**
     * Set the passed property: Whether the validation passed or not.
     *
     * @param passed the passed value to set.
     * @return the ValidationResultUpdate object itself.
     */
    public ValidationResultUpdate setPassed(Boolean passed) {
        this.passed = passed;
        return this;
    }

    /**
     * Get the ruleSlug property: The hot-dog case slug of the validation rule that was applied.
     *
     * @return the ruleSlug value.
     */
    public String getRuleSlug() {
        return this.ruleSlug;
    }

    /**
     * Set the ruleSlug property: The hot-dog case slug of the validation rule that was applied.
     *
     * @param ruleSlug the ruleSlug value to set.
     * @return the ValidationResultUpdate object itself.
     */
    public ValidationResultUpdate setRuleSlug(String ruleSlug) {
        this.ruleSlug = ruleSlug;
        return this;
    }

    /**
     * Get the message property: Message explaining why the validation failed.
     *
     * @return the message value.
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Set the message property: Message explaining why the validation failed.
     *
     * @param message the message value to set.
     * @return the ValidationResultUpdate object itself.
     */
    public ValidationResultUpdate setMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the document property: Unique identifier for the document.
     *
     * @return the document value.
     */
    public String getDocument() {
        return this.document;
    }

    /**
     * Set the document property: Unique identifier for the document.
     *
     * @param document the document value to set.
     * @return the ValidationResultUpdate object itself.
     */
    public ValidationResultUpdate setDocument(String document) {
        this.document = document;
        return this;
    }
}
