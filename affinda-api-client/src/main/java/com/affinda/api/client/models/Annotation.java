package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** The Annotation model. */
@Fluent
public class Annotation {
    /*
     * Annotation's ID
     */
    @JsonProperty(value = "id", required = true)
    private int id;

    /*
     * x/y coordinates for the rectangular bounding box containing the data
     */
    @JsonProperty(value = "rectangle", required = true)
    private Rectangle rectangle;

    /*
     * x/y coordinates for the rectangles containing the data. An annotation
     * can be contained within multiple rectangles.
     */
    @JsonProperty(value = "rectangles", required = true)
    private List<Rectangle> rectangles;

    /*
     * Unique identifier for the document
     */
    @JsonProperty(value = "document", required = true)
    private String document;

    /*
     * The page number within the document, starting from 0.
     */
    @JsonProperty(value = "pageIndex", required = true)
    private Integer pageIndex;

    /*
     * Raw data extracted from the before any post-processing
     */
    @JsonProperty(value = "raw", required = true)
    private String raw;

    /*
     * The overall confidence that the model's prediction is correct
     */
    @JsonProperty(value = "confidence", required = true)
    private Float confidence;

    /*
     * The model's confidence that the text has been classified correctly
     */
    @JsonProperty(value = "classificationConfidence", required = true)
    private Float classificationConfidence;

    /*
     * If the document was submitted as an image, this is the confidence that
     * the text in the image has been correctly read by the model
     */
    @JsonProperty(value = "textExtractionConfidence", required = true)
    private Float textExtractionConfidence;

    /*
     * Indicates whether the data has been validated, either by a human using
     * our validation tool or through auto-validation rules
     */
    @JsonProperty(value = "isVerified", required = true)
    private boolean isVerified;

    /*
     * Indicates whether the data has been validated by a human
     */
    @JsonProperty(value = "isClientVerified", required = true)
    private boolean isClientVerified;

    /*
     * Indicates whether the data has been auto-validated
     */
    @JsonProperty(value = "isAutoVerified", required = true)
    private boolean isAutoVerified;

    /*
     * Data point's identifier
     */
    @JsonProperty(value = "dataPoint", required = true)
    private String dataPoint;

    /*
     * The different data types of annotations
     */
    @JsonProperty(value = "contentType", required = true)
    private AnnotationContentType contentType;

    /*
     * The parent annotation's ID
     */
    @JsonProperty(value = "parent")
    private Integer parent;

    /*
     * Dictionary of <any>
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the id property: Annotation's ID.
     *
     * @return the id value.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Set the id property: Annotation's ID.
     *
     * @param id the id value to set.
     * @return the Annotation object itself.
     */
    public Annotation setId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Get the rectangle property: x/y coordinates for the rectangular bounding box containing the data.
     *
     * @return the rectangle value.
     */
    public Rectangle getRectangle() {
        return this.rectangle;
    }

