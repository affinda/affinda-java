package affinda.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResumeDataName model. */
@Fluent
public final class ResumeDataName {
    /*
     * The raw property.
     */
    @JsonProperty(value = "raw")
    private String raw;

    /*
     * The first property.
     */
    @JsonProperty(value = "first")
    private String first;

    /*
     * The last property.
     */
    @JsonProperty(value = "last")
    private String last;

    /*
     * The middle property.
     */
    @JsonProperty(value = "middle")
    private String middle;

    /*
     * The title property.
     */
    @JsonProperty(value = "title")
    private String title;

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
     * @return the ResumeDataName object itself.
     */
    public ResumeDataName setRaw(String raw) {
        this.raw = raw;
        return this;
    }

    /**
     * Get the first property: The first property.
     *
     * @return the first value.
     */
    public String getFirst() {
        return this.first;
    }

    /**
     * Set the first property: The first property.
     *
     * @param first the first value to set.
     * @return the ResumeDataName object itself.
     */
    public ResumeDataName setFirst(String first) {
        this.first = first;
        return this;
    }

    /**
     * Get the last property: The last property.
     *
     * @return the last value.
     */
    public String getLast() {
        return this.last;
    }

    /**
     * Set the last property: The last property.
     *
     * @param last the last value to set.
     * @return the ResumeDataName object itself.
     */
    public ResumeDataName setLast(String last) {
        this.last = last;
        return this;
    }

    /**
     * Get the middle property: The middle property.
     *
     * @return the middle value.
     */
    public String getMiddle() {
        return this.middle;
    }

    /**
     * Set the middle property: The middle property.
     *
     * @param middle the middle value to set.
     * @return the ResumeDataName object itself.
     */
    public ResumeDataName setMiddle(String middle) {
        this.middle = middle;
        return this;
    }

    /**
     * Get the title property: The title property.
     *
     * @return the title value.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Set the title property: The title property.
     *
     * @param title the title value to set.
     * @return the ResumeDataName object itself.
     */
    public ResumeDataName setTitle(String title) {
        this.title = title;
        return this;
    }
}
