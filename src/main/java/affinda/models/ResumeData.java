package affinda.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.nio.ByteBuffer;
import java.util.List;
import reactor.core.publisher.Flux;

/** The ResumeData model. */
@Fluent
public final class ResumeData {
    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private ResumeDataName name;

    /*
     * The phoneNumbers property.
     */
    @JsonProperty(value = "phoneNumbers")
    private List<String> phoneNumbers;

    /*
     * The websites property.
     */
    @JsonProperty(value = "websites")
    private List<String> websites;

    /*
     * The emails property.
     */
    @JsonProperty(value = "emails")
    private List<String> emails;

    /*
     * The dateOfBirth property.
     */
    @JsonProperty(value = "dateOfBirth")
    private String dateOfBirth;

    /*
     * The location property.
     */
    @JsonProperty(value = "location")
    private Location location;

    /*
     * The objective property.
     */
    @JsonProperty(value = "objective")
    private String objective;

    /*
     * The languages property.
     */
    @JsonProperty(value = "languages")
    private List<String> languages;

    /*
     * The summary property.
     */
    @JsonProperty(value = "summary")
    private String summary;

    /*
     * The totalYearsExperience property.
     */
    @JsonProperty(value = "totalYearsExperience")
    private Integer totalYearsExperience;

    /*
     * base64 encoded string
     */
    @JsonProperty(value = "headShot")
    private Flux<ByteBuffer> headShot;

    /*
     * The education property.
     */
    @JsonProperty(value = "education")
    private List<ResumeDataEducationItem> education;

    /*
     * The workExperience property.
     */
    @JsonProperty(value = "workExperience")
    private List<ResumeDataWorkExperienceItem> workExperience;

    /*
     * The skills property.
     */
    @JsonProperty(value = "skills")
    private List<String> skills;

    /*
     * The skillsDetails property.
     */
    @JsonProperty(value = "skillsDetails")
    private List<ResumeDataSkillsDetailsItem> skillsDetails;

    /*
     * The certifications property.
     */
    @JsonProperty(value = "certifications")
    private List<String> certifications;

    /*
     * The publications property.
     */
    @JsonProperty(value = "publications")
    private List<String> publications;

    /*
     * The referees property.
     */
    @JsonProperty(value = "referees")
    private List<ResumeDataRefereesItem> referees;

    /*
     * The sections property.
     */
    @JsonProperty(value = "sections")
    private List<ResumeDataSectionsItem> sections;

    /*
     * Probability that the given document is a resume. Values below 30 suggest
     * that the resume is not a resume.
     */
    @JsonProperty(value = "isResumeProbability")
    private Integer isResumeProbability;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public ResumeDataName getName() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the ResumeData object itself.
     */
    public ResumeData setName(ResumeDataName name) {
        this.name = name;
        return this;
    }

    /**
     * Get the phoneNumbers property: The phoneNumbers property.
     *
     * @return the phoneNumbers value.
     */
    public List<String> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    /**
     * Set the phoneNumbers property: The phoneNumbers property.
     *
     * @param phoneNumbers the phoneNumbers value to set.
     * @return the ResumeData object itself.
     */
    public ResumeData setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    /**
     * Get the websites property: The websites property.
     *
     * @return the websites value.
     */
    public List<String> getWebsites() {
        return this.websites;
    }

    /**
     * Set the websites property: The websites property.
     *
     * @param websites the websites value to set.
     * @return the ResumeData object itself.
     */
    public ResumeData setWebsites(List<String> websites) {
        this.websites = websites;
        return this;
    }

    /**
     * Get the emails property: The emails property.
     *
     * @return the emails value.
     */
    public List<String> getEmails() {
        return this.emails;
    }

    /**
     * Set the emails property: The emails property.
     *
     * @param emails the emails value to set.
     * @return the ResumeData object itself.
     */
    public ResumeData setEmails(List<String> emails) {
        this.emails = emails;
        return this;
    }

    /**
     * Get the dateOfBirth property: The dateOfBirth property.
     *
     * @return the dateOfBirth value.
     */
    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    /**
     * Set the dateOfBirth property: The dateOfBirth property.
     *
     * @param dateOfBirth the dateOfBirth value to set.
     * @return the ResumeData object itself.
     */
    public ResumeData setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    /**
     * Get the location property: The location property.
     *
     * @return the location value.
     */
    public Location getLocation() {
        return this.location;
    }

    /**
     * Set the location property: The location property.
     *
     * @param location the location value to set.
     * @return the ResumeData object itself.
     */
    public ResumeData setLocation(Location location) {
        this.location = location;
        return this;
    }

    /**
     * Get the objective property: The objective property.
     *
     * @return the objective value.
     */
    public String getObjective() {
        return this.objective;
    }

    /**
     * Set the objective property: The objective property.
     *
     * @param objective the objective value to set.
     * @return the ResumeData object itself.
     */
    public ResumeData setObjective(String objective) {
        this.objective = objective;
        return this;
    }

    /**
     * Get the languages property: The languages property.
     *
     * @return the languages value.
     */
    public List<String> getLanguages() {
        return this.languages;
    }

    /**
     * Set the languages property: The languages property.
     *
     * @param languages the languages value to set.
     * @return the ResumeData object itself.
     */
    public ResumeData setLanguages(List<String> languages) {
        this.languages = languages;
        return this;
    }

