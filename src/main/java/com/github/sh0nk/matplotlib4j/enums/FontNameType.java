package com.github.sh0nk.matplotlib4j.enums;

public enum FontNameType {

    // List of enum constants representing the font names
    SERIF("serif"),
    SANS_SERIF("sans_serif"),
    CURSIVE("cursive"),
    FANTASY("fantasy"),
    MONOSPACE("monospace");

    private String fontName;

    private FontNameType(String fontName){
        this.fontName = fontName;
    }

    public String getFontName() {
        return this.fontName;
    }
}
