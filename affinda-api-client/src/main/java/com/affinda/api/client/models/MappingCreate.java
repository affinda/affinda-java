package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MappingCreate model. */
@Fluent
public final class MappingCreate {
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

    /*
     * The organization that this mapping belongs to.
     */
    @JsonProperty(value = "organization")
    private String organization;

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
     * @return the MappingCreate object itself.
     */
    public MappingCreate setDataSource(String dataSource) {
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
     * @return the MappingCreate object itself.
     */
    public MappingCreate setScoreCutoff(Float scoreCutoff) {
        this.scoreCutoff = scoreCutoff;
        return this;
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
     * @return the MappingCreate object itself.
     */
    public MappingCreate setOrganization(String organization) {
        this.organization = organization;
        return this;
    }
}
