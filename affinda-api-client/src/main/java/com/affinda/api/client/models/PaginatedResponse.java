package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PaginatedResponse model. */
@Fluent
public class PaginatedResponse {
    /*
     * Number of items in results.
     */
    @JsonProperty(value = "count", required = true)
    private int count;

    /*
     * URL to request next page of results.
     */
    @JsonProperty(value = "next")
    private String next;

    /*
     * URL to request previous page of results.
     */
    @JsonProperty(value = "previous")
    private String previous;

    /**
     * Get the count property: Number of items in results.
     *
     * @return the count value.
     */
    public int getCount() {
        return this.count;
    }

    /**
     * Set the count property: Number of items in results.
     *
     * @param count the count value to set.
     * @return the PaginatedResponse object itself.
     */
    public PaginatedResponse setCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * Get the next property: URL to request next page of results.
     *
     * @return the next value.
     */
    public String getNext() {
        return this.next;
    }

    /**
     * Set the next property: URL to request next page of results.
     *
     * @param next the next value to set.
     * @return the PaginatedResponse object itself.
     */
    public PaginatedResponse setNext(String next) {
        this.next = next;
        return this;
    }

    /**
     * Get the previous property: URL to request previous page of results.
     *
     * @return the previous value.
     */
    public String getPrevious() {
        return this.previous;
    }

    /**
     * Set the previous property: URL to request previous page of results.
     *
     * @param previous the previous value to set.
     * @return the PaginatedResponse object itself.
     */
    public PaginatedResponse setPrevious(String previous) {
        this.previous = previous;
        return this;
    }
}
