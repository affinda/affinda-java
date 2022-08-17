package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The RowAnnotation model. */
@Fluent
public final class RowAnnotation {
    /*
     * The code property.
     */
    @JsonProperty(value = "code")
    private String code;

    /*
     * The date property.
     */
    @JsonProperty(value = "date")
    private String date;

    /*
     * The description property.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The unit property.
     */
    @JsonProperty(value = "unit")
    private String unit;

    /*
     * The unitPrice property.
     */
    @JsonProperty(value = "unitPrice")
    private Float unitPrice;

    /*
     * The quantity property.
     */
    @JsonProperty(value = "quantity")
    private Float quantity;

    /*
     * The discount property.
     */
    @JsonProperty(value = "discount")
    private String discount;

    /*
     * The baseTotal property.
     */
    @JsonProperty(value = "baseTotal")
    private Float baseTotal;

    /*
     * The taxRate property.
     */
    @JsonProperty(value = "taxRate")
    private String taxRate;

    /*
     * The taxTotal property.
     */
    @JsonProperty(value = "taxTotal")
    private Float taxTotal;

    /*
     * The total property.
     */
    @JsonProperty(value = "total")
    private Float total;

    /*
     * The other property.
     */
    @JsonProperty(value = "other")
    private String other;

    /*
     * Dictionary of <any>
     */
    @JsonProperty(value = "customFields")
    private Map<String, Object> customFields;

    /**
     * Get the code property: The code property.
     *
     * @return the code value.
     */
    public String getCode() {
        return this.code;
    }

    /**
     * Set the code property: The code property.
     *
     * @param code the code value to set.
     * @return the RowAnnotation object itself.
     */
    public RowAnnotation setCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get the date property: The date property.
     *
     * @return the date value.
     */
    public String getDate() {
        return this.date;
    }

    /**
     * Set the date property: The date property.
     *
     * @param date the date value to set.
     * @return the RowAnnotation object itself.
     */
    public RowAnnotation setDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * Get the description property: The description property.
     *
     * @return the description value.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Set the description property: The description property.
     *
     * @param description the description value to set.
     * @return the RowAnnotation object itself.
     */
    public RowAnnotation setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the unit property: The unit property.
     *
     * @return the unit value.
     */
    public String getUnit() {
        return this.unit;
    }

    /**
     * Set the unit property: The unit property.
     *
     * @param unit the unit value to set.
     * @return the RowAnnotation object itself.
     */
    public RowAnnotation setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Get the unitPrice property: The unitPrice property.
     *
     * @return the unitPrice value.
     */
    public Float getUnitPrice() {
        return this.unitPrice;
    }

    /**
     * Set the unitPrice property: The unitPrice property.
     *
     * @param unitPrice the unitPrice value to set.
     * @return the RowAnnotation object itself.
     */
    public RowAnnotation setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    /**
     * Get the quantity property: The quantity property.
     *
     * @return the quantity value.
     */
    public Float getQuantity() {
        return this.quantity;
    }

    /**
     * Set the quantity property: The quantity property.
     *
     * @param quantity the quantity value to set.
     * @return the RowAnnotation object itself.
     */
    public RowAnnotation setQuantity(Float quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get the discount property: The discount property.
     *
     * @return the discount value.
     */
    public String getDiscount() {
        return this.discount;
    }

    /**
     * Set the discount property: The discount property.
     *
     * @param discount the discount value to set.
     * @return the RowAnnotation object itself.
     */
    public RowAnnotation setDiscount(String discount) {
        this.discount = discount;
        return this;
    }

    /**
     * Get the baseTotal property: The baseTotal property.
     *
     * @return the baseTotal value.
     */
    public Float getBaseTotal() {
        return this.baseTotal;
    }

    /**
     * Set the baseTotal property: The baseTotal property.
     *
     * @param baseTotal the baseTotal value to set.
     * @return the RowAnnotation object itself.
     */
    public RowAnnotation setBaseTotal(Float baseTotal) {
        this.baseTotal = baseTotal;
        return this;
    }

    /**
     * Get the taxRate property: The taxRate property.
     *
     * @return the taxRate value.
     */
    public String getTaxRate() {
        return this.taxRate;
    }

    /**
     * Set the taxRate property: The taxRate property.
     *
     * @param taxRate the taxRate value to set.
     * @return the RowAnnotation object itself.
     */
    public RowAnnotation setTaxRate(String taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     * Get the taxTotal property: The taxTotal property.
     *
     * @return the taxTotal value.
     */
    public Float getTaxTotal() {
        return this.taxTotal;
    }

    /**
     * Set the taxTotal property: The taxTotal property.
     *
     * @param taxTotal the taxTotal value to set.
     * @return the RowAnnotation object itself.
     */
    public RowAnnotation setTaxTotal(Float taxTotal) {
        this.taxTotal = taxTotal;
        return this;
    }

    /**
     * Get the total property: The total property.
     *
     * @return the total value.
     */
    public Float getTotal() {
        return this.total;
    }

    /**
     * Set the total property: The total property.
     *
     * @param total the total value to set.
     * @return the RowAnnotation object itself.
     */
    public RowAnnotation setTotal(Float total) {
        this.total = total;
        return this;
    }

    /**
     * Get the other property: The other property.
     *
     * @return the other value.
     */
    public String getOther() {
        return this.other;
    }

    /**
     * Set the other property: The other property.
     *
     * @param other the other value to set.
     * @return the RowAnnotation object itself.
     */
    public RowAnnotation setOther(String other) {
        this.other = other;
        return this;
    }

    /**
     * Get the customFields property: Dictionary of &lt;any&gt;.
     *
     * @return the customFields value.
     */
    public Map<String, Object> getCustomFields() {
        return this.customFields;
    }

    /**
     * Set the customFields property: Dictionary of &lt;any&gt;.
     *
     * @param customFields the customFields value to set.
     * @return the RowAnnotation object itself.
     */
    public RowAnnotation setCustomFields(Map<String, Object> customFields) {
        this.customFields = customFields;
        return this;
    }
}
