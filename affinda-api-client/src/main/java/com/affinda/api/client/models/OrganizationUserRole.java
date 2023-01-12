package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OrganizationUserRole. */
public final class OrganizationUserRole extends ExpandableStringEnum<OrganizationUserRole> {
    /** Static value admin for OrganizationUserRole. */
    public static final OrganizationUserRole ADMIN = fromString("admin");

    /** Static value member for OrganizationUserRole. */
    public static final OrganizationUserRole MEMBER = fromString("member");

    /**
     * Creates or finds a OrganizationUserRole from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OrganizationUserRole.
     */
    @JsonCreator
    public static OrganizationUserRole fromString(String name) {
        return fromString(name, OrganizationUserRole.class);
    }

    /** @return known OrganizationUserRole values. */
    public static Collection<OrganizationUserRole> values() {
        return values(OrganizationUserRole.class);
    }
}
