package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DocumentFormat. */
public final class DocumentFormat extends ExpandableStringEnum<DocumentFormat> {
    /** Static value json for DocumentFormat. */
    public static final DocumentFormat JSON = fromString("json");

    /** Static value xml for DocumentFormat. */
    public static final DocumentFormat XML = fromString("xml");

    /** Static value hr-xml for DocumentFormat. */
    public static final DocumentFormat HR_XML = fromString("hr-xml");

    /**
     * Creates or finds a DocumentFormat from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DocumentFormat.
     */
    @JsonCreator
    public static DocumentFormat fromString(String name) {
        return fromString(name, DocumentFormat.class);
    }

    /** @return known DocumentFormat values. */
    public static Collection<DocumentFormat> values() {
        return values(DocumentFormat.class);
    }
}
