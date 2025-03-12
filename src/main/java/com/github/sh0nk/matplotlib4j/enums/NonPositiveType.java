package com.github.sh0nk.matplotlib4j.enums;

public enum NonPositiveType {

    // List of enum constants representing the non-positive types
    MASK("mask"),
    CLIP("clip");

    private String nonpositive;

    private NonPositiveType(String nonpositive){
        this.nonpositive = nonpositive;
    }

    public String getNonpositive() {
        return this.nonpositive;
    }

}
