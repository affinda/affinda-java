package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The InvoiceData model. */
@Fluent
public final class InvoiceData {
    /*
     * The tables property.
     */
    @JsonProperty(value = "tables")
    private List<TableAnnotation> tables;

    /*
     * The invoiceDate property.
     */
    @JsonProperty(value = "invoiceDate")
    private DateAnnotation invoiceDate;

    /*
     * The invoiceOrderDate property.
     */
    @JsonProperty(value = "invoiceOrderDate")
    private DateAnnotation invoiceOrderDate;

    /*
     * The paymentDateDue property.
     */
    @JsonProperty(value = "paymentDateDue")
    private DateAnnotation paymentDateDue;

    /*
     * The paymentAmountBase property.
     */
    @JsonProperty(value = "paymentAmountBase")
    private InvoiceDataPaymentAmountBase paymentAmountBase;

    /*
     * The paymentAmountTax property.
     */
    @JsonProperty(value = "paymentAmountTax")
    private InvoiceDataPaymentAmountTax paymentAmountTax;

    /*
     * The paymentAmountTotal property.
     */
    @JsonProperty(value = "paymentAmountTotal")
    private InvoiceDataPaymentAmountTotal paymentAmountTotal;

    /*
     * The paymentAmountPaid property.
     */
    @JsonProperty(value = "paymentAmountPaid")
    private InvoiceDataPaymentAmountPaid paymentAmountPaid;

    /*
     * The paymentAmountDue property.
     */
    @JsonProperty(value = "paymentAmountDue")
    private InvoiceDataPaymentAmountDue paymentAmountDue;

    /*
     * The invoiceNumber property.
     */
    @JsonProperty(value = "invoiceNumber")
    private InvoiceDataInvoiceNumber invoiceNumber;

    /*
     * The invoicePurchaseOrderNumber property.
     */
    @JsonProperty(value = "invoicePurchaseOrderNumber")
    private InvoiceDataInvoicePurchaseOrderNumber invoicePurchaseOrderNumber;

    /*
     * The supplierBusinessNumber property.
     */
    @JsonProperty(value = "supplierBusinessNumber")
    private InvoiceDataSupplierBusinessNumber supplierBusinessNumber;

    /*
     * The customerNumber property.
     */
    @JsonProperty(value = "customerNumber")
    private InvoiceDataCustomerNumber customerNumber;

    /*
     * The customerBusinessNumber property.
     */
    @JsonProperty(value = "customerBusinessNumber")
    private InvoiceDataCustomerBusinessNumber customerBusinessNumber;

    /*
     * The paymentReference property.
     */
    @JsonProperty(value = "paymentReference")
    private InvoiceDataPaymentReference paymentReference;

    /*
     * The bankAccountNumber property.
     */
    @JsonProperty(value = "bankAccountNumber")
    private InvoiceDataBankAccountNumber bankAccountNumber;

    /*
     * The supplierVat property.
     */
    @JsonProperty(value = "supplierVat")
    private InvoiceDataSupplierVat supplierVat;

    /*
     * The customerVat property.
     */
    @JsonProperty(value = "customerVat")
    private InvoiceDataCustomerVat customerVat;

    /*
     * The bpayBillerCode property.
     */
    @JsonProperty(value = "bpayBillerCode")
    private InvoiceDataBpayBillerCode bpayBillerCode;

    /*
     * The bpayReference property.
     */
    @JsonProperty(value = "bpayReference")
    private InvoiceDataBpayReference bpayReference;

    /*
     * The bankSortCode property.
     */
    @JsonProperty(value = "bankSortCode")
    private InvoiceDataBankSortCode bankSortCode;

    /*
     * The bankIban property.
     */
    @JsonProperty(value = "bankIban")
    private InvoiceDataBankIban bankIban;

    /*
     * The bankSwift property.
     */
    @JsonProperty(value = "bankSwift")
    private InvoiceDataBankSwift bankSwift;

    /*
     * The bankBsb property.
     */
    @JsonProperty(value = "bankBsb")
    private InvoiceDataBankBsb bankBsb;

    /*
     * The customerContactName property.
     */
    @JsonProperty(value = "customerContactName")
    private InvoiceDataCustomerContactName customerContactName;

