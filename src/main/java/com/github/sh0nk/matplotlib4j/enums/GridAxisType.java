package com.github.sh0nk.matplotlib4j.enums;

public enum GridAxisType {

    // List of enum constants representing the grid axis
    X("x"),
    Y("y"),
    BOTH("both");

    private String gridAxis;

    private GridAxisType(String gridAxis){
        this.gridAxis = gridAxis;
    }

    public String getGridAxis() {
        return this.gridAxis;
    }

}
