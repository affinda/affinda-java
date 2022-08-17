package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResumeDataSkillsPropertiesItemsItem model. */
@Fluent
public final class ResumeDataSkillsPropertiesItemsItem {
    /*
     * The section property.
     */
    @JsonProperty(value = "section")
    private String section;

    /*
     * If this skill is extracted from a "workExperience" section, the
     * "position" is the index of the work experience where this skill is
     * found, with 0 being the first work experience, 1 being the second work
     * experience, and so on.
     */
    @JsonProperty(value = "position")
    private Integer position;

    /*
     * If this skill is extracted from a "workExperience" section, the
     * "workExperienceId" is the id of the work experience where this skill is
     * found.
     */
    @JsonProperty(value = "workExperienceId")
    private Integer workExperienceId;

    /**
     * Get the section property: The section property.
     *
     * @return the section value.
     */
    public String getSection() {
        return this.section;
    }

    /**
     * Set the section property: The section property.
     *
     * @param section the section value to set.
     * @return the ResumeDataSkillsPropertiesItemsItem object itself.
     */
    public ResumeDataSkillsPropertiesItemsItem setSection(String section) {
        this.section = section;
        return this;
    }

    /**
     * Get the position property: If this skill is extracted from a "workExperience" section, the "position" is the
     * index of the work experience where this skill is found, with 0 being the first work experience, 1 being the
     * second work experience, and so on.
     *
     * @return the position value.
     */
    public Integer getPosition() {
        return this.position;
    }

    /**
     * Set the position property: If this skill is extracted from a "workExperience" section, the "position" is the
     * index of the work experience where this skill is found, with 0 being the first work experience, 1 being the
     * second work experience, and so on.
     *
     * @param position the position value to set.
     * @return the ResumeDataSkillsPropertiesItemsItem object itself.
     */
    public ResumeDataSkillsPropertiesItemsItem setPosition(Integer position) {
        this.position = position;
        return this;
    }

    /**
     * Get the workExperienceId property: If this skill is extracted from a "workExperience" section, the
     * "workExperienceId" is the id of the work experience where this skill is found.
     *
     * @return the workExperienceId value.
     */
    public Integer getWorkExperienceId() {
        return this.workExperienceId;
    }

    /**
     * Set the workExperienceId property: If this skill is extracted from a "workExperience" section, the
     * "workExperienceId" is the id of the work experience where this skill is found.
     *
     * @param workExperienceId the workExperienceId value to set.
     * @return the ResumeDataSkillsPropertiesItemsItem object itself.
     */
    public ResumeDataSkillsPropertiesItemsItem setWorkExperienceId(Integer workExperienceId) {
        this.workExperienceId = workExperienceId;
        return this;
    }
}
