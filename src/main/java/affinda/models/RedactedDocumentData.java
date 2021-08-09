package affinda.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.URL;

/** The RedactedDocumentData model. */
@Fluent
public final class RedactedDocumentData {
    /*
     * The redactedPdf property.
     */
    @JsonProperty(value = "redactedPdf")
    private URL redactedPdf;

    /**
     * Get the redactedPdf property: The redactedPdf property.
     *
     * @return the redactedPdf value.
     */
    public URL getRedactedPdf() {
        return this.redactedPdf;
    }

    /**
     * Set the redactedPdf property: The redactedPdf property.
     *
     * @param redactedPdf the redactedPdf value to set.
     * @return the RedactedDocumentData object itself.
     */
    public RedactedDocumentData setRedactedPdf(URL redactedPdf) {
        this.redactedPdf = redactedPdf;
        return this;
    }
}