    /**
     * Get the summary property: The summary property.
     *
     * @return the summary value.
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * Set the summary property: The summary property.
     *
     * @param summary the summary value to set.
     * @return the ResumeData object itself.
     */
    public ResumeData setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get the totalYearsExperience property: The totalYearsExperience property.
     *
     * @return the totalYearsExperience value.
     */
    public Integer getTotalYearsExperience() {
        return this.totalYearsExperience;
    }

    /**
     * Set the totalYearsExperience property: The totalYearsExperience property.
     *
     * @param totalYearsExperience the totalYearsExperience value to set.
     * @return the ResumeData object itself.
     */
    public ResumeData setTotalYearsExperience(Integer totalYearsExperience) {
        this.totalYearsExperience = totalYearsExperience;
        return this;
    }

    /**
     * Get the headShot property: base64 encoded string.
     *
     * @return the headShot value.
     */
    public Flux<ByteBuffer> getHeadShot() {
        return this.headShot;
    }

    /**
     * Set the headShot property: base64 encoded string.
     *
     * @param headShot the headShot value to set.
     * @return the ResumeData object itself.
     */
    public ResumeData setHeadShot(Flux<ByteBuffer> headShot) {
        this.headShot = headShot;
        return this;
    }

    /**
     * Get the education property: The education property.
     *
     * @return the education value.
     */
    public List<ResumeDataEducationItem> getEducation() {
        return this.education;
    }

    /**
     * Set the education property: The education property.
     *
     * @param education the education value to set.
     * @return the ResumeData object itself.
     */
    public ResumeData setEducation(List<ResumeDataEducationItem> education) {
        this.education = education;
        return this;
    }

    /**
     * Get the workExperience property: The workExperience property.
     *
     * @return the workExperience value.
     */
    public List<ResumeDataWorkExperienceItem> getWorkExperience() {
        return this.workExperience;
    }

    /**
     * Set the workExperience property: The workExperience property.
     *
     * @param workExperience the workExperience value to set.
     * @return the ResumeData object itself.
     */
    public ResumeData setWorkExperience(List<ResumeDataWorkExperienceItem> workExperience) {
        this.workExperience = workExperience;
        return this;
    }

    /**
     * Get the skills property: The skills property.
     *
     * @return the skills value.
     */
    public List<String> getSkills() {
        return this.skills;
    }

    /**
     * Set the skills property: The skills property.
     *
     * @param skills the skills value to set.
     * @return the ResumeData object itself.
     */
    public ResumeData setSkills(List<String> skills) {
        this.skills = skills;
        return this;
    }

    /**
     * Get the skillsDetails property: The skillsDetails property.
     *
     * @return the skillsDetails value.
     */
    public List<ResumeDataSkillsDetailsItem> getSkillsDetails() {
        return this.skillsDetails;
    }

    /**
     * Set the skillsDetails property: The skillsDetails property.
     *
     * @param skillsDetails the skillsDetails value to set.
     * @return the ResumeData object itself.
     */
    public ResumeData setSkillsDetails(List<ResumeDataSkillsDetailsItem> skillsDetails) {
        this.skillsDetails = skillsDetails;
        return this;
    }

    /**
     * Get the certifications property: The certifications property.
     *
     * @return the certifications value.
     */
    public List<String> getCertifications() {
        return this.certifications;
    }

    /**
     * Set the certifications property: The certifications property.
     *
     * @param certifications the certifications value to set.
     * @return the ResumeData object itself.
     */
    public ResumeData setCertifications(List<String> certifications) {
        this.certifications = certifications;
        return this;
    }

    /**
     * Get the publications property: The publications property.
     *
     * @return the publications value.
     */
    public List<String> getPublications() {
        return this.publications;
    }

    /**
     * Set the publications property: The publications property.
     *
     * @param publications the publications value to set.
     * @return the ResumeData object itself.
     */
    public ResumeData setPublications(List<String> publications) {
        this.publications = publications;
        return this;
    }

    /**
     * Get the referees property: The referees property.
     *
     * @return the referees value.
     */
    public List<ResumeDataRefereesItem> getReferees() {
        return this.referees;
    }

    /**
     * Set the referees property: The referees property.
     *
     * @param referees the referees value to set.
     * @return the ResumeData object itself.
     */
    public ResumeData setReferees(List<ResumeDataRefereesItem> referees) {
        this.referees = referees;
        return this;
    }

    /**
     * Get the sections property: The sections property.
     *
     * @return the sections value.
     */
    public List<ResumeDataSectionsItem> getSections() {
        return this.sections;
    }

    /**
     * Set the sections property: The sections property.
     *
     * @param sections the sections value to set.
     * @return the ResumeData object itself.
     */
    public ResumeData setSections(List<ResumeDataSectionsItem> sections) {
        this.sections = sections;
        return this;
    }

    /**
     * Get the isResumeProbability property: Probability that the given document is a resume. Values below 30 suggest
     * that the resume is not a resume.
     *
     * @return the isResumeProbability value.
     */
    public Integer getIsResumeProbability() {
        return this.isResumeProbability;
    }

    /**
     * Set the isResumeProbability property: Probability that the given document is a resume. Values below 30 suggest
     * that the resume is not a resume.
     *
     * @param isResumeProbability the isResumeProbability value to set.
     * @return the ResumeData object itself.
     */
    public ResumeData setIsResumeProbability(Integer isResumeProbability) {
        this.isResumeProbability = isResumeProbability;
        return this;
    }
}
