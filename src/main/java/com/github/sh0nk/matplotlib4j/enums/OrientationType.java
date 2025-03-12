package com.github.sh0nk.matplotlib4j.enums;

public enum OrientationType {

    // List of enum constants representing the font stretches
    LANDSCAPE("landscape"),
    PORTRAIT("portrait");

    private String orientation;

    private OrientationType(String orientation){
        this.orientation = orientation;
    }

    public String getOrientation() {
        return this.orientation;
    }

}
