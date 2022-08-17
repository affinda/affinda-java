package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JobDescriptionSearchParameters model. */
@Fluent
public final class JobDescriptionSearchParameters {
    /*
     * The indices property.
     */
    @JsonProperty(value = "indices", required = true)
    private List<String> indices;

    /*
     * Unique identifier for the document. If creating a document and left
     * blank, one will be automatically generated.
     */
    @JsonProperty(value = "resume")
    private String resume;

    /*
     * The jobTitles property.
     */
    @JsonProperty(value = "jobTitles")
    private List<String> jobTitles;

    /*
     * The jobTitlesRequired property.
     */
    @JsonProperty(value = "jobTitlesRequired")
    private Boolean jobTitlesRequired;

    /*
     * The jobTitlesWeight property.
     */
    @JsonProperty(value = "jobTitlesWeight")
    private Float jobTitlesWeight;

    /*
     * The totalYearsExperience property.
     */
    @JsonProperty(value = "totalYearsExperience")
    private Float totalYearsExperience;

    /*
     * The yearsExperienceRequired property.
     */
    @JsonProperty(value = "yearsExperienceRequired")
    private Boolean yearsExperienceRequired;

    /*
     * The yearsExperienceWeight property.
     */
    @JsonProperty(value = "yearsExperienceWeight")
    private Float yearsExperienceWeight;

    /*
     * The locations property.
     */
    @JsonProperty(value = "locations")
    private List<ResumeSearchParametersLocation> locations;

    /*
     * The locationsWeight property.
     */
    @JsonProperty(value = "locationsWeight")
    private Float locationsWeight;

    /*
     * The locationsRequired property.
     */
    @JsonProperty(value = "locationsRequired")
    private Boolean locationsRequired;

    /*
     * The skills property.
     */
    @JsonProperty(value = "skills")
    private List<ResumeSearchParametersSkill> skills;

    /*
     * The skillsWeight property.
     */
    @JsonProperty(value = "skillsWeight")
    private Float skillsWeight;

    /*
     * The languages property.
     */
    @JsonProperty(value = "languages")
    private List<ResumeSearchParametersSkill> languages;

    /*
     * The languagesWeight property.
     */
    @JsonProperty(value = "languagesWeight")
    private Float languagesWeight;

    /*
     * The degrees property.
     */
    @JsonProperty(value = "degrees")
    private List<String> degrees;

    /*
     * The degreesRequired property.
     */
    @JsonProperty(value = "degreesRequired")
    private Boolean degreesRequired;

    /*
     * The degreeTypes property.
     */
    @JsonProperty(value = "degreeTypes")
    private List<EducationLevel> degreeTypes;

    /*
     * The degreeTypesRequired property.
     */
    @JsonProperty(value = "degreeTypesRequired")
    private Boolean degreeTypesRequired;

    /*
     * The educationWeight property.
     */
    @JsonProperty(value = "educationWeight")
    private Float educationWeight;

    /*
     * The searchExpression property.
     */
    @JsonProperty(value = "searchExpression")
    private String searchExpression;

    /*
     * The searchExpressionRequired property.
     */
    @JsonProperty(value = "searchExpressionRequired")
    private Boolean searchExpressionRequired;

    /*
     * The searchExpressionWeight property.
     */
    @JsonProperty(value = "searchExpressionWeight")
    private Float searchExpressionWeight;

    /*
     * The socCodes property.
     */
    @JsonProperty(value = "socCodes")
    private List<Integer> socCodes;

    /*
     * The socCodesWeight property.
     */
    @JsonProperty(value = "socCodesWeight")
    private Float socCodesWeight;

    /*
     * The socCodesRequired property.
     */
    @JsonProperty(value = "socCodesRequired")
    private Boolean socCodesRequired;

    /*
     * The managementLevel property.
     */
    @JsonProperty(value = "managementLevel")
    private ManagementLevel managementLevel;

    /*
     * The managementLevelRequired property.
     */
    @JsonProperty(value = "managementLevelRequired")
    private Boolean managementLevelRequired;

    /*
     * The managementLevelWeight property.
     */
    @JsonProperty(value = "managementLevelWeight")
    private Float managementLevelWeight;

    /**
     * Get the indices property: The indices property.
     *
     * @return the indices value.
     */
    public List<String> getIndices() {
        return this.indices;
    }

