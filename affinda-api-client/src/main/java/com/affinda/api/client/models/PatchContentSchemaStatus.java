package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PatchContentSchemaStatus. */
public final class PatchContentSchemaStatus extends ExpandableStringEnum<PatchContentSchemaStatus> {
    /** Static value accepted for PatchContentSchemaStatus. */
    public static final PatchContentSchemaStatus ACCEPTED = fromString("accepted");

    /** Static value declined for PatchContentSchemaStatus. */
    public static final PatchContentSchemaStatus DECLINED = fromString("declined");

    /**
     * Creates or finds a PatchContentSchemaStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PatchContentSchemaStatus.
     */
    @JsonCreator
    public static PatchContentSchemaStatus fromString(String name) {
        return fromString(name, PatchContentSchemaStatus.class);
    }

    /** @return known PatchContentSchemaStatus values. */
    public static Collection<PatchContentSchemaStatus> values() {
        return values(PatchContentSchemaStatus.class);
    }
}
