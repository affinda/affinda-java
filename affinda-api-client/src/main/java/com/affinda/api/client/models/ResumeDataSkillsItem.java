package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ResumeDataSkillsItem model. */
@Fluent
public final class ResumeDataSkillsItem {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The lastUsed property.
     */
    @JsonProperty(value = "lastUsed")
    private String lastUsed;

    /*
     * The numberOfMonths property.
     */
    @JsonProperty(value = "numberOfMonths")
    private Integer numberOfMonths;

    /*
     * The type property.
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * The sources property.
     */
    @JsonProperty(value = "sources")
    private List<ResumeDataSkillsPropertiesItemsItem> sources;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the ResumeDataSkillsItem object itself.
     */
    public ResumeDataSkillsItem setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the lastUsed property: The lastUsed property.
     *
     * @return the lastUsed value.
     */
    public String getLastUsed() {
        return this.lastUsed;
    }

    /**
     * Set the lastUsed property: The lastUsed property.
     *
     * @param lastUsed the lastUsed value to set.
     * @return the ResumeDataSkillsItem object itself.
     */
    public ResumeDataSkillsItem setLastUsed(String lastUsed) {
        this.lastUsed = lastUsed;
        return this;
    }

    /**
     * Get the numberOfMonths property: The numberOfMonths property.
     *
     * @return the numberOfMonths value.
     */
    public Integer getNumberOfMonths() {
        return this.numberOfMonths;
    }

    /**
     * Set the numberOfMonths property: The numberOfMonths property.
     *
     * @param numberOfMonths the numberOfMonths value to set.
     * @return the ResumeDataSkillsItem object itself.
     */
    public ResumeDataSkillsItem setNumberOfMonths(Integer numberOfMonths) {
        this.numberOfMonths = numberOfMonths;
        return this;
    }

    /**
     * Get the type property: The type property.
     *
     * @return the type value.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Set the type property: The type property.
     *
     * @param type the type value to set.
     * @return the ResumeDataSkillsItem object itself.
     */
    public ResumeDataSkillsItem setType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the sources property: The sources property.
     *
     * @return the sources value.
     */
    public List<ResumeDataSkillsPropertiesItemsItem> getSources() {
        return this.sources;
    }

    /**
     * Set the sources property: The sources property.
     *
     * @param sources the sources value to set.
     * @return the ResumeDataSkillsItem object itself.
     */
    public ResumeDataSkillsItem setSources(List<ResumeDataSkillsPropertiesItemsItem> sources) {
        this.sources = sources;
        return this;
    }
}
