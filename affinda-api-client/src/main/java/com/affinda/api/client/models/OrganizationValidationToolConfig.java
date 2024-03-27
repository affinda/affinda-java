package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Configuration of the embeddable validation tool. */
@Fluent
public final class OrganizationValidationToolConfig {
    /*
     * The theme property.
     */
    @JsonProperty(value = "theme")
    private ThemeConfig theme;

    /*
     * Hide the confirm document button and other actions.
     */
    @JsonProperty(value = "hideActions")
    private Boolean hideActions;

    /*
     * Hide the collection selector.
     */
    @JsonProperty(value = "hideCollection")
    private Boolean hideCollection;

    /*
     * Hide the edit pages button.
     */
    @JsonProperty(value = "hideEditPages")
    private Boolean hideEditPages;

    /*
     * Hide the export menu.
     */
    @JsonProperty(value = "hideExport")
    private Boolean hideExport;

    /*
     * Hide the filename input.
     */
    @JsonProperty(value = "hideFilename")
    private Boolean hideFilename;

    /*
     * Hide the reject document button.
     */
    @JsonProperty(value = "hideReject")
    private Boolean hideReject;

    /*
     * Hide the reparse button.
     */
    @JsonProperty(value = "hideReparse")
    private Boolean hideReparse;

    /*
     * Hide the run OCR button.
     */
    @JsonProperty(value = "hideRunOcr")
    private Boolean hideRunOcr;

    /*
     * Hide the tags editor.
     */
    @JsonProperty(value = "hideTags")
    private Boolean hideTags;

    /*
     * Hide the warnings panel.
     */
    @JsonProperty(value = "hideWarnings")
    private Boolean hideWarnings;

    /*
     * Disable the page editor after a document has been split once.
     */
    @JsonProperty(value = "restrictDocumentSplitting")
    private Boolean restrictDocumentSplitting;

    /*
     * Disable currency formatting of decimals values.
     */
    @JsonProperty(value = "disableCurrencyFormatting")
    private Boolean disableCurrencyFormatting;

    /*
     * Disable editing document metadata. Makes the collection selector,
     * filename input and tags editor read only.
     */
    @JsonProperty(value = "disableEditDocumentMetadata")
    private Boolean disableEditDocumentMetadata;

    /**
     * Get the theme property: The theme property.
     *
     * @return the theme value.
     */
    public ThemeConfig getTheme() {
        return this.theme;
    }

    /**
     * Set the theme property: The theme property.
     *
     * @param theme the theme value to set.
     * @return the OrganizationValidationToolConfig object itself.
     */
    public OrganizationValidationToolConfig setTheme(ThemeConfig theme) {
        this.theme = theme;
        return this;
    }

    /**
     * Get the hideActions property: Hide the confirm document button and other actions.
     *
     * @return the hideActions value.
     */
    public Boolean isHideActions() {
        return this.hideActions;
    }

    /**
     * Set the hideActions property: Hide the confirm document button and other actions.
     *
     * @param hideActions the hideActions value to set.
     * @return the OrganizationValidationToolConfig object itself.
     */
    public OrganizationValidationToolConfig setHideActions(Boolean hideActions) {
        this.hideActions = hideActions;
        return this;
    }

    /**
     * Get the hideCollection property: Hide the collection selector.
     *
     * @return the hideCollection value.
     */
    public Boolean isHideCollection() {
        return this.hideCollection;
    }

    /**
     * Set the hideCollection property: Hide the collection selector.
     *
     * @param hideCollection the hideCollection value to set.
     * @return the OrganizationValidationToolConfig object itself.
     */
    public OrganizationValidationToolConfig setHideCollection(Boolean hideCollection) {
        this.hideCollection = hideCollection;
        return this;
    }

    /**
     * Get the hideEditPages property: Hide the edit pages button.
     *
     * @return the hideEditPages value.
     */
    public Boolean isHideEditPages() {
        return this.hideEditPages;
    }

    /**
     * Set the hideEditPages property: Hide the edit pages button.
     *
     * @param hideEditPages the hideEditPages value to set.
     * @return the OrganizationValidationToolConfig object itself.
     */
    public OrganizationValidationToolConfig setHideEditPages(Boolean hideEditPages) {
        this.hideEditPages = hideEditPages;
        return this;
    }

    /**
     * Get the hideExport property: Hide the export menu.
     *
     * @return the hideExport value.
     */
    public Boolean isHideExport() {
        return this.hideExport;
    }

    /**
     * Set the hideExport property: Hide the export menu.
     *
     * @param hideExport the hideExport value to set.
     * @return the OrganizationValidationToolConfig object itself.
     */
    public OrganizationValidationToolConfig setHideExport(Boolean hideExport) {
        this.hideExport = hideExport;
        return this;
    }

    /**
     * Get the hideFilename property: Hide the filename input.
     *
     * @return the hideFilename value.
     */
    public Boolean isHideFilename() {
        return this.hideFilename;
    }

