package com.github.sh0nk.matplotlib4j.enums;

public enum HistOrientationType {

    // List of enum constants representing the histogram orientation types
    VERTICAL("vertical"),
    HORIZONAL("horizontal");

    private String orientation;

    private HistOrientationType(String orientation){
        this.orientation = orientation;
    }

    public String getOrientation() {
        return this.orientation;
    }

}
