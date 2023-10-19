package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The ResumeSearchConfig model. */
@Fluent
public final class ResumeSearchConfig {
    /*
     * The allowPdfDownload property.
     */
    @JsonProperty(value = "allowPdfDownload")
    private Boolean allowPdfDownload;

    /*
     * Maximum number of results that can be returned. Setting to "null" means
     * no limitation.
     */
    @JsonProperty(value = "maxResults")
    private Integer maxResults;

    /*
     * The displayJobTitle property.
     */
    @JsonProperty(value = "displayJobTitle")
    private Boolean displayJobTitle;

    /*
     * The displayLocation property.
     */
    @JsonProperty(value = "displayLocation")
    private Boolean displayLocation;

    /*
     * The displayYearsExperience property.
     */
    @JsonProperty(value = "displayYearsExperience")
    private Boolean displayYearsExperience;

    /*
     * The displayOccupationGroup property.
     */
    @JsonProperty(value = "displayOccupationGroup")
    private Boolean displayOccupationGroup;

    /*
     * The displayEducation property.
     */
    @JsonProperty(value = "displayEducation")
    private Boolean displayEducation;

    /*
     * The displaySkills property.
     */
    @JsonProperty(value = "displaySkills")
    private Boolean displaySkills;

    /*
     * The displayLanguages property.
     */
    @JsonProperty(value = "displayLanguages")
    private Boolean displayLanguages;

    /*
     * The displayManagementLevel property.
     */
    @JsonProperty(value = "displayManagementLevel")
    private Boolean displayManagementLevel;

    /*
     * The displayKeywords property.
     */
    @JsonProperty(value = "displayKeywords")
    private Boolean displayKeywords;

    /*
     * The weightJobTitle property.
     */
    @JsonProperty(value = "weightJobTitle")
    private Float weightJobTitle;

    /*
     * The weightLocation property.
     */
    @JsonProperty(value = "weightLocation")
    private Float weightLocation;

    /*
     * The weightYearsExperience property.
     */
    @JsonProperty(value = "weightYearsExperience")
    private Float weightYearsExperience;

    /*
     * The weightOccupationGroup property.
     */
    @JsonProperty(value = "weightOccupationGroup")
    private Float weightOccupationGroup;

    /*
     * The weightEducation property.
     */
    @JsonProperty(value = "weightEducation")
    private Float weightEducation;

    /*
     * The weightSkills property.
     */
    @JsonProperty(value = "weightSkills")
    private Float weightSkills;

    /*
     * The weightLanguages property.
     */
    @JsonProperty(value = "weightLanguages")
    private Float weightLanguages;

    /*
     * The weightManagementLevel property.
     */
    @JsonProperty(value = "weightManagementLevel")
    private Float weightManagementLevel;

    /*
     * The weightKeywords property.
     */
    @JsonProperty(value = "weightKeywords")
    private Float weightKeywords;

    /*
     * List of index names.
     */
    @JsonProperty(value = "indices")
    private List<String> indices;

    /*
     * Controls whether or not the index dropdown is displayed to the user
     */
    @JsonProperty(value = "showIndexDropdown")
    private Boolean showIndexDropdown;

    /*
     * Customize the theme of the embeded search tool.
     */
    @JsonProperty(value = "searchToolTheme")
    private Map<String, Object> searchToolTheme;

    /*
     * ID of the logged in user.
     */
    @JsonProperty(value = "userId", access = JsonProperty.Access.WRITE_ONLY)
    private Integer userId;

    /*
     * Username of the logged in user.
     */
    @JsonProperty(value = "username", access = JsonProperty.Access.WRITE_ONLY)
    private String username;

    /*
     * A list of actions to show in the dropdown in the embedded search tool
     */
    @JsonProperty(value = "actions")
    private List<SearchConfigAction> actions;

    /*
     * Hide the reset/import toolbar.
     */
    @JsonProperty(value = "hideToolbar")
    private Boolean hideToolbar;

    /*
     * Hide the entire side panel.
     */
    @JsonProperty(value = "hideSidePanel")
    private Boolean hideSidePanel;

    /*
     * The customFieldsConfig property.
     */
    @JsonProperty(value = "customFieldsConfig")
    private List<CustomFieldConfig> customFieldsConfig;

