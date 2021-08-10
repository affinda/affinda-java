package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URL;
import java.util.List;

/** The Paths1Vwy7YkResumesGetResponses200ContentApplicationJsonSchema model. */
@Fluent
public final class Paths1Vwy7YkResumesGetResponses200ContentApplicationJsonSchema {
    /*
     * The count property.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /*
     * The next property.
     */
    @JsonProperty(value = "next")
    private URL next;

    /*
     * The previous property.
     */
    @JsonProperty(value = "previous")
    private URL previous;

    /*
     * The results property.
     */
    @JsonProperty(value = "results")
    private List<Meta> results;

    /**
     * Get the count property: The count property.
     *
     * @return the count value.
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * Set the count property: The count property.
     *
     * @param count the count value to set.
     * @return the Paths1Vwy7YkResumesGetResponses200ContentApplicationJsonSchema object itself.
     */
    public Paths1Vwy7YkResumesGetResponses200ContentApplicationJsonSchema setCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get the next property: The next property.
     *
     * @return the next value.
     */
    public URL getNext() {
        return this.next;
    }

    /**
     * Set the next property: The next property.
     *
     * @param next the next value to set.
     * @return the Paths1Vwy7YkResumesGetResponses200ContentApplicationJsonSchema object itself.
     */
    public Paths1Vwy7YkResumesGetResponses200ContentApplicationJsonSchema setNext(URL next) {
        this.next = next;
        return this;
    }

    /**
     * Get the previous property: The previous property.
     *
     * @return the previous value.
     */
    public URL getPrevious() {
        return this.previous;
    }

    /**
     * Set the previous property: The previous property.
     *
     * @param previous the previous value to set.
     * @return the Paths1Vwy7YkResumesGetResponses200ContentApplicationJsonSchema object itself.
     */
    public Paths1Vwy7YkResumesGetResponses200ContentApplicationJsonSchema setPrevious(URL previous) {
        this.previous = previous;
        return this;
    }

    /**
     * Get the results property: The results property.
     *
     * @return the results value.
     */
    public List<Meta> getResults() {
        return this.results;
    }

    /**
     * Set the results property: The results property.
     *
     * @param results the results value to set.
     * @return the Paths1Vwy7YkResumesGetResponses200ContentApplicationJsonSchema object itself.
     */
    public Paths1Vwy7YkResumesGetResponses200ContentApplicationJsonSchema setResults(List<Meta> results) {
        this.results = results;
        return this;
    }
}
