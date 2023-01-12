package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ResumeSearchParameters model. */
@Fluent
public final class ResumeSearchParameters {
    /*
     * The indices property.
     */
    @JsonProperty(value = "indices", required = true)
    private List<String> indices;

    /*
     * A random string that uniquely identify the resource.
     */
    @JsonProperty(value = "jobDescription")
    private String jobDescription;

    /*
     * A random string that uniquely identify the resource.
     */
    @JsonProperty(value = "resume")
    private String resume;

    /*
     * The jobTitles property.
     */
    @JsonProperty(value = "jobTitles")
    private List<String> jobTitles;

    /*
     * Search only through the canditate's current job
     */
    @JsonProperty(value = "jobTitlesCurrentOnly")
    private Boolean jobTitlesCurrentOnly;

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
     * Minimum years of total work experience
     */
    @JsonProperty(value = "yearsExperienceMin")
    private Integer yearsExperienceMin;

    /*
     * Maximum years of total work experience
     */
    @JsonProperty(value = "yearsExperienceMax")
    private Integer yearsExperienceMax;

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
     * Search by location name or by coordinates
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
     * The institutions property.
     */
    @JsonProperty(value = "institutions")
    private List<String> institutions;

    /*
     * The institutionsRequired property.
     */
    @JsonProperty(value = "institutionsRequired")
    private Boolean institutionsRequired;

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
     * The highestDegreeTypes property.
     */
    @JsonProperty(value = "highestDegreeTypes")
    private List<EducationLevel> highestDegreeTypes;

    /*
     * The highestDegreeTypesRequired property.
     */
    @JsonProperty(value = "highestDegreeTypesRequired")
    private Boolean highestDegreeTypesRequired;

    /*
     * Search for student canditates
     */
    @JsonProperty(value = "isCurrentStudent")
    private Boolean isCurrentStudent;

    /*
     * The isCurrentStudentRequired property.
     */
    @JsonProperty(value = "isCurrentStudentRequired")
    private Boolean isCurrentStudentRequired;

    /*
     * Search for canditates that graduated less than a year ago
     */
    @JsonProperty(value = "isRecentGraduate")
    private Boolean isRecentGraduate;

    /*
     * The isRecentGraduateRequired property.
     */
    @JsonProperty(value = "isRecentGraduateRequired")
    private Boolean isRecentGraduateRequired;

    /*
     * The educationWeight property.
     */
    @JsonProperty(value = "educationWeight")
    private Float educationWeight;

    /*
     * Search through resumes' raw text
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

    /*
     * The customData property.
     */
    @JsonProperty(value = "customData")
    private List<ResumeSearchParametersCustomData> customData;

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
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setIndices(List<String> indices) {
        this.indices = indices;
        return this;
    }

    /**
     * Get the jobDescription property: A random string that uniquely identify the resource.
     *
     * @return the jobDescription value.
     */
    public String getJobDescription() {
        return this.jobDescription;
    }

    /**
     * Set the jobDescription property: A random string that uniquely identify the resource.
     *
     * @param jobDescription the jobDescription value to set.
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
        return this;
    }

    /**
     * Get the resume property: A random string that uniquely identify the resource.
     *
     * @return the resume value.
     */
    public String getResume() {
        return this.resume;
    }

    /**
     * Set the resume property: A random string that uniquely identify the resource.
     *
     * @param resume the resume value to set.
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setResume(String resume) {
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
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setJobTitles(List<String> jobTitles) {
        this.jobTitles = jobTitles;
        return this;
    }

    /**
     * Get the jobTitlesCurrentOnly property: Search only through the canditate's current job.
     *
     * @return the jobTitlesCurrentOnly value.
     */
    public Boolean isJobTitlesCurrentOnly() {
        return this.jobTitlesCurrentOnly;
    }