    /**
     * Set the indices property: The indices property.
     *
     * @param indices the indices value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setIndices(List<String> indices) {
        this.indices = indices;
        return this;
    }

    /**
     * Get the resume property: Unique identifier for the document. If creating a document and left blank, one will be
     * automatically generated.
     *
     * @return the resume value.
     */
    public String getResume() {
        return this.resume;
    }

    /**
     * Set the resume property: Unique identifier for the document. If creating a document and left blank, one will be
     * automatically generated.
     *
     * @param resume the resume value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setResume(String resume) {
        this.resume = resume;
        return this;
    }

    /**
     * Get the jobTitles property: The jobTitles property.
     *
     * @return the jobTitles value.
     */
    public List<String> getJobTitles() {
        return this.jobTitles;
    }

    /**
     * Set the jobTitles property: The jobTitles property.
     *
     * @param jobTitles the jobTitles value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setJobTitles(List<String> jobTitles) {
        this.jobTitles = jobTitles;
        return this;
    }

    /**
     * Get the jobTitlesRequired property: The jobTitlesRequired property.
     *
     * @return the jobTitlesRequired value.
     */
    public Boolean isJobTitlesRequired() {
        return this.jobTitlesRequired;
    }

    /**
     * Set the jobTitlesRequired property: The jobTitlesRequired property.
     *
     * @param jobTitlesRequired the jobTitlesRequired value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setJobTitlesRequired(Boolean jobTitlesRequired) {
        this.jobTitlesRequired = jobTitlesRequired;
        return this;
    }

    /**
     * Get the jobTitlesWeight property: The jobTitlesWeight property.
     *
     * @return the jobTitlesWeight value.
     */
    public Float getJobTitlesWeight() {
        return this.jobTitlesWeight;
    }

    /**
     * Set the jobTitlesWeight property: The jobTitlesWeight property.
     *
     * @param jobTitlesWeight the jobTitlesWeight value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setJobTitlesWeight(Float jobTitlesWeight) {
        this.jobTitlesWeight = jobTitlesWeight;
        return this;
    }

    /**
     * Get the totalYearsExperience property: The totalYearsExperience property.
     *
     * @return the totalYearsExperience value.
     */
    public Float getTotalYearsExperience() {
        return this.totalYearsExperience;
    }

    /**
     * Set the totalYearsExperience property: The totalYearsExperience property.
     *
     * @param totalYearsExperience the totalYearsExperience value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setTotalYearsExperience(Float totalYearsExperience) {
        this.totalYearsExperience = totalYearsExperience;
        return this;
    }

    /**
     * Get the yearsExperienceRequired property: The yearsExperienceRequired property.
     *
     * @return the yearsExperienceRequired value.
     */
    public Boolean isYearsExperienceRequired() {
        return this.yearsExperienceRequired;
    }

    /**
     * Set the yearsExperienceRequired property: The yearsExperienceRequired property.
     *
     * @param yearsExperienceRequired the yearsExperienceRequired value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setYearsExperienceRequired(Boolean yearsExperienceRequired) {
        this.yearsExperienceRequired = yearsExperienceRequired;
        return this;
    }

    /**
     * Get the yearsExperienceWeight property: The yearsExperienceWeight property.
     *
     * @return the yearsExperienceWeight value.
     */
    public Float getYearsExperienceWeight() {
        return this.yearsExperienceWeight;
    }

    /**
     * Set the yearsExperienceWeight property: The yearsExperienceWeight property.
     *
     * @param yearsExperienceWeight the yearsExperienceWeight value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setYearsExperienceWeight(Float yearsExperienceWeight) {
        this.yearsExperienceWeight = yearsExperienceWeight;
        return this;
    }

    /**
     * Get the locations property: The locations property.
     *
     * @return the locations value.
     */
    public List<ResumeSearchParametersLocation> getLocations() {
        return this.locations;
    }

    /**
     * Set the locations property: The locations property.
     *
     * @param locations the locations value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setLocations(List<ResumeSearchParametersLocation> locations) {
        this.locations = locations;
        return this;
    }

    /**
     * Get the locationsWeight property: The locationsWeight property.
     *
     * @return the locationsWeight value.
     */
    public Float getLocationsWeight() {
        return this.locationsWeight;
    }

