package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DocumentCollection model. */
@Fluent
public final class DocumentCollection {
    /*
     * Uniquely identify a collection.
     */
    @JsonProperty(value = "identifier", required = true)
    private String identifier;

    /*
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The workspace property.
     */
    @JsonProperty(value = "workspace")
    private DocumentCollectionWorkspace workspace;

    /*
     * The extractor property.
     */
    @JsonProperty(value = "extractor")
    private Extractor extractor;

    /*
     * The autoValidationThreshold property.
     */
    @JsonProperty(value = "autoValidationThreshold")
    private Float autoValidationThreshold;

    /*
     * The autoValidateIfValidationRulesPass property.
     */
    @JsonProperty(value = "autoValidateIfValidationRulesPass")
    private Boolean autoValidateIfValidationRulesPass;

    /*
     * The fields property.
     */
    @JsonProperty(value = "fields")
    private List<FieldGroup> fields;

    /*
     * The fieldsLayout property.
     */
    @JsonProperty(value = "fieldsLayout")
    private FieldsLayout fieldsLayout;

    /*
     * The fieldsConfigured property.
     */
    @JsonProperty(value = "fieldsConfigured")
    private Boolean fieldsConfigured;

    /*
     * The dateFormatPreference property.
     */
    @JsonProperty(value = "dateFormatPreference")
    private DocumentCollectionDateFormatPreference dateFormatPreference;

    /*
     * Predict the date format from any dates in the document that is not
     * ambiguous.
     */
    @JsonProperty(value = "dateFormatFromDocument")
    private Boolean dateFormatFromDocument;

    /*
     * Extra configurations specific to an extractor.
     */
    @JsonProperty(value = "extractorConfig")
    private ExtractorConfig extractorConfig;

    /*
     * Number of unvalidated documents in the collection.
     */
    @JsonProperty(value = "unvalidatedDocsCount")
    private Integer unvalidatedDocsCount;

    /*
     * Number of validated documents in the collection.
     */
    @JsonProperty(value = "confirmedDocsCount")
    private Integer confirmedDocsCount;

    /*
     * When you send email to this address, any document attached in the body
     * will be uploaded to this collection.
     */
    @JsonProperty(value = "ingestEmail")
    private String ingestEmail;

    /*
     * Whether a tailored extractor has been requested for this collection.
     */
    @JsonProperty(value = "tailoredExtractorRequested")
    private Boolean tailoredExtractorRequested;

    /*
     * Whether to allow OpenAI API to be used to assist in creating a model for
     * this collection.
     */
    @JsonProperty(value = "allowOpenai")
    private Boolean allowOpenai;

    /*
     * Whether this collection feeds documents into the extractor's training
     * queue. This setting can only be toggled for custom extractors.
     */
    @JsonProperty(value = "trainsExtractor")
    private Boolean trainsExtractor;

    /*
     * If True, users cannot validate documents with missing mandatory fields,
     * or failing validation rules.
     */
    @JsonProperty(value = "disableConfirmationIfValidationRulesFail")
    private Boolean disableConfirmationIfValidationRulesFail;

    /**
     * Get the identifier property: Uniquely identify a collection.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Uniquely identify a collection.
     *
     * @param identifier the identifier value to set.
     * @return the DocumentCollection object itself.
     */
    public DocumentCollection setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
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
     * @return the DocumentCollection object itself.
     */
    public DocumentCollection setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the workspace property: The workspace property.
     *
     * @return the workspace value.
     */
    public DocumentCollectionWorkspace getWorkspace() {
        return this.workspace;
    }

