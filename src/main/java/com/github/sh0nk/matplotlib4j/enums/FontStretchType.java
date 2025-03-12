package com.github.sh0nk.matplotlib4j.enums;

public enum FontStretchType {

    // List of enum constants representing the font stretches
    ULTRA_CONDENSED("ultra-condensed"),
    EXTRA_CONDENSED("extra-condensed"),
    NORMAL("normal"),
    SEMI_EXPANDED("semi-expanded"),
    EXPANDED("expanded"),
    EXTRA_EXPANDED("extra-expanded"),
    ULTRA_EXPANDED("ultre-expanded");

    private String fontStretch;

    private FontStretchType(String fontStretch){
        this.fontStretch = fontStretch;
    }

    public String getFontStretch() {
        return this.fontStretch;
    }

}
