package com.affinda.api.client.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ThemeConfigPaletteMode. */
public final class ThemeConfigPaletteMode extends ExpandableStringEnum<ThemeConfigPaletteMode> {
    /** Static value light for ThemeConfigPaletteMode. */
    public static final ThemeConfigPaletteMode LIGHT = fromString("light");

    /** Static value dark for ThemeConfigPaletteMode. */
    public static final ThemeConfigPaletteMode DARK = fromString("dark");

    /**
     * Creates or finds a ThemeConfigPaletteMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ThemeConfigPaletteMode.
     */
    @JsonCreator
    public static ThemeConfigPaletteMode fromString(String name) {
        return fromString(name, ThemeConfigPaletteMode.class);
    }

    /** @return known ThemeConfigPaletteMode values. */
    public static Collection<ThemeConfigPaletteMode> values() {
        return values(ThemeConfigPaletteMode.class);
    }
}
