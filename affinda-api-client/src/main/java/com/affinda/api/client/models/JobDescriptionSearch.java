package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The JobDescriptionSearch model. */
@Fluent
public final class JobDescriptionSearch {
    /*
     * Total number of results
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
     * The parameters property.
     */
    @JsonProperty(value = "parameters")
    private JobDescriptionSearchParameters parameters;

    /*
     * The results property.
     */
    @JsonProperty(value = "results")
    private List<JobDescriptionSearchResult> results;

    /**
     * Get the count property: Total number of results.
     *
     * @return the count value.
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * Set the count property: Total number of results.
     *
     * @param count the count value to set.
     * @return the JobDescriptionSearch object itself.
     */
    public JobDescriptionSearch setCount(Integer count) {
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
     * @return the JobDescriptionSearch object itself.
     */
    public JobDescriptionSearch setNext(String next) {
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
     * @return the JobDescriptionSearch object itself.
     */
    public JobDescriptionSearch setPrevious(String previous) {
        this.previous = previous;
        return this;
    }

    /**
     * Get the parameters property: The parameters property.
     *
     * @return the parameters value.
     */
    public JobDescriptionSearchParameters getParameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameters property.
     *
     * @param parameters the parameters value to set.
     * @return the JobDescriptionSearch object itself.
     */
    public JobDescriptionSearch setParameters(JobDescriptionSearchParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public List<JobDescriptionSearchResult> getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the JobDescriptionSearch object itself.
     */
    public JobDescriptionSearch setResults(List<JobDescriptionSearchResult> results) {
        this.results = results;
        return this;
    }
}
