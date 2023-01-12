package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for InvitationStatus. */
public final class InvitationStatus extends ExpandableStringEnum<InvitationStatus> {
    /** Static value pending for InvitationStatus. */
    public static final InvitationStatus PENDING = fromString("pending");

    /** Static value accepted for InvitationStatus. */
    public static final InvitationStatus ACCEPTED = fromString("accepted");

    /** Static value declined for InvitationStatus. */
    public static final InvitationStatus DECLINED = fromString("declined");

    /**
     * Creates or finds a InvitationStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding InvitationStatus.
     */
    @JsonCreator
    public static InvitationStatus fromString(String name) {
        return fromString(name, InvitationStatus.class);
    }

    /** @return known InvitationStatus values. */
    public static Collection<InvitationStatus> values() {
        return values(InvitationStatus.class);
    }
}
