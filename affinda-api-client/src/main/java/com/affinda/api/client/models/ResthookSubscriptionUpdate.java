package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResthookSubscriptionUpdate model. */
@Fluent
public final class ResthookSubscriptionUpdate {
    /*
     * The event name to subscribe to.
     */
    @JsonProperty(value = "event")
    private ResthookEvent event;

    /*
     * Version of the resthook subscription. Determines the resthook body being
     * fired.
     */
    @JsonProperty(value = "version")
    private Version version;

    /**
     * Get the event property: The event name to subscribe to.
     *
     * @return the event value.
     */
    public ResthookEvent getEvent() {
        return this.event;
    }

    /**
     * Set the event property: The event name to subscribe to.
     *
     * @param event the event value to set.
     * @return the ResthookSubscriptionUpdate object itself.
     */
    public ResthookSubscriptionUpdate setEvent(ResthookEvent event) {
        this.event = event;
        return this;
    }

    /**
     * Get the version property: Version of the resthook subscription. Determines the resthook body being fired.
     *
     * @return the version value.
     */
    public Version getVersion() {
        return this.version;
    }

    /**
     * Set the version property: Version of the resthook subscription. Determines the resthook body being fired.
     *
     * @param version the version value to set.
     * @return the ResthookSubscriptionUpdate object itself.
     */
    public ResthookSubscriptionUpdate setVersion(Version version) {
        this.version = version;
        return this;
    }
}