    /**
     * Set the hideFilename property: Hide the filename input.
     *
     * @param hideFilename the hideFilename value to set.
     * @return the OrganizationValidationToolConfig object itself.
     */
    public OrganizationValidationToolConfig setHideFilename(Boolean hideFilename) {
        this.hideFilename = hideFilename;
        return this;
    }

    /**
     * Get the hideReject property: Hide the reject document button.
     *
     * @return the hideReject value.
     */
    public Boolean isHideReject() {
        return this.hideReject;
    }

    /**
     * Set the hideReject property: Hide the reject document button.
     *
     * @param hideReject the hideReject value to set.
     * @return the OrganizationValidationToolConfig object itself.
     */
    public OrganizationValidationToolConfig setHideReject(Boolean hideReject) {
        this.hideReject = hideReject;
        return this;
    }

    /**
     * Get the hideReparse property: Hide the reparse button.
     *
     * @return the hideReparse value.
     */
    public Boolean isHideReparse() {
        return this.hideReparse;
    }

    /**
     * Set the hideReparse property: Hide the reparse button.
     *
     * @param hideReparse the hideReparse value to set.
     * @return the OrganizationValidationToolConfig object itself.
     */
    public OrganizationValidationToolConfig setHideReparse(Boolean hideReparse) {
        this.hideReparse = hideReparse;
        return this;
    }

    /**
     * Get the hideRunOcr property: Hide the run OCR button.
     *
     * @return the hideRunOcr value.
     */
    public Boolean isHideRunOcr() {
        return this.hideRunOcr;
    }

    /**
     * Set the hideRunOcr property: Hide the run OCR button.
     *
     * @param hideRunOcr the hideRunOcr value to set.
     * @return the OrganizationValidationToolConfig object itself.
     */
    public OrganizationValidationToolConfig setHideRunOcr(Boolean hideRunOcr) {
        this.hideRunOcr = hideRunOcr;
        return this;
    }

    /**
     * Get the hideTags property: Hide the tags editor.
     *
     * @return the hideTags value.
     */
    public Boolean isHideTags() {
        return this.hideTags;
    }

    /**
     * Set the hideTags property: Hide the tags editor.
     *
     * @param hideTags the hideTags value to set.
     * @return the OrganizationValidationToolConfig object itself.
     */
    public OrganizationValidationToolConfig setHideTags(Boolean hideTags) {
        this.hideTags = hideTags;
        return this;
    }

    /**
     * Get the hideWarnings property: Hide the warnings panel.
     *
     * @return the hideWarnings value.
     */
    public Boolean isHideWarnings() {
        return this.hideWarnings;
    }

    /**
     * Set the hideWarnings property: Hide the warnings panel.
     *
     * @param hideWarnings the hideWarnings value to set.
     * @return the OrganizationValidationToolConfig object itself.
     */
    public OrganizationValidationToolConfig setHideWarnings(Boolean hideWarnings) {
        this.hideWarnings = hideWarnings;
        return this;
    }

    /**
     * Get the restrictDocumentSplitting property: Disable the page editor after a document has been split once.
     *
     * @return the restrictDocumentSplitting value.
     */
    public Boolean isRestrictDocumentSplitting() {
        return this.restrictDocumentSplitting;
    }

    /**
     * Set the restrictDocumentSplitting property: Disable the page editor after a document has been split once.
     *
     * @param restrictDocumentSplitting the restrictDocumentSplitting value to set.
     * @return the OrganizationValidationToolConfig object itself.
     */
    public OrganizationValidationToolConfig setRestrictDocumentSplitting(Boolean restrictDocumentSplitting) {
        this.restrictDocumentSplitting = restrictDocumentSplitting;
        return this;
    }

    /**
     * Get the disableCurrencyFormatting property: Disable currency formatting of decimals values.
     *
     * @return the disableCurrencyFormatting value.
     */
    public Boolean isDisableCurrencyFormatting() {
        return this.disableCurrencyFormatting;
    }

    /**
     * Set the disableCurrencyFormatting property: Disable currency formatting of decimals values.
     *
     * @param disableCurrencyFormatting the disableCurrencyFormatting value to set.
     * @return the OrganizationValidationToolConfig object itself.
     */
    public OrganizationValidationToolConfig setDisableCurrencyFormatting(Boolean disableCurrencyFormatting) {
        this.disableCurrencyFormatting = disableCurrencyFormatting;
        return this;
    }

    /**
     * Get the disableEditDocumentMetadata property: Disable editing document metadata. Makes the collection selector,
     * filename input and tags editor read only.
     *
     * @return the disableEditDocumentMetadata value.
     */
    public Boolean isDisableEditDocumentMetadata() {
        return this.disableEditDocumentMetadata;
    }

    /**
     * Set the disableEditDocumentMetadata property: Disable editing document metadata. Makes the collection selector,
     * filename input and tags editor read only.
     *
     * @param disableEditDocumentMetadata the disableEditDocumentMetadata value to set.
     * @return the OrganizationValidationToolConfig object itself.
     */
    public OrganizationValidationToolConfig setDisableEditDocumentMetadata(Boolean disableEditDocumentMetadata) {
        this.disableEditDocumentMetadata = disableEditDocumentMetadata;
        return this;
    }
}
