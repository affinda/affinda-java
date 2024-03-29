package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The TableAnnotationParsed model. */
@Fluent
public final class TableAnnotationParsed {
    /*
     * The rows property.
     */
    @JsonProperty(value = "rows")
    private List<RowAnnotation> rows;

    /**
     * Get the rows property: The rows property.
     *
     * @return the rows value.
     */
    public List<RowAnnotation> getRows() {
        return this.rows;
    }

    /**
     * Set the rows property: The rows property.
     *
     * @param rows the rows value to set.
     * @return the TableAnnotationParsed object itself.
     */
    public TableAnnotationParsed setRows(List<RowAnnotation> rows) {
        this.rows = rows;
        return this;
    }
}
