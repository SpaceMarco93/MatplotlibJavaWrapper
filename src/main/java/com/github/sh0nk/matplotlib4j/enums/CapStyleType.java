package com.github.sh0nk.matplotlib4j.enums;

public enum CapStyleType {

    // List of enum constants representing the capstyle types
    BUTT("butt"),
    PROJECTIN("projecting"),
    ROUND("round");

    private String capStyle;

    private CapStyleType(String capStyle) {
        this.capStyle = capStyle;
    }

    public String getCapStyle() {
        return this.capStyle;
    }
}
