package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RowAnnotationParsed model. */
@Fluent
public final class RowAnnotationParsed {
    /*
     * The itemCode property.
     */
    @JsonProperty(value = "itemCode")
    private TextAnnotation itemCode;

    /*
     * The itemDate property.
     */
    @JsonProperty(value = "itemDate")
    private DateAnnotation itemDate;

    /*
     * The itemDescription property.
     */
    @JsonProperty(value = "itemDescription")
    private TextAnnotation itemDescription;

    /*
     * The itemUnit property.
     */
    @JsonProperty(value = "itemUnit")
    private TextAnnotation itemUnit;

    /*
     * The itemUnitPrice property.
     */
    @JsonProperty(value = "itemUnitPrice")
    private FloatAnnotation itemUnitPrice;

    /*
     * The itemQuantity property.
     */
    @JsonProperty(value = "itemQuantity")
    private FloatAnnotation itemQuantity;

    /*
     * The itemDiscount property.
     */
    @JsonProperty(value = "itemDiscount")
    private TextAnnotation itemDiscount;

    /*
     * The itemBaseTotal property.
     */
    @JsonProperty(value = "itemBaseTotal")
    private FloatAnnotation itemBaseTotal;

    /*
     * The itemTaxRate property.
     */
    @JsonProperty(value = "itemTaxRate")
    private TextAnnotation itemTaxRate;

    /*
     * The itemTaxTotal property.
     */
    @JsonProperty(value = "itemTaxTotal")
    private TextAnnotation itemTaxTotal;

    /*
     * The itemTotal property.
     */
    @JsonProperty(value = "itemTotal")
    private FloatAnnotation itemTotal;

    /*
     * The itemOther property.
     */
    @JsonProperty(value = "itemOther")
    private TextAnnotation itemOther;

    /**
     * Get the itemCode property: The itemCode property.
     *
     * @return the itemCode value.
     */
    public TextAnnotation getItemCode() {
        return this.itemCode;
    }

    /**
     * Set the itemCode property: The itemCode property.
     *
     * @param itemCode the itemCode value to set.
     * @return the RowAnnotationParsed object itself.
     */
    public RowAnnotationParsed setItemCode(TextAnnotation itemCode) {
        this.itemCode = itemCode;
        return this;
    }

    /**
     * Get the itemDate property: The itemDate property.
     *
     * @return the itemDate value.
     */
    public DateAnnotation getItemDate() {
        return this.itemDate;
    }

    /**
     * Set the itemDate property: The itemDate property.
     *
     * @param itemDate the itemDate value to set.
     * @return the RowAnnotationParsed object itself.
     */
    public RowAnnotationParsed setItemDate(DateAnnotation itemDate) {
        this.itemDate = itemDate;
        return this;
    }

    /**
     * Get the itemDescription property: The itemDescription property.
     *
     * @return the itemDescription value.
     */
    public TextAnnotation getItemDescription() {
        return this.itemDescription;
    }

    /**
     * Set the itemDescription property: The itemDescription property.
     *
     * @param itemDescription the itemDescription value to set.
     * @return the RowAnnotationParsed object itself.
     */
    public RowAnnotationParsed setItemDescription(TextAnnotation itemDescription) {
        this.itemDescription = itemDescription;
        return this;
    }

    /**
     * Get the itemUnit property: The itemUnit property.
     *
     * @return the itemUnit value.
     */
    public TextAnnotation getItemUnit() {
        return this.itemUnit;
    }

    /**
     * Set the itemUnit property: The itemUnit property.
     *
     * @param itemUnit the itemUnit value to set.
     * @return the RowAnnotationParsed object itself.
     */
    public RowAnnotationParsed setItemUnit(TextAnnotation itemUnit) {
        this.itemUnit = itemUnit;
        return this;
    }

    /**
     * Get the itemUnitPrice property: The itemUnitPrice property.
     *
     * @return the itemUnitPrice value.
     */
    public FloatAnnotation getItemUnitPrice() {
        return this.itemUnitPrice;
    }

