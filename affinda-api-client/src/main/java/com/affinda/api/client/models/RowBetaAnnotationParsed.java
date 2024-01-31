package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RowBetaAnnotationParsed model. */
@Fluent
public final class RowBetaAnnotationParsed {
    /*
     * The itemCodeBeta property.
     */
    @JsonProperty(value = "itemCodeBeta")
    private TextAnnotation itemCodeBeta;

    /*
     * The itemDateBeta property.
     */
    @JsonProperty(value = "itemDateBeta")
    private DateAnnotation itemDateBeta;

    /*
     * The itemDescriptionBeta property.
     */
    @JsonProperty(value = "itemDescriptionBeta")
    private TextAnnotation itemDescriptionBeta;

    /*
     * The itemUnitBeta property.
     */
    @JsonProperty(value = "itemUnitBeta")
    private TextAnnotation itemUnitBeta;

    /*
     * The itemUnitPriceBeta property.
     */
    @JsonProperty(value = "itemUnitPriceBeta")
    private FloatAnnotation itemUnitPriceBeta;

    /*
     * The itemQuantityBeta property.
     */
    @JsonProperty(value = "itemQuantityBeta")
    private FloatAnnotation itemQuantityBeta;

    /*
     * The itemDiscountBeta property.
     */
    @JsonProperty(value = "itemDiscountBeta")
    private TextAnnotation itemDiscountBeta;

    /*
     * The itemBaseTotalBeta property.
     */
    @JsonProperty(value = "itemBaseTotalBeta")
    private FloatAnnotation itemBaseTotalBeta;

    /*
     * The itemTaxRateBeta property.
     */
    @JsonProperty(value = "itemTaxRateBeta")
    private TextAnnotation itemTaxRateBeta;

    /*
     * The itemTaxTotalBeta property.
     */
    @JsonProperty(value = "itemTaxTotalBeta")
    private FloatAnnotation itemTaxTotalBeta;

    /*
     * The itemTotalBeta property.
     */
    @JsonProperty(value = "itemTotalBeta")
    private FloatAnnotation itemTotalBeta;

    /*
     * The itemOtherBeta property.
     */
    @JsonProperty(value = "itemOtherBeta")
    private TextAnnotation itemOtherBeta;

    /**
     * Get the itemCodeBeta property: The itemCodeBeta property.
     *
     * @return the itemCodeBeta value.
     */
    public TextAnnotation getItemCodeBeta() {
        return this.itemCodeBeta;
    }

    /**
     * Set the itemCodeBeta property: The itemCodeBeta property.
     *
     * @param itemCodeBeta the itemCodeBeta value to set.
     * @return the RowBetaAnnotationParsed object itself.
     */
    public RowBetaAnnotationParsed setItemCodeBeta(TextAnnotation itemCodeBeta) {
        this.itemCodeBeta = itemCodeBeta;
        return this;
    }

    /**
     * Get the itemDateBeta property: The itemDateBeta property.
     *
     * @return the itemDateBeta value.
     */
    public DateAnnotation getItemDateBeta() {
        return this.itemDateBeta;
    }

    /**
     * Set the itemDateBeta property: The itemDateBeta property.
     *
     * @param itemDateBeta the itemDateBeta value to set.
     * @return the RowBetaAnnotationParsed object itself.
     */
    public RowBetaAnnotationParsed setItemDateBeta(DateAnnotation itemDateBeta) {
        this.itemDateBeta = itemDateBeta;
        return this;
    }

    /**
     * Get the itemDescriptionBeta property: The itemDescriptionBeta property.
     *
     * @return the itemDescriptionBeta value.
     */
    public TextAnnotation getItemDescriptionBeta() {
        return this.itemDescriptionBeta;
    }

    /**
     * Set the itemDescriptionBeta property: The itemDescriptionBeta property.
     *
     * @param itemDescriptionBeta the itemDescriptionBeta value to set.
     * @return the RowBetaAnnotationParsed object itself.
     */
    public RowBetaAnnotationParsed setItemDescriptionBeta(TextAnnotation itemDescriptionBeta) {
        this.itemDescriptionBeta = itemDescriptionBeta;
        return this;
    }

    /**
     * Get the itemUnitBeta property: The itemUnitBeta property.
     *
     * @return the itemUnitBeta value.
     */
    public TextAnnotation getItemUnitBeta() {
        return this.itemUnitBeta;
    }

    /**
     * Set the itemUnitBeta property: The itemUnitBeta property.
     *
     * @param itemUnitBeta the itemUnitBeta value to set.
     * @return the RowBetaAnnotationParsed object itself.
     */
    public RowBetaAnnotationParsed setItemUnitBeta(TextAnnotation itemUnitBeta) {
        this.itemUnitBeta = itemUnitBeta;
        return this;
    }

    /**
     * Get the itemUnitPriceBeta property: The itemUnitPriceBeta property.
     *
     * @return the itemUnitPriceBeta value.
     */
    public FloatAnnotation getItemUnitPriceBeta() {
        return this.itemUnitPriceBeta;
    }

