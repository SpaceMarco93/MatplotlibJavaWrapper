package com.github.sh0nk.matplotlib4j.enums;

public enum ScaleUnitsType {

    // List of enum constants representing the scale units types
    WIDTH("width"),
    HEIGHT("height"),
    DOTS("dots"),
    INCHES("inches"),
    X("x"),
    Y("y"),
    XY("xy");

    private String scaleUnit;

    private ScaleUnitsType(String scaleUnit) {
        this.scaleUnit = scaleUnit;
    }

    public String getScaleUnit() {
        return this.scaleUnit;
    }

}