    /*
     * The customerCompanyName property.
     */
    @JsonProperty(value = "customerCompanyName")
    private InvoiceDataCustomerCompanyName customerCompanyName;

    /*
     * The supplierCompanyName property.
     */
    @JsonProperty(value = "supplierCompanyName")
    private InvoiceDataSupplierCompanyName supplierCompanyName;

    /*
     * The customerBillingAddress property.
     */
    @JsonProperty(value = "customerBillingAddress")
    private LocationAnnotation customerBillingAddress;

    /*
     * The customerDeliveryAddress property.
     */
    @JsonProperty(value = "customerDeliveryAddress")
    private LocationAnnotation customerDeliveryAddress;

    /*
     * The supplierAddress property.
     */
    @JsonProperty(value = "supplierAddress")
    private LocationAnnotation supplierAddress;

    /*
     * The customerPhoneNumber property.
     */
    @JsonProperty(value = "customerPhoneNumber")
    private InvoiceDataCustomerPhoneNumber customerPhoneNumber;

    /*
     * The supplierPhoneNumber property.
     */
    @JsonProperty(value = "supplierPhoneNumber")
    private InvoiceDataSupplierPhoneNumber supplierPhoneNumber;

    /*
     * The supplierFax property.
     */
    @JsonProperty(value = "supplierFax")
    private InvoiceDataSupplierFax supplierFax;

    /*
     * The customerEmail property.
     */
    @JsonProperty(value = "customerEmail")
    private InvoiceDataCustomerEmail customerEmail;

    /*
     * The supplierEmail property.
     */
    @JsonProperty(value = "supplierEmail")
    private InvoiceDataSupplierEmail supplierEmail;

    /*
     * The supplierWebsite property.
     */
    @JsonProperty(value = "supplierWebsite")
    private InvoiceDataSupplierWebsite supplierWebsite;

    /*
     * The currencyCode property.
     */
    @JsonProperty(value = "currencyCode")
    private CurrencyCodeAnnotation currencyCode;

    /*
     * Dictionary of <any>
     */
    @JsonProperty(value = "customFields")
    private Map<String, Object> customFields;

    /**
     * Get the tables property: The tables property.
     *
     * @return the tables value.
     */
    public List<TableAnnotation> getTables() {
        return this.tables;
    }

    /**
     * Set the tables property: The tables property.
     *
     * @param tables the tables value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setTables(List<TableAnnotation> tables) {
        this.tables = tables;
        return this;
    }

    /**
     * Get the invoiceDate property: The invoiceDate property.
     *
     * @return the invoiceDate value.
     */
    public DateAnnotation getInvoiceDate() {
        return this.invoiceDate;
    }

    /**
     * Set the invoiceDate property: The invoiceDate property.
     *
     * @param invoiceDate the invoiceDate value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setInvoiceDate(DateAnnotation invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }

    /**
     * Get the invoiceOrderDate property: The invoiceOrderDate property.
     *
     * @return the invoiceOrderDate value.
     */
    public DateAnnotation getInvoiceOrderDate() {
        return this.invoiceOrderDate;
    }

    /**
     * Set the invoiceOrderDate property: The invoiceOrderDate property.
     *
     * @param invoiceOrderDate the invoiceOrderDate value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setInvoiceOrderDate(DateAnnotation invoiceOrderDate) {
        this.invoiceOrderDate = invoiceOrderDate;
        return this;
    }

    /**
     * Get the paymentDateDue property: The paymentDateDue property.
     *
     * @return the paymentDateDue value.
     */
    public DateAnnotation getPaymentDateDue() {
        return this.paymentDateDue;
    }

    /**
     * Set the paymentDateDue property: The paymentDateDue property.
     *
     * @param paymentDateDue the paymentDateDue value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setPaymentDateDue(DateAnnotation paymentDateDue) {
        this.paymentDateDue = paymentDateDue;
        return this;
    }

    /**
     * Get the paymentAmountBase property: The paymentAmountBase property.
     *
     * @return the paymentAmountBase value.
     */
    public InvoiceDataPaymentAmountBase getPaymentAmountBase() {
        return this.paymentAmountBase;
    }

