package com.github.sh0nk.matplotlib4j.enums;

public enum FontStyleType {

    // List of enum constants representing the font styles
    NORMAL("normal"),
    ITALIC("italic"),
    OBLIQUE("oblique");

    private String fontStyle;

    private FontStyleType(String fontStyle){
        this.fontStyle = fontStyle;
    }

    public String getFontStyle() {
        return this.fontStyle;
    }

}
