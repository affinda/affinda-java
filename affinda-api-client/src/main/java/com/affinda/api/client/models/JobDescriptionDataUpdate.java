package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** A JSON-encoded string of the `JobDescriptionData` object. */
@Fluent
public final class JobDescriptionDataUpdate {
    /*
     * The jobTitle property.
     */
    @JsonProperty(value = "jobTitle")
    private JobTitleAnnotationUpdate jobTitle;

    /*
     * The contactEmail property.
     */
    @JsonProperty(value = "contactEmail")
    private TextAnnotationV2Update contactEmail;

    /*
     * The contactName property.
     */
    @JsonProperty(value = "contactName")
    private TextAnnotationV2Update contactName;

    /*
     * The contactPhone property.
     */
    @JsonProperty(value = "contactPhone")
    private TextAnnotationV2Update contactPhone;

    /*
     * The startDate property.
     */
    @JsonProperty(value = "startDate")
    private DateAnnotationV2Update startDate;

    /*
     * The endDate property.
     */
    @JsonProperty(value = "endDate")
    private DateAnnotationV2Update endDate;

    /*
     * The jobType property.
     */
    @JsonProperty(value = "jobType")
    private TextAnnotationV2Update jobType;

    /*
     * The languages property.
     */
    @JsonProperty(value = "languages")
    private List<LanguageAnnotationV2Update> languages;

    /*
     * The skills property.
     */
    @JsonProperty(value = "skills")
    private List<SkillAnnotationV2Update> skills;

    /*
     * The organizationName property.
     */
    @JsonProperty(value = "organizationName")
    private TextAnnotationV2Update organizationName;

    /*
     * The organizationWebsite property.
     */
    @JsonProperty(value = "organizationWebsite")
    private TextAnnotationV2Update organizationWebsite;

    /*
     * The educationLevel property.
     */
    @JsonProperty(value = "educationLevel")
    private TextAnnotationV2Update educationLevel;

    /*
     * The educationAccreditation property.
     */
    @JsonProperty(value = "educationAccreditation")
    private TextAnnotationV2Update educationAccreditation;

    /*
     * The expectedRemuneration property.
     */
    @JsonProperty(value = "expectedRemuneration")
    private ExpectedRemunerationAnnotationV2Update expectedRemuneration;

    /*
     * The location property.
     */
    @JsonProperty(value = "location")
    private LocationAnnotationV2Update location;

    /*
     * The certifications property.
     */
    @JsonProperty(value = "certifications")
    private List<TextAnnotationV2Update> certifications;

    /*
     * The yearsExperience property.
     */
    @JsonProperty(value = "yearsExperience")
    private YearsExperienceAnnotationV2Update yearsExperience;

    /*
     * A JSON-encoded string of the `JobDescriptionData` object.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the jobTitle property: The jobTitle property.
     *
     * @return the jobTitle value.
     */
    public JobTitleAnnotationUpdate getJobTitle() {
        return this.jobTitle;
    }

    /**
     * Set the jobTitle property: The jobTitle property.
     *
     * @param jobTitle the jobTitle value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setJobTitle(JobTitleAnnotationUpdate jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * Get the contactEmail property: The contactEmail property.
     *
     * @return the contactEmail value.
     */
    public TextAnnotationV2Update getContactEmail() {
        return this.contactEmail;
    }

    /**
     * Set the contactEmail property: The contactEmail property.
     *
     * @param contactEmail the contactEmail value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setContactEmail(TextAnnotationV2Update contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     * Get the contactName property: The contactName property.
     *
     * @return the contactName value.
     */
    public TextAnnotationV2Update getContactName() {
        return this.contactName;
    }

    /**
     * Set the contactName property: The contactName property.
     *
     * @param contactName the contactName value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setContactName(TextAnnotationV2Update contactName) {
        this.contactName = contactName;
        return this;
    }

    /**
     * Get the contactPhone property: The contactPhone property.
     *
     * @return the contactPhone value.
     */
    public TextAnnotationV2Update getContactPhone() {
        return this.contactPhone;
    }

    /**
     * Set the contactPhone property: The contactPhone property.
     *
     * @param contactPhone the contactPhone value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setContactPhone(TextAnnotationV2Update contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }

    /**
     * Get the startDate property: The startDate property.
     *
     * @return the startDate value.
     */
    public DateAnnotationV2Update getStartDate() {
        return this.startDate;
    }

    /**
     * Set the startDate property: The startDate property.
     *
     * @param startDate the startDate value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setStartDate(DateAnnotationV2Update startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get the endDate property: The endDate property.
     *
     * @return the endDate value.
     */
    public DateAnnotationV2Update getEndDate() {
        return this.endDate;
    }

