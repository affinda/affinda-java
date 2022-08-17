package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResumeSkillSourcesItem model. */
@Fluent
public final class ResumeSkillSourcesItem {
    /*
     * The section property.
     */
    @JsonProperty(value = "section")
    private ResumeSkillSourcesItemSection section;

    /*
     * The position property.
     */
    @JsonProperty(value = "position")
    private Integer position;

    /**
     * Get the section property: The section property.
     *
     * @return the section value.
     */
    public ResumeSkillSourcesItemSection getSection() {
        return this.section;
    }

    /**
     * Set the section property: The section property.
     *
     * @param section the section value to set.
     * @return the ResumeSkillSourcesItem object itself.
     */
    public ResumeSkillSourcesItem setSection(ResumeSkillSourcesItemSection section) {
        this.section = section;
        return this;
    }

    /**
     * Get the position property: The position property.
     *
     * @return the position value.
     */
    public Integer getPosition() {
        return this.position;
    }

    /**
     * Set the position property: The position property.
     *
     * @param position the position value to set.
     * @return the ResumeSkillSourcesItem object itself.
     */
    public ResumeSkillSourcesItem setPosition(Integer position) {
        this.position = position;
        return this;
    }
}
