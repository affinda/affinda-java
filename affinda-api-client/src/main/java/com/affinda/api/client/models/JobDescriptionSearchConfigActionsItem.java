package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JobDescriptionSearchConfigActionsItem model. */
@Fluent
public final class JobDescriptionSearchConfigActionsItem {
    /*
     * Human readable label to display in the UI
     */
    @JsonProperty(value = "label")
    private String label;

    /*
     * Name of the event to be triggered
     */
    @JsonProperty(value = "eventName")
    private String eventName;

    /**
     * Get the label property: Human readable label to display in the UI.
     *
     * @return the label value.
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * Set the label property: Human readable label to display in the UI.
     *
     * @param label the label value to set.
     * @return the JobDescriptionSearchConfigActionsItem object itself.
     */
    public JobDescriptionSearchConfigActionsItem setLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the eventName property: Name of the event to be triggered.
     *
     * @return the eventName value.
     */
    public String getEventName() {
        return this.eventName;
    }

    /**
     * Set the eventName property: Name of the event to be triggered.
     *
     * @param eventName the eventName value to set.
     * @return the JobDescriptionSearchConfigActionsItem object itself.
     */
    public JobDescriptionSearchConfigActionsItem setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
}
