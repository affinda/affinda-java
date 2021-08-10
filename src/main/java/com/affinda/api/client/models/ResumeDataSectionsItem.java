package com.affinda.api.client.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ResumeDataSectionsItem model. */
@Fluent
public final class ResumeDataSectionsItem {
    /*
     * The sectionType property.
     */
    @JsonProperty(value = "sectionType")
    private String sectionType;

    /*
     * The bbox property.
     */
    @JsonProperty(value = "bbox")
    private List<Float> bbox;

    /*
     * The pageIndex property.
     */
    @JsonProperty(value = "pageIndex")
    private Integer pageIndex;

    /*
     * The text property.
     */
    @JsonProperty(value = "text")
    private String text;

    /**
     * Get the sectionType property: The sectionType property.
     *
     * @return the sectionType value.
     */
    public String getSectionType() {
        return this.sectionType;
    }

    /**
     * Set the sectionType property: The sectionType property.
     *
     * @param sectionType the sectionType value to set.
     * @return the ResumeDataSectionsItem object itself.
     */
    public ResumeDataSectionsItem setSectionType(String sectionType) {
        this.sectionType = sectionType;
        return this;
    }

    /**
     * Get the bbox property: The bbox property.
     *
     * @return the bbox value.
     */
    public List<Float> getBbox() {
        return this.bbox;
    }

    /**
     * Set the bbox property: The bbox property.
     *
     * @param bbox the bbox value to set.
     * @return the ResumeDataSectionsItem object itself.
     */
    public ResumeDataSectionsItem setBbox(List<Float> bbox) {
        this.bbox = bbox;
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
     * @return the ResumeDataSectionsItem object itself.
     */
    public ResumeDataSectionsItem setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    /**
     * Get the text property: The text property.
     *
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: The text property.
     *
     * @param text the text value to set.
     * @return the ResumeDataSectionsItem object itself.
     */
    public ResumeDataSectionsItem setText(String text) {
        this.text = text;
        return this;
    }
}
