package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for IndexDocumentType. */
public final class IndexDocumentType extends ExpandableStringEnum<IndexDocumentType> {
    /** Static value resumes for IndexDocumentType. */
    public static final IndexDocumentType RESUMES = fromString("resumes");

    /** Static value job_descriptions for IndexDocumentType. */
    public static final IndexDocumentType JOB_DESCRIPTIONS = fromString("job_descriptions");

    /**
     * Creates or finds a IndexDocumentType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding IndexDocumentType.
     */
    @JsonCreator
    public static IndexDocumentType fromString(String name) {
        return fromString(name, IndexDocumentType.class);
    }

    /** @return known IndexDocumentType values. */
    public static Collection<IndexDocumentType> values() {
        return values(IndexDocumentType.class);
    }
}
