package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The Extractor model. */
@Fluent
public final class Extractor {
    /*
     * Uniquely identify an extractor.
     */
    @JsonProperty(value = "identifier", required = true)
    private String identifier;

    /*
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The namePlural property.
     */
    @JsonProperty(value = "namePlural", required = true)
    private String namePlural;

    /*
     * The baseExtractor property.
     */
    @JsonProperty(value = "baseExtractor")
    private ExtractorBaseExtractor baseExtractor;

    /*
     * The organization property.
     */
    @JsonProperty(value = "organization")
    private Organization organization;

    /*
     * The category property.
     */
    @JsonProperty(value = "category")
    private String category;

    /*
     * The validatable property.
     */
    @JsonProperty(value = "validatable", required = true)
    private boolean validatable;

    /*
     * The isCustom property.
     */
    @JsonProperty(value = "isCustom")
    private Boolean isCustom;

    /*
     * The fieldGroups property.
     */
    @JsonProperty(value = "fieldGroups")
    private List<FieldGroup> fieldGroups;

    /*
     * The createdDt property.
     */
    @JsonProperty(value = "createdDt")
    private OffsetDateTime createdDt;

    /*
     * The lastTrainedDt property.
     */
    @JsonProperty(value = "lastTrainedDt")
    private OffsetDateTime lastTrainedDt;

    /**
     * Get the identifier property: Uniquely identify an extractor.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Uniquely identify an extractor.
     *
     * @param identifier the identifier value to set.
     * @return the Extractor object itself.
     */
    public Extractor setIdentifier(String identifier) {
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
     * @return the Extractor object itself.
     */
    public Extractor setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the namePlural property: The namePlural property.
     *
     * @return the namePlural value.
     */
    public String getNamePlural() {
        return this.namePlural;
    }

    /**
     * Set the namePlural property: The namePlural property.
     *
     * @param namePlural the namePlural value to set.
     * @return the Extractor object itself.
     */
    public Extractor setNamePlural(String namePlural) {
        this.namePlural = namePlural;
        return this;
    }

    /**
     * Get the baseExtractor property: The baseExtractor property.
     *
     * @return the baseExtractor value.
     */
    public ExtractorBaseExtractor getBaseExtractor() {
        return this.baseExtractor;
    }

    /**
     * Set the baseExtractor property: The baseExtractor property.
     *
     * @param baseExtractor the baseExtractor value to set.
     * @return the Extractor object itself.
     */
    public Extractor setBaseExtractor(ExtractorBaseExtractor baseExtractor) {
        this.baseExtractor = baseExtractor;
        return this;
    }

    /**
     * Get the organization property: The organization property.
     *
     * @return the organization value.
     */
    public Organization getOrganization() {
        return this.organization;
    }

    /**
     * Set the organization property: The organization property.
     *
     * @param organization the organization value to set.
     * @return the Extractor object itself.
     */
    public Extractor setOrganization(Organization organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get the category property: The category property.
     *
     * @return the category value.
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * Set the category property: The category property.
     *
     * @param category the category value to set.
     * @return the Extractor object itself.
     */
    public Extractor setCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * Get the validatable property: The validatable property.
     *
     * @return the validatable value.
     */
    public boolean isValidatable() {
        return this.validatable;
    }

    /**
     * Set the validatable property: The validatable property.
     *
     * @param validatable the validatable value to set.
     * @return the Extractor object itself.
     */
    public Extractor setValidatable(boolean validatable) {
        this.validatable = validatable;
        return this;
    }

    /**
     * Get the isCustom property: The isCustom property.
     *
     * @return the isCustom value.
     */
    public Boolean isCustom() {
        return this.isCustom;
    }

    /**
     * Set the isCustom property: The isCustom property.
     *
     * @param isCustom the isCustom value to set.
     * @return the Extractor object itself.
     */
    public Extractor setIsCustom(Boolean isCustom) {
        this.isCustom = isCustom;
        return this;
    }

    /**
     * Get the fieldGroups property: The fieldGroups property.
     *
     * @return the fieldGroups value.
     */
    public List<FieldGroup> getFieldGroups() {
        return this.fieldGroups;
    }

    /**
     * Set the fieldGroups property: The fieldGroups property.
     *
     * @param fieldGroups the fieldGroups value to set.
     * @return the Extractor object itself.
     */
    public Extractor setFieldGroups(List<FieldGroup> fieldGroups) {
        this.fieldGroups = fieldGroups;
        return this;
    }

    /**
     * Get the createdDt property: The createdDt property.
     *
     * @return the createdDt value.
     */
    public OffsetDateTime getCreatedDt() {
        return this.createdDt;
    }

    /**
     * Set the createdDt property: The createdDt property.
     *
     * @param createdDt the createdDt value to set.
     * @return the Extractor object itself.
     */
    public Extractor setCreatedDt(OffsetDateTime createdDt) {
        this.createdDt = createdDt;
        return this;
    }

    /**
     * Get the lastTrainedDt property: The lastTrainedDt property.
     *
     * @return the lastTrainedDt value.
     */
    public OffsetDateTime getLastTrainedDt() {
        return this.lastTrainedDt;
    }

    /**
     * Set the lastTrainedDt property: The lastTrainedDt property.
     *
     * @param lastTrainedDt the lastTrainedDt value to set.
     * @return the Extractor object itself.
     */
    public Extractor setLastTrainedDt(OffsetDateTime lastTrainedDt) {
        this.lastTrainedDt = lastTrainedDt;
        return this;
    }
}
