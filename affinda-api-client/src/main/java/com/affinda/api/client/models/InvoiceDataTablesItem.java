package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The InvoiceDataTablesItem model. */
@Fluent
public final class InvoiceDataTablesItem {
    /*
     * The parsed property.
     */
    @JsonProperty(value = "parsed")
    private List<InvoiceDataTablesPropertiesItemsItem> parsed;

    /**
     * Get the parsed property: The parsed property.
     *
     * @return the parsed value.
     */
    public List<InvoiceDataTablesPropertiesItemsItem> getParsed() {
        return this.parsed;
    }

    /**
     * Set the parsed property: The parsed property.
     *
     * @param parsed the parsed value to set.
     * @return the InvoiceDataTablesItem object itself.
     */
    public InvoiceDataTablesItem setParsed(List<InvoiceDataTablesPropertiesItemsItem> parsed) {
        this.parsed = parsed;
        return this;
    }
}
