package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The OccupationGroup model. */
@Fluent
public class OccupationGroup {
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
     * @return the OccupationGroup object itself.
     */
    public OccupationGroup setCode(int code) {
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
     * @return the OccupationGroup object itself.
     */
    public OccupationGroup setName(String name) {
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
     * @return the OccupationGroup object itself.
     */
    public OccupationGroup setChildren(List<OccupationGroup> children) {
        this.children = children;
        return this;
    }
}
