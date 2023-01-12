package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DocumentState. */
public final class DocumentState extends ExpandableStringEnum<DocumentState> {
    /** Static value uploaded for DocumentState. */
    public static final DocumentState UPLOADED = fromString("uploaded");

    /** Static value review for DocumentState. */
    public static final DocumentState REVIEW = fromString("review");

    /** Static value validated for DocumentState. */
    public static final DocumentState VALIDATED = fromString("validated");

    /** Static value archived for DocumentState. */
    public static final DocumentState ARCHIVED = fromString("archived");

    /** Static value rejected for DocumentState. */
    public static final DocumentState REJECTED = fromString("rejected");

    /**
     * Creates or finds a DocumentState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DocumentState.
     */
    @JsonCreator
    public static DocumentState fromString(String name) {
        return fromString(name, DocumentState.class);
    }

    /** @return known DocumentState values. */
    public static Collection<DocumentState> values() {
        return values(DocumentState.class);
    }
}
