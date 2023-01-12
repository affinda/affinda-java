package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The WorkspaceCollectionsItemExtractor model. */
@Fluent
public final class WorkspaceCollectionsItemExtractor {
    /*
     * Extractor's ID.
     */
    @JsonProperty(value = "id", required = true)
    private int id;

    /*
     * The identifier property.
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
    private BaseExtractor baseExtractor;

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
     * The createdDt property.
     */
    @JsonProperty(value = "createdDt")
    private OffsetDateTime createdDt;

    /**
     * Get the id property: Extractor's ID.
     *
     * @return the id value.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Set the id property: Extractor's ID.
     *
     * @param id the id value to set.
     * @return the WorkspaceCollectionsItemExtractor object itself.
     */
    public WorkspaceCollectionsItemExtractor setId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Get the identifier property: The identifier property.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: The identifier property.
     *
     * @param identifier the identifier value to set.
     * @return the WorkspaceCollectionsItemExtractor object itself.
     */
    public WorkspaceCollectionsItemExtractor setIdentifier(String identifier) {
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
     * @return the WorkspaceCollectionsItemExtractor object itself.
     */
    public WorkspaceCollectionsItemExtractor setName(String name) {
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
     * @return the WorkspaceCollectionsItemExtractor object itself.
     */
    public WorkspaceCollectionsItemExtractor setNamePlural(String namePlural) {
        this.namePlural = namePlural;
        return this;
    }

    /**
     * Get the baseExtractor property: The baseExtractor property.
     *
     * @return the baseExtractor value.
     */
    public BaseExtractor getBaseExtractor() {
        return this.baseExtractor;
    }

    /**
     * Set the baseExtractor property: The baseExtractor property.
     *
     * @param baseExtractor the baseExtractor value to set.
     * @return the WorkspaceCollectionsItemExtractor object itself.
     */
    public WorkspaceCollectionsItemExtractor setBaseExtractor(BaseExtractor baseExtractor) {
        this.baseExtractor = baseExtractor;
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
     * @return the WorkspaceCollectionsItemExtractor object itself.
     */
    public WorkspaceCollectionsItemExtractor setCategory(String category) {
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
     * @return the WorkspaceCollectionsItemExtractor object itself.
     */
    public WorkspaceCollectionsItemExtractor setValidatable(boolean validatable) {
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
     * @return the WorkspaceCollectionsItemExtractor object itself.
     */
    public WorkspaceCollectionsItemExtractor setIsCustom(Boolean isCustom) {
        this.isCustom = isCustom;
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
     * @return the WorkspaceCollectionsItemExtractor object itself.
     */
    public WorkspaceCollectionsItemExtractor setCreatedDt(OffsetDateTime createdDt) {
        this.createdDt = createdDt;
        return this;
    }
}
