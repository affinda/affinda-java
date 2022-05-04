package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** The Annotation model. */
@Fluent
public class Annotation {
    /*
     * The rectangle property.
     */
    @JsonProperty(value = "rectangle", required = true)
    private Rectangle rectangle;

    /*
     * The pageIndex property.
     */
    @JsonProperty(value = "pageIndex", required = true)
    private Integer pageIndex;

    /*
     * The raw property.
     */
    @JsonProperty(value = "raw", required = true)
    private String raw;

    /*
     * The confidence property.
     */
    @JsonProperty(value = "confidence", required = true)
    private float confidence;

    /*
     * The isVerified property.
     */
    @JsonProperty(value = "isVerified", required = true)
    private boolean isVerified;

    /*
     * The classification property.
     */
    @JsonProperty(value = "classification", required = true)
    private String classification;

    /*
     * Dictionary of <any>
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the rectangle property: The rectangle property.
     *
     * @return the rectangle value.
     */
    public Rectangle getRectangle() {
        return this.rectangle;
    }

    /**
     * Set the rectangle property: The rectangle property.
     *
     * @param rectangle the rectangle value to set.
     * @return the Annotation object itself.
     */
    public Annotation setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
        return this;
    }

    /**
     * Get the pageIndex property: The pageIndex property.
     *
     * @return the pageIndex value.
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * Set the pageIndex property: The pageIndex property.
     *
     * @param pageIndex the pageIndex value to set.
     * @return the Annotation object itself.
     */
    public Annotation setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * Get the raw property: The raw property.
     *
     * @return the raw value.
     */
    public String getRaw() {
        return this.raw;
    }

    /**
     * Set the raw property: The raw property.
     *
     * @param raw the raw value to set.
     * @return the Annotation object itself.
     */
    public Annotation setRaw(String raw) {
        this.raw = raw;
        return this;
    }

    /**
     * Get the confidence property: The confidence property.
     *
     * @return the confidence value.
     */
    public float getConfidence() {
        return this.confidence;
    }

    /**
     * Set the confidence property: The confidence property.
     *
     * @param confidence the confidence value to set.
     * @return the Annotation object itself.
     */
    public Annotation setConfidence(float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * Get the isVerified property: The isVerified property.
     *
     * @return the isVerified value.
     */
    public boolean isVerified() {
        return this.isVerified;
    }

    /**
     * Set the isVerified property: The isVerified property.
     *
     * @param isVerified the isVerified value to set.
     * @return the Annotation object itself.
     */
    public Annotation setIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
        return this;
    }

    /**
     * Get the classification property: The classification property.
     *
     * @return the classification value.
     */
    public String getClassification() {
        return this.classification;
    }

    /**
     * Set the classification property: The classification property.
     *
     * @param classification the classification value to set.
     * @return the Annotation object itself.
     */
    public Annotation setClassification(String classification) {
        this.classification = classification;
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
     * @return the Annotation object itself.
     */
    public Annotation setAdditionalProperties(Map<String, Object> additionalProperties) {
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
