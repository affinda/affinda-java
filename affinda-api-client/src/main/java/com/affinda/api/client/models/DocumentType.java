package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DocumentType. */
public final class DocumentType extends ExpandableStringEnum<DocumentType> {
    /** Static value resumes for DocumentType. */
    public static final DocumentType RESUMES = fromString("resumes");

    /** Static value job_descriptions for DocumentType. */
    public static final DocumentType JOB_DESCRIPTIONS = fromString("job_descriptions");

    /**
     * Creates or finds a DocumentType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DocumentType.
     */
    @JsonCreator
    public static DocumentType fromString(String name) {
        return fromString(name, DocumentType.class);
    }

    /** @return known DocumentType values. */
    public static Collection<DocumentType> values() {
        return values(DocumentType.class);
    }
}
