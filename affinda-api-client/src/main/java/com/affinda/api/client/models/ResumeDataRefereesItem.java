package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** The ResumeDataRefereesItem model. */
@Fluent
public final class ResumeDataRefereesItem {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The text property.
     */
    @JsonProperty(value = "text")
    private String text;

    /*
     * The email property.
     */
    @JsonProperty(value = "email")
    private String email;

    /*
     * The number property.
     */
    @JsonProperty(value = "number")
    private String number;

    /*
     * The position property.
     */
    @JsonProperty(value = "position")
    private String position;

    /*
     * Dictionary of <any>
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

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
     * @return the ResumeDataRefereesItem object itself.
     */
    public ResumeDataRefereesItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the text property: The text property.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: The text property.
     *
     * @param text the text value to set.
     * @return the ResumeDataRefereesItem object itself.
     */
    public ResumeDataRefereesItem setText(String text) {
        this.text = text;
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
     * @return the ResumeDataRefereesItem object itself.
     */
    public ResumeDataRefereesItem setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get the number property: The number property.
     *
     * @return the number value.
     */
    public String getNumber() {
        return this.number;
    }

    /**
     * Set the number property: The number property.
     *
     * @param number the number value to set.
     * @return the ResumeDataRefereesItem object itself.
     */
    public ResumeDataRefereesItem setNumber(String number) {
        this.number = number;
        return this;
    }

    /**
     * Get the position property: The position property.
     *
     * @return the position value.
     */
    public String getPosition() {
        return this.position;
    }

    /**
     * Set the position property: The position property.
     *
     * @param position the position value to set.
     * @return the ResumeDataRefereesItem object itself.
     */
    public ResumeDataRefereesItem setPosition(String position) {
        this.position = position;
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
     * @return the ResumeDataRefereesItem object itself.
     */
    public ResumeDataRefereesItem setAdditionalProperties(Map<String, Object> additionalProperties) {
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