    /**
     * Set the jobTitlesCurrentOnly property: Search only through the canditate's current job.
     *
     * @param jobTitlesCurrentOnly the jobTitlesCurrentOnly value to set.
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setJobTitlesCurrentOnly(Boolean jobTitlesCurrentOnly) {
        this.jobTitlesCurrentOnly = jobTitlesCurrentOnly;
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
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setJobTitlesRequired(Boolean jobTitlesRequired) {
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
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setJobTitlesWeight(Float jobTitlesWeight) {
        this.jobTitlesWeight = jobTitlesWeight;
        return this;
    }

    /**
     * Get the yearsExperienceMin property: Minimum years of total work experience.
     *
     * @return the yearsExperienceMin value.
     */
    public Integer getYearsExperienceMin() {
        return this.yearsExperienceMin;
    }

    /**
     * Set the yearsExperienceMin property: Minimum years of total work experience.
     *
     * @param yearsExperienceMin the yearsExperienceMin value to set.
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setYearsExperienceMin(Integer yearsExperienceMin) {
        this.yearsExperienceMin = yearsExperienceMin;
        return this;
    }

    /**
     * Get the yearsExperienceMax property: Maximum years of total work experience.
     *
     * @return the yearsExperienceMax value.
     */
    public Integer getYearsExperienceMax() {
        return this.yearsExperienceMax;
    }

    /**
     * Set the yearsExperienceMax property: Maximum years of total work experience.
     *
     * @param yearsExperienceMax the yearsExperienceMax value to set.
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setYearsExperienceMax(Integer yearsExperienceMax) {
        this.yearsExperienceMax = yearsExperienceMax;
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
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setYearsExperienceRequired(Boolean yearsExperienceRequired) {
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
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setYearsExperienceWeight(Float yearsExperienceWeight) {
        this.yearsExperienceWeight = yearsExperienceWeight;
        return this;
    }

    /**
     * Get the locations property: Search by location name or by coordinates.
     *
     * @return the locations value.
     */
    public List<ResumeSearchParametersLocation> getLocations() {
        return this.locations;
    }

    /**
     * Set the locations property: Search by location name or by coordinates.
     *
     * @param locations the locations value to set.
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setLocations(List<ResumeSearchParametersLocation> locations) {
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
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setLocationsWeight(Float locationsWeight) {
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
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setLocationsRequired(Boolean locationsRequired) {
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
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setSkills(List<ResumeSearchParametersSkill> skills) {
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
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setSkillsWeight(Float skillsWeight) {
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
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setLanguages(List<ResumeSearchParametersSkill> languages) {
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
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setLanguagesWeight(Float languagesWeight) {
        this.languagesWeight = languagesWeight;
        return this;
    }

    /**
     * Get the institutions property: The institutions property.
     *
     * @return the institutions value.
     */
    public List<String> getInstitutions() {
        return this.institutions;
    }

    /**
     * Set the institutions property: The institutions property.
     *
     * @param institutions the institutions value to set.
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setInstitutions(List<String> institutions) {
        this.institutions = institutions;
        return this;
    }

    /**
     * Get the institutionsRequired property: The institutionsRequired property.
     *
     * @return the institutionsRequired value.
     */
    public Boolean isInstitutionsRequired() {
        return this.institutionsRequired;
    }

    /**
     * Set the institutionsRequired property: The institutionsRequired property.
     *
     * @param institutionsRequired the institutionsRequired value to set.
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setInstitutionsRequired(Boolean institutionsRequired) {
        this.institutionsRequired = institutionsRequired;
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
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setDegrees(List<String> degrees) {
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
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setDegreesRequired(Boolean degreesRequired) {
        this.degreesRequired = degreesRequired;
        return this;
    }

    /**
     * Get the highestDegreeTypes property: The highestDegreeTypes property.
     *
     * @return the highestDegreeTypes value.
     */
    public List<EducationLevel> getHighestDegreeTypes() {
        return this.highestDegreeTypes;
    }

    /**
     * Set the highestDegreeTypes property: The highestDegreeTypes property.
     *
     * @param highestDegreeTypes the highestDegreeTypes value to set.
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setHighestDegreeTypes(List<EducationLevel> highestDegreeTypes) {
        this.highestDegreeTypes = highestDegreeTypes;
        return this;
    }

    /**
     * Get the highestDegreeTypesRequired property: The highestDegreeTypesRequired property.
     *
     * @return the highestDegreeTypesRequired value.
     */
    public Boolean isHighestDegreeTypesRequired() {
        return this.highestDegreeTypesRequired;
    }