    /**
     * Set the endDate property: The endDate property.
     *
     * @param endDate the endDate value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setEndDate(DateAnnotationV2Update endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get the jobType property: The jobType property.
     *
     * @return the jobType value.
     */
    public TextAnnotationV2Update getJobType() {
        return this.jobType;
    }

    /**
     * Set the jobType property: The jobType property.
     *
     * @param jobType the jobType value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setJobType(TextAnnotationV2Update jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * Get the languages property: The languages property.
     *
     * @return the languages value.
     */
    public List<LanguageAnnotationV2Update> getLanguages() {
        return this.languages;
    }

    /**
     * Set the languages property: The languages property.
     *
     * @param languages the languages value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setLanguages(List<LanguageAnnotationV2Update> languages) {
        this.languages = languages;
        return this;
    }

    /**
     * Get the skills property: The skills property.
     *
     * @return the skills value.
     */
    public List<SkillAnnotationV2Update> getSkills() {
        return this.skills;
    }

    /**
     * Set the skills property: The skills property.
     *
     * @param skills the skills value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setSkills(List<SkillAnnotationV2Update> skills) {
        this.skills = skills;
        return this;
    }

    /**
     * Get the organizationName property: The organizationName property.
     *
     * @return the organizationName value.
     */
    public TextAnnotationV2Update getOrganizationName() {
        return this.organizationName;
    }

    /**
     * Set the organizationName property: The organizationName property.
     *
     * @param organizationName the organizationName value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setOrganizationName(TextAnnotationV2Update organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * Get the organizationWebsite property: The organizationWebsite property.
     *
     * @return the organizationWebsite value.
     */
    public TextAnnotationV2Update getOrganizationWebsite() {
        return this.organizationWebsite;
    }

    /**
     * Set the organizationWebsite property: The organizationWebsite property.
     *
     * @param organizationWebsite the organizationWebsite value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setOrganizationWebsite(TextAnnotationV2Update organizationWebsite) {
        this.organizationWebsite = organizationWebsite;
        return this;
    }

    /**
     * Get the educationLevel property: The educationLevel property.
     *
     * @return the educationLevel value.
     */
    public TextAnnotationV2Update getEducationLevel() {
        return this.educationLevel;
    }

    /**
     * Set the educationLevel property: The educationLevel property.
     *
     * @param educationLevel the educationLevel value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setEducationLevel(TextAnnotationV2Update educationLevel) {
        this.educationLevel = educationLevel;
        return this;
    }

    /**
     * Get the educationAccreditation property: The educationAccreditation property.
     *
     * @return the educationAccreditation value.
     */
    public TextAnnotationV2Update getEducationAccreditation() {
        return this.educationAccreditation;
    }

    /**
     * Set the educationAccreditation property: The educationAccreditation property.
     *
     * @param educationAccreditation the educationAccreditation value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setEducationAccreditation(TextAnnotationV2Update educationAccreditation) {
        this.educationAccreditation = educationAccreditation;
        return this;
    }

    /**
     * Get the expectedRemuneration property: The expectedRemuneration property.
     *
     * @return the expectedRemuneration value.
     */
    public ExpectedRemunerationAnnotationV2Update getExpectedRemuneration() {
        return this.expectedRemuneration;
    }

    /**
     * Set the expectedRemuneration property: The expectedRemuneration property.
     *
     * @param expectedRemuneration the expectedRemuneration value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setExpectedRemuneration(
            ExpectedRemunerationAnnotationV2Update expectedRemuneration) {
        this.expectedRemuneration = expectedRemuneration;
        return this;
    }

    /**
     * Get the location property: The location property.
     *
     * @return the location value.
     */
    public LocationAnnotationV2Update getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The location property.
     *
     * @param location the location value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setLocation(LocationAnnotationV2Update location) {
        this.location = location;
        return this;
    }

    /**
     * Get the certifications property: The certifications property.
     *
     * @return the certifications value.
     */
    public List<TextAnnotationV2Update> getCertifications() {
        return this.certifications;
    }

    /**
     * Set the certifications property: The certifications property.
     *
     * @param certifications the certifications value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setCertifications(List<TextAnnotationV2Update> certifications) {
        this.certifications = certifications;
        return this;
    }

    /**
     * Get the yearsExperience property: The yearsExperience property.
     *
     * @return the yearsExperience value.
     */
    public YearsExperienceAnnotationV2Update getYearsExperience() {
        return this.yearsExperience;
    }

    /**
     * Set the yearsExperience property: The yearsExperience property.
     *
     * @param yearsExperience the yearsExperience value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setYearsExperience(YearsExperienceAnnotationV2Update yearsExperience) {
        this.yearsExperience = yearsExperience;
        return this;
    }

    /**
     * Get the additionalProperties property: A JSON-encoded string of the `JobDescriptionData` object.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: A JSON-encoded string of the `JobDescriptionData` object.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setAdditionalProperties(Map<String, Object> additionalProperties) {
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
