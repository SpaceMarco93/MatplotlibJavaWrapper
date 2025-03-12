package com.github.sh0nk.matplotlib4j.enums;

public enum RotationType {

    // List of enum constants representing the rotations
    VERTICAL("vertical"),
    HORIZONTAL("horizontal");

    private String rotation;

    private RotationType(String rotation){
        this.rotation = rotation;
    }

    public String getRotation() {
        return this.rotation;
    }

}
