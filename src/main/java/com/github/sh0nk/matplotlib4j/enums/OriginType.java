package com.github.sh0nk.matplotlib4j.enums;

public enum OriginType {

    // List of enum constants representing the origin types
    UPPER("upper"),
    LOWER("lower"),
    IMAGE("image");

    private String origin;

    private OriginType(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return this.origin;
    }

}
