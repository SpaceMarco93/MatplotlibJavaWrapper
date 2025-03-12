package com.github.sh0nk.matplotlib4j.enums;

public enum ProjectionType {

    // List of enum constants representing the extend types
    AITOFF("aitoff"),
    HAMMER("hammer"),
    LAMBERT("lambert"),
    MOLLWEIDE("mollweide"),
    POLAR("polar"),
    RECTILINEAR("rectilinear");

    private String projection;

    private ProjectionType(String projection) {
        this.projection = projection;
    }

    public String getProjection() {
        return this.projection;
    }

}
