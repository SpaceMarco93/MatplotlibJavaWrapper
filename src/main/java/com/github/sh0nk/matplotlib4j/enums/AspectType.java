package com.github.sh0nk.matplotlib4j.enums;

public enum AspectType {

    // List of enum constants representing the aspect types
    AUTO("auto"),
    EQUAL("equal");

    private String aspect;

    private AspectType(String aspect) {
        this.aspect = aspect;
    }

    public String getAspect() {
        return this.aspect;
    }

}
