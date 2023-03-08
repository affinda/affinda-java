package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The OccupationGroupSearchResult model. */
@Fluent
public final class OccupationGroupSearchResult {
    /*
     * The match property.
     */
    @JsonProperty(value = "match")
    private Boolean match;

    /*
     * The code property.
     */
    @JsonProperty(value = "code", required = true)
    private int code;

    /*
     * The name property.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The children property.
     */
    @JsonProperty(value = "children", required = true)
    private List<OccupationGroup> children;

    /*
     * The parents property.
     */
    @JsonProperty(value = "parents")
    private List<OccupationGroup> parents;

    /**
     * Get the match property: The match property.
     *
     * @return the match value.
     */
    public Boolean isMatch() {
        return this.match;
    }

    /**
     * Set the match property: The match property.
     *
     * @param match the match value to set.
     * @return the OccupationGroupSearchResult object itself.
     */
    public OccupationGroupSearchResult setMatch(Boolean match) {
        this.match = match;
        return this;
    }

    /**
     * Get the code property: The code property.
     *
     * @return the code value.
     */
    public int getCode() {
        return this.code;
    }

    /**
     * Set the code property: The code property.
     *
     * @param code the code value to set.
     * @return the OccupationGroupSearchResult object itself.
     */
    public OccupationGroupSearchResult setCode(int code) {
        this.code = code;
        return this;
    }

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the OccupationGroupSearchResult object itself.
     */
    public OccupationGroupSearchResult setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the children property: The children property.
     *
     * @return the children value.
     */
    public List<OccupationGroup> getChildren() {
        return this.children;
    }

    /**
     * Set the children property: The children property.
     *
     * @param children the children value to set.
     * @return the OccupationGroupSearchResult object itself.
     */
    public OccupationGroupSearchResult setChildren(List<OccupationGroup> children) {
        this.children = children;
        return this;
    }

    /**
     * Get the parents property: The parents property.
     *
     * @return the parents value.
     */
    public List<OccupationGroup> getParents() {
        return this.parents;
    }

    /**
     * Set the parents property: The parents property.
     *
     * @param parents the parents value to set.
     * @return the OccupationGroupSearchResult object itself.
     */
    public OccupationGroupSearchResult setParents(List<OccupationGroup> parents) {
        this.parents = parents;
        return this;
    }
}
