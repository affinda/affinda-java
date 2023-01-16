package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Paths9K2ZxlV3UsersGetResponses200ContentApplicationJsonSchema model. */
@Fluent
public final class Paths9K2ZxlV3UsersGetResponses200ContentApplicationJsonSchema {
    /*
     * Number of indexes in result
     */
    @JsonProperty(value = "count")
    private Integer count;

    /*
     * URL to request next page of results
     */
    @JsonProperty(value = "next")
    private String next;

    /*
     * URL to request previous page of results
     */
    @JsonProperty(value = "previous")
    private String previous;

    /*
     * The results property.
     */
    @JsonProperty(value = "results")
    private List<User> results;

    /**
     * Get the count property: Number of indexes in result.
     *
     * @return the count value.
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * Set the count property: Number of indexes in result.
     *
     * @param count the count value to set.
     * @return the Paths9K2ZxlV3UsersGetResponses200ContentApplicationJsonSchema object itself.
     */
    public Paths9K2ZxlV3UsersGetResponses200ContentApplicationJsonSchema setCount(Integer count) {
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
     * @return the Paths9K2ZxlV3UsersGetResponses200ContentApplicationJsonSchema object itself.
     */
    public Paths9K2ZxlV3UsersGetResponses200ContentApplicationJsonSchema setNext(String next) {
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
     * @return the Paths9K2ZxlV3UsersGetResponses200ContentApplicationJsonSchema object itself.
     */
    public Paths9K2ZxlV3UsersGetResponses200ContentApplicationJsonSchema setPrevious(String previous) {
        this.previous = previous;
        return this;
    }

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public List<User> getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the Paths9K2ZxlV3UsersGetResponses200ContentApplicationJsonSchema object itself.
     */
    public Paths9K2ZxlV3UsersGetResponses200ContentApplicationJsonSchema setResults(List<User> results) {
        this.results = results;
        return this;
    }
}
