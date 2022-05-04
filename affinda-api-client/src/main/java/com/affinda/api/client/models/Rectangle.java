package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Rectangle model. */
@Fluent
public final class Rectangle {
    /*
     * The x0 property.
     */
    @JsonProperty(value = "x0", required = true)
    private float x0;

    /*
     * The y0 property.
     */
    @JsonProperty(value = "y0", required = true)
    private float y0;

    /*
     * The x1 property.
     */
    @JsonProperty(value = "x1", required = true)
    private float x1;

    /*
     * The y1 property.
     */
    @JsonProperty(value = "y1", required = true)
    private float y1;

    /**
     * Get the x0 property: The x0 property.
     *
     * @return the x0 value.
     */
    public float getX0() {
        return this.x0;
    }

    /**
     * Set the x0 property: The x0 property.
     *
     * @param x0 the x0 value to set.
     * @return the Rectangle object itself.
     */
    public Rectangle setX0(float x0) {
        this.x0 = x0;
        return this;
    }

    /**
     * Get the y0 property: The y0 property.
     *
     * @return the y0 value.
     */
    public float getY0() {
        return this.y0;
    }

    /**
     * Set the y0 property: The y0 property.
     *
     * @param y0 the y0 value to set.
     * @return the Rectangle object itself.
     */
    public Rectangle setY0(float y0) {
        this.y0 = y0;
        return this;
    }

    /**
     * Get the x1 property: The x1 property.
     *
     * @return the x1 value.
     */
    public float getX1() {
        return this.x1;
    }

    /**
     * Set the x1 property: The x1 property.
     *
     * @param x1 the x1 value to set.
     * @return the Rectangle object itself.
     */
    public Rectangle setX1(float x1) {
        this.x1 = x1;
        return this;
    }

    /**
     * Get the y1 property: The y1 property.
     *
     * @return the y1 value.
     */
    public float getY1() {
        return this.y1;
    }

    /**
     * Set the y1 property: The y1 property.
     *
     * @param y1 the y1 value to set.
     * @return the Rectangle object itself.
     */
    public Rectangle setY1(float y1) {
        this.y1 = y1;
        return this;
    }
}
