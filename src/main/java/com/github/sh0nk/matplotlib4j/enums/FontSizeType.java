package com.github.sh0nk.matplotlib4j.enums;

public enum FontSizeType {

    // List of enum constants representing the font sizes
    XX_SMALL("xx-small"),
    X_SMALL("x-small"),
    SMALL("small"),
    MEDIUM("medium"),
    LARGE("large"),
    X_LARGE("x-large"),
    XX_LARGE("xx-large");

    private String fontSize;

    private FontSizeType(String fontSize){
        this.fontSize = fontSize;
    }

    public String getFontSize() {
        return this.fontSize;
    }
}
