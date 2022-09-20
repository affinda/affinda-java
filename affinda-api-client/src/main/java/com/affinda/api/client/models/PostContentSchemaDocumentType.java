package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PostContentSchemaDocumentType. */
public final class PostContentSchemaDocumentType extends ExpandableStringEnum<PostContentSchemaDocumentType> {
    /** Static value resumes for PostContentSchemaDocumentType. */
    public static final PostContentSchemaDocumentType RESUMES = fromString("resumes");

    /** Static value job_descriptions for PostContentSchemaDocumentType. */
    public static final PostContentSchemaDocumentType JOB_DESCRIPTIONS = fromString("job_descriptions");

    /**
     * Creates or finds a PostContentSchemaDocumentType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PostContentSchemaDocumentType.
     */
    @JsonCreator
    public static PostContentSchemaDocumentType fromString(String name) {
        return fromString(name, PostContentSchemaDocumentType.class);
    }

    /** @return known PostContentSchemaDocumentType values. */
    public static Collection<PostContentSchemaDocumentType> values() {
        return values(PostContentSchemaDocumentType.class);
    }
}