    /**
     * Set the paymentAmountBase property: The paymentAmountBase property.
     *
     * @param paymentAmountBase the paymentAmountBase value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setPaymentAmountBase(InvoiceDataPaymentAmountBase paymentAmountBase) {
        this.paymentAmountBase = paymentAmountBase;
        return this;
    }

    /**
     * Get the paymentAmountTax property: The paymentAmountTax property.
     *
     * @return the paymentAmountTax value.
     */
    public InvoiceDataPaymentAmountTax getPaymentAmountTax() {
        return this.paymentAmountTax;
    }

    /**
     * Set the paymentAmountTax property: The paymentAmountTax property.
     *
     * @param paymentAmountTax the paymentAmountTax value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setPaymentAmountTax(InvoiceDataPaymentAmountTax paymentAmountTax) {
        this.paymentAmountTax = paymentAmountTax;
        return this;
    }

    /**
     * Get the paymentAmountTotal property: The paymentAmountTotal property.
     *
     * @return the paymentAmountTotal value.
     */
    public InvoiceDataPaymentAmountTotal getPaymentAmountTotal() {
        return this.paymentAmountTotal;
    }

    /**
     * Set the paymentAmountTotal property: The paymentAmountTotal property.
     *
     * @param paymentAmountTotal the paymentAmountTotal value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setPaymentAmountTotal(InvoiceDataPaymentAmountTotal paymentAmountTotal) {
        this.paymentAmountTotal = paymentAmountTotal;
        return this;
    }

    /**
     * Get the paymentAmountPaid property: The paymentAmountPaid property.
     *
     * @return the paymentAmountPaid value.
     */
    public InvoiceDataPaymentAmountPaid getPaymentAmountPaid() {
        return this.paymentAmountPaid;
    }

    /**
     * Set the paymentAmountPaid property: The paymentAmountPaid property.
     *
     * @param paymentAmountPaid the paymentAmountPaid value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setPaymentAmountPaid(InvoiceDataPaymentAmountPaid paymentAmountPaid) {
        this.paymentAmountPaid = paymentAmountPaid;
        return this;
    }

    /**
     * Get the paymentAmountDue property: The paymentAmountDue property.
     *
     * @return the paymentAmountDue value.
     */
    public InvoiceDataPaymentAmountDue getPaymentAmountDue() {
        return this.paymentAmountDue;
    }

    /**
     * Set the paymentAmountDue property: The paymentAmountDue property.
     *
     * @param paymentAmountDue the paymentAmountDue value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setPaymentAmountDue(InvoiceDataPaymentAmountDue paymentAmountDue) {
        this.paymentAmountDue = paymentAmountDue;
        return this;
    }

    /**
     * Get the invoiceNumber property: The invoiceNumber property.
     *
     * @return the invoiceNumber value.
     */
    public InvoiceDataInvoiceNumber getInvoiceNumber() {
        return this.invoiceNumber;
    }

    /**
     * Set the invoiceNumber property: The invoiceNumber property.
     *
     * @param invoiceNumber the invoiceNumber value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setInvoiceNumber(InvoiceDataInvoiceNumber invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        return this;
    }

    /**
     * Get the invoicePurchaseOrderNumber property: The invoicePurchaseOrderNumber property.
     *
     * @return the invoicePurchaseOrderNumber value.
     */
    public InvoiceDataInvoicePurchaseOrderNumber getInvoicePurchaseOrderNumber() {
        return this.invoicePurchaseOrderNumber;
    }

    /**
     * Set the invoicePurchaseOrderNumber property: The invoicePurchaseOrderNumber property.
     *
     * @param invoicePurchaseOrderNumber the invoicePurchaseOrderNumber value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setInvoicePurchaseOrderNumber(InvoiceDataInvoicePurchaseOrderNumber invoicePurchaseOrderNumber) {
        this.invoicePurchaseOrderNumber = invoicePurchaseOrderNumber;
        return this;
    }

    /**
     * Get the supplierBusinessNumber property: The supplierBusinessNumber property.
     *
     * @return the supplierBusinessNumber value.
     */
    public InvoiceDataSupplierBusinessNumber getSupplierBusinessNumber() {
        return this.supplierBusinessNumber;
    }

