package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for AnnotationContentType. */
public final class AnnotationContentType extends ExpandableStringEnum<AnnotationContentType> {
    /** Static value text for AnnotationContentType. */
    public static final AnnotationContentType TEXT = fromString("text");

    /** Static value integer for AnnotationContentType. */
    public static final AnnotationContentType INTEGER = fromString("integer");

    /** Static value float for AnnotationContentType. */
    public static final AnnotationContentType FLOAT = fromString("float");

    /** Static value decimal for AnnotationContentType. */
    public static final AnnotationContentType DECIMAL = fromString("decimal");

    /** Static value date for AnnotationContentType. */
    public static final AnnotationContentType DATE = fromString("date");

    /** Static value datetime for AnnotationContentType. */
    public static final AnnotationContentType DATETIME = fromString("datetime");

    /** Static value boolean for AnnotationContentType. */
    public static final AnnotationContentType BOOLEAN = fromString("boolean");

    /** Static value enum for AnnotationContentType. */
    public static final AnnotationContentType ENUM = fromString("enum");

    /** Static value location for AnnotationContentType. */
    public static final AnnotationContentType LOCATION = fromString("location");

    /** Static value json for AnnotationContentType. */
    public static final AnnotationContentType JSON = fromString("json");

    /** Static value table for AnnotationContentType. */
    public static final AnnotationContentType TABLE = fromString("table");

    /**
     * Creates or finds a AnnotationContentType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AnnotationContentType.
     */
    @JsonCreator
    public static AnnotationContentType fromString(String name) {
        return fromString(name, AnnotationContentType.class);
    }

    /** @return known AnnotationContentType values. */
    public static Collection<AnnotationContentType> values() {
        return values(AnnotationContentType.class);
    }
}
