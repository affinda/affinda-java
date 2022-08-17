package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ResumeDataSkillsItem model. */
@Fluent
public final class ResumeDataSkillsItem {
    /*
     * The id property.
     */
    @JsonProperty(value = "id")
    private Integer id;

    /*
     * EMSI id of this skill.
     */
    @JsonProperty(value = "emsiId", access = JsonProperty.Access.WRITE_ONLY)
    private String emsiId;

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
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The count property.
     */
    @JsonProperty(value = "count", access = JsonProperty.Access.WRITE_ONLY)
    private Integer count;

    /*
     * The weighting property.
     */
    @JsonProperty(value = "weighting", access = JsonProperty.Access.WRITE_ONLY)
    private Float weighting;

    /*
     * The sources property.
     */
    @JsonProperty(value = "sources", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResumeDataSkillsPropertiesItemsItem> sources;

    /**
     * Get the id property: The id property.
     *
     * @return the id value.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Set the id property: The id property.
     *
     * @param id the id value to set.
     * @return the ResumeDataSkillsItem object itself.
     */
    public ResumeDataSkillsItem setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get the emsiId property: EMSI id of this skill.
     *
     * @return the emsiId value.
     */
    public String getEmsiId() {
        return this.emsiId;
    }

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
     * Get the count property: The count property.
     *
     * @return the count value.
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * Get the weighting property: The weighting property.
     *
     * @return the weighting value.
     */
    public Float getWeighting() {
        return this.weighting;
    }

    /**
     * Get the sources property: The sources property.
     *
     * @return the sources value.
     */
    public List<ResumeDataSkillsPropertiesItemsItem> getSources() {
        return this.sources;
    }
}
