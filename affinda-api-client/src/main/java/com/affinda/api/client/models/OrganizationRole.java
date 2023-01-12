package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OrganizationRole. */
public final class OrganizationRole extends ExpandableStringEnum<OrganizationRole> {
    /** Static value admin for OrganizationRole. */
    public static final OrganizationRole ADMIN = fromString("admin");

    /** Static value member for OrganizationRole. */
    public static final OrganizationRole MEMBER = fromString("member");

    /**
     * Creates or finds a OrganizationRole from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OrganizationRole.
     */
    @JsonCreator
    public static OrganizationRole fromString(String name) {
        return fromString(name, OrganizationRole.class);
    }

    /** @return known OrganizationRole values. */
    public static Collection<OrganizationRole> values() {
        return values(OrganizationRole.class);
    }
}
