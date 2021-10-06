package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The InvoiceData model. */
@Fluent
public final class InvoiceData {
    /*
     * The invoiceDate property.
     */
    @JsonProperty(value = "invoiceDate")
    private String invoiceDate;

    /*
     * The invoiceOrderDate property.
     */
    @JsonProperty(value = "invoiceOrderDate")
    private String invoiceOrderDate;

    /*
     * The paymentDateDue property.
     */
    @JsonProperty(value = "paymentDateDue")
    private String paymentDateDue;

    /*
     * The paymentAmountBase property.
     */
    @JsonProperty(value = "paymentAmountBase")
    private String paymentAmountBase;

    /*
     * The paymentAmountTax property.
     */
    @JsonProperty(value = "paymentAmountTax")
    private String paymentAmountTax;

    /*
     * The paymentAmountTotal property.
     */
    @JsonProperty(value = "paymentAmountTotal")
    private String paymentAmountTotal;

    /*
     * The paymentAmountPaid property.
     */
    @JsonProperty(value = "paymentAmountPaid")
    private String paymentAmountPaid;

    /*
     * The paymentAmountDue property.
     */
    @JsonProperty(value = "paymentAmountDue")
    private String paymentAmountDue;

    /*
     * The invoiceNumber property.
     */
    @JsonProperty(value = "invoiceNumber")
    private String invoiceNumber;

    /*
     * The invoicePurchaseOrderNumber property.
     */
    @JsonProperty(value = "invoicePurchaseOrderNumber")
    private String invoicePurchaseOrderNumber;

    /*
     * The supplierBusinessNumber property.
     */
    @JsonProperty(value = "supplierBusinessNumber")
    private String supplierBusinessNumber;

    /*
     * The customerNumber property.
     */
    @JsonProperty(value = "customerNumber")
    private String customerNumber;

    /*
     * The customerBusinessNumber property.
     */
    @JsonProperty(value = "customerBusinessNumber")
    private String customerBusinessNumber;

    /*
     * The paymentReference property.
     */
    @JsonProperty(value = "paymentReference")
    private String paymentReference;

    /*
     * The bankAccountNumber property.
     */
    @JsonProperty(value = "bankAccountNumber")
    private String bankAccountNumber;

    /*
     * The supplierVAT property.
     */
    @JsonProperty(value = "supplierVAT")
    private String supplierVAT;

    /*
     * The customerVAT property.
     */
    @JsonProperty(value = "customerVAT")
    private String customerVAT;

    /*
     * The bpayBillerCode property.
     */
    @JsonProperty(value = "bpayBillerCode")
    private String bpayBillerCode;

    /*
     * The bpayReference property.
     */
    @JsonProperty(value = "bpayReference")
    private String bpayReference;

    /*
     * The bankSortCode property.
     */
    @JsonProperty(value = "bankSortCode")
    private String bankSortCode;

    /*
     * The bankIBAN property.
     */
    @JsonProperty(value = "bankIBAN")
    private String bankIban;

    /*
     * The bankSwift property.
     */
    @JsonProperty(value = "bankSwift")
    private String bankSwift;

    /*
     * The bankBSB property.
     */
    @JsonProperty(value = "bankBSB")
    private String bankBSB;

    /*
     * The customerContactName property.
     */
    @JsonProperty(value = "customerContactName")
    private String customerContactName;

    /*
     * The customerCompanyName property.
     */
    @JsonProperty(value = "customerCompanyName")
    private String customerCompanyName;

    /*
     * The supplierCompanyName property.
     */
    @JsonProperty(value = "supplierCompanyName")
    private String supplierCompanyName;

    /*
     * The customerBillingAddress property.
     */
    @JsonProperty(value = "customerBillingAddress")
    private Location customerBillingAddress;

    /*
     * The customerDeliveryAddress property.
     */
    @JsonProperty(value = "customerDeliveryAddress")
    private Location customerDeliveryAddress;

    /*
     * The supplierAddress property.
     */
    @JsonProperty(value = "supplierAddress")
    private Location supplierAddress;