    /**
     * Set the itemUnitPrice property: The itemUnitPrice property.
     *
     * @param itemUnitPrice the itemUnitPrice value to set.
     * @return the RowAnnotationParsed object itself.
     */
    public RowAnnotationParsed setItemUnitPrice(FloatAnnotation itemUnitPrice) {
        this.itemUnitPrice = itemUnitPrice;
        return this;
    }

    /**
     * Get the itemQuantity property: The itemQuantity property.
     *
     * @return the itemQuantity value.
     */
    public FloatAnnotation getItemQuantity() {
        return this.itemQuantity;
    }

    /**
     * Set the itemQuantity property: The itemQuantity property.
     *
     * @param itemQuantity the itemQuantity value to set.
     * @return the RowAnnotationParsed object itself.
     */
    public RowAnnotationParsed setItemQuantity(FloatAnnotation itemQuantity) {
        this.itemQuantity = itemQuantity;
        return this;
    }

    /**
     * Get the itemDiscount property: The itemDiscount property.
     *
     * @return the itemDiscount value.
     */
    public TextAnnotation getItemDiscount() {
        return this.itemDiscount;
    }

    /**
     * Set the itemDiscount property: The itemDiscount property.
     *
     * @param itemDiscount the itemDiscount value to set.
     * @return the RowAnnotationParsed object itself.
     */
    public RowAnnotationParsed setItemDiscount(TextAnnotation itemDiscount) {
        this.itemDiscount = itemDiscount;
        return this;
    }

    /**
     * Get the itemBaseTotal property: The itemBaseTotal property.
     *
     * @return the itemBaseTotal value.
     */
    public FloatAnnotation getItemBaseTotal() {
        return this.itemBaseTotal;
    }

    /**
     * Set the itemBaseTotal property: The itemBaseTotal property.
     *
     * @param itemBaseTotal the itemBaseTotal value to set.
     * @return the RowAnnotationParsed object itself.
     */
    public RowAnnotationParsed setItemBaseTotal(FloatAnnotation itemBaseTotal) {
        this.itemBaseTotal = itemBaseTotal;
        return this;
    }

    /**
     * Get the itemTaxRate property: The itemTaxRate property.
     *
     * @return the itemTaxRate value.
     */
    public TextAnnotation getItemTaxRate() {
        return this.itemTaxRate;
    }

    /**
     * Set the itemTaxRate property: The itemTaxRate property.
     *
     * @param itemTaxRate the itemTaxRate value to set.
     * @return the RowAnnotationParsed object itself.
     */
    public RowAnnotationParsed setItemTaxRate(TextAnnotation itemTaxRate) {
        this.itemTaxRate = itemTaxRate;
        return this;
    }

    /**
     * Get the itemTaxTotal property: The itemTaxTotal property.
     *
     * @return the itemTaxTotal value.
     */
    public TextAnnotation getItemTaxTotal() {
        return this.itemTaxTotal;
    }

    /**
     * Set the itemTaxTotal property: The itemTaxTotal property.
     *
     * @param itemTaxTotal the itemTaxTotal value to set.
     * @return the RowAnnotationParsed object itself.
     */
    public RowAnnotationParsed setItemTaxTotal(TextAnnotation itemTaxTotal) {
        this.itemTaxTotal = itemTaxTotal;
        return this;
    }

    /**
     * Get the itemTotal property: The itemTotal property.
     *
     * @return the itemTotal value.
     */
    public FloatAnnotation getItemTotal() {
        return this.itemTotal;
    }

    /**
     * Set the itemTotal property: The itemTotal property.
     *
     * @param itemTotal the itemTotal value to set.
     * @return the RowAnnotationParsed object itself.
     */
    public RowAnnotationParsed setItemTotal(FloatAnnotation itemTotal) {
        this.itemTotal = itemTotal;
        return this;
    }

    /**
     * Get the itemOther property: The itemOther property.
     *
     * @return the itemOther value.
     */
    public TextAnnotation getItemOther() {
        return this.itemOther;
    }

    /**
     * Set the itemOther property: The itemOther property.
     *
     * @param itemOther the itemOther value to set.
     * @return the RowAnnotationParsed object itself.
     */
    public RowAnnotationParsed setItemOther(TextAnnotation itemOther) {
        this.itemOther = itemOther;
        return this;
    }
}
