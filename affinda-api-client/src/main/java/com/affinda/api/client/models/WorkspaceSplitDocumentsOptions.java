package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for WorkspaceSplitDocumentsOptions. */
public final class WorkspaceSplitDocumentsOptions extends ExpandableStringEnum<WorkspaceSplitDocumentsOptions> {
    /** Static value leave for WorkspaceSplitDocumentsOptions. */
    public static final WorkspaceSplitDocumentsOptions LEAVE = fromString("leave");

    /** Static value conservative for WorkspaceSplitDocumentsOptions. */
    public static final WorkspaceSplitDocumentsOptions CONSERVATIVE = fromString("conservative");

    /** Static value recommended for WorkspaceSplitDocumentsOptions. */
    public static final WorkspaceSplitDocumentsOptions RECOMMENDED = fromString("recommended");

    /** Static value aggressive for WorkspaceSplitDocumentsOptions. */
    public static final WorkspaceSplitDocumentsOptions AGGRESSIVE = fromString("aggressive");

    /**
     * Creates or finds a WorkspaceSplitDocumentsOptions from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WorkspaceSplitDocumentsOptions.
     */
    @JsonCreator
    public static WorkspaceSplitDocumentsOptions fromString(String name) {
        return fromString(name, WorkspaceSplitDocumentsOptions.class);
    }

    /** @return known WorkspaceSplitDocumentsOptions values. */
    public static Collection<WorkspaceSplitDocumentsOptions> values() {
        return values(WorkspaceSplitDocumentsOptions.class);
    }
}
