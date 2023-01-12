package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The Document model. */
@Fluent
public final class Document extends DocumentMeta {
    /*
     * Dictionary of <any>
     */
    @JsonProperty(value = "data")
    private Map<String, Object> data;

    /**
     * Get the data property: Dictionary of &lt;any&gt;.
     *
     * @return the data value.
     */
    public Map<String, Object> getData() {
        return this.data;
    }

    /**
     * Set the data property: Dictionary of &lt;any&gt;.
     *
     * @param data the data value to set.
     * @return the Document object itself.
     */
    public Document setData(Map<String, Object> data) {
        this.data = data;
        return this;
    }
}
