package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ResthookEvent. */
public final class ResthookEvent extends ExpandableStringEnum<ResthookEvent> {
    /** Static value resume.parse.succeeded for ResthookEvent. */
    public static final ResthookEvent RESUME_PARSE_SUCCEEDED = fromString("resume.parse.succeeded");

    /** Static value resume.parse.failed for ResthookEvent. */
    public static final ResthookEvent RESUME_PARSE_FAILED = fromString("resume.parse.failed");

    /** Static value resume.parse.completed for ResthookEvent. */
    public static final ResthookEvent RESUME_PARSE_COMPLETED = fromString("resume.parse.completed");

    /** Static value invoice.parse.succeeded for ResthookEvent. */
    public static final ResthookEvent INVOICE_PARSE_SUCCEEDED = fromString("invoice.parse.succeeded");

    /** Static value invoice.parse.failed for ResthookEvent. */
    public static final ResthookEvent INVOICE_PARSE_FAILED = fromString("invoice.parse.failed");

    /** Static value invoice.parse.completed for ResthookEvent. */
    public static final ResthookEvent INVOICE_PARSE_COMPLETED = fromString("invoice.parse.completed");

    /** Static value invoice.validate.completed for ResthookEvent. */
    public static final ResthookEvent INVOICE_VALIDATE_COMPLETED = fromString("invoice.validate.completed");

    /** Static value document.parse.succeeded for ResthookEvent. */
    public static final ResthookEvent DOCUMENT_PARSE_SUCCEEDED = fromString("document.parse.succeeded");

    /** Static value document.parse.failed for ResthookEvent. */
    public static final ResthookEvent DOCUMENT_PARSE_FAILED = fromString("document.parse.failed");

    /** Static value document.parse.completed for ResthookEvent. */
    public static final ResthookEvent DOCUMENT_PARSE_COMPLETED = fromString("document.parse.completed");

    /** Static value document.validate.completed for ResthookEvent. */
    public static final ResthookEvent DOCUMENT_VALIDATE_COMPLETED = fromString("document.validate.completed");

    /** Static value document.classify.succeeded for ResthookEvent. */
    public static final ResthookEvent DOCUMENT_CLASSIFY_SUCCEEDED = fromString("document.classify.succeeded");

    /** Static value document.classify.failed for ResthookEvent. */
    public static final ResthookEvent DOCUMENT_CLASSIFY_FAILED = fromString("document.classify.failed");

    /** Static value document.classify.completed for ResthookEvent. */
    public static final ResthookEvent DOCUMENT_CLASSIFY_COMPLETED = fromString("document.classify.completed");

    /** Static value document.rejected for ResthookEvent. */
    public static final ResthookEvent DOCUMENT_REJECTED = fromString("document.rejected");

    /** Static value annotation.validated for ResthookEvent. */
    public static final ResthookEvent ANNOTATION_VALIDATED = fromString("annotation.validated");

    /**
     * Creates or finds a ResthookEvent from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResthookEvent.
     */
    @JsonCreator
    public static ResthookEvent fromString(String name) {
        return fromString(name, ResthookEvent.class);
    }

    /** @return known ResthookEvent values. */
    public static Collection<ResthookEvent> values() {
        return values(ResthookEvent.class);
    }
}