    /**
     * Set the itemUnitPriceBeta property: The itemUnitPriceBeta property.
     *
     * @param itemUnitPriceBeta the itemUnitPriceBeta value to set.
     * @return the RowBetaAnnotationParsed object itself.
     */
    public RowBetaAnnotationParsed setItemUnitPriceBeta(FloatAnnotation itemUnitPriceBeta) {
        this.itemUnitPriceBeta = itemUnitPriceBeta;
        return this;
    }

    /**
     * Get the itemQuantityBeta property: The itemQuantityBeta property.
     *
     * @return the itemQuantityBeta value.
     */
    public FloatAnnotation getItemQuantityBeta() {
        return this.itemQuantityBeta;
    }

    /**
     * Set the itemQuantityBeta property: The itemQuantityBeta property.
     *
     * @param itemQuantityBeta the itemQuantityBeta value to set.
     * @return the RowBetaAnnotationParsed object itself.
     */
    public RowBetaAnnotationParsed setItemQuantityBeta(FloatAnnotation itemQuantityBeta) {
        this.itemQuantityBeta = itemQuantityBeta;
        return this;
    }

    /**
     * Get the itemDiscountBeta property: The itemDiscountBeta property.
     *
     * @return the itemDiscountBeta value.
     */
    public TextAnnotation getItemDiscountBeta() {
        return this.itemDiscountBeta;
    }

    /**
     * Set the itemDiscountBeta property: The itemDiscountBeta property.
     *
     * @param itemDiscountBeta the itemDiscountBeta value to set.
     * @return the RowBetaAnnotationParsed object itself.
     */
    public RowBetaAnnotationParsed setItemDiscountBeta(TextAnnotation itemDiscountBeta) {
        this.itemDiscountBeta = itemDiscountBeta;
        return this;
    }

    /**
     * Get the itemBaseTotalBeta property: The itemBaseTotalBeta property.
     *
     * @return the itemBaseTotalBeta value.
     */
    public FloatAnnotation getItemBaseTotalBeta() {
        return this.itemBaseTotalBeta;
    }

    /**
     * Set the itemBaseTotalBeta property: The itemBaseTotalBeta property.
     *
     * @param itemBaseTotalBeta the itemBaseTotalBeta value to set.
     * @return the RowBetaAnnotationParsed object itself.
     */
    public RowBetaAnnotationParsed setItemBaseTotalBeta(FloatAnnotation itemBaseTotalBeta) {
        this.itemBaseTotalBeta = itemBaseTotalBeta;
        return this;
    }

    /**
     * Get the itemTaxRateBeta property: The itemTaxRateBeta property.
     *
     * @return the itemTaxRateBeta value.
     */
    public TextAnnotation getItemTaxRateBeta() {
        return this.itemTaxRateBeta;
    }

    /**
     * Set the itemTaxRateBeta property: The itemTaxRateBeta property.
     *
     * @param itemTaxRateBeta the itemTaxRateBeta value to set.
     * @return the RowBetaAnnotationParsed object itself.
     */
    public RowBetaAnnotationParsed setItemTaxRateBeta(TextAnnotation itemTaxRateBeta) {
        this.itemTaxRateBeta = itemTaxRateBeta;
        return this;
    }

    /**
     * Get the itemTaxTotalBeta property: The itemTaxTotalBeta property.
     *
     * @return the itemTaxTotalBeta value.
     */
    public FloatAnnotation getItemTaxTotalBeta() {
        return this.itemTaxTotalBeta;
    }

    /**
     * Set the itemTaxTotalBeta property: The itemTaxTotalBeta property.
     *
     * @param itemTaxTotalBeta the itemTaxTotalBeta value to set.
     * @return the RowBetaAnnotationParsed object itself.
     */
    public RowBetaAnnotationParsed setItemTaxTotalBeta(FloatAnnotation itemTaxTotalBeta) {
        this.itemTaxTotalBeta = itemTaxTotalBeta;
        return this;
    }

    /**
     * Get the itemTotalBeta property: The itemTotalBeta property.
     *
     * @return the itemTotalBeta value.
     */
    public FloatAnnotation getItemTotalBeta() {
        return this.itemTotalBeta;
    }

    /**
     * Set the itemTotalBeta property: The itemTotalBeta property.
     *
     * @param itemTotalBeta the itemTotalBeta value to set.
     * @return the RowBetaAnnotationParsed object itself.
     */
    public RowBetaAnnotationParsed setItemTotalBeta(FloatAnnotation itemTotalBeta) {
        this.itemTotalBeta = itemTotalBeta;
        return this;
    }

    /**
     * Get the itemOtherBeta property: The itemOtherBeta property.
     *
     * @return the itemOtherBeta value.
     */
    public TextAnnotation getItemOtherBeta() {
        return this.itemOtherBeta;
    }

    /**
     * Set the itemOtherBeta property: The itemOtherBeta property.
     *
     * @param itemOtherBeta the itemOtherBeta value to set.
     * @return the RowBetaAnnotationParsed object itself.
     */
    public RowBetaAnnotationParsed setItemOtherBeta(TextAnnotation itemOtherBeta) {
        this.itemOtherBeta = itemOtherBeta;
        return this;
    }
}
