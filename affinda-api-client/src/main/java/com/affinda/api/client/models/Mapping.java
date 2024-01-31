package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A mapping allows you to specify specific settings regarding a lookup against a MappingDataSource should be applied.
 */
@Fluent
public final class Mapping {
    /*
     * Uniquely identify a mapping.
     */
    @JsonProperty(value = "identifier", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String identifier;

    /*
     * The organization that this mapping belongs to.
     */
    @JsonProperty(value = "organization")
    private String organization;

    /*
     * The mapping data source this mapping applies to.
     */
    @JsonProperty(value = "dataSource", required = true)
    private String dataSource;

    /*
     * Higher values will result in more strict matching.
     */
    @JsonProperty(value = "scoreCutoff")
    private Float scoreCutoff;

    /**
     * Get the identifier property: Uniquely identify a mapping.
     *
     * @return the identifier value.
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * Get the organization property: The organization that this mapping belongs to.
     *
     * @return the organization value.
     */
    public String getOrganization() {
        return this.organization;
    }

    /**
     * Set the organization property: The organization that this mapping belongs to.
     *
     * @param organization the organization value to set.
     * @return the Mapping object itself.
     */
    public Mapping setOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get the dataSource property: The mapping data source this mapping applies to.
     *
     * @return the dataSource value.
     */
    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * Set the dataSource property: The mapping data source this mapping applies to.
     *
     * @param dataSource the dataSource value to set.
     * @return the Mapping object itself.
     */
    public Mapping setDataSource(String dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    /**
     * Get the scoreCutoff property: Higher values will result in more strict matching.
     *
     * @return the scoreCutoff value.
     */
    public Float getScoreCutoff() {
        return this.scoreCutoff;
    }

    /**
     * Set the scoreCutoff property: Higher values will result in more strict matching.
     *
     * @param scoreCutoff the scoreCutoff value to set.
     * @return the Mapping object itself.
     */
    public Mapping setScoreCutoff(Float scoreCutoff) {
        this.scoreCutoff = scoreCutoff;
        return this;
    }
}