    /**
     * Set the highestDegreeTypesRequired property: The highestDegreeTypesRequired property.
     *
     * @param highestDegreeTypesRequired the highestDegreeTypesRequired value to set.
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setHighestDegreeTypesRequired(Boolean highestDegreeTypesRequired) {
        this.highestDegreeTypesRequired = highestDegreeTypesRequired;
        return this;
    }

    /**
     * Get the isCurrentStudent property: Search for student canditates.
     *
     * @return the isCurrentStudent value.
     */
    public Boolean isCurrentStudent() {
        return this.isCurrentStudent;
    }

    /**
     * Set the isCurrentStudent property: Search for student canditates.
     *
     * @param isCurrentStudent the isCurrentStudent value to set.
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setIsCurrentStudent(Boolean isCurrentStudent) {
        this.isCurrentStudent = isCurrentStudent;
        return this;
    }

    /**
     * Get the isCurrentStudentRequired property: The isCurrentStudentRequired property.
     *
     * @return the isCurrentStudentRequired value.
     */
    public Boolean isCurrentStudentRequired() {
        return this.isCurrentStudentRequired;
    }

    /**
     * Set the isCurrentStudentRequired property: The isCurrentStudentRequired property.
     *
     * @param isCurrentStudentRequired the isCurrentStudentRequired value to set.
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setIsCurrentStudentRequired(Boolean isCurrentStudentRequired) {
        this.isCurrentStudentRequired = isCurrentStudentRequired;
        return this;
    }

    /**
     * Get the isRecentGraduate property: Search for canditates that graduated less than a year ago.
     *
     * @return the isRecentGraduate value.
     */
    public Boolean isRecentGraduate() {
        return this.isRecentGraduate;
    }

    /**
     * Set the isRecentGraduate property: Search for canditates that graduated less than a year ago.
     *
     * @param isRecentGraduate the isRecentGraduate value to set.
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setIsRecentGraduate(Boolean isRecentGraduate) {
        this.isRecentGraduate = isRecentGraduate;
        return this;
    }

    /**
     * Get the isRecentGraduateRequired property: The isRecentGraduateRequired property.
     *
     * @return the isRecentGraduateRequired value.
     */
    public Boolean isRecentGraduateRequired() {
        return this.isRecentGraduateRequired;
    }

    /**
     * Set the isRecentGraduateRequired property: The isRecentGraduateRequired property.
     *
     * @param isRecentGraduateRequired the isRecentGraduateRequired value to set.
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setIsRecentGraduateRequired(Boolean isRecentGraduateRequired) {
        this.isRecentGraduateRequired = isRecentGraduateRequired;
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
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setEducationWeight(Float educationWeight) {
        this.educationWeight = educationWeight;
        return this;
    }

    /**
     * Get the searchExpression property: Search through resumes' raw text.
     *
     * @return the searchExpression value.
     */
    public String getSearchExpression() {
        return this.searchExpression;
    }

    /**
     * Set the searchExpression property: Search through resumes' raw text.
     *
     * @param searchExpression the searchExpression value to set.
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setSearchExpression(String searchExpression) {
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
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setSearchExpressionRequired(Boolean searchExpressionRequired) {
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
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setSearchExpressionWeight(Float searchExpressionWeight) {
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
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setSocCodes(List<Integer> socCodes) {
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
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setSocCodesWeight(Float socCodesWeight) {
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
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setSocCodesRequired(Boolean socCodesRequired) {
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
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setManagementLevel(ManagementLevel managementLevel) {
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
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setManagementLevelRequired(Boolean managementLevelRequired) {
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
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setManagementLevelWeight(Float managementLevelWeight) {
        this.managementLevelWeight = managementLevelWeight;
        return this;
    }

    /**
     * Get the customData property: The customData property.
     *
     * @return the customData value.
     */
    public List<ResumeSearchParametersCustomData> getCustomData() {
        return this.customData;
    }

    /**
     * Set the customData property: The customData property.
     *
     * @param customData the customData value to set.
     * @return the ResumeSearchParameters object itself.
     */
    public ResumeSearchParameters setCustomData(List<ResumeSearchParametersCustomData> customData) {
        this.customData = customData;
        return this;
    }
}
