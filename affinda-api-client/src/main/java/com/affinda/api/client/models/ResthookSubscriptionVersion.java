package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ResthookSubscriptionVersion. */
public final class ResthookSubscriptionVersion extends ExpandableStringEnum<ResthookSubscriptionVersion> {
    /** Static value v1 for ResthookSubscriptionVersion. */
    public static final ResthookSubscriptionVersion V1 = fromString("v1");

    /** Static value v2 for ResthookSubscriptionVersion. */
    public static final ResthookSubscriptionVersion V2 = fromString("v2");

    /** Static value v3 for ResthookSubscriptionVersion. */
    public static final ResthookSubscriptionVersion V3 = fromString("v3");

    /**
     * Creates or finds a ResthookSubscriptionVersion from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ResthookSubscriptionVersion.
     */
    @JsonCreator
    public static ResthookSubscriptionVersion fromString(String name) {
        return fromString(name, ResthookSubscriptionVersion.class);
    }

    /** @return known ResthookSubscriptionVersion values. */
    public static Collection<ResthookSubscriptionVersion> values() {
        return values(ResthookSubscriptionVersion.class);
    }
}
