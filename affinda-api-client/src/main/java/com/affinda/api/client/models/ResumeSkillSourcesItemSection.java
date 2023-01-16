package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ResumeSkillSourcesItemSection. */
public final class ResumeSkillSourcesItemSection extends ExpandableStringEnum<ResumeSkillSourcesItemSection> {
    /** Static value Achievements for ResumeSkillSourcesItemSection. */
    public static final ResumeSkillSourcesItemSection ACHIEVEMENTS = fromString("Achievements");

    /** Static value AdditionalInformation for ResumeSkillSourcesItemSection. */
    public static final ResumeSkillSourcesItemSection ADDITIONAL_INFORMATION = fromString("AdditionalInformation");

    /** Static value Education for ResumeSkillSourcesItemSection. */
    public static final ResumeSkillSourcesItemSection EDUCATION = fromString("Education");

    /** Static value Extracurriculars for ResumeSkillSourcesItemSection. */
    public static final ResumeSkillSourcesItemSection EXTRACURRICULARS = fromString("Extracurriculars");

    /** Static value Organisations for ResumeSkillSourcesItemSection. */
    public static final ResumeSkillSourcesItemSection ORGANISATIONS = fromString("Organisations");

    /** Static value Other for ResumeSkillSourcesItemSection. */
    public static final ResumeSkillSourcesItemSection OTHER = fromString("Other");

    /** Static value PersonalDetails for ResumeSkillSourcesItemSection. */
    public static final ResumeSkillSourcesItemSection PERSONAL_DETAILS = fromString("PersonalDetails");

    /** Static value Projects for ResumeSkillSourcesItemSection. */
    public static final ResumeSkillSourcesItemSection PROJECTS = fromString("Projects");

    /** Static value Publications for ResumeSkillSourcesItemSection. */
    public static final ResumeSkillSourcesItemSection PUBLICATIONS = fromString("Publications");

    /** Static value Referees for ResumeSkillSourcesItemSection. */
    public static final ResumeSkillSourcesItemSection REFEREES = fromString("Referees");

    /** Static value Skills for ResumeSkillSourcesItemSection. */
    public static final ResumeSkillSourcesItemSection SKILLS = fromString("Skills");

    /** Static value Summary for ResumeSkillSourcesItemSection. */
    public static final ResumeSkillSourcesItemSection SUMMARY = fromString("Summary");

    /** Static value Training for ResumeSkillSourcesItemSection. */
    public static final ResumeSkillSourcesItemSection TRAINING = fromString("Training");

    /** Static value WorkExperience for ResumeSkillSourcesItemSection. */
    public static final ResumeSkillSourcesItemSection WORK_EXPERIENCE = fromString("WorkExperience");

    /** Static value NotPopulated for ResumeSkillSourcesItemSection. */
    public static final ResumeSkillSourcesItemSection NOT_POPULATED = fromString("NotPopulated");

    /** Static value Header for ResumeSkillSourcesItemSection. */
    public static final ResumeSkillSourcesItemSection HEADER = fromString("Header");

    /** Static value Footer for ResumeSkillSourcesItemSection. */
    public static final ResumeSkillSourcesItemSection FOOTER = fromString("Footer");

    /** Static value Skills/Interests/Languages for ResumeSkillSourcesItemSection. */
    public static final ResumeSkillSourcesItemSection SKILLS_INTERESTS_LANGUAGES =
            fromString("Skills/Interests/Languages");

    /** Static value Training/Certifications for ResumeSkillSourcesItemSection. */
    public static final ResumeSkillSourcesItemSection TRAINING_CERTIFICATIONS = fromString("Training/Certifications");

    /** Static value Extracurriculars/Leadership for ResumeSkillSourcesItemSection. */
    public static final ResumeSkillSourcesItemSection EXTRACURRICULARS_LEADERSHIP =
            fromString("Extracurriculars/Leadership");

    /**
     * Creates or finds a ResumeSkillSourcesItemSection from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResumeSkillSourcesItemSection.
     */
    @JsonCreator
    public static ResumeSkillSourcesItemSection fromString(String name) {
        return fromString(name, ResumeSkillSourcesItemSection.class);
    }

    /** @return known ResumeSkillSourcesItemSection values. */
    public static Collection<ResumeSkillSourcesItemSection> values() {
        return values(ResumeSkillSourcesItemSection.class);
    }
}
