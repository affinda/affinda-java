package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ResumeSearchDetailEducationMissing model. */
@Fluent
public final class ResumeSearchDetailEducationMissing {
    /*
     * The degrees property.
     */
    @JsonProperty(value = "degrees")
    private List<String> degrees;

    /*
     * The highestDegreeTypes property.
     */
    @JsonProperty(value = "highestDegreeTypes")
    private List<String> highestDegreeTypes;

    /*
     * The institutions property.
     */
    @JsonProperty(value = "institutions")
    private List<String> institutions;

    /*
     * The currentStudent property.
     */
    @JsonProperty(value = "currentStudent")
    private Boolean currentStudent;

    /*
     * The recentGraduate property.
     */
    @JsonProperty(value = "recentGraduate")
    private Boolean recentGraduate;

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
     * @return the ResumeSearchDetailEducationMissing object itself.
     */
    public ResumeSearchDetailEducationMissing setDegrees(List<String> degrees) {
        this.degrees = degrees;
        return this;
    }

    /**
     * Get the highestDegreeTypes property: The highestDegreeTypes property.
     *
     * @return the highestDegreeTypes value.
     */
    public List<String> getHighestDegreeTypes() {
        return this.highestDegreeTypes;
    }

    /**
     * Set the highestDegreeTypes property: The highestDegreeTypes property.
     *
     * @param highestDegreeTypes the highestDegreeTypes value to set.
     * @return the ResumeSearchDetailEducationMissing object itself.
     */
    public ResumeSearchDetailEducationMissing setHighestDegreeTypes(List<String> highestDegreeTypes) {
        this.highestDegreeTypes = highestDegreeTypes;
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
     * @return the ResumeSearchDetailEducationMissing object itself.
     */
    public ResumeSearchDetailEducationMissing setInstitutions(List<String> institutions) {
        this.institutions = institutions;
        return this;
    }

    /**
     * Get the currentStudent property: The currentStudent property.
     *
     * @return the currentStudent value.
     */
    public Boolean isCurrentStudent() {
        return this.currentStudent;
    }

    /**
     * Set the currentStudent property: The currentStudent property.
     *
     * @param currentStudent the currentStudent value to set.
     * @return the ResumeSearchDetailEducationMissing object itself.
     */
    public ResumeSearchDetailEducationMissing setCurrentStudent(Boolean currentStudent) {
        this.currentStudent = currentStudent;
        return this;
    }

    /**
     * Get the recentGraduate property: The recentGraduate property.
     *
     * @return the recentGraduate value.
     */
    public Boolean isRecentGraduate() {
        return this.recentGraduate;
    }

    /**
     * Set the recentGraduate property: The recentGraduate property.
     *
     * @param recentGraduate the recentGraduate value to set.
     * @return the ResumeSearchDetailEducationMissing object itself.
     */
    public ResumeSearchDetailEducationMissing setRecentGraduate(Boolean recentGraduate) {
        this.recentGraduate = recentGraduate;
        return this;
    }
}
