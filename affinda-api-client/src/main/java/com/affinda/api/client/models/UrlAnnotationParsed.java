package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The UrlAnnotationParsed model. */
@Fluent
public final class UrlAnnotationParsed {
    /*
     * The url property.
     */
    @JsonProperty(value = "url")
    private String url;

    /*
     * The domain property.
     */
    @JsonProperty(value = "domain")
    private String domain;

    /**
     * Get the url property: The url property.
     *
     * @return the url value.
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * Set the url property: The url property.
     *
     * @param url the url value to set.
     * @return the UrlAnnotationParsed object itself.
     */
    public UrlAnnotationParsed setUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the domain property: The domain property.
     *
     * @return the domain value.
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * Set the domain property: The domain property.
     *
     * @param domain the domain value to set.
     * @return the UrlAnnotationParsed object itself.
     */
    public UrlAnnotationParsed setDomain(String domain) {
        this.domain = domain;
        return this;
    }
}