    /**
     * Set the supplierBusinessNumber property: The supplierBusinessNumber property.
     *
     * @param supplierBusinessNumber the supplierBusinessNumber value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setSupplierBusinessNumber(InvoiceDataSupplierBusinessNumber supplierBusinessNumber) {
        this.supplierBusinessNumber = supplierBusinessNumber;
        return this;
    }

    /**
     * Get the customerNumber property: The customerNumber property.
     *
     * @return the customerNumber value.
     */
    public InvoiceDataCustomerNumber getCustomerNumber() {
        return this.customerNumber;
    }

    /**
     * Set the customerNumber property: The customerNumber property.
     *
     * @param customerNumber the customerNumber value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setCustomerNumber(InvoiceDataCustomerNumber customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }

    /**
     * Get the customerBusinessNumber property: The customerBusinessNumber property.
     *
     * @return the customerBusinessNumber value.
     */
    public InvoiceDataCustomerBusinessNumber getCustomerBusinessNumber() {
        return this.customerBusinessNumber;
    }

    /**
     * Set the customerBusinessNumber property: The customerBusinessNumber property.
     *
     * @param customerBusinessNumber the customerBusinessNumber value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setCustomerBusinessNumber(InvoiceDataCustomerBusinessNumber customerBusinessNumber) {
        this.customerBusinessNumber = customerBusinessNumber;
        return this;
    }

    /**
     * Get the paymentReference property: The paymentReference property.
     *
     * @return the paymentReference value.
     */
    public InvoiceDataPaymentReference getPaymentReference() {
        return this.paymentReference;
    }

    /**
     * Set the paymentReference property: The paymentReference property.
     *
     * @param paymentReference the paymentReference value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setPaymentReference(InvoiceDataPaymentReference paymentReference) {
        this.paymentReference = paymentReference;
        return this;
    }

    /**
     * Get the bankAccountNumber property: The bankAccountNumber property.
     *
     * @return the bankAccountNumber value.
     */
    public InvoiceDataBankAccountNumber getBankAccountNumber() {
        return this.bankAccountNumber;
    }

    /**
     * Set the bankAccountNumber property: The bankAccountNumber property.
     *
     * @param bankAccountNumber the bankAccountNumber value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setBankAccountNumber(InvoiceDataBankAccountNumber bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
        return this;
    }

    /**
     * Get the supplierVat property: The supplierVat property.
     *
     * @return the supplierVat value.
     */
    public InvoiceDataSupplierVat getSupplierVat() {
        return this.supplierVat;
    }

    /**
     * Set the supplierVat property: The supplierVat property.
     *
     * @param supplierVat the supplierVat value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setSupplierVat(InvoiceDataSupplierVat supplierVat) {
        this.supplierVat = supplierVat;
        return this;
    }

    /**
     * Get the customerVat property: The customerVat property.
     *
     * @return the customerVat value.
     */
    public InvoiceDataCustomerVat getCustomerVat() {
        return this.customerVat;
    }

    /**
     * Set the customerVat property: The customerVat property.
     *
     * @param customerVat the customerVat value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setCustomerVat(InvoiceDataCustomerVat customerVat) {
        this.customerVat = customerVat;
        return this;
    }

    /**
     * Get the bpayBillerCode property: The bpayBillerCode property.
     *
     * @return the bpayBillerCode value.
     */
    public InvoiceDataBpayBillerCode getBpayBillerCode() {
        return this.bpayBillerCode;
    }

    /**
     * Set the bpayBillerCode property: The bpayBillerCode property.
     *
     * @param bpayBillerCode the bpayBillerCode value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setBpayBillerCode(InvoiceDataBpayBillerCode bpayBillerCode) {
        this.bpayBillerCode = bpayBillerCode;
        return this;
    }

    /**
     * Get the bpayReference property: The bpayReference property.
     *
     * @return the bpayReference value.
     */
    public InvoiceDataBpayReference getBpayReference() {
        return this.bpayReference;
    }

    /**
     * Set the bpayReference property: The bpayReference property.
     *
     * @param bpayReference the bpayReference value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setBpayReference(InvoiceDataBpayReference bpayReference) {
        this.bpayReference = bpayReference;
        return this;
    }

    /**
     * Get the bankSortCode property: The bankSortCode property.
     *
     * @return the bankSortCode value.
     */
    public InvoiceDataBankSortCode getBankSortCode() {
        return this.bankSortCode;
    }