    /**
     * Get the allowPdfDownload property: The allowPdfDownload property.
     *
     * @return the allowPdfDownload value.
     */
    public Boolean isAllowPdfDownload() {
        return this.allowPdfDownload;
    }

    /**
     * Set the allowPdfDownload property: The allowPdfDownload property.
     *
     * @param allowPdfDownload the allowPdfDownload value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setAllowPdfDownload(Boolean allowPdfDownload) {
        this.allowPdfDownload = allowPdfDownload;
        return this;
    }

    /**
     * Get the maxResults property: Maximum number of results that can be returned. Setting to "null" means no
     * limitation.
     *
     * @return the maxResults value.
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * Set the maxResults property: Maximum number of results that can be returned. Setting to "null" means no
     * limitation.
     *
     * @param maxResults the maxResults value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Get the displayJobTitle property: The displayJobTitle property.
     *
     * @return the displayJobTitle value.
     */
    public Boolean isDisplayJobTitle() {
        return this.displayJobTitle;
    }

    /**
     * Set the displayJobTitle property: The displayJobTitle property.
     *
     * @param displayJobTitle the displayJobTitle value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setDisplayJobTitle(Boolean displayJobTitle) {
        this.displayJobTitle = displayJobTitle;
        return this;
    }

    /**
     * Get the displayLocation property: The displayLocation property.
     *
     * @return the displayLocation value.
     */
    public Boolean isDisplayLocation() {
        return this.displayLocation;
    }

    /**
     * Set the displayLocation property: The displayLocation property.
     *
     * @param displayLocation the displayLocation value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setDisplayLocation(Boolean displayLocation) {
        this.displayLocation = displayLocation;
        return this;
    }

    /**
     * Get the displayYearsExperience property: The displayYearsExperience property.
     *
     * @return the displayYearsExperience value.
     */
    public Boolean isDisplayYearsExperience() {
        return this.displayYearsExperience;
    }

    /**
     * Set the displayYearsExperience property: The displayYearsExperience property.
     *
     * @param displayYearsExperience the displayYearsExperience value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setDisplayYearsExperience(Boolean displayYearsExperience) {
        this.displayYearsExperience = displayYearsExperience;
        return this;
    }

    /**
     * Get the displayOccupationGroup property: The displayOccupationGroup property.
     *
     * @return the displayOccupationGroup value.
     */
    public Boolean isDisplayOccupationGroup() {
        return this.displayOccupationGroup;
    }

    /**
     * Set the displayOccupationGroup property: The displayOccupationGroup property.
     *
     * @param displayOccupationGroup the displayOccupationGroup value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setDisplayOccupationGroup(Boolean displayOccupationGroup) {
        this.displayOccupationGroup = displayOccupationGroup;
        return this;
    }

    /**
     * Get the displayEducation property: The displayEducation property.
     *
     * @return the displayEducation value.
     */
    public Boolean isDisplayEducation() {
        return this.displayEducation;
    }

    /**
     * Set the displayEducation property: The displayEducation property.
     *
     * @param displayEducation the displayEducation value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setDisplayEducation(Boolean displayEducation) {
        this.displayEducation = displayEducation;
        return this;
    }

    /**
     * Get the displaySkills property: The displaySkills property.
     *
     * @return the displaySkills value.
     */
    public Boolean isDisplaySkills() {
        return this.displaySkills;
    }

    /**
     * Set the displaySkills property: The displaySkills property.
     *
     * @param displaySkills the displaySkills value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setDisplaySkills(Boolean displaySkills) {
        this.displaySkills = displaySkills;
        return this;
    }

    /**
     * Get the displayLanguages property: The displayLanguages property.
     *
     * @return the displayLanguages value.
     */
    public Boolean isDisplayLanguages() {
        return this.displayLanguages;
    }

    /**
     * Set the displayLanguages property: The displayLanguages property.
     *
     * @param displayLanguages the displayLanguages value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setDisplayLanguages(Boolean displayLanguages) {
        this.displayLanguages = displayLanguages;
        return this;
    }

    /**
     * Get the displayManagementLevel property: The displayManagementLevel property.
     *
     * @return the displayManagementLevel value.
     */
    public Boolean isDisplayManagementLevel() {
        return this.displayManagementLevel;
    }

