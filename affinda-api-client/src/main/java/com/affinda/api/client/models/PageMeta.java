package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PageMeta model. */
@Fluent
public final class PageMeta {
    /*
     * The id property.
     */
    @JsonProperty(value = "id", required = true)
    private int id;

    /*
     * Page number within the document, starts from 0.
     */
    @JsonProperty(value = "pageIndex", required = true)
    private int pageIndex;

    /*
     * The URL to the image of the page.
     */
    @JsonProperty(value = "image", required = true)
    private String image;

    /*
     * The URL to the translated image of the page.
     */
    @JsonProperty(value = "imageTranslated")
    private String imageTranslated;

    /*
     * Height of the page's image in px.
     */
    @JsonProperty(value = "height", required = true)
    private float height;

    /*
     * Width of the page's image in px.
     */
    @JsonProperty(value = "width", required = true)
    private float width;

    /*
     * The degree of rotation applied to the page. Greater than 0 indicates
     * clockwise rotation. Less than 0 indicates counter-clockwise rotation.
     */
    @JsonProperty(value = "rotation", required = true)
    private int rotation;

    /**
     * Get the id property: The id property.
     *
     * @return the id value.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Set the id property: The id property.
     *
     * @param id the id value to set.
     * @return the PageMeta object itself.
     */
    public PageMeta setId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Get the pageIndex property: Page number within the document, starts from 0.
     *
     * @return the pageIndex value.
     */
    public int getPageIndex() {
        return this.pageIndex;
    }

    /**
     * Set the pageIndex property: Page number within the document, starts from 0.
     *
     * @param pageIndex the pageIndex value to set.
     * @return the PageMeta object itself.
     */
    public PageMeta setPageIndex(int pageIndex) {
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
     * Get the imageTranslated property: The URL to the translated image of the page.
     *
     * @return the imageTranslated value.
     */
    public String getImageTranslated() {
        return this.imageTranslated;
    }

    /**
     * Set the imageTranslated property: The URL to the translated image of the page.
     *
     * @param imageTranslated the imageTranslated value to set.
     * @return the PageMeta object itself.
     */
    public PageMeta setImageTranslated(String imageTranslated) {
        this.imageTranslated = imageTranslated;
        return this;
    }

    /**
     * Get the height property: Height of the page's image in px.
     *
     * @return the height value.
     */
    public float getHeight() {
        return this.height;
    }

    /**
     * Set the height property: Height of the page's image in px.
     *
     * @param height the height value to set.
     * @return the PageMeta object itself.
     */
    public PageMeta setHeight(float height) {
        this.height = height;
        return this;
    }

    /**
     * Get the width property: Width of the page's image in px.
     *
     * @return the width value.
     */
    public float getWidth() {
        return this.width;
    }

    /**
     * Set the width property: Width of the page's image in px.
     *
     * @param width the width value to set.
     * @return the PageMeta object itself.
     */
    public PageMeta setWidth(float width) {
        this.width = width;
        return this;
    }

    /**
     * Get the rotation property: The degree of rotation applied to the page. Greater than 0 indicates clockwise
     * rotation. Less than 0 indicates counter-clockwise rotation.
     *
     * @return the rotation value.
     */
    public int getRotation() {
        return this.rotation;
    }

    /**
     * Set the rotation property: The degree of rotation applied to the page. Greater than 0 indicates clockwise
     * rotation. Less than 0 indicates counter-clockwise rotation.
     *
     * @param rotation the rotation value to set.
     * @return the PageMeta object itself.
     */
    public PageMeta setRotation(int rotation) {
        this.rotation = rotation;
        return this;
    }
}
