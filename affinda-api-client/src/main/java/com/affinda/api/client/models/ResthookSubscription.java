package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResthookSubscription model. */
@Fluent
public final class ResthookSubscription {
    /*
     * Resthook subscription's ID.
     */
    @JsonProperty(value = "id", required = true)
    private int id;

    /*
     * The event name to subscribe to.
     */
    @JsonProperty(value = "event", required = true)
    private ResthookEvent event;

    /*
     * URL of the resthook's receiver.
     */
    @JsonProperty(value = "targetUrl", required = true)
    private String targetUrl;

    /*
     * Resthooks only fire for active subscriptions.
     */
    @JsonProperty(value = "active", required = true)
    private boolean active;

    /*
     * Resthook subscriptions can be auto deactivated if the receiver
     * continuously returns error status code over a period of time.
     */
    @JsonProperty(value = "autoDeactivated", required = true)
    private boolean autoDeactivated;

    /*
     * The reason for the subscription being auto deactivated. May contains the
     * error response that the receiver returned.
     */
    @JsonProperty(value = "autoDeactivateReason", required = true)
    private String autoDeactivateReason;

    /*
     * Version of the resthook subscription. Determines the resthook body being
     * fired.
     */
    @JsonProperty(value = "version", required = true)
    private ResthookSubscriptionVersion version;

    /**
     * Get the id property: Resthook subscription's ID.
     *
     * @return the id value.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Set the id property: Resthook subscription's ID.
     *
     * @param id the id value to set.
     * @return the ResthookSubscription object itself.
     */
    public ResthookSubscription setId(int id) {
        this.id = id;
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
     * @return the ResthookSubscription object itself.
     */
    public ResthookSubscription setEvent(ResthookEvent event) {
        this.event = event;
        return this;
    }

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
     * @return the ResthookSubscription object itself.
     */
    public ResthookSubscription setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
        return this;
    }

    /**
     * Get the active property: Resthooks only fire for active subscriptions.
     *
     * @return the active value.
     */
    public boolean isActive() {
        return this.active;
    }

    /**
     * Set the active property: Resthooks only fire for active subscriptions.
     *
     * @param active the active value to set.
     * @return the ResthookSubscription object itself.
     */
    public ResthookSubscription setActive(boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Get the autoDeactivated property: Resthook subscriptions can be auto deactivated if the receiver continuously
     * returns error status code over a period of time.
     *
     * @return the autoDeactivated value.
     */
    public boolean isAutoDeactivated() {
        return this.autoDeactivated;
    }

    /**
     * Set the autoDeactivated property: Resthook subscriptions can be auto deactivated if the receiver continuously
     * returns error status code over a period of time.
     *
     * @param autoDeactivated the autoDeactivated value to set.
     * @return the ResthookSubscription object itself.
     */
    public ResthookSubscription setAutoDeactivated(boolean autoDeactivated) {
        this.autoDeactivated = autoDeactivated;
        return this;
    }

    /**
     * Get the autoDeactivateReason property: The reason for the subscription being auto deactivated. May contains the
     * error response that the receiver returned.
     *
     * @return the autoDeactivateReason value.
     */
    public String getAutoDeactivateReason() {
        return this.autoDeactivateReason;
    }

    /**
     * Set the autoDeactivateReason property: The reason for the subscription being auto deactivated. May contains the
     * error response that the receiver returned.
     *
     * @param autoDeactivateReason the autoDeactivateReason value to set.
     * @return the ResthookSubscription object itself.
     */
    public ResthookSubscription setAutoDeactivateReason(String autoDeactivateReason) {
        this.autoDeactivateReason = autoDeactivateReason;
        return this;
    }

    /**
     * Get the version property: Version of the resthook subscription. Determines the resthook body being fired.
     *
     * @return the version value.
     */
    public ResthookSubscriptionVersion getVersion() {
        return this.version;
    }

    /**
     * Set the version property: Version of the resthook subscription. Determines the resthook body being fired.
     *
     * @param version the version value to set.
     * @return the ResthookSubscription object itself.
     */
    public ResthookSubscription setVersion(ResthookSubscriptionVersion version) {
        this.version = version;
        return this;
    }
}
