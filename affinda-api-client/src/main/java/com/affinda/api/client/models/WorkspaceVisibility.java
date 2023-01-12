package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for WorkspaceVisibility. */
public final class WorkspaceVisibility extends ExpandableStringEnum<WorkspaceVisibility> {
    /** Static value organization for WorkspaceVisibility. */
    public static final WorkspaceVisibility ORGANIZATION = fromString("organization");

    /** Static value private for WorkspaceVisibility. */
    public static final WorkspaceVisibility PRIVATE = fromString("private");

    /**
     * Creates or finds a WorkspaceVisibility from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding WorkspaceVisibility.
     */
    @JsonCreator
    public static WorkspaceVisibility fromString(String name) {
        return fromString(name, WorkspaceVisibility.class);
    }

    /** @return known WorkspaceVisibility values. */
    public static Collection<WorkspaceVisibility> values() {
        return values(WorkspaceVisibility.class);
    }
}
