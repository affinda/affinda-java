package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The TableBetaAnnotationParsed model. */
@Fluent
public final class TableBetaAnnotationParsed {
    /*
     * The rows property.
     */
    @JsonProperty(value = "rows")
    private List<RowBetaAnnotation> rows;

    /**
     * Get the rows property: The rows property.
     *
     * @return the rows value.
     */
    public List<RowBetaAnnotation> getRows() {
        return this.rows;
    }

    /**
     * Set the rows property: The rows property.
     *
     * @param rows the rows value to set.
     * @return the TableBetaAnnotationParsed object itself.
     */
    public TableBetaAnnotationParsed setRows(List<RowBetaAnnotation> rows) {
        this.rows = rows;
        return this;
    }
}