    /**
     * Set the displayManagementLevel property: The displayManagementLevel property.
     *
     * @param displayManagementLevel the displayManagementLevel value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setDisplayManagementLevel(Boolean displayManagementLevel) {
        this.displayManagementLevel = displayManagementLevel;
        return this;
    }

    /**
     * Get the displayKeywords property: The displayKeywords property.
     *
     * @return the displayKeywords value.
     */
    public Boolean isDisplayKeywords() {
        return this.displayKeywords;
    }

    /**
     * Set the displayKeywords property: The displayKeywords property.
     *
     * @param displayKeywords the displayKeywords value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setDisplayKeywords(Boolean displayKeywords) {
        this.displayKeywords = displayKeywords;
        return this;
    }

    /**
     * Get the weightJobTitle property: The weightJobTitle property.
     *
     * @return the weightJobTitle value.
     */
    public Float getWeightJobTitle() {
        return this.weightJobTitle;
    }

    /**
     * Set the weightJobTitle property: The weightJobTitle property.
     *
     * @param weightJobTitle the weightJobTitle value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setWeightJobTitle(Float weightJobTitle) {
        this.weightJobTitle = weightJobTitle;
        return this;
    }

    /**
     * Get the weightLocation property: The weightLocation property.
     *
     * @return the weightLocation value.
     */
    public Float getWeightLocation() {
        return this.weightLocation;
    }

    /**
     * Set the weightLocation property: The weightLocation property.
     *
     * @param weightLocation the weightLocation value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setWeightLocation(Float weightLocation) {
        this.weightLocation = weightLocation;
        return this;
    }

    /**
     * Get the weightYearsExperience property: The weightYearsExperience property.
     *
     * @return the weightYearsExperience value.
     */
    public Float getWeightYearsExperience() {
        return this.weightYearsExperience;
    }

    /**
     * Set the weightYearsExperience property: The weightYearsExperience property.
     *
     * @param weightYearsExperience the weightYearsExperience value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setWeightYearsExperience(Float weightYearsExperience) {
        this.weightYearsExperience = weightYearsExperience;
        return this;
    }

    /**
     * Get the weightOccupationGroup property: The weightOccupationGroup property.
     *
     * @return the weightOccupationGroup value.
     */
    public Float getWeightOccupationGroup() {
        return this.weightOccupationGroup;
    }

    /**
     * Set the weightOccupationGroup property: The weightOccupationGroup property.
     *
     * @param weightOccupationGroup the weightOccupationGroup value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setWeightOccupationGroup(Float weightOccupationGroup) {
        this.weightOccupationGroup = weightOccupationGroup;
        return this;
    }

    /**
     * Get the weightEducation property: The weightEducation property.
     *
     * @return the weightEducation value.
     */
    public Float getWeightEducation() {
        return this.weightEducation;
    }

    /**
     * Set the weightEducation property: The weightEducation property.
     *
     * @param weightEducation the weightEducation value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setWeightEducation(Float weightEducation) {
        this.weightEducation = weightEducation;
        return this;
    }

    /**
     * Get the weightSkills property: The weightSkills property.
     *
     * @return the weightSkills value.
     */
    public Float getWeightSkills() {
        return this.weightSkills;
    }

    /**
     * Set the weightSkills property: The weightSkills property.
     *
     * @param weightSkills the weightSkills value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setWeightSkills(Float weightSkills) {
        this.weightSkills = weightSkills;
        return this;
    }

    /**
     * Get the weightLanguages property: The weightLanguages property.
     *
     * @return the weightLanguages value.
     */
    public Float getWeightLanguages() {
        return this.weightLanguages;
    }

    /**
     * Set the weightLanguages property: The weightLanguages property.
     *
     * @param weightLanguages the weightLanguages value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setWeightLanguages(Float weightLanguages) {
        this.weightLanguages = weightLanguages;
        return this;
    }

    /**
     * Get the weightManagementLevel property: The weightManagementLevel property.
     *
     * @return the weightManagementLevel value.
     */
    public Float getWeightManagementLevel() {
        return this.weightManagementLevel;
    }

