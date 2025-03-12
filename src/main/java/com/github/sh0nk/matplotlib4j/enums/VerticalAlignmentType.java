package com.github.sh0nk.matplotlib4j.enums;

public enum VerticalAlignmentType {

    // List of enum constants representing the vertical alignments
    BASELINE("baseline"),
    BOTTOM("bottom"),
    CENTER("center"),
    CENTER_BASELINE("center_baseline"),
    TOP("top");

    private String verticalAlignment;

    private VerticalAlignmentType(String verticalAlignment){
        this.verticalAlignment = verticalAlignment;
    }

    public String getVerticalAlignment() {
        return this.verticalAlignment;
    }

}