    /*
     * The customerPhoneNumber property.
     */
    @JsonProperty(value = "customerPhoneNumber")
    private String customerPhoneNumber;

    /*
     * The supplierPhoneNumber property.
     */
    @JsonProperty(value = "supplierPhoneNumber")
    private String supplierPhoneNumber;

    /*
     * The supplierFax property.
     */
    @JsonProperty(value = "supplierFax")
    private String supplierFax;

    /*
     * The customerEmail property.
     */
    @JsonProperty(value = "customerEmail")
    private String customerEmail;

    /*
     * The supplierEmail property.
     */
    @JsonProperty(value = "supplierEmail")
    private String supplierEmail;

    /*
     * The supplierWebsite property.
     */
    @JsonProperty(value = "supplierWebsite")
    private String supplierWebsite;

    /**
     * Get the invoiceDate property: The invoiceDate property.
     *
     * @return the invoiceDate value.
     */
    public String getInvoiceDate() {
        return this.invoiceDate;
    }

    /**
     * Set the invoiceDate property: The invoiceDate property.
     *
     * @param invoiceDate the invoiceDate value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }

    /**
     * Get the invoiceOrderDate property: The invoiceOrderDate property.
     *
     * @return the invoiceOrderDate value.
     */
    public String getInvoiceOrderDate() {
        return this.invoiceOrderDate;
    }

    /**
     * Set the invoiceOrderDate property: The invoiceOrderDate property.
     *
     * @param invoiceOrderDate the invoiceOrderDate value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setInvoiceOrderDate(String invoiceOrderDate) {
        this.invoiceOrderDate = invoiceOrderDate;
        return this;
    }

    /**
     * Get the paymentDateDue property: The paymentDateDue property.
     *
     * @return the paymentDateDue value.
     */
    public String getPaymentDateDue() {
        return this.paymentDateDue;
    }

    /**
     * Set the paymentDateDue property: The paymentDateDue property.
     *
     * @param paymentDateDue the paymentDateDue value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setPaymentDateDue(String paymentDateDue) {
        this.paymentDateDue = paymentDateDue;
        return this;
    }

    /**
     * Get the paymentAmountBase property: The paymentAmountBase property.
     *
     * @return the paymentAmountBase value.
     */
    public String getPaymentAmountBase() {
        return this.paymentAmountBase;
    }

    /**
     * Set the paymentAmountBase property: The paymentAmountBase property.
     *
     * @param paymentAmountBase the paymentAmountBase value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setPaymentAmountBase(String paymentAmountBase) {
        this.paymentAmountBase = paymentAmountBase;
        return this;
    }

    /**
     * Get the paymentAmountTax property: The paymentAmountTax property.
     *
     * @return the paymentAmountTax value.
     */
    public String getPaymentAmountTax() {
        return this.paymentAmountTax;
    }

    /**
     * Set the paymentAmountTax property: The paymentAmountTax property.
     *
     * @param paymentAmountTax the paymentAmountTax value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setPaymentAmountTax(String paymentAmountTax) {
        this.paymentAmountTax = paymentAmountTax;
        return this;
    }

    /**
     * Get the paymentAmountTotal property: The paymentAmountTotal property.
     *
     * @return the paymentAmountTotal value.
     */
    public String getPaymentAmountTotal() {
        return this.paymentAmountTotal;
    }

    /**
     * Set the paymentAmountTotal property: The paymentAmountTotal property.
     *
     * @param paymentAmountTotal the paymentAmountTotal value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setPaymentAmountTotal(String paymentAmountTotal) {
        this.paymentAmountTotal = paymentAmountTotal;
        return this;
    }

    /**
     * Get the paymentAmountPaid property: The paymentAmountPaid property.
     *
     * @return the paymentAmountPaid value.
     */
    public String getPaymentAmountPaid() {
        return this.paymentAmountPaid;
    }

    /**
     * Set the paymentAmountPaid property: The paymentAmountPaid property.
     *
     * @param paymentAmountPaid the paymentAmountPaid value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setPaymentAmountPaid(String paymentAmountPaid) {
        this.paymentAmountPaid = paymentAmountPaid;
        return this;
    }

    /**
     * Get the paymentAmountDue property: The paymentAmountDue property.
     *
     * @return the paymentAmountDue value.
     */
    public String getPaymentAmountDue() {
        return this.paymentAmountDue;
    }

