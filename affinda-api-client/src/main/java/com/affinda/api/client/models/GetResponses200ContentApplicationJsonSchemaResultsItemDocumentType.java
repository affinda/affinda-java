package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for GetResponses200ContentApplicationJsonSchemaResultsItemDocumentType. */
public final class GetResponses200ContentApplicationJsonSchemaResultsItemDocumentType
        extends ExpandableStringEnum<GetResponses200ContentApplicationJsonSchemaResultsItemDocumentType> {
    /** Static value resumes for GetResponses200ContentApplicationJsonSchemaResultsItemDocumentType. */
    public static final GetResponses200ContentApplicationJsonSchemaResultsItemDocumentType RESUMES =
            fromString("resumes");

    /** Static value job_descriptions for GetResponses200ContentApplicationJsonSchemaResultsItemDocumentType. */
    public static final GetResponses200ContentApplicationJsonSchemaResultsItemDocumentType JOB_DESCRIPTIONS =
            fromString("job_descriptions");

    /**
     * Creates or finds a GetResponses200ContentApplicationJsonSchemaResultsItemDocumentType from its string
     * representation.
     *
     * @param name a name to look for.
     * @return the corresponding GetResponses200ContentApplicationJsonSchemaResultsItemDocumentType.
     */
    @JsonCreator
    public static GetResponses200ContentApplicationJsonSchemaResultsItemDocumentType fromString(String name) {
        return fromString(name, GetResponses200ContentApplicationJsonSchemaResultsItemDocumentType.class);
    }

    /** @return known GetResponses200ContentApplicationJsonSchemaResultsItemDocumentType values. */
    public static Collection<GetResponses200ContentApplicationJsonSchemaResultsItemDocumentType> values() {
        return values(GetResponses200ContentApplicationJsonSchemaResultsItemDocumentType.class);
    }
}
