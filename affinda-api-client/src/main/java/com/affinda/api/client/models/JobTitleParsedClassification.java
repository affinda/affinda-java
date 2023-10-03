package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JobTitleParsedClassification model. */
@Fluent
public final class JobTitleParsedClassification {
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

    /*
     * The 4 digit code representing the SOC2020 classification for this job
     * title
     */
    @JsonProperty(value = "minorGroupCode")
    private Integer minorGroupCode;

    /*
     * The 4 digit code representing the SOC2020 classification for this job
     * title
     */
    @JsonProperty(value = "subMajorGroupCode")
    private Integer subMajorGroupCode;

    /*
     * The 4 digit code representing the SOC2020 classification for this job
     * title
     */
    @JsonProperty(value = "majorGroupCode")
    private Integer majorGroupCode;

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
     * @return the JobTitleParsedClassification object itself.
     */
    public JobTitleParsedClassification setSocCode(Float socCode) {
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
     * @return the JobTitleParsedClassification object itself.
     */
    public JobTitleParsedClassification setTitle(String title) {
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
     * @return the JobTitleParsedClassification object itself.
     */
    public JobTitleParsedClassification setMinorGroup(String minorGroup) {
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
     * @return the JobTitleParsedClassification object itself.
     */
    public JobTitleParsedClassification setSubMajorGroup(String subMajorGroup) {
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
     * @return the JobTitleParsedClassification object itself.
     */
    public JobTitleParsedClassification setMajorGroup(String majorGroup) {
        this.majorGroup = majorGroup;
        return this;
    }

    /**
     * Get the minorGroupCode property: The 4 digit code representing the SOC2020 classification for this job title.
     *
     * @return the minorGroupCode value.
     */
    public Integer getMinorGroupCode() {
        return this.minorGroupCode;
    }

    /**
     * Set the minorGroupCode property: The 4 digit code representing the SOC2020 classification for this job title.
     *
     * @param minorGroupCode the minorGroupCode value to set.
     * @return the JobTitleParsedClassification object itself.
     */
    public JobTitleParsedClassification setMinorGroupCode(Integer minorGroupCode) {
        this.minorGroupCode = minorGroupCode;
        return this;
    }

    /**
     * Get the subMajorGroupCode property: The 4 digit code representing the SOC2020 classification for this job title.
     *
     * @return the subMajorGroupCode value.
     */
    public Integer getSubMajorGroupCode() {
        return this.subMajorGroupCode;
    }

    /**
     * Set the subMajorGroupCode property: The 4 digit code representing the SOC2020 classification for this job title.
     *
     * @param subMajorGroupCode the subMajorGroupCode value to set.
     * @return the JobTitleParsedClassification object itself.
     */
    public JobTitleParsedClassification setSubMajorGroupCode(Integer subMajorGroupCode) {
        this.subMajorGroupCode = subMajorGroupCode;
        return this;
    }

    /**
     * Get the majorGroupCode property: The 4 digit code representing the SOC2020 classification for this job title.
     *
     * @return the majorGroupCode value.
     */
    public Integer getMajorGroupCode() {
        return this.majorGroupCode;
    }

    /**
     * Set the majorGroupCode property: The 4 digit code representing the SOC2020 classification for this job title.
     *
     * @param majorGroupCode the majorGroupCode value to set.
     * @return the JobTitleParsedClassification object itself.
     */
    public JobTitleParsedClassification setMajorGroupCode(Integer majorGroupCode) {
        this.majorGroupCode = majorGroupCode;
        return this;
    }
}
