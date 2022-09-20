package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PageMeta model. */
@Fluent
public final class PageMeta {
    /*
     * The id property.
     */
    @JsonProperty(value = "id")
    private Integer id;

    /*
     * Page number within the document, starts from 0.
     */
    @JsonProperty(value = "pageIndex")
    private Integer pageIndex;

    /*
     * The URL to the image of the page.
     */
    @JsonProperty(value = "image")
    private String image;

    /*
     * Height of the page's image in px.
     */
    @JsonProperty(value = "height")
    private Float height;

    /*
     * Width of the page's image in px.
     */
    @JsonProperty(value = "width")
    private Float width;

    /*
     * The degree of rotation applied to the page. Greater than 0 indicates
     * clockwise rotation. Less than 0 indicates counter-clockwise rotation.
     */
    @JsonProperty(value = "rotation")
    private Integer rotation;

    /**
     * Get the id property: The id property.
     *
     * @return the id value.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Set the id property: The id property.
     *
     * @param id the id value to set.
     * @return the PageMeta object itself.
     */
    public PageMeta setId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get the pageIndex property: Page number within the document, starts from 0.
     *
     * @return the pageIndex value.
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * Set the pageIndex property: Page number within the document, starts from 0.
     *
     * @param pageIndex the pageIndex value to set.
     * @return the PageMeta object itself.
     */
    public PageMeta setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * Get the image property: The URL to the image of the page.
     *
     * @return the image value.
     */
    public String getImage() {
        return this.image;
    }

    /**
     * Set the image property: The URL to the image of the page.
     *
     * @param image the image value to set.
     * @return the PageMeta object itself.
     */
    public PageMeta setImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * Get the height property: Height of the page's image in px.
     *
     * @return the height value.
     */
    public Float getHeight() {
        return this.height;
    }

    /**
     * Set the height property: Height of the page's image in px.
     *
     * @param height the height value to set.
     * @return the PageMeta object itself.
     */
    public PageMeta setHeight(Float height) {
        this.height = height;
        return this;
    }

    /**
     * Get the width property: Width of the page's image in px.
     *
     * @return the width value.
     */
    public Float getWidth() {
        return this.width;
    }

    /**
     * Set the width property: Width of the page's image in px.
     *
     * @param width the width value to set.
     * @return the PageMeta object itself.
     */
    public PageMeta setWidth(Float width) {
        this.width = width;
        return this;
    }

    /**
     * Get the rotation property: The degree of rotation applied to the page. Greater than 0 indicates clockwise
     * rotation. Less than 0 indicates counter-clockwise rotation.
     *
     * @return the rotation value.
     */
    public Integer getRotation() {
        return this.rotation;
    }

    /**
     * Set the rotation property: The degree of rotation applied to the page. Greater than 0 indicates clockwise
     * rotation. Less than 0 indicates counter-clockwise rotation.
     *
     * @param rotation the rotation value to set.
     * @return the PageMeta object itself.
     */
    public PageMeta setRotation(Integer rotation) {
        this.rotation = rotation;
        return this;
    }
}
