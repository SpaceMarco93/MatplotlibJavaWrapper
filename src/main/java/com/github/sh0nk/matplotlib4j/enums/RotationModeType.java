package com.github.sh0nk.matplotlib4j.enums;

public enum RotationModeType {

    // List of enum constants representing the rotation modes
    DEFAULT("default"),
    ANCHOR("anchor");

    private String rotationMode;

    private RotationModeType(String rotationMode){
        this.rotationMode = rotationMode;
    }

    public String getRotationMode() {
        return this.rotationMode;
    }

}
