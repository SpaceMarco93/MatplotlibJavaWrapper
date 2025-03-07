package com.github.sh0nk.matplotlib4j.enums;

public enum MarkerStyleType {

    // List of enum constant representing the marker styles
    POINT("."),
    PIXEL(","),
    CIRCLE("o"),
    TRIANGLE_DOWN("v"),
    TRIANGLE_UP("^"),
    TRIANGLE_LEFT("<"),
    TRIANGLE_RIGHT(">"),
    TRI_DOWN("1"),
    TRI_UP("2"),
    TRI_LEFT("3"),
    TRI_RIGHT("4"),
    OCTAGON("8"),
    SQUARE("s"),
    PENTAGON("p"),
    PLUS_FILLED("P"),
    STAR("*"),
    HEXAGON_1("h"),
    HEXAGON_2("H"),
    PLUS("+"),
    X("x"),
    X_FILLED("X"),
    DIAMOND("D"),
    THIN_DIAMOND("d"),
    V_LINE("|"),
    H_LINE("_");

    private final String markerStyle;

    private MarkerStyleType(String markerStyle) {
        this.markerStyle = markerStyle;
    }

    public String getMarkerStyle() {
        return this.markerStyle;
    }

}