    /**
     * Set the paymentAmountDue property: The paymentAmountDue property.
     *
     * @param paymentAmountDue the paymentAmountDue value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setPaymentAmountDue(String paymentAmountDue) {
        this.paymentAmountDue = paymentAmountDue;
        return this;
    }

    /**
     * Get the invoiceNumber property: The invoiceNumber property.
     *
     * @return the invoiceNumber value.
     */
    public String getInvoiceNumber() {
        return this.invoiceNumber;
    }

    /**
     * Set the invoiceNumber property: The invoiceNumber property.
     *
     * @param invoiceNumber the invoiceNumber value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    /**
     * Get the invoicePurchaseOrderNumber property: The invoicePurchaseOrderNumber property.
     *
     * @return the invoicePurchaseOrderNumber value.
     */
    public String getInvoicePurchaseOrderNumber() {
        return this.invoicePurchaseOrderNumber;
    }

    /**
     * Set the invoicePurchaseOrderNumber property: The invoicePurchaseOrderNumber property.
     *
     * @param invoicePurchaseOrderNumber the invoicePurchaseOrderNumber value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setInvoicePurchaseOrderNumber(String invoicePurchaseOrderNumber) {
        this.invoicePurchaseOrderNumber = invoicePurchaseOrderNumber;
        return this;
    }

    /**
     * Get the supplierBusinessNumber property: The supplierBusinessNumber property.
     *
     * @return the supplierBusinessNumber value.
     */
    public String getSupplierBusinessNumber() {
        return this.supplierBusinessNumber;
    }

    /**
     * Set the supplierBusinessNumber property: The supplierBusinessNumber property.
     *
     * @param supplierBusinessNumber the supplierBusinessNumber value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setSupplierBusinessNumber(String supplierBusinessNumber) {
        this.supplierBusinessNumber = supplierBusinessNumber;
        return this;
    }

    /**
     * Get the customerNumber property: The customerNumber property.
     *
     * @return the customerNumber value.
     */
    public String getCustomerNumber() {
        return this.customerNumber;
    }

    /**
     * Set the customerNumber property: The customerNumber property.
     *
     * @param customerNumber the customerNumber value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    /**
     * Get the customerBusinessNumber property: The customerBusinessNumber property.
     *
     * @return the customerBusinessNumber value.
     */
    public String getCustomerBusinessNumber() {
        return this.customerBusinessNumber;
    }

    /**
     * Set the customerBusinessNumber property: The customerBusinessNumber property.
     *
     * @param customerBusinessNumber the customerBusinessNumber value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setCustomerBusinessNumber(String customerBusinessNumber) {
        this.customerBusinessNumber = customerBusinessNumber;
        return this;
    }

    /**
     * Get the paymentReference property: The paymentReference property.
     *
     * @return the paymentReference value.
     */
    public String getPaymentReference() {
        return this.paymentReference;
    }

    /**
     * Set the paymentReference property: The paymentReference property.
     *
     * @param paymentReference the paymentReference value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setPaymentReference(String paymentReference) {
        this.paymentReference = paymentReference;
        return this;
    }

    /**
     * Get the bankAccountNumber property: The bankAccountNumber property.
     *
     * @return the bankAccountNumber value.
     */
    public String getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    /**
     * Set the bankAccountNumber property: The bankAccountNumber property.
     *
     * @param bankAccountNumber the bankAccountNumber value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
        return this;
    }

    /**
     * Get the supplierVAT property: The supplierVAT property.
     *
     * @return the supplierVAT value.
     */
    public String getSupplierVAT() {
        return this.supplierVAT;
    }

    /**
     * Set the supplierVAT property: The supplierVAT property.
     *
     * @param supplierVAT the supplierVAT value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setSupplierVAT(String supplierVAT) {
        this.supplierVAT = supplierVAT;
        return this;
    }

    /**
     * Get the customerVAT property: The customerVAT property.
     *
     * @return the customerVAT value.
     */
    public String getCustomerVAT() {
        return this.customerVAT;
    }