    /**
     * Set the bankSortCode property: The bankSortCode property.
     *
     * @param bankSortCode the bankSortCode value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setBankSortCode(InvoiceDataBankSortCode bankSortCode) {
        this.bankSortCode = bankSortCode;
        return this;
    }

    /**
     * Get the bankIban property: The bankIban property.
     *
     * @return the bankIban value.
     */
    public InvoiceDataBankIban getBankIban() {
        return this.bankIban;
    }

    /**
     * Set the bankIban property: The bankIban property.
     *
     * @param bankIban the bankIban value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setBankIban(InvoiceDataBankIban bankIban) {
        this.bankIban = bankIban;
        return this;
    }

    /**
     * Get the bankSwift property: The bankSwift property.
     *
     * @return the bankSwift value.
     */
    public InvoiceDataBankSwift getBankSwift() {
        return this.bankSwift;
    }

    /**
     * Set the bankSwift property: The bankSwift property.
     *
     * @param bankSwift the bankSwift value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setBankSwift(InvoiceDataBankSwift bankSwift) {
        this.bankSwift = bankSwift;
        return this;
    }

    /**
     * Get the bankBsb property: The bankBsb property.
     *
     * @return the bankBsb value.
     */
    public InvoiceDataBankBsb getBankBsb() {
        return this.bankBsb;
    }

    /**
     * Set the bankBsb property: The bankBsb property.
     *
     * @param bankBsb the bankBsb value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setBankBsb(InvoiceDataBankBsb bankBsb) {
        this.bankBsb = bankBsb;
        return this;
    }

    /**
     * Get the customerContactName property: The customerContactName property.
     *
     * @return the customerContactName value.
     */
    public InvoiceDataCustomerContactName getCustomerContactName() {
        return this.customerContactName;
    }

    /**
     * Set the customerContactName property: The customerContactName property.
     *
     * @param customerContactName the customerContactName value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setCustomerContactName(InvoiceDataCustomerContactName customerContactName) {
        this.customerContactName = customerContactName;
        return this;
    }

    /**
     * Get the customerCompanyName property: The customerCompanyName property.
     *
     * @return the customerCompanyName value.
     */
    public InvoiceDataCustomerCompanyName getCustomerCompanyName() {
        return this.customerCompanyName;
    }

    /**
     * Set the customerCompanyName property: The customerCompanyName property.
     *
     * @param customerCompanyName the customerCompanyName value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setCustomerCompanyName(InvoiceDataCustomerCompanyName customerCompanyName) {
        this.customerCompanyName = customerCompanyName;
        return this;
    }

    /**
     * Get the supplierCompanyName property: The supplierCompanyName property.
     *
     * @return the supplierCompanyName value.
     */
    public InvoiceDataSupplierCompanyName getSupplierCompanyName() {
        return this.supplierCompanyName;
    }

    /**
     * Set the supplierCompanyName property: The supplierCompanyName property.
     *
     * @param supplierCompanyName the supplierCompanyName value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setSupplierCompanyName(InvoiceDataSupplierCompanyName supplierCompanyName) {
        this.supplierCompanyName = supplierCompanyName;
        return this;
    }

    /**
     * Get the customerBillingAddress property: The customerBillingAddress property.
     *
     * @return the customerBillingAddress value.
     */
    public LocationAnnotation getCustomerBillingAddress() {
        return this.customerBillingAddress;
    }

    /**
     * Set the customerBillingAddress property: The customerBillingAddress property.
     *
     * @param customerBillingAddress the customerBillingAddress value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setCustomerBillingAddress(LocationAnnotation customerBillingAddress) {
        this.customerBillingAddress = customerBillingAddress;
        return this;
    }

    /**
     * Get the customerDeliveryAddress property: The customerDeliveryAddress property.
     *
     * @return the customerDeliveryAddress value.
     */
    public LocationAnnotation getCustomerDeliveryAddress() {
        return this.customerDeliveryAddress;
    }

    /**
     * Set the customerDeliveryAddress property: The customerDeliveryAddress property.
     *
     * @param customerDeliveryAddress the customerDeliveryAddress value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setCustomerDeliveryAddress(LocationAnnotation customerDeliveryAddress) {
        this.customerDeliveryAddress = customerDeliveryAddress;
        return this;
    }

    /**
     * Get the supplierAddress property: The supplierAddress property.
     *
     * @return the supplierAddress value.
     */
    public LocationAnnotation getSupplierAddress() {
        return this.supplierAddress;
    }

