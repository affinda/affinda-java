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
     * The id property.
     */
    @JsonProperty(value = "id", required = true)
    private int id;

    /*
     * The rectangle property.
     */
    @JsonProperty(value = "rectangle", required = true)
    private Rectangle rectangle;

    /*
     * The rectangles property.
     */
    @JsonProperty(value = "rectangles", required = true)
    private List<Rectangle> rectangles;

    /*
     * The pageIndex property.
     */
    @JsonProperty(value = "pageIndex", required = true)
    private Integer pageIndex;

    /*
     * The raw property.
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
     * the text in the image has been correctly read by the model.
     */
    @JsonProperty(value = "textExtractionConfidence", required = true)
    private Float textExtractionConfidence;

    /*
     * The isVerified property.
     */
    @JsonProperty(value = "isVerified", required = true)
    private boolean isVerified;

    /*
     * The isClientVerified property.
     */
    @JsonProperty(value = "isClientVerified", required = true)
    private boolean isClientVerified;

    /*
     * The isAutoVerified property.
     */
    @JsonProperty(value = "isAutoVerified", required = true)
    private boolean isAutoVerified;

    /*
     * The dataPoint property.
     */
    @JsonProperty(value = "dataPoint")
    private String dataPoint;

    /*
     * The contentType property.
     */
    @JsonProperty(value = "contentType", required = true)
    private String contentType;

    /*
     * Dictionary of <any>
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

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
     * @return the Annotation object itself.
     */
    public Annotation setId(int id) {
        this.id = id;
        return this;
    }

    /**
     * Get the rectangle property: The rectangle property.
     *
     * @return the rectangle value.
     */
    public Rectangle getRectangle() {
        return this.rectangle;
    }

    /**
     * Set the rectangle property: The rectangle property.
     *
     * @param rectangle the rectangle value to set.
     * @return the Annotation object itself.
     */
    public Annotation setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
        return this;
    }

    /**
     * Get the rectangles property: The rectangles property.
     *
     * @return the rectangles value.
     */
    public List<Rectangle> getRectangles() {
        return this.rectangles;
    }

    /**
     * Set the rectangles property: The rectangles property.
     *
     * @param rectangles the rectangles value to set.
     * @return the Annotation object itself.
     */
    public Annotation setRectangles(List<Rectangle> rectangles) {
        this.rectangles = rectangles;
        return this;
    }

    /**
     * Get the pageIndex property: The pageIndex property.
     *
     * @return the pageIndex value.
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * Set the pageIndex property: The pageIndex property.
     *
     * @param pageIndex the pageIndex value to set.
     * @return the Annotation object itself.
     */
    public Annotation setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * Get the raw property: The raw property.
     *
     * @return the raw value.
     */
    public String getRaw() {
        return this.raw;
    }

    /**
     * Set the raw property: The raw property.
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
     * Get the isVerified property: The isVerified property.
     *
     * @return the isVerified value.
     */
    public boolean isVerified() {
        return this.isVerified;
    }

    /**
     * Set the isVerified property: The isVerified property.
     *
     * @param isVerified the isVerified value to set.
     * @return the Annotation object itself.
     */
    public Annotation setIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
        return this;
    }

    /**
     * Get the isClientVerified property: The isClientVerified property.
     *
     * @return the isClientVerified value.
     */
    public boolean isClientVerified() {
        return this.isClientVerified;
    }

    /**
     * Set the isClientVerified property: The isClientVerified property.
     *
     * @param isClientVerified the isClientVerified value to set.
     * @return the Annotation object itself.
     */
    public Annotation setIsClientVerified(boolean isClientVerified) {
        this.isClientVerified = isClientVerified;
        return this;
    }

    /**
     * Get the isAutoVerified property: The isAutoVerified property.
     *
     * @return the isAutoVerified value.
     */
    public boolean isAutoVerified() {
        return this.isAutoVerified;
    }

    /**
     * Set the isAutoVerified property: The isAutoVerified property.
     *
     * @param isAutoVerified the isAutoVerified value to set.
     * @return the Annotation object itself.
     */
    public Annotation setIsAutoVerified(boolean isAutoVerified) {
        this.isAutoVerified = isAutoVerified;
        return this;
    }

    /**
     * Get the dataPoint property: The dataPoint property.
     *
     * @return the dataPoint value.
     */
    public String getDataPoint() {
        return this.dataPoint;
    }

    /**
     * Set the dataPoint property: The dataPoint property.
     *
     * @param dataPoint the dataPoint value to set.
     * @return the Annotation object itself.
     */
    public Annotation setDataPoint(String dataPoint) {
        this.dataPoint = dataPoint;
        return this;
    }

    /**
     * Get the contentType property: The contentType property.
     *
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The contentType property.
     *
     * @param contentType the contentType value to set.
     * @return the Annotation object itself.
     */
    public Annotation setContentType(String contentType) {
        this.contentType = contentType;
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
