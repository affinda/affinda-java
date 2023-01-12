package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DocumentCollectionDateFormatPreference. */
public final class DocumentCollectionDateFormatPreference
        extends ExpandableStringEnum<DocumentCollectionDateFormatPreference> {
    /** Static value DMY for DocumentCollectionDateFormatPreference. */
    public static final DocumentCollectionDateFormatPreference DMY = fromString("DMY");

    /** Static value MDY for DocumentCollectionDateFormatPreference. */
    public static final DocumentCollectionDateFormatPreference MDY = fromString("MDY");

    /** Static value YMD for DocumentCollectionDateFormatPreference. */
    public static final DocumentCollectionDateFormatPreference YMD = fromString("YMD");

    /**
     * Creates or finds a DocumentCollectionDateFormatPreference from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DocumentCollectionDateFormatPreference.
     */
    @JsonCreator
    public static DocumentCollectionDateFormatPreference fromString(String name) {
        return fromString(name, DocumentCollectionDateFormatPreference.class);
    }

    /** @return known DocumentCollectionDateFormatPreference values. */
    public static Collection<DocumentCollectionDateFormatPreference> values() {
        return values(DocumentCollectionDateFormatPreference.class);
    }
}
