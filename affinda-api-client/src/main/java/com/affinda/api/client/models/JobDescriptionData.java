package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JobDescriptionData model. */
@Fluent
public final class JobDescriptionData {
    /*
     * The jobTitle property.
     */
    @JsonProperty(value = "jobTitle")
    private JobTitleAnnotation jobTitle;

    /*
     * The contactEmail property.
     */
    @JsonProperty(value = "contactEmail")
    private TextAnnotationV2 contactEmail;

    /*
     * The contactName property.
     */
    @JsonProperty(value = "contactName")
    private TextAnnotationV2 contactName;

    /*
     * The contactPhone property.
     */
    @JsonProperty(value = "contactPhone")
    private TextAnnotationV2 contactPhone;

    /*
     * The startDate property.
     */
    @JsonProperty(value = "startDate")
    private DateAnnotation startDate;

    /*
     * The endDate property.
     */
    @JsonProperty(value = "endDate")
    private DateAnnotation endDate;

    /*
     * The jobType property.
     */
    @JsonProperty(value = "jobType")
    private TextAnnotationV2 jobType;

    /*
     * The languages property.
     */
    @JsonProperty(value = "languages")
    private List<LanguageAnnotationV2> languages;

    /*
     * The skills property.
     */
    @JsonProperty(value = "skills")
    private List<SkillAnnotationV2> skills;

    /*
     * The organizationName property.
     */
    @JsonProperty(value = "organizationName")
    private TextAnnotationV2 organizationName;

    /*
     * The organizationWebsite property.
     */
    @JsonProperty(value = "organizationWebsite")
    private TextAnnotationV2 organizationWebsite;

    /*
     * The educationLevel property.
     */
    @JsonProperty(value = "educationLevel")
    private TextAnnotationV2 educationLevel;

    /*
     * The educationAccreditation property.
     */
    @JsonProperty(value = "educationAccreditation")
    private TextAnnotationV2 educationAccreditation;

    /*
     * The expectedRemuneration property.
     */
    @JsonProperty(value = "expectedRemuneration")
    private ExpectedRemunerationAnnotationV2 expectedRemuneration;

    /*
     * The location property.
     */
    @JsonProperty(value = "location")
    private LocationAnnotationV2 location;

    /*
     * The certifications property.
     */
    @JsonProperty(value = "certifications")
    private List<TextAnnotationV2> certifications;

    /*
     * The yearsExperience property.
     */
    @JsonProperty(value = "yearsExperience")
    private YearsExperienceAnnotationV2 yearsExperience;

    /**
     * Get the jobTitle property: The jobTitle property.
     *
     * @return the jobTitle value.
     */
    public JobTitleAnnotation getJobTitle() {
        return this.jobTitle;
    }

    /**
     * Set the jobTitle property: The jobTitle property.
     *
     * @param jobTitle the jobTitle value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setJobTitle(JobTitleAnnotation jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     * Get the contactEmail property: The contactEmail property.
     *
     * @return the contactEmail value.
     */
    public TextAnnotationV2 getContactEmail() {
        return this.contactEmail;
    }

    /**
     * Set the contactEmail property: The contactEmail property.
     *
     * @param contactEmail the contactEmail value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setContactEmail(TextAnnotationV2 contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     * Get the contactName property: The contactName property.
     *
     * @return the contactName value.
     */
    public TextAnnotationV2 getContactName() {
        return this.contactName;
    }

    /**
     * Set the contactName property: The contactName property.
     *
     * @param contactName the contactName value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setContactName(TextAnnotationV2 contactName) {
        this.contactName = contactName;
        return this;
    }

    /**
     * Get the contactPhone property: The contactPhone property.
     *
     * @return the contactPhone value.
     */
    public TextAnnotationV2 getContactPhone() {
        return this.contactPhone;
    }

    /**
     * Set the contactPhone property: The contactPhone property.
     *
     * @param contactPhone the contactPhone value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setContactPhone(TextAnnotationV2 contactPhone) {
        this.contactPhone = contactPhone;
        return this;
    }

    /**
     * Get the startDate property: The startDate property.
     *
     * @return the startDate value.
     */
    public DateAnnotation getStartDate() {
        return this.startDate;
    }

    /**
     * Set the startDate property: The startDate property.
     *
     * @param startDate the startDate value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setStartDate(DateAnnotation startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get the endDate property: The endDate property.
     *
     * @return the endDate value.
     */
    public DateAnnotation getEndDate() {
        return this.endDate;
    }