    /**
     * Set the customerVAT property: The customerVAT property.
     *
     * @param customerVAT the customerVAT value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setCustomerVAT(String customerVAT) {
        this.customerVAT = customerVAT;
        return this;
    }

    /**
     * Get the bpayBillerCode property: The bpayBillerCode property.
     *
     * @return the bpayBillerCode value.
     */
    public String getBpayBillerCode() {
        return this.bpayBillerCode;
    }

    /**
     * Set the bpayBillerCode property: The bpayBillerCode property.
     *
     * @param bpayBillerCode the bpayBillerCode value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setBpayBillerCode(String bpayBillerCode) {
        this.bpayBillerCode = bpayBillerCode;
        return this;
    }

    /**
     * Get the bpayReference property: The bpayReference property.
     *
     * @return the bpayReference value.
     */
    public String getBpayReference() {
        return this.bpayReference;
    }

    /**
     * Set the bpayReference property: The bpayReference property.
     *
     * @param bpayReference the bpayReference value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setBpayReference(String bpayReference) {
        this.bpayReference = bpayReference;
        return this;
    }

    /**
     * Get the bankSortCode property: The bankSortCode property.
     *
     * @return the bankSortCode value.
     */
    public String getBankSortCode() {
        return this.bankSortCode;
    }

    /**
     * Set the bankSortCode property: The bankSortCode property.
     *
     * @param bankSortCode the bankSortCode value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setBankSortCode(String bankSortCode) {
        this.bankSortCode = bankSortCode;
        return this;
    }

    /**
     * Get the bankIban property: The bankIBAN property.
     *
     * @return the bankIban value.
     */
    public String getBankIban() {
        return this.bankIban;
    }

    /**
     * Set the bankIban property: The bankIBAN property.
     *
     * @param bankIban the bankIban value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setBankIban(String bankIban) {
        this.bankIban = bankIban;
        return this;
    }

    /**
     * Get the bankSwift property: The bankSwift property.
     *
     * @return the bankSwift value.
     */
    public String getBankSwift() {
        return this.bankSwift;
    }

    /**
     * Set the bankSwift property: The bankSwift property.
     *
     * @param bankSwift the bankSwift value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setBankSwift(String bankSwift) {
        this.bankSwift = bankSwift;
        return this;
    }

    /**
     * Get the bankBSB property: The bankBSB property.
     *
     * @return the bankBSB value.
     */
    public String getBankBSB() {
        return this.bankBSB;
    }

    /**
     * Set the bankBSB property: The bankBSB property.
     *
     * @param bankBSB the bankBSB value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setBankBSB(String bankBSB) {
        this.bankBSB = bankBSB;
        return this;
    }

    /**
     * Get the customerContactName property: The customerContactName property.
     *
     * @return the customerContactName value.
     */
    public String getCustomerContactName() {
        return this.customerContactName;
    }

    /**
     * Set the customerContactName property: The customerContactName property.
     *
     * @param customerContactName the customerContactName value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setCustomerContactName(String customerContactName) {
        this.customerContactName = customerContactName;
        return this;
    }

    /**
     * Get the customerCompanyName property: The customerCompanyName property.
     *
     * @return the customerCompanyName value.
     */
    public String getCustomerCompanyName() {
        return this.customerCompanyName;
    }

    /**
     * Set the customerCompanyName property: The customerCompanyName property.
     *
     * @param customerCompanyName the customerCompanyName value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setCustomerCompanyName(String customerCompanyName) {
        this.customerCompanyName = customerCompanyName;
        return this;
    }

    /**
     * Get the supplierCompanyName property: The supplierCompanyName property.
     *
     * @return the supplierCompanyName value.
     */
    public String getSupplierCompanyName() {
        return this.supplierCompanyName;
    }