    /**
     * Set the supplierAddress property: The supplierAddress property.
     *
     * @param supplierAddress the supplierAddress value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setSupplierAddress(LocationAnnotation supplierAddress) {
        this.supplierAddress = supplierAddress;
        return this;
    }

    /**
     * Get the customerPhoneNumber property: The customerPhoneNumber property.
     *
     * @return the customerPhoneNumber value.
     */
    public InvoiceDataCustomerPhoneNumber getCustomerPhoneNumber() {
        return this.customerPhoneNumber;
    }

    /**
     * Set the customerPhoneNumber property: The customerPhoneNumber property.
     *
     * @param customerPhoneNumber the customerPhoneNumber value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setCustomerPhoneNumber(InvoiceDataCustomerPhoneNumber customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
        return this;
    }

    /**
     * Get the supplierPhoneNumber property: The supplierPhoneNumber property.
     *
     * @return the supplierPhoneNumber value.
     */
    public InvoiceDataSupplierPhoneNumber getSupplierPhoneNumber() {
        return this.supplierPhoneNumber;
    }

    /**
     * Set the supplierPhoneNumber property: The supplierPhoneNumber property.
     *
     * @param supplierPhoneNumber the supplierPhoneNumber value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setSupplierPhoneNumber(InvoiceDataSupplierPhoneNumber supplierPhoneNumber) {
        this.supplierPhoneNumber = supplierPhoneNumber;
        return this;
    }

    /**
     * Get the supplierFax property: The supplierFax property.
     *
     * @return the supplierFax value.
     */
    public InvoiceDataSupplierFax getSupplierFax() {
        return this.supplierFax;
    }

    /**
     * Set the supplierFax property: The supplierFax property.
     *
     * @param supplierFax the supplierFax value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setSupplierFax(InvoiceDataSupplierFax supplierFax) {
        this.supplierFax = supplierFax;
        return this;
    }

    /**
     * Get the customerEmail property: The customerEmail property.
     *
     * @return the customerEmail value.
     */
    public InvoiceDataCustomerEmail getCustomerEmail() {
        return this.customerEmail;
    }

    /**
     * Set the customerEmail property: The customerEmail property.
     *
     * @param customerEmail the customerEmail value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setCustomerEmail(InvoiceDataCustomerEmail customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    /**
     * Get the supplierEmail property: The supplierEmail property.
     *
     * @return the supplierEmail value.
     */
    public InvoiceDataSupplierEmail getSupplierEmail() {
        return this.supplierEmail;
    }

    /**
     * Set the supplierEmail property: The supplierEmail property.
     *
     * @param supplierEmail the supplierEmail value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setSupplierEmail(InvoiceDataSupplierEmail supplierEmail) {
        this.supplierEmail = supplierEmail;
        return this;
    }

    /**
     * Get the supplierWebsite property: The supplierWebsite property.
     *
     * @return the supplierWebsite value.
     */
    public InvoiceDataSupplierWebsite getSupplierWebsite() {
        return this.supplierWebsite;
    }

    /**
     * Set the supplierWebsite property: The supplierWebsite property.
     *
     * @param supplierWebsite the supplierWebsite value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setSupplierWebsite(InvoiceDataSupplierWebsite supplierWebsite) {
        this.supplierWebsite = supplierWebsite;
        return this;
    }

    /**
     * Get the currencyCode property: The currencyCode property.
     *
     * @return the currencyCode value.
     */
    public CurrencyCodeAnnotation getCurrencyCode() {
        return this.currencyCode;
    }

    /**
     * Set the currencyCode property: The currencyCode property.
     *
     * @param currencyCode the currencyCode value to set.
     * @return the InvoiceData object itself.
     */
    public InvoiceData setCurrencyCode(CurrencyCodeAnnotation currencyCode) {
        this.currencyCode = currencyCode;
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
     * @return the InvoiceData object itself.
     */
    public InvoiceData setCustomFields(Map<String, Object> customFields) {
        this.customFields = customFields;
        return this;
    }
}