    /**
     * Set the workspace property: The workspace property.
     *
     * @param workspace the workspace value to set.
     * @return the DocumentCollection object itself.
     */
    public DocumentCollection setWorkspace(DocumentCollectionWorkspace workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * Get the extractor property: The extractor property.
     *
     * @return the extractor value.
     */
    public Extractor getExtractor() {
        return this.extractor;
    }

    /**
     * Set the extractor property: The extractor property.
     *
     * @param extractor the extractor value to set.
     * @return the DocumentCollection object itself.
     */
    public DocumentCollection setExtractor(Extractor extractor) {
        this.extractor = extractor;
        return this;
    }

    /**
     * Get the autoValidationThreshold property: The autoValidationThreshold property.
     *
     * @return the autoValidationThreshold value.
     */
    public Float getAutoValidationThreshold() {
        return this.autoValidationThreshold;
    }

    /**
     * Set the autoValidationThreshold property: The autoValidationThreshold property.
     *
     * @param autoValidationThreshold the autoValidationThreshold value to set.
     * @return the DocumentCollection object itself.
     */
    public DocumentCollection setAutoValidationThreshold(Float autoValidationThreshold) {
        this.autoValidationThreshold = autoValidationThreshold;
        return this;
    }

    /**
     * Get the autoValidateIfValidationRulesPass property: The autoValidateIfValidationRulesPass property.
     *
     * @return the autoValidateIfValidationRulesPass value.
     */
    public Boolean isAutoValidateIfValidationRulesPass() {
        return this.autoValidateIfValidationRulesPass;
    }

    /**
     * Set the autoValidateIfValidationRulesPass property: The autoValidateIfValidationRulesPass property.
     *
     * @param autoValidateIfValidationRulesPass the autoValidateIfValidationRulesPass value to set.
     * @return the DocumentCollection object itself.
     */
    public DocumentCollection setAutoValidateIfValidationRulesPass(Boolean autoValidateIfValidationRulesPass) {
        this.autoValidateIfValidationRulesPass = autoValidateIfValidationRulesPass;
        return this;
    }

    /**
     * Get the fields property: The fields property.
     *
     * @return the fields value.
     */
    public List<FieldGroup> getFields() {
        return this.fields;
    }

    /**
     * Set the fields property: The fields property.
     *
     * @param fields the fields value to set.
     * @return the DocumentCollection object itself.
     */
    public DocumentCollection setFields(List<FieldGroup> fields) {
        this.fields = fields;
        return this;
    }

    /**
     * Get the fieldsLayout property: The fieldsLayout property.
     *
     * @return the fieldsLayout value.
     */
    public FieldsLayout getFieldsLayout() {
        return this.fieldsLayout;
    }

    /**
     * Set the fieldsLayout property: The fieldsLayout property.
     *
     * @param fieldsLayout the fieldsLayout value to set.
     * @return the DocumentCollection object itself.
     */
    public DocumentCollection setFieldsLayout(FieldsLayout fieldsLayout) {
        this.fieldsLayout = fieldsLayout;
        return this;
    }

    /**
     * Get the fieldsConfigured property: The fieldsConfigured property.
     *
     * @return the fieldsConfigured value.
     */
    public Boolean isFieldsConfigured() {
        return this.fieldsConfigured;
    }

    /**
     * Set the fieldsConfigured property: The fieldsConfigured property.
     *
     * @param fieldsConfigured the fieldsConfigured value to set.
     * @return the DocumentCollection object itself.
     */
    public DocumentCollection setFieldsConfigured(Boolean fieldsConfigured) {
        this.fieldsConfigured = fieldsConfigured;
        return this;
    }

    /**
     * Get the dateFormatPreference property: The dateFormatPreference property.
     *
     * @return the dateFormatPreference value.
     */
    public DocumentCollectionDateFormatPreference getDateFormatPreference() {
        return this.dateFormatPreference;
    }

    /**
     * Set the dateFormatPreference property: The dateFormatPreference property.
     *
     * @param dateFormatPreference the dateFormatPreference value to set.
     * @return the DocumentCollection object itself.
     */
    public DocumentCollection setDateFormatPreference(DocumentCollectionDateFormatPreference dateFormatPreference) {
        this.dateFormatPreference = dateFormatPreference;
        return this;
    }

    /**
     * Get the dateFormatFromDocument property: Predict the date format from any dates in the document that is not
     * ambiguous.
     *
     * @return the dateFormatFromDocument value.
     */
    public Boolean isDateFormatFromDocument() {
        return this.dateFormatFromDocument;
    }

    /**
     * Set the dateFormatFromDocument property: Predict the date format from any dates in the document that is not
     * ambiguous.
     *
     * @param dateFormatFromDocument the dateFormatFromDocument value to set.
     * @return the DocumentCollection object itself.
     */
    public DocumentCollection setDateFormatFromDocument(Boolean dateFormatFromDocument) {
        this.dateFormatFromDocument = dateFormatFromDocument;
        return this;
    }

    /**
     * Get the extractorConfig property: Extra configurations specific to an extractor.
     *
     * @return the extractorConfig value.
     */
    public ExtractorConfig getExtractorConfig() {
        return this.extractorConfig;
    }

    /**
     * Set the extractorConfig property: Extra configurations specific to an extractor.
     *
     * @param extractorConfig the extractorConfig value to set.
     * @return the DocumentCollection object itself.
     */
    public DocumentCollection setExtractorConfig(ExtractorConfig extractorConfig) {
        this.extractorConfig = extractorConfig;
        return this;
    }

    /**
     * Get the unvalidatedDocsCount property: Number of unvalidated documents in the collection.
     *
     * @return the unvalidatedDocsCount value.
     */
    public Integer getUnvalidatedDocsCount() {
        return this.unvalidatedDocsCount;
    }

    /**
     * Set the unvalidatedDocsCount property: Number of unvalidated documents in the collection.
     *
     * @param unvalidatedDocsCount the unvalidatedDocsCount value to set.
     * @return the DocumentCollection object itself.
     */
    public DocumentCollection setUnvalidatedDocsCount(Integer unvalidatedDocsCount) {
        this.unvalidatedDocsCount = unvalidatedDocsCount;
        return this;
    }

    /**
     * Get the confirmedDocsCount property: Number of validated documents in the collection.
     *
     * @return the confirmedDocsCount value.
     */
    public Integer getConfirmedDocsCount() {
        return this.confirmedDocsCount;
    }

    /**
     * Set the confirmedDocsCount property: Number of validated documents in the collection.
     *
     * @param confirmedDocsCount the confirmedDocsCount value to set.
     * @return the DocumentCollection object itself.
     */
    public DocumentCollection setConfirmedDocsCount(Integer confirmedDocsCount) {
        this.confirmedDocsCount = confirmedDocsCount;
        return this;
    }

    /**
     * Get the ingestEmail property: When you send email to this address, any document attached in the body will be
     * uploaded to this collection.
     *
     * @return the ingestEmail value.
     */
    public String getIngestEmail() {
        return this.ingestEmail;
    }

    /**
     * Set the ingestEmail property: When you send email to this address, any document attached in the body will be
     * uploaded to this collection.
     *
     * @param ingestEmail the ingestEmail value to set.
     * @return the DocumentCollection object itself.
     */
    public DocumentCollection setIngestEmail(String ingestEmail) {
        this.ingestEmail = ingestEmail;
        return this;
    }

    /**
     * Get the tailoredExtractorRequested property: Whether a tailored extractor has been requested for this collection.
     *
     * @return the tailoredExtractorRequested value.
     */
    public Boolean isTailoredExtractorRequested() {
        return this.tailoredExtractorRequested;
    }

    /**
     * Set the tailoredExtractorRequested property: Whether a tailored extractor has been requested for this collection.
     *
     * @param tailoredExtractorRequested the tailoredExtractorRequested value to set.
     * @return the DocumentCollection object itself.
     */
    public DocumentCollection setTailoredExtractorRequested(Boolean tailoredExtractorRequested) {
        this.tailoredExtractorRequested = tailoredExtractorRequested;
        return this;
    }

    /**
     * Get the allowOpenai property: Whether to allow OpenAI API to be used to assist in creating a model for this
     * collection.
     *
     * @return the allowOpenai value.
     */
    public Boolean isAllowOpenai() {
        return this.allowOpenai;
    }

    /**
     * Set the allowOpenai property: Whether to allow OpenAI API to be used to assist in creating a model for this
     * collection.
     *
     * @param allowOpenai the allowOpenai value to set.
     * @return the DocumentCollection object itself.
     */
    public DocumentCollection setAllowOpenai(Boolean allowOpenai) {
        this.allowOpenai = allowOpenai;
        return this;
    }

    /**
     * Get the trainsExtractor property: Whether this collection feeds documents into the extractor's training queue.
     * This setting can only be toggled for custom extractors.
     *
     * @return the trainsExtractor value.
     */
    public Boolean isTrainsExtractor() {
        return this.trainsExtractor;
    }

    /**
     * Set the trainsExtractor property: Whether this collection feeds documents into the extractor's training queue.
     * This setting can only be toggled for custom extractors.
     *
     * @param trainsExtractor the trainsExtractor value to set.
     * @return the DocumentCollection object itself.
     */
    public DocumentCollection setTrainsExtractor(Boolean trainsExtractor) {
        this.trainsExtractor = trainsExtractor;
        return this;
    }

    /**
     * Get the disableConfirmationIfValidationRulesFail property: If True, users cannot validate documents with missing
     * mandatory fields, or failing validation rules.
     *
     * @return the disableConfirmationIfValidationRulesFail value.
     */
    public Boolean isDisableConfirmationIfValidationRulesFail() {
        return this.disableConfirmationIfValidationRulesFail;
    }

    /**
     * Set the disableConfirmationIfValidationRulesFail property: If True, users cannot validate documents with missing
     * mandatory fields, or failing validation rules.
     *
     * @param disableConfirmationIfValidationRulesFail the disableConfirmationIfValidationRulesFail value to set.
     * @return the DocumentCollection object itself.
     */
    public DocumentCollection setDisableConfirmationIfValidationRulesFail(
            Boolean disableConfirmationIfValidationRulesFail) {
        this.disableConfirmationIfValidationRulesFail = disableConfirmationIfValidationRulesFail;
        return this;
    }
}
