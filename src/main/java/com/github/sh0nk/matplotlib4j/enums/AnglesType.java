package com.github.sh0nk.matplotlib4j.enums;

public enum AnglesType {

    // List of enum constants representing the angles types
    UV("uv"),
    XY("xy");
    
    private String angles;

    private AnglesType(String angles) {
        this.angles = angles;
    }

    public String getAngles() {
        return this.angles;
    }

}
