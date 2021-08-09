package affinda.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Components10Bc157ResponsesConversionerrorContentApplicationJsonSchema model. */
@Fluent
public final class Components10Bc157ResponsesConversionerrorContentApplicationJsonSchema {
    /*
     * The fileForConversion property.
     */
    @JsonProperty(value = "fileForConversion")
    private String fileForConversion;

    /**
     * Get the fileForConversion property: The fileForConversion property.
     *
     * @return the fileForConversion value.
     */
    public String getFileForConversion() {
        return this.fileForConversion;
    }

    /**
     * Set the fileForConversion property: The fileForConversion property.
     *
     * @param fileForConversion the fileForConversion value to set.
     * @return the Components10Bc157ResponsesConversionerrorContentApplicationJsonSchema object itself.
     */
    public Components10Bc157ResponsesConversionerrorContentApplicationJsonSchema setFileForConversion(
            String fileForConversion) {
        this.fileForConversion = fileForConversion;
        return this;
    }
}