    /**
     * Set the weightManagementLevel property: The weightManagementLevel property.
     *
     * @param weightManagementLevel the weightManagementLevel value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setWeightManagementLevel(Float weightManagementLevel) {
        this.weightManagementLevel = weightManagementLevel;
        return this;
    }

    /**
     * Get the weightKeywords property: The weightKeywords property.
     *
     * @return the weightKeywords value.
     */
    public Float getWeightKeywords() {
        return this.weightKeywords;
    }

    /**
     * Set the weightKeywords property: The weightKeywords property.
     *
     * @param weightKeywords the weightKeywords value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setWeightKeywords(Float weightKeywords) {
        this.weightKeywords = weightKeywords;
        return this;
    }

    /**
     * Get the indices property: List of index names.
     *
     * @return the indices value.
     */
    public List<String> getIndices() {
        return this.indices;
    }

    /**
     * Set the indices property: List of index names.
     *
     * @param indices the indices value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setIndices(List<String> indices) {
        this.indices = indices;
        return this;
    }

    /**
     * Get the showIndexDropdown property: Controls whether or not the index dropdown is displayed to the user.
     *
     * @return the showIndexDropdown value.
     */
    public Boolean isShowIndexDropdown() {
        return this.showIndexDropdown;
    }

    /**
     * Set the showIndexDropdown property: Controls whether or not the index dropdown is displayed to the user.
     *
     * @param showIndexDropdown the showIndexDropdown value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setShowIndexDropdown(Boolean showIndexDropdown) {
        this.showIndexDropdown = showIndexDropdown;
        return this;
    }

    /**
     * Get the searchToolTheme property: Customize the theme of the embeded search tool.
     *
     * @return the searchToolTheme value.
     */
    public Map<String, Object> getSearchToolTheme() {
        return this.searchToolTheme;
    }

    /**
     * Set the searchToolTheme property: Customize the theme of the embeded search tool.
     *
     * @param searchToolTheme the searchToolTheme value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setSearchToolTheme(Map<String, Object> searchToolTheme) {
        this.searchToolTheme = searchToolTheme;
        return this;
    }

    /**
     * Get the userId property: ID of the logged in user.
     *
     * @return the userId value.
     */
    public Integer getUserId() {
        return this.userId;
    }

    /**
     * Get the username property: Username of the logged in user.
     *
     * @return the username value.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Get the actions property: A list of actions to show in the dropdown in the embedded search tool.
     *
     * @return the actions value.
     */
    public List<SearchConfigAction> getActions() {
        return this.actions;
    }

    /**
     * Set the actions property: A list of actions to show in the dropdown in the embedded search tool.
     *
     * @param actions the actions value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setActions(List<SearchConfigAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the hideToolbar property: Hide the reset/import toolbar.
     *
     * @return the hideToolbar value.
     */
    public Boolean isHideToolbar() {
        return this.hideToolbar;
    }

    /**
     * Set the hideToolbar property: Hide the reset/import toolbar.
     *
     * @param hideToolbar the hideToolbar value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setHideToolbar(Boolean hideToolbar) {
        this.hideToolbar = hideToolbar;
        return this;
    }

    /**
     * Get the hideSidePanel property: Hide the entire side panel.
     *
     * @return the hideSidePanel value.
     */
    public Boolean isHideSidePanel() {
        return this.hideSidePanel;
    }

    /**
     * Set the hideSidePanel property: Hide the entire side panel.
     *
     * @param hideSidePanel the hideSidePanel value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setHideSidePanel(Boolean hideSidePanel) {
        this.hideSidePanel = hideSidePanel;
        return this;
    }

    /**
     * Get the customFieldsConfig property: The customFieldsConfig property.
     *
     * @return the customFieldsConfig value.
     */
    public List<CustomFieldConfig> getCustomFieldsConfig() {
        return this.customFieldsConfig;
    }

    /**
     * Set the customFieldsConfig property: The customFieldsConfig property.
     *
     * @param customFieldsConfig the customFieldsConfig value to set.
     * @return the ResumeSearchConfig object itself.
     */
    public ResumeSearchConfig setCustomFieldsConfig(List<CustomFieldConfig> customFieldsConfig) {
        this.customFieldsConfig = customFieldsConfig;
        return this;
    }
}
