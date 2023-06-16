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
    private TextAnnotationUpdate contactEmail;

    /*
     * The contactName property.
     */
    @JsonProperty(value = "contactName")
    private TextAnnotationUpdate contactName;

    /*
     * The contactPhone property.
     */
    @JsonProperty(value = "contactPhone")
    private TextAnnotationUpdate contactPhone;

    /*
     * The startDate property.
     */
    @JsonProperty(value = "startDate")
    private DateAnnotationUpdate startDate;

    /*
     * The endDate property.
     */
    @JsonProperty(value = "endDate")
    private DateAnnotationUpdate endDate;

    /*
     * The jobType property.
     */
    @JsonProperty(value = "jobType")
    private TextAnnotationUpdate jobType;

    /*
     * The languages property.
     */
    @JsonProperty(value = "languages")
    private List<LanguageAnnotationUpdate> languages;

    /*
     * The skills property.
     */
    @JsonProperty(value = "skills")
    private List<SkillAnnotationUpdate> skills;

    /*
     * The organizationName property.
     */
    @JsonProperty(value = "organizationName")
    private TextAnnotationUpdate organizationName;

    /*
     * The organizationWebsite property.
     */
    @JsonProperty(value = "organizationWebsite")
    private TextAnnotationUpdate organizationWebsite;

    /*
     * The educationLevel property.
     */
    @JsonProperty(value = "educationLevel")
    private TextAnnotationUpdate educationLevel;

    /*
     * The educationAccreditation property.
     */
    @JsonProperty(value = "educationAccreditation")
    private TextAnnotationUpdate educationAccreditation;

    /*
     * The expectedRemuneration property.
     */
    @JsonProperty(value = "expectedRemuneration")
    private ExpectedRemunerationAnnotationUpdate expectedRemuneration;

    /*
     * The location property.
     */
    @JsonProperty(value = "location")
    private LocationAnnotationUpdate location;

    /*
     * The certifications property.
     */
    @JsonProperty(value = "certifications")
    private List<TextAnnotationUpdate> certifications;

    /*
     * The yearsExperience property.
     */
    @JsonProperty(value = "yearsExperience")
    private YearsExperienceAnnotationUpdate yearsExperience;

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
    public TextAnnotationUpdate getContactEmail() {
        return this.contactEmail;
    }

    /**
     * Set the contactEmail property: The contactEmail property.
     *
     * @param contactEmail the contactEmail value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setContactEmail(TextAnnotationUpdate contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     * Get the contactName property: The contactName property.
     *
     * @return the contactName value.
     */
    public TextAnnotationUpdate getContactName() {
        return this.contactName;
    }

    /**
     * Set the contactName property: The contactName property.
     *
     * @param contactName the contactName value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setContactName(TextAnnotationUpdate contactName) {
        this.contactName = contactName;
        return this;
    }

    /**
     * Get the contactPhone property: The contactPhone property.
     *
     * @return the contactPhone value.
     */
    public TextAnnotationUpdate getContactPhone() {
        return this.contactPhone;
    }

    /**
     * Set the contactPhone property: The contactPhone property.
     *
     * @param contactPhone the contactPhone value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setContactPhone(TextAnnotationUpdate contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }

    /**
     * Get the startDate property: The startDate property.
     *
     * @return the startDate value.
     */
    public DateAnnotationUpdate getStartDate() {
        return this.startDate;
    }

    /**
     * Set the startDate property: The startDate property.
     *
     * @param startDate the startDate value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setStartDate(DateAnnotationUpdate startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get the endDate property: The endDate property.
     *
     * @return the endDate value.
     */
    public DateAnnotationUpdate getEndDate() {
        return this.endDate;
    }

    /**
     * Set the endDate property: The endDate property.
     *
     * @param endDate the endDate value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setEndDate(DateAnnotationUpdate endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get the jobType property: The jobType property.
     *
     * @return the jobType value.
     */
    public TextAnnotationUpdate getJobType() {
        return this.jobType;
    }

    /**
     * Set the jobType property: The jobType property.
     *
     * @param jobType the jobType value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setJobType(TextAnnotationUpdate jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * Get the languages property: The languages property.
     *
     * @return the languages value.
     */
    public List<LanguageAnnotationUpdate> getLanguages() {
        return this.languages;
    }

    /**
     * Set the languages property: The languages property.
     *
     * @param languages the languages value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setLanguages(List<LanguageAnnotationUpdate> languages) {
        this.languages = languages;
        return this;
    }

    /**
     * Get the skills property: The skills property.
     *
     * @return the skills value.
     */
    public List<SkillAnnotationUpdate> getSkills() {
        return this.skills;
    }

    /**
     * Set the skills property: The skills property.
     *
     * @param skills the skills value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setSkills(List<SkillAnnotationUpdate> skills) {
        this.skills = skills;
        return this;
    }

    /**
     * Get the organizationName property: The organizationName property.
     *
     * @return the organizationName value.
     */
    public TextAnnotationUpdate getOrganizationName() {
        return this.organizationName;
    }

    /**
     * Set the organizationName property: The organizationName property.
     *
     * @param organizationName the organizationName value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setOrganizationName(TextAnnotationUpdate organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * Get the organizationWebsite property: The organizationWebsite property.
     *
     * @return the organizationWebsite value.
     */
    public TextAnnotationUpdate getOrganizationWebsite() {
        return this.organizationWebsite;
    }

    /**
     * Set the organizationWebsite property: The organizationWebsite property.
     *
     * @param organizationWebsite the organizationWebsite value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setOrganizationWebsite(TextAnnotationUpdate organizationWebsite) {
        this.organizationWebsite = organizationWebsite;
        return this;
    }

    /**
     * Get the educationLevel property: The educationLevel property.
     *
     * @return the educationLevel value.
     */
    public TextAnnotationUpdate getEducationLevel() {
        return this.educationLevel;
    }

    /**
     * Set the educationLevel property: The educationLevel property.
     *
     * @param educationLevel the educationLevel value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setEducationLevel(TextAnnotationUpdate educationLevel) {
        this.educationLevel = educationLevel;
        return this;
    }

    /**
     * Get the educationAccreditation property: The educationAccreditation property.
     *
     * @return the educationAccreditation value.
     */
    public TextAnnotationUpdate getEducationAccreditation() {
        return this.educationAccreditation;
    }

    /**
     * Set the educationAccreditation property: The educationAccreditation property.
     *
     * @param educationAccreditation the educationAccreditation value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setEducationAccreditation(TextAnnotationUpdate educationAccreditation) {
        this.educationAccreditation = educationAccreditation;
        return this;
    }

    /**
     * Get the expectedRemuneration property: The expectedRemuneration property.
     *
     * @return the expectedRemuneration value.
     */
    public ExpectedRemunerationAnnotationUpdate getExpectedRemuneration() {
        return this.expectedRemuneration;
    }

    /**
     * Set the expectedRemuneration property: The expectedRemuneration property.
     *
     * @param expectedRemuneration the expectedRemuneration value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setExpectedRemuneration(ExpectedRemunerationAnnotationUpdate expectedRemuneration) {
        this.expectedRemuneration = expectedRemuneration;
        return this;
    }

    /**
     * Get the location property: The location property.
     *
     * @return the location value.
     */
    public LocationAnnotationUpdate getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The location property.
     *
     * @param location the location value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setLocation(LocationAnnotationUpdate location) {
        this.location = location;
        return this;
    }

    /**
     * Get the certifications property: The certifications property.
     *
     * @return the certifications value.
     */
    public List<TextAnnotationUpdate> getCertifications() {
        return this.certifications;
    }

    /**
     * Set the certifications property: The certifications property.
     *
     * @param certifications the certifications value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setCertifications(List<TextAnnotationUpdate> certifications) {
        this.certifications = certifications;
        return this;
    }

    /**
     * Get the yearsExperience property: The yearsExperience property.
     *
     * @return the yearsExperience value.
     */
    public YearsExperienceAnnotationUpdate getYearsExperience() {
        return this.yearsExperience;
    }

    /**
     * Set the yearsExperience property: The yearsExperience property.
     *
     * @param yearsExperience the yearsExperience value to set.
     * @return the JobDescriptionDataUpdate object itself.
     */
    public JobDescriptionDataUpdate setYearsExperience(YearsExperienceAnnotationUpdate yearsExperience) {
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
