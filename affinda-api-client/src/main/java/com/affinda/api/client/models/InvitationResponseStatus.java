package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for InvitationResponseStatus. */
public final class InvitationResponseStatus extends ExpandableStringEnum<InvitationResponseStatus> {
    /** Static value accepted for InvitationResponseStatus. */
    public static final InvitationResponseStatus ACCEPTED = fromString("accepted");

    /** Static value declined for InvitationResponseStatus. */
    public static final InvitationResponseStatus DECLINED = fromString("declined");

    /**
     * Creates or finds a InvitationResponseStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding InvitationResponseStatus.
     */
    @JsonCreator
    public static InvitationResponseStatus fromString(String name) {
        return fromString(name, InvitationResponseStatus.class);
    }

    /** @return known InvitationResponseStatus values. */
    public static Collection<InvitationResponseStatus> values() {
        return values(InvitationResponseStatus.class);
    }
}
