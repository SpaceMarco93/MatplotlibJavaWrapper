package com.github.sh0nk.matplotlib4j.enums;

public enum JoinStyleType {

    // List of enum constants representing the joinstyle types
    MITER("miter"),
    ROUND("round"),
    BEVEL("bevel");

    private String joinStyle;

    private JoinStyleType(String joinStyle){
        this.joinStyle = joinStyle;
    }

    public String getJoinStyle() {
        return this.joinStyle;
    }
}
