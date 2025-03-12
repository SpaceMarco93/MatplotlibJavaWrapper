package com.github.sh0nk.matplotlib4j.enums;

public enum FontVariantType {

    // List of enum constants representing the font variants
    NORMAL("normal"),
    SMALL_CAPS("small-caps");

    private String fontVariant;

    private FontVariantType(String fontVariant){
        this.fontVariant = fontVariant;
    }

    public String getFontVariant() {
        return this.fontVariant;
    }

}
