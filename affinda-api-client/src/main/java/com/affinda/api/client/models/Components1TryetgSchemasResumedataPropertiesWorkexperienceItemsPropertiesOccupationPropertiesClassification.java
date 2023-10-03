package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Components1TryetgSchemasResumedataPropertiesWorkexperienceItemsPropertiesOccupationPropertiesClassification
 * model.
 */
@Fluent
public final
class Components1TryetgSchemasResumedataPropertiesWorkexperienceItemsPropertiesOccupationPropertiesClassification {
    /*
     * SOC2020 classification for this job title
     */
    @JsonProperty(value = "title")
    private String title;

    /*
     * SOC2020 minor group
     */
    @JsonProperty(value = "minorGroup")
    private String minorGroup;

    /*
     * SOC2020 sub major group
     */
    @JsonProperty(value = "subMajorGroup")
    private String subMajorGroup;

    /*
     * SOC2020 major group
     */
    @JsonProperty(value = "majorGroup")
    private String majorGroup;

    /*
     * The 4 digit code representing the SOC2020 classification for this job
     * title
     */
    @JsonProperty(value = "socCode")
    private Integer socCode;

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
     * Get the title property: SOC2020 classification for this job title.
     *
     * @return the title value.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Set the title property: SOC2020 classification for this job title.
     *
     * @param title the title value to set.
     * @return the
     *     Components1TryetgSchemasResumedataPropertiesWorkexperienceItemsPropertiesOccupationPropertiesClassification
     *     object itself.
     */
    public Components1TryetgSchemasResumedataPropertiesWorkexperienceItemsPropertiesOccupationPropertiesClassification
            setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the minorGroup property: SOC2020 minor group.
     *
     * @return the minorGroup value.
     */
    public String getMinorGroup() {
        return this.minorGroup;
    }

    /**
     * Set the minorGroup property: SOC2020 minor group.
     *
     * @param minorGroup the minorGroup value to set.
     * @return the
     *     Components1TryetgSchemasResumedataPropertiesWorkexperienceItemsPropertiesOccupationPropertiesClassification
     *     object itself.
     */
    public Components1TryetgSchemasResumedataPropertiesWorkexperienceItemsPropertiesOccupationPropertiesClassification
            setMinorGroup(String minorGroup) {
        this.minorGroup = minorGroup;
        return this;
    }

    /**
     * Get the subMajorGroup property: SOC2020 sub major group.
     *
     * @return the subMajorGroup value.
     */
    public String getSubMajorGroup() {
        return this.subMajorGroup;
    }

    /**
     * Set the subMajorGroup property: SOC2020 sub major group.
     *
     * @param subMajorGroup the subMajorGroup value to set.
     * @return the
     *     Components1TryetgSchemasResumedataPropertiesWorkexperienceItemsPropertiesOccupationPropertiesClassification
     *     object itself.
     */
    public Components1TryetgSchemasResumedataPropertiesWorkexperienceItemsPropertiesOccupationPropertiesClassification
            setSubMajorGroup(String subMajorGroup) {
        this.subMajorGroup = subMajorGroup;
        return this;
    }

    /**
     * Get the majorGroup property: SOC2020 major group.
     *
     * @return the majorGroup value.
     */
    public String getMajorGroup() {
        return this.majorGroup;
    }

    /**
     * Set the majorGroup property: SOC2020 major group.
     *
     * @param majorGroup the majorGroup value to set.
     * @return the
     *     Components1TryetgSchemasResumedataPropertiesWorkexperienceItemsPropertiesOccupationPropertiesClassification
     *     object itself.
     */
    public Components1TryetgSchemasResumedataPropertiesWorkexperienceItemsPropertiesOccupationPropertiesClassification
            setMajorGroup(String majorGroup) {
        this.majorGroup = majorGroup;
        return this;
    }

    /**
     * Get the socCode property: The 4 digit code representing the SOC2020 classification for this job title.
     *
     * @return the socCode value.
     */
    public Integer getSocCode() {
        return this.socCode;
    }

    /**
     * Set the socCode property: The 4 digit code representing the SOC2020 classification for this job title.
     *
     * @param socCode the socCode value to set.
     * @return the
     *     Components1TryetgSchemasResumedataPropertiesWorkexperienceItemsPropertiesOccupationPropertiesClassification
     *     object itself.
     */
    public Components1TryetgSchemasResumedataPropertiesWorkexperienceItemsPropertiesOccupationPropertiesClassification
            setSocCode(Integer socCode) {
        this.socCode = socCode;
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
     * @return the
     *     Components1TryetgSchemasResumedataPropertiesWorkexperienceItemsPropertiesOccupationPropertiesClassification
     *     object itself.
     */
    public Components1TryetgSchemasResumedataPropertiesWorkexperienceItemsPropertiesOccupationPropertiesClassification
            setMinorGroupCode(Integer minorGroupCode) {
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
     * @return the
     *     Components1TryetgSchemasResumedataPropertiesWorkexperienceItemsPropertiesOccupationPropertiesClassification
     *     object itself.
     */
    public Components1TryetgSchemasResumedataPropertiesWorkexperienceItemsPropertiesOccupationPropertiesClassification
            setSubMajorGroupCode(Integer subMajorGroupCode) {
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
     * @return the
     *     Components1TryetgSchemasResumedataPropertiesWorkexperienceItemsPropertiesOccupationPropertiesClassification
     *     object itself.
     */
    public Components1TryetgSchemasResumedataPropertiesWorkexperienceItemsPropertiesOccupationPropertiesClassification
            setMajorGroupCode(Integer majorGroupCode) {
        this.majorGroupCode = majorGroupCode;
        return this;
    }
}
