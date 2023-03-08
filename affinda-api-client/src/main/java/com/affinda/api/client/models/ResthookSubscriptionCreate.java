package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResthookSubscriptionCreate model. */
@Fluent
public final class ResthookSubscriptionCreate {
    /*
     * URL of the resthook's receiver.
     */
    @JsonProperty(value = "targetUrl", required = true)
    private String targetUrl;

    /*
     * The event name to subscribe to.
     */
    @JsonProperty(value = "event", required = true)
    private ResthookEvent event;

    /*
     * Version of the resthook subscription. Determines the resthook body being
     * fired.
     */
    @JsonProperty(value = "version")
    private Version version;

    /**
     * Get the targetUrl property: URL of the resthook's receiver.
     *
     * @return the targetUrl value.
     */
    public String getTargetUrl() {
        return this.targetUrl;
    }

    /**
     * Set the targetUrl property: URL of the resthook's receiver.
     *
     * @param targetUrl the targetUrl value to set.
     * @return the ResthookSubscriptionCreate object itself.
     */
    public ResthookSubscriptionCreate setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
        return this;
    }

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
     * @return the ResthookSubscriptionCreate object itself.
     */
    public ResthookSubscriptionCreate setEvent(ResthookEvent event) {
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
     * @return the ResthookSubscriptionCreate object itself.
     */
    public ResthookSubscriptionCreate setVersion(Version version) {
        this.version = version;
        return this;
    }
}
