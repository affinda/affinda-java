package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Monthly credits consumption. */
@Fluent
public final class UsageByCollection {
    /*
     * Month of the usage
     */
    @JsonProperty(value = "month", required = true)
    private String month;

    /*
     * Usage count
     */
    @JsonProperty(value = "count", required = true)
    private int count;

    /**
     * Get the month property: Month of the usage.
     *
     * @return the month value.
     */
    public String getMonth() {
        return this.month;
    }

    /**
     * Set the month property: Month of the usage.
     *
     * @param month the month value to set.
     * @return the UsageByCollection object itself.
     */
    public UsageByCollection setMonth(String month) {
        this.month = month;
        return this;
    }

    /**
     * Get the count property: Usage count.
     *
     * @return the count value.
     */
    public int getCount() {
        return this.count;
    }

    /**
     * Set the count property: Usage count.
     *
     * @param count the count value to set.
     * @return the UsageByCollection object itself.
     */
    public UsageByCollection setCount(int count) {
        this.count = count;
        return this;
    }
}
