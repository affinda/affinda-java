package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JobTitleAnnotationParsedClassification model. */
@Fluent
public final class JobTitleAnnotationParsedClassification {
    /*
     * The socCode property.
     */
    @JsonProperty(value = "socCode")
    private Float socCode;

    /*
     * The title property.
     */
    @JsonProperty(value = "title")
    private String title;

    /*
     * The minorGroup property.
     */
    @JsonProperty(value = "minorGroup")
    private String minorGroup;

    /*
     * The subMajorGroup property.
     */
    @JsonProperty(value = "subMajorGroup")
    private String subMajorGroup;

    /*
     * The majorGroup property.
     */
    @JsonProperty(value = "majorGroup")
    private String majorGroup;

    /**
     * Get the socCode property: The socCode property.
     *
     * @return the socCode value.
     */
    public Float getSocCode() {
        return this.socCode;
    }

    /**
     * Set the socCode property: The socCode property.
     *
     * @param socCode the socCode value to set.
     * @return the JobTitleAnnotationParsedClassification object itself.
     */
    public JobTitleAnnotationParsedClassification setSocCode(Float socCode) {
        this.socCode = socCode;
        return this;
    }

    /**
     * Get the title property: The title property.
     *
     * @return the title value.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Set the title property: The title property.
     *
     * @param title the title value to set.
     * @return the JobTitleAnnotationParsedClassification object itself.
     */
    public JobTitleAnnotationParsedClassification setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the minorGroup property: The minorGroup property.
     *
     * @return the minorGroup value.
     */
    public String getMinorGroup() {
        return this.minorGroup;
    }

    /**
     * Set the minorGroup property: The minorGroup property.
     *
     * @param minorGroup the minorGroup value to set.
     * @return the JobTitleAnnotationParsedClassification object itself.
     */
    public JobTitleAnnotationParsedClassification setMinorGroup(String minorGroup) {
        this.minorGroup = minorGroup;
        return this;
    }

    /**
     * Get the subMajorGroup property: The subMajorGroup property.
     *
     * @return the subMajorGroup value.
     */
    public String getSubMajorGroup() {
        return this.subMajorGroup;
    }

    /**
     * Set the subMajorGroup property: The subMajorGroup property.
     *
     * @param subMajorGroup the subMajorGroup value to set.
     * @return the JobTitleAnnotationParsedClassification object itself.
     */
    public JobTitleAnnotationParsedClassification setSubMajorGroup(String subMajorGroup) {
        this.subMajorGroup = subMajorGroup;
        return this;
    }

    /**
     * Get the majorGroup property: The majorGroup property.
     *
     * @return the majorGroup value.
     */
    public String getMajorGroup() {
        return this.majorGroup;
    }

    /**
     * Set the majorGroup property: The majorGroup property.
     *
     * @param majorGroup the majorGroup value to set.
     * @return the JobTitleAnnotationParsedClassification object itself.
     */
    public JobTitleAnnotationParsedClassification setMajorGroup(String majorGroup) {
        this.majorGroup = majorGroup;
        return this;
    }
}
