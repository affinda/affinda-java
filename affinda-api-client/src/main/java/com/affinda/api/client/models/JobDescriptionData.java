package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JobDescriptionData model. */
@Fluent
public final class JobDescriptionData {
    /*
     * The contactEmail property.
     */
    @JsonProperty(value = "contactEmail")
    private TextAnnotation contactEmail;

    /*
     * The contactName property.
     */
    @JsonProperty(value = "contactName")
    private TextAnnotation contactName;

    /*
     * The contactPhone property.
     */
    @JsonProperty(value = "contactPhone")
    private TextAnnotation contactPhone;

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
    private TextAnnotation jobType;

    /*
     * The languages property.
     */
    @JsonProperty(value = "languages")
    private List<LanguageAnnotation> languages;

    /*
     * The skills property.
     */
    @JsonProperty(value = "skills")
    private List<SkillAnnotation> skills;

    /*
     * The organizationName property.
     */
    @JsonProperty(value = "organizationName")
    private TextAnnotation organizationName;

    /*
     * The organizationWebsite property.
     */
    @JsonProperty(value = "organizationWebsite")
    private TextAnnotation organizationWebsite;

    /*
     * The educationLevel property.
     */
    @JsonProperty(value = "educationLevel")
    private TextAnnotation educationLevel;

    /*
     * The educationAccreditation property.
     */
    @JsonProperty(value = "educationAccreditation")
    private TextAnnotation educationAccreditation;

    /*
     * The expectedRemuneration property.
     */
    @JsonProperty(value = "expectedRemuneration")
    private ExpectedRemunerationAnnotation expectedRemuneration;

    /*
     * The location property.
     */
    @JsonProperty(value = "location")
    private LocationAnnotation location;

    /*
     * The certifications property.
     */
    @JsonProperty(value = "certifications")
    private List<TextAnnotation> certifications;

    /**
     * Get the contactEmail property: The contactEmail property.
     *
     * @return the contactEmail value.
     */
    public TextAnnotation getContactEmail() {
        return this.contactEmail;
    }

    /**
     * Set the contactEmail property: The contactEmail property.
     *
     * @param contactEmail the contactEmail value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setContactEmail(TextAnnotation contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     * Get the contactName property: The contactName property.
     *
     * @return the contactName value.
     */
    public TextAnnotation getContactName() {
        return this.contactName;
    }

    /**
     * Set the contactName property: The contactName property.
     *
     * @param contactName the contactName value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setContactName(TextAnnotation contactName) {
        this.contactName = contactName;
        return this;
    }

    /**
     * Get the contactPhone property: The contactPhone property.
     *
     * @return the contactPhone value.
     */
    public TextAnnotation getContactPhone() {
        return this.contactPhone;
    }

    /**
     * Set the contactPhone property: The contactPhone property.
     *
     * @param contactPhone the contactPhone value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setContactPhone(TextAnnotation contactPhone) {
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
    public TextAnnotation getJobType() {
        return this.jobType;
    }

    /**
     * Set the jobType property: The jobType property.
     *
     * @param jobType the jobType value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setJobType(TextAnnotation jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * Get the languages property: The languages property.
     *
     * @return the languages value.
     */
    public List<LanguageAnnotation> getLanguages() {
        return this.languages;
    }

    /**
     * Set the languages property: The languages property.
     *
     * @param languages the languages value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setLanguages(List<LanguageAnnotation> languages) {
        this.languages = languages;
        return this;
    }

    /**
     * Get the skills property: The skills property.
     *
     * @return the skills value.
     */
    public List<SkillAnnotation> getSkills() {
        return this.skills;
    }

    /**
     * Set the skills property: The skills property.
     *
     * @param skills the skills value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setSkills(List<SkillAnnotation> skills) {
        this.skills = skills;
        return this;
    }

    /**
     * Get the organizationName property: The organizationName property.
     *
     * @return the organizationName value.
     */
    public TextAnnotation getOrganizationName() {
        return this.organizationName;
    }

    /**
     * Set the organizationName property: The organizationName property.
     *
     * @param organizationName the organizationName value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setOrganizationName(TextAnnotation organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * Get the organizationWebsite property: The organizationWebsite property.
     *
     * @return the organizationWebsite value.
     */
    public TextAnnotation getOrganizationWebsite() {
        return this.organizationWebsite;
    }

    /**
     * Set the organizationWebsite property: The organizationWebsite property.
     *
     * @param organizationWebsite the organizationWebsite value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setOrganizationWebsite(TextAnnotation organizationWebsite) {
        this.organizationWebsite = organizationWebsite;
        return this;
    }

    /**
     * Get the educationLevel property: The educationLevel property.
     *
     * @return the educationLevel value.
     */
    public TextAnnotation getEducationLevel() {
        return this.educationLevel;
    }

    /**
     * Set the educationLevel property: The educationLevel property.
     *
     * @param educationLevel the educationLevel value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setEducationLevel(TextAnnotation educationLevel) {
        this.educationLevel = educationLevel;
        return this;
    }

    /**
     * Get the educationAccreditation property: The educationAccreditation property.
     *
     * @return the educationAccreditation value.
     */
    public TextAnnotation getEducationAccreditation() {
        return this.educationAccreditation;
    }

    /**
     * Set the educationAccreditation property: The educationAccreditation property.
     *
     * @param educationAccreditation the educationAccreditation value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setEducationAccreditation(TextAnnotation educationAccreditation) {
        this.educationAccreditation = educationAccreditation;
        return this;
    }

    /**
     * Get the expectedRemuneration property: The expectedRemuneration property.
     *
     * @return the expectedRemuneration value.
     */
    public ExpectedRemunerationAnnotation getExpectedRemuneration() {
        return this.expectedRemuneration;
    }

    /**
     * Set the expectedRemuneration property: The expectedRemuneration property.
     *
     * @param expectedRemuneration the expectedRemuneration value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setExpectedRemuneration(ExpectedRemunerationAnnotation expectedRemuneration) {
        this.expectedRemuneration = expectedRemuneration;
        return this;
    }

    /**
     * Get the location property: The location property.
     *
     * @return the location value.
     */
    public LocationAnnotation getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The location property.
     *
     * @param location the location value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setLocation(LocationAnnotation location) {
        this.location = location;
        return this;
    }

    /**
     * Get the certifications property: The certifications property.
     *
     * @return the certifications value.
     */
    public List<TextAnnotation> getCertifications() {
        return this.certifications;
    }

    /**
     * Set the certifications property: The certifications property.
     *
     * @param certifications the certifications value to set.
     * @return the JobDescriptionData object itself.
     */
    public JobDescriptionData setCertifications(List<TextAnnotation> certifications) {
        this.certifications = certifications;
        return this;
    }
}
