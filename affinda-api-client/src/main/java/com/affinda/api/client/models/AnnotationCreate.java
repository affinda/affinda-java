package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AnnotationCreate model. */
@Fluent
public final class AnnotationCreate {
    /*
     * x/y coordinates for the rectangles containing the data. An annotation
     * can be contained within multiple rectangles.
     */
    @JsonProperty(value = "rectangles")
    private List<Rectangle> rectangles;

    /*
     * Uniquely identify a document.
     */
    @JsonProperty(value = "document", required = true)
    private String document;

    /*
     * The page number within the document, starting from 0.
     */
    @JsonProperty(value = "pageIndex", required = true)
    private Integer pageIndex;

    /*
     * Data point's identifier
     */
    @JsonProperty(value = "dataPoint", required = true)
    private String dataPoint;

    /*
     * Raw data extracted from the before any post-processing
     */
    @JsonProperty(value = "raw")
    private String raw;

    /*
     * The parsed property.
     */
    @JsonProperty(value = "parsed")
    private Object parsed;

    /*
     * Indicates whether the data has been validated by a human
     */
    @JsonProperty(value = "isClientVerified")
    private Boolean isClientVerified;

    /*
     * The parent annotation's ID
     */
    @JsonProperty(value = "parent")
    private Integer parent;

    /**
     * Get the rectangles property: x/y coordinates for the rectangles containing the data. An annotation can be
     * contained within multiple rectangles.
     *
     * @return the rectangles value.
     */
    public List<Rectangle> getRectangles() {
        return this.rectangles;
    }

    /**
     * Set the rectangles property: x/y coordinates for the rectangles containing the data. An annotation can be
     * contained within multiple rectangles.
     *
     * @param rectangles the rectangles value to set.
     * @return the AnnotationCreate object itself.
     */
    public AnnotationCreate setRectangles(List<Rectangle> rectangles) {
        this.rectangles = rectangles;
        return this;
    }

    /**
     * Get the document property: Uniquely identify a document.
     *
     * @return the document value.
     */
    public String getDocument() {
        return this.document;
    }

    /**
     * Set the document property: Uniquely identify a document.
     *
     * @param document the document value to set.
     * @return the AnnotationCreate object itself.
     */
    public AnnotationCreate setDocument(String document) {
        this.document = document;
        return this;
    }

    /**
     * Get the pageIndex property: The page number within the document, starting from 0.
     *
     * @return the pageIndex value.
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * Set the pageIndex property: The page number within the document, starting from 0.
     *
     * @param pageIndex the pageIndex value to set.
     * @return the AnnotationCreate object itself.
     */
    public AnnotationCreate setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * Get the dataPoint property: Data point's identifier.
     *
     * @return the dataPoint value.
     */
    public String getDataPoint() {
        return this.dataPoint;
    }

    /**
     * Set the dataPoint property: Data point's identifier.
     *
     * @param dataPoint the dataPoint value to set.
     * @return the AnnotationCreate object itself.
     */
    public AnnotationCreate setDataPoint(String dataPoint) {
        this.dataPoint = dataPoint;
        return this;
    }

    /**
     * Get the raw property: Raw data extracted from the before any post-processing.
     *
     * @return the raw value.
     */
    public String getRaw() {
        return this.raw;
    }

    /**
     * Set the raw property: Raw data extracted from the before any post-processing.
     *
     * @param raw the raw value to set.
     * @return the AnnotationCreate object itself.
     */
    public AnnotationCreate setRaw(String raw) {
        this.raw = raw;
        return this;
    }

    /**
     * Get the parsed property: The parsed property.
     *
     * @return the parsed value.
     */
    public Object getParsed() {
        return this.parsed;
    }

    /**
     * Set the parsed property: The parsed property.
     *
     * @param parsed the parsed value to set.
     * @return the AnnotationCreate object itself.
     */
    public AnnotationCreate setParsed(Object parsed) {
        this.parsed = parsed;
        return this;
    }

    /**
     * Get the isClientVerified property: Indicates whether the data has been validated by a human.
     *
     * @return the isClientVerified value.
     */
    public Boolean isClientVerified() {
        return this.isClientVerified;
    }

    /**
     * Set the isClientVerified property: Indicates whether the data has been validated by a human.
     *
     * @param isClientVerified the isClientVerified value to set.
     * @return the AnnotationCreate object itself.
     */
    public AnnotationCreate setIsClientVerified(Boolean isClientVerified) {
        this.isClientVerified = isClientVerified;
        return this;
    }

    /**
     * Get the parent property: The parent annotation's ID.
     *
     * @return the parent value.
     */
    public Integer getParent() {
        return this.parent;
    }

    /**
     * Set the parent property: The parent annotation's ID.
     *
     * @param parent the parent value to set.
     * @return the AnnotationCreate object itself.
     */
    public AnnotationCreate setParent(Integer parent) {
        this.parent = parent;
        return this;
    }
}
