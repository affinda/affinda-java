package affinda.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The User model. */
@Fluent
public final class User {
    /*
     * The documentCount property.
     */
    @JsonProperty(value = "documentCount")
    private Integer documentCount;

    /*
     * The redactedDocumentCount property.
     */
    @JsonProperty(value = "redactedDocumentCount")
    private Integer redactedDocumentCount;

    /*
     * The reformattedResumeCount property.
     */
    @JsonProperty(value = "reformattedResumeCount")
    private Integer reformattedResumeCount;

    /*
     * The parsingCredits property.
     */
    @JsonProperty(value = "parsingCredits")
    private Integer parsingCredits;

    /*
     * The redactionCredits property.
     */
    @JsonProperty(value = "redactionCredits")
    private Integer redactionCredits;

    /*
     * The reformattingCredits property.
     */
    @JsonProperty(value = "reformattingCredits")
    private Integer reformattingCredits;

    /**
     * Get the documentCount property: The documentCount property.
     *
     * @return the documentCount value.
     */
    public Integer getDocumentCount() {
        return this.documentCount;
    }

    /**
     * Set the documentCount property: The documentCount property.
     *
     * @param documentCount the documentCount value to set.
     * @return the User object itself.
     */
    public User setDocumentCount(Integer documentCount) {
        this.documentCount = documentCount;
        return this;
    }

    /**
     * Get the redactedDocumentCount property: The redactedDocumentCount property.
     *
     * @return the redactedDocumentCount value.
     */
    public Integer getRedactedDocumentCount() {
        return this.redactedDocumentCount;
    }

    /**
     * Set the redactedDocumentCount property: The redactedDocumentCount property.
     *
     * @param redactedDocumentCount the redactedDocumentCount value to set.
     * @return the User object itself.
     */
    public User setRedactedDocumentCount(Integer redactedDocumentCount) {
        this.redactedDocumentCount = redactedDocumentCount;
        return this;
    }

    /**
     * Get the reformattedResumeCount property: The reformattedResumeCount property.
     *
     * @return the reformattedResumeCount value.
     */
    public Integer getReformattedResumeCount() {
        return this.reformattedResumeCount;
    }

    /**
     * Set the reformattedResumeCount property: The reformattedResumeCount property.
     *
     * @param reformattedResumeCount the reformattedResumeCount value to set.
     * @return the User object itself.
     */
    public User setReformattedResumeCount(Integer reformattedResumeCount) {
        this.reformattedResumeCount = reformattedResumeCount;
        return this;
    }

    /**
     * Get the parsingCredits property: The parsingCredits property.
     *
     * @return the parsingCredits value.
     */
    public Integer getParsingCredits() {
        return this.parsingCredits;
    }

    /**
     * Set the parsingCredits property: The parsingCredits property.
     *
     * @param parsingCredits the parsingCredits value to set.
     * @return the User object itself.
     */
    public User setParsingCredits(Integer parsingCredits) {
        this.parsingCredits = parsingCredits;
        return this;
    }

    /**
     * Get the redactionCredits property: The redactionCredits property.
     *
     * @return the redactionCredits value.
     */
    public Integer getRedactionCredits() {
        return this.redactionCredits;
    }

    /**
     * Set the redactionCredits property: The redactionCredits property.
     *
     * @param redactionCredits the redactionCredits value to set.
     * @return the User object itself.
     */
    public User setRedactionCredits(Integer redactionCredits) {
        this.redactionCredits = redactionCredits;
        return this;
    }

    /**
     * Get the reformattingCredits property: The reformattingCredits property.
     *
     * @return the reformattingCredits value.
     */
    public Integer getReformattingCredits() {
        return this.reformattingCredits;
    }

    /**
     * Set the reformattingCredits property: The reformattingCredits property.
     *
     * @param reformattingCredits the reformattingCredits value to set.
     * @return the User object itself.
     */
    public User setReformattingCredits(Integer reformattingCredits) {
        this.reformattingCredits = reformattingCredits;
        return this;
    }
}