    /**
     * Set the endDate property: The endDate property.
     *
     * @param endDate the endDate value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setEndDate(DateAnnotation endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * Get the jobType property: The jobType property.
     *
     * @return the jobType value.
     */
    public TextAnnotationV2 getJobType() {
        return this.jobType;
    }

    /**
     * Set the jobType property: The jobType property.
     *
     * @param jobType the jobType value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setJobType(TextAnnotationV2 jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * Get the languages property: The languages property.
     *
     * @return the languages value.
     */
    public List<LanguageAnnotationV2> getLanguages() {
        return this.languages;
    }

    /**
     * Set the languages property: The languages property.
     *
     * @param languages the languages value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setLanguages(List<LanguageAnnotationV2> languages) {
        this.languages = languages;
        return this;
    }

    /**
     * Get the skills property: The skills property.
     *
     * @return the skills value.
     */
    public List<SkillAnnotationV2> getSkills() {
        return this.skills;
    }

    /**
     * Set the skills property: The skills property.
     *
     * @param skills the skills value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setSkills(List<SkillAnnotationV2> skills) {
        this.skills = skills;
        return this;
    }

    /**
     * Get the organizationName property: The organizationName property.
     *
     * @return the organizationName value.
     */
    public TextAnnotationV2 getOrganizationName() {
        return this.organizationName;
    }

    /**
     * Set the organizationName property: The organizationName property.
     *
     * @param organizationName the organizationName value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setOrganizationName(TextAnnotationV2 organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * Get the organizationWebsite property: The organizationWebsite property.
     *
     * @return the organizationWebsite value.
     */
    public TextAnnotationV2 getOrganizationWebsite() {
        return this.organizationWebsite;
    }

    /**
     * Set the organizationWebsite property: The organizationWebsite property.
     *
     * @param organizationWebsite the organizationWebsite value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setOrganizationWebsite(TextAnnotationV2 organizationWebsite) {
        this.organizationWebsite = organizationWebsite;
        return this;
    }

    /**
     * Get the educationLevel property: The educationLevel property.
     *
     * @return the educationLevel value.
     */
    public TextAnnotationV2 getEducationLevel() {
        return this.educationLevel;
    }

    /**
     * Set the educationLevel property: The educationLevel property.
     *
     * @param educationLevel the educationLevel value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setEducationLevel(TextAnnotationV2 educationLevel) {
        this.educationLevel = educationLevel;
        return this;
    }

    /**
     * Get the educationAccreditation property: The educationAccreditation property.
     *
     * @return the educationAccreditation value.
     */
    public TextAnnotationV2 getEducationAccreditation() {
        return this.educationAccreditation;
    }

    /**
     * Set the educationAccreditation property: The educationAccreditation property.
     *
     * @param educationAccreditation the educationAccreditation value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setEducationAccreditation(TextAnnotationV2 educationAccreditation) {
        this.educationAccreditation = educationAccreditation;
        return this;
    }

    /**
     * Get the expectedRemuneration property: The expectedRemuneration property.
     *
     * @return the expectedRemuneration value.
     */
    public ExpectedRemunerationAnnotationV2 getExpectedRemuneration() {
        return this.expectedRemuneration;
    }

    /**
     * Set the expectedRemuneration property: The expectedRemuneration property.
     *
     * @param expectedRemuneration the expectedRemuneration value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setExpectedRemuneration(ExpectedRemunerationAnnotationV2 expectedRemuneration) {
        this.expectedRemuneration = expectedRemuneration;
        return this;
    }

    /**
     * Get the location property: The location property.
     *
     * @return the location value.
     */
    public LocationAnnotationV2 getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The location property.
     *
     * @param location the location value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setLocation(LocationAnnotationV2 location) {
        this.location = location;
        return this;
    }

    /**
     * Get the certifications property: The certifications property.
     *
     * @return the certifications value.
     */
    public List<TextAnnotationV2> getCertifications() {
        return this.certifications;
    }

    /**
     * Set the certifications property: The certifications property.
     *
     * @param certifications the certifications value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setCertifications(List<TextAnnotationV2> certifications) {
        this.certifications = certifications;
        return this;
    }

    /**
     * Get the yearsExperience property: The yearsExperience property.
     *
     * @return the yearsExperience value.
     */
    public YearsExperienceAnnotationV2 getYearsExperience() {
        return this.yearsExperience;
    }

    /**
     * Set the yearsExperience property: The yearsExperience property.
     *
     * @param yearsExperience the yearsExperience value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setYearsExperience(YearsExperienceAnnotationV2 yearsExperience) {
        this.yearsExperience = yearsExperience;
        return this;
    }
}