    /**
     * Set the locationsWeight property: The locationsWeight property.
     *
     * @param locationsWeight the locationsWeight value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setLocationsWeight(Float locationsWeight) {
        this.locationsWeight = locationsWeight;
        return this;
    }

    /**
     * Get the locationsRequired property: The locationsRequired property.
     *
     * @return the locationsRequired value.
     */
    public Boolean isLocationsRequired() {
        return this.locationsRequired;
    }

    /**
     * Set the locationsRequired property: The locationsRequired property.
     *
     * @param locationsRequired the locationsRequired value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setLocationsRequired(Boolean locationsRequired) {
        this.locationsRequired = locationsRequired;
        return this;
    }

    /**
     * Get the skills property: The skills property.
     *
     * @return the skills value.
     */
    public List<ResumeSearchParametersSkill> getSkills() {
        return this.skills;
    }

    /**
     * Set the skills property: The skills property.
     *
     * @param skills the skills value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setSkills(List<ResumeSearchParametersSkill> skills) {
        this.skills = skills;
        return this;
    }

    /**
     * Get the skillsWeight property: The skillsWeight property.
     *
     * @return the skillsWeight value.
     */
    public Float getSkillsWeight() {
        return this.skillsWeight;
    }

    /**
     * Set the skillsWeight property: The skillsWeight property.
     *
     * @param skillsWeight the skillsWeight value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setSkillsWeight(Float skillsWeight) {
        this.skillsWeight = skillsWeight;
        return this;
    }

    /**
     * Get the languages property: The languages property.
     *
     * @return the languages value.
     */
    public List<ResumeSearchParametersSkill> getLanguages() {
        return this.languages;
    }

    /**
     * Set the languages property: The languages property.
     *
     * @param languages the languages value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setLanguages(List<ResumeSearchParametersSkill> languages) {
        this.languages = languages;
        return this;
    }

    /**
     * Get the languagesWeight property: The languagesWeight property.
     *
     * @return the languagesWeight value.
     */
    public Float getLanguagesWeight() {
        return this.languagesWeight;
    }

    /**
     * Set the languagesWeight property: The languagesWeight property.
     *
     * @param languagesWeight the languagesWeight value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setLanguagesWeight(Float languagesWeight) {
        this.languagesWeight = languagesWeight;
        return this;
    }

    /**
     * Get the degrees property: The degrees property.
     *
     * @return the degrees value.
     */
    public List<String> getDegrees() {
        return this.degrees;
    }

    /**
     * Set the degrees property: The degrees property.
     *
     * @param degrees the degrees value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setDegrees(List<String> degrees) {
        this.degrees = degrees;
        return this;
    }

    /**
     * Get the degreesRequired property: The degreesRequired property.
     *
     * @return the degreesRequired value.
     */
    public Boolean isDegreesRequired() {
        return this.degreesRequired;
    }

    /**
     * Set the degreesRequired property: The degreesRequired property.
     *
     * @param degreesRequired the degreesRequired value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setDegreesRequired(Boolean degreesRequired) {
        this.degreesRequired = degreesRequired;
        return this;
    }

    /**
     * Get the degreeTypes property: The degreeTypes property.
     *
     * @return the degreeTypes value.
     */
    public List<EducationLevel> getDegreeTypes() {
        return this.degreeTypes;
    }

    /**
     * Set the degreeTypes property: The degreeTypes property.
     *
     * @param degreeTypes the degreeTypes value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setDegreeTypes(List<EducationLevel> degreeTypes) {
        this.degreeTypes = degreeTypes;
        return this;
    }

    /**
     * Get the degreeTypesRequired property: The degreeTypesRequired property.
     *
     * @return the degreeTypesRequired value.
     */
    public Boolean isDegreeTypesRequired() {
        return this.degreeTypesRequired;
    }

    /**
     * Set the degreeTypesRequired property: The degreeTypesRequired property.
     *
     * @param degreeTypesRequired the degreeTypesRequired value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setDegreeTypesRequired(Boolean degreeTypesRequired) {
        this.degreeTypesRequired = degreeTypesRequired;
        return this;
    }

    /**
     * Get the educationWeight property: The educationWeight property.
     *
     * @return the educationWeight value.
     */
    public Float getEducationWeight() {
        return this.educationWeight;
    }

    /**
     * Set the educationWeight property: The educationWeight property.
     *
     * @param educationWeight the educationWeight value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setEducationWeight(Float educationWeight) {
        this.educationWeight = educationWeight;
        return this;
    }

    /**
     * Get the searchExpression property: The searchExpression property.
     *
     * @return the searchExpression value.
     */
    public String getSearchExpression() {
        return this.searchExpression;
    }

