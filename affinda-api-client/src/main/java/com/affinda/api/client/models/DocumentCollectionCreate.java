package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DocumentCollectionCreate model. */
@Fluent
public final class DocumentCollectionCreate {
    /*
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Uniquely identify a workspace.
     */
    @JsonProperty(value = "workspace", required = true)
    private String workspace;

    /*
     * Uniquely identify an extractor.
     */
    @JsonProperty(value = "extractor")
    private String extractor;

    /*
     * Not applicable, please leave empty.
     */
    @JsonProperty(value = "baseExtractor")
    private String baseExtractor;

    /*
     * The autoValidationThreshold property.
     */
    @JsonProperty(value = "autoValidationThreshold")
    private Float autoValidationThreshold;

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
     * The dateFormatPreference property.
     */
    @JsonProperty(value = "dateFormatPreference")
    private DateFormatPreference dateFormatPreference;

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
     * @return the DocumentCollectionCreate object itself.
     */
    public DocumentCollectionCreate setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the workspace property: Uniquely identify a workspace.
     *
     * @return the workspace value.
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * Set the workspace property: Uniquely identify a workspace.
     *
     * @param workspace the workspace value to set.
     * @return the DocumentCollectionCreate object itself.
     */
    public DocumentCollectionCreate setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * Get the extractor property: Uniquely identify an extractor.
     *
     * @return the extractor value.
     */
    public String getExtractor() {
        return this.extractor;
    }

    /**
     * Set the extractor property: Uniquely identify an extractor.
     *
     * @param extractor the extractor value to set.
     * @return the DocumentCollectionCreate object itself.
     */
    public DocumentCollectionCreate setExtractor(String extractor) {
        this.extractor = extractor;
        return this;
    }

    /**
     * Get the baseExtractor property: Not applicable, please leave empty.
     *
     * @return the baseExtractor value.
     */
    public String getBaseExtractor() {
        return this.baseExtractor;
    }

    /**
     * Set the baseExtractor property: Not applicable, please leave empty.
     *
     * @param baseExtractor the baseExtractor value to set.
     * @return the DocumentCollectionCreate object itself.
     */
    public DocumentCollectionCreate setBaseExtractor(String baseExtractor) {
        this.baseExtractor = baseExtractor;
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
     * @return the DocumentCollectionCreate object itself.
     */
    public DocumentCollectionCreate setAutoValidationThreshold(Float autoValidationThreshold) {
        this.autoValidationThreshold = autoValidationThreshold;
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
     * @return the DocumentCollectionCreate object itself.
     */
    public DocumentCollectionCreate setFields(List<FieldGroup> fields) {
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
     * @return the DocumentCollectionCreate object itself.
     */
    public DocumentCollectionCreate setFieldsLayout(FieldsLayout fieldsLayout) {
        this.fieldsLayout = fieldsLayout;
        return this;
    }

    /**
     * Get the dateFormatPreference property: The dateFormatPreference property.
     *
     * @return the dateFormatPreference value.
     */
    public DateFormatPreference getDateFormatPreference() {
        return this.dateFormatPreference;
    }

    /**
     * Set the dateFormatPreference property: The dateFormatPreference property.
     *
     * @param dateFormatPreference the dateFormatPreference value to set.
     * @return the DocumentCollectionCreate object itself.
     */
    public DocumentCollectionCreate setDateFormatPreference(DateFormatPreference dateFormatPreference) {
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
     * @return the DocumentCollectionCreate object itself.
     */
    public DocumentCollectionCreate setDateFormatFromDocument(Boolean dateFormatFromDocument) {
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
     * @return the DocumentCollectionCreate object itself.
     */
    public DocumentCollectionCreate setExtractorConfig(ExtractorConfig extractorConfig) {
        this.extractorConfig = extractorConfig;
        return this;
    }
}
