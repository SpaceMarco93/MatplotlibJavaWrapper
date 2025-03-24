package com.github.sh0nk.matplotlib4j.enums;

public enum PivotType {

    // List of enum constants representing the pivot types
    TAIL("tail"),
    MID("mid"),
    MIDDLE("middle"),
    TIP("tip");


    private String pivot;

    private PivotType(String pivot) {
        this.pivot = pivot;
    }

    public String getPivot() {
        return this.pivot;
    }
}