    /**
     * Set the rectangle property: x/y coordinates for the rectangular bounding box containing the data.
     *
     * @param rectangle the rectangle value to set.
     * @return the Annotation object itself.
     */
    public Annotation setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
        return this;
    }

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
     * @return the Annotation object itself.
     */
    public Annotation setRectangles(List<Rectangle> rectangles) {
        this.rectangles = rectangles;
        return this;
    }

    /**
     * Get the document property: Unique identifier for the document.
     *
     * @return the document value.
     */
    public String getDocument() {
        return this.document;
    }

    /**
     * Set the document property: Unique identifier for the document.
     *
     * @param document the document value to set.
     * @return the Annotation object itself.
     */
    public Annotation setDocument(String document) {
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
     * @return the Annotation object itself.
     */
    public Annotation setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
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
     * @return the Annotation object itself.
     */
    public Annotation setRaw(String raw) {
        this.raw = raw;
        return this;
    }

    /**
     * Get the confidence property: The overall confidence that the model's prediction is correct.
     *
     * @return the confidence value.
     */
    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * Set the confidence property: The overall confidence that the model's prediction is correct.
     *
     * @param confidence the confidence value to set.
     * @return the Annotation object itself.
     */
    public Annotation setConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * Get the classificationConfidence property: The model's confidence that the text has been classified correctly.
     *
     * @return the classificationConfidence value.
     */
    public Float getClassificationConfidence() {
        return this.classificationConfidence;
    }

    /**
     * Set the classificationConfidence property: The model's confidence that the text has been classified correctly.
     *
     * @param classificationConfidence the classificationConfidence value to set.
     * @return the Annotation object itself.
     */
    public Annotation setClassificationConfidence(Float classificationConfidence) {
        this.classificationConfidence = classificationConfidence;
        return this;
    }

    /**
     * Get the textExtractionConfidence property: If the document was submitted as an image, this is the confidence that
     * the text in the image has been correctly read by the model.
     *
     * @return the textExtractionConfidence value.
     */
    public Float getTextExtractionConfidence() {
        return this.textExtractionConfidence;
    }

    /**
     * Set the textExtractionConfidence property: If the document was submitted as an image, this is the confidence that
     * the text in the image has been correctly read by the model.
     *
     * @param textExtractionConfidence the textExtractionConfidence value to set.
     * @return the Annotation object itself.
     */
    public Annotation setTextExtractionConfidence(Float textExtractionConfidence) {
        this.textExtractionConfidence = textExtractionConfidence;
        return this;
    }

    /**
     * Get the isVerified property: Indicates whether the data has been validated, either by a human using our
     * validation tool or through auto-validation rules.
     *
     * @return the isVerified value.
     */
    public boolean isVerified() {
        return this.isVerified;
    }

    /**
     * Set the isVerified property: Indicates whether the data has been validated, either by a human using our
     * validation tool or through auto-validation rules.
     *
     * @param isVerified the isVerified value to set.
     * @return the Annotation object itself.
     */
    public Annotation setIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
        return this;
    }

    /**
     * Get the isClientVerified property: Indicates whether the data has been validated by a human.
     *
     * @return the isClientVerified value.
     */
    public boolean isClientVerified() {
        return this.isClientVerified;
    }

    /**
     * Set the isClientVerified property: Indicates whether the data has been validated by a human.
     *
     * @param isClientVerified the isClientVerified value to set.
     * @return the Annotation object itself.
     */
    public Annotation setIsClientVerified(boolean isClientVerified) {
        this.isClientVerified = isClientVerified;
        return this;
    }

    /**
     * Get the isAutoVerified property: Indicates whether the data has been auto-validated.
     *
     * @return the isAutoVerified value.
     */
    public boolean isAutoVerified() {
        return this.isAutoVerified;
    }

    /**
     * Set the isAutoVerified property: Indicates whether the data has been auto-validated.
     *
     * @param isAutoVerified the isAutoVerified value to set.
     * @return the Annotation object itself.
     */
    public Annotation setIsAutoVerified(boolean isAutoVerified) {
        this.isAutoVerified = isAutoVerified;
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
     * @return the Annotation object itself.
     */
    public Annotation setDataPoint(String dataPoint) {
        this.dataPoint = dataPoint;
        return this;
    }

    /**
     * Get the contentType property: The different data types of annotations.
     *
     * @return the contentType value.
     */
    public AnnotationContentType getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The different data types of annotations.
     *
     * @param contentType the contentType value to set.
     * @return the Annotation object itself.
     */
    public Annotation setContentType(AnnotationContentType contentType) {
        this.contentType = contentType;
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
     * @return the Annotation object itself.
     */
    public Annotation setParent(Integer parent) {
        this.parent = parent;
        return this;
    }

    /**
     * Get the additionalProperties property: Dictionary of &lt;any&gt;.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Dictionary of &lt;any&gt;.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the Annotation object itself.
     */
    public Annotation setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void setAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }
}
