package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Get8ItemsItem. */
public final class Get8ItemsItem extends ExpandableStringEnum<Get8ItemsItem> {
    /** Static value file_name for Get8ItemsItem. */
    public static final Get8ItemsItem FILE_NAME = fromString("file_name");

    /** Static value extractor for Get8ItemsItem. */
    public static final Get8ItemsItem EXTRACTOR = fromString("extractor");

    /** Static value created_dt for Get8ItemsItem. */
    public static final Get8ItemsItem CREATED_DT = fromString("created_dt");

    /**
     * Creates or finds a Get8ItemsItem from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Get8ItemsItem.
     */
    @JsonCreator
    public static Get8ItemsItem fromString(String name) {
        return fromString(name, Get8ItemsItem.class);
    }

    /** @return known Get8ItemsItem values. */
    public static Collection<Get8ItemsItem> values() {
        return values(Get8ItemsItem.class);
    }
}