    /**
     * Set the searchExpression property: The searchExpression property.
     *
     * @param searchExpression the searchExpression value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setSearchExpression(String searchExpression) {
        this.searchExpression = searchExpression;
        return this;
    }

    /**
     * Get the searchExpressionRequired property: The searchExpressionRequired property.
     *
     * @return the searchExpressionRequired value.
     */
    public Boolean isSearchExpressionRequired() {
        return this.searchExpressionRequired;
    }

    /**
     * Set the searchExpressionRequired property: The searchExpressionRequired property.
     *
     * @param searchExpressionRequired the searchExpressionRequired value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setSearchExpressionRequired(Boolean searchExpressionRequired) {
        this.searchExpressionRequired = searchExpressionRequired;
        return this;
    }

    /**
     * Get the searchExpressionWeight property: The searchExpressionWeight property.
     *
     * @return the searchExpressionWeight value.
     */
    public Float getSearchExpressionWeight() {
        return this.searchExpressionWeight;
    }

    /**
     * Set the searchExpressionWeight property: The searchExpressionWeight property.
     *
     * @param searchExpressionWeight the searchExpressionWeight value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setSearchExpressionWeight(Float searchExpressionWeight) {
        this.searchExpressionWeight = searchExpressionWeight;
        return this;
    }

    /**
     * Get the socCodes property: The socCodes property.
     *
     * @return the socCodes value.
     */
    public List<Integer> getSocCodes() {
        return this.socCodes;
    }

    /**
     * Set the socCodes property: The socCodes property.
     *
     * @param socCodes the socCodes value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setSocCodes(List<Integer> socCodes) {
        this.socCodes = socCodes;
        return this;
    }

    /**
     * Get the socCodesWeight property: The socCodesWeight property.
     *
     * @return the socCodesWeight value.
     */
    public Float getSocCodesWeight() {
        return this.socCodesWeight;
    }

    /**
     * Set the socCodesWeight property: The socCodesWeight property.
     *
     * @param socCodesWeight the socCodesWeight value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setSocCodesWeight(Float socCodesWeight) {
        this.socCodesWeight = socCodesWeight;
        return this;
    }

    /**
     * Get the socCodesRequired property: The socCodesRequired property.
     *
     * @return the socCodesRequired value.
     */
    public Boolean isSocCodesRequired() {
        return this.socCodesRequired;
    }

    /**
     * Set the socCodesRequired property: The socCodesRequired property.
     *
     * @param socCodesRequired the socCodesRequired value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setSocCodesRequired(Boolean socCodesRequired) {
        this.socCodesRequired = socCodesRequired;
        return this;
    }

    /**
     * Get the managementLevel property: The managementLevel property.
     *
     * @return the managementLevel value.
     */
    public ManagementLevel getManagementLevel() {
        return this.managementLevel;
    }

    /**
     * Set the managementLevel property: The managementLevel property.
     *
     * @param managementLevel the managementLevel value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setManagementLevel(ManagementLevel managementLevel) {
        this.managementLevel = managementLevel;
        return this;
    }

    /**
     * Get the managementLevelRequired property: The managementLevelRequired property.
     *
     * @return the managementLevelRequired value.
     */
    public Boolean isManagementLevelRequired() {
        return this.managementLevelRequired;
    }

    /**
     * Set the managementLevelRequired property: The managementLevelRequired property.
     *
     * @param managementLevelRequired the managementLevelRequired value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setManagementLevelRequired(Boolean managementLevelRequired) {
        this.managementLevelRequired = managementLevelRequired;
        return this;
    }

    /**
     * Get the managementLevelWeight property: The managementLevelWeight property.
     *
     * @return the managementLevelWeight value.
     */
    public Float getManagementLevelWeight() {
        return this.managementLevelWeight;
    }

    /**
     * Set the managementLevelWeight property: The managementLevelWeight property.
     *
     * @param managementLevelWeight the managementLevelWeight value to set.
     * @return the JobDescriptionSearchParameters object itself.
     */
    public JobDescriptionSearchParameters setManagementLevelWeight(Float managementLevelWeight) {
        this.managementLevelWeight = managementLevelWeight;
        return this;
    }
}