    /**
     * Set the supplierCompanyName property: The supplierCompanyName property.
     *
     * @param supplierCompanyName the supplierCompanyName value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setSupplierCompanyName(String supplierCompanyName) {
        this.supplierCompanyName = supplierCompanyName;
        return this;
    }

    /**
     * Get the customerBillingAddress property: The customerBillingAddress property.
     *
     * @return the customerBillingAddress value.
     */
    public Location getCustomerBillingAddress() {
        return this.customerBillingAddress;
    }

    /**
     * Set the customerBillingAddress property: The customerBillingAddress property.
     *
     * @param customerBillingAddress the customerBillingAddress value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setCustomerBillingAddress(Location customerBillingAddress) {
        this.customerBillingAddress = customerBillingAddress;
        return this;
    }

    /**
     * Get the customerDeliveryAddress property: The customerDeliveryAddress property.
     *
     * @return the customerDeliveryAddress value.
     */
    public Location getCustomerDeliveryAddress() {
        return this.customerDeliveryAddress;
    }

    /**
     * Set the customerDeliveryAddress property: The customerDeliveryAddress property.
     *
     * @param customerDeliveryAddress the customerDeliveryAddress value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setCustomerDeliveryAddress(Location customerDeliveryAddress) {
        this.customerDeliveryAddress = customerDeliveryAddress;
        return this;
    }

    /**
     * Get the supplierAddress property: The supplierAddress property.
     *
     * @return the supplierAddress value.
     */
    public Location getSupplierAddress() {
        return this.supplierAddress;
    }

    /**
     * Set the supplierAddress property: The supplierAddress property.
     *
     * @param supplierAddress the supplierAddress value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setSupplierAddress(Location supplierAddress) {
        this.supplierAddress = supplierAddress;
        return this;
    }

    /**
     * Get the customerPhoneNumber property: The customerPhoneNumber property.
     *
     * @return the customerPhoneNumber value.
     */
    public String getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }

    /**
     * Set the customerPhoneNumber property: The customerPhoneNumber property.
     *
     * @param customerPhoneNumber the customerPhoneNumber value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
        return this;
    }

    /**
     * Get the supplierPhoneNumber property: The supplierPhoneNumber property.
     *
     * @return the supplierPhoneNumber value.
     */
    public String getSupplierPhoneNumber() {
        return this.supplierPhoneNumber;
    }

    /**
     * Set the supplierPhoneNumber property: The supplierPhoneNumber property.
     *
     * @param supplierPhoneNumber the supplierPhoneNumber value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setSupplierPhoneNumber(String supplierPhoneNumber) {
        this.supplierPhoneNumber = supplierPhoneNumber;
        return this;
    }

    /**
     * Get the supplierFax property: The supplierFax property.
     *
     * @return the supplierFax value.
     */
    public String getSupplierFax() {
        return this.supplierFax;
    }

    /**
     * Set the supplierFax property: The supplierFax property.
     *
     * @param supplierFax the supplierFax value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setSupplierFax(String supplierFax) {
        this.supplierFax = supplierFax;
        return this;
    }

    /**
     * Get the customerEmail property: The customerEmail property.
     *
     * @return the customerEmail value.
     */
    public String getCustomerEmail() {
        return this.customerEmail;
    }

    /**
     * Set the customerEmail property: The customerEmail property.
     *
     * @param customerEmail the customerEmail value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    /**
     * Get the supplierEmail property: The supplierEmail property.
     *
     * @return the supplierEmail value.
     */
    public String getSupplierEmail() {
        return this.supplierEmail;
    }

    /**
     * Set the supplierEmail property: The supplierEmail property.
     *
     * @param supplierEmail the supplierEmail value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setSupplierEmail(String supplierEmail) {
        this.supplierEmail = supplierEmail;
        return this;
    }

    /**
     * Get the supplierWebsite property: The supplierWebsite property.
     *
     * @return the supplierWebsite value.
     */
    public String getSupplierWebsite() {
        return this.supplierWebsite;
    }

    /**
     * Set the supplierWebsite property: The supplierWebsite property.
     *
     * @param supplierWebsite the supplierWebsite value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setSupplierWebsite(String supplierWebsite) {
        this.supplierWebsite = supplierWebsite;
        return this;
    }
}
