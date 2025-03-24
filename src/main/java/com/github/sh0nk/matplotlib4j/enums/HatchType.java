package com.github.sh0nk.matplotlib4j.enums;

public enum HatchType {

    // List of enum constants representing the hatch types
    DIAGONAL_HATCHING("/"),
    BACK_DIAGONAL("\\"),
    VERTICAL("|"),
    HORIZONTAL("-"),
    CROSSED("+"),
    CROSSED_DIAGONAL("x"),
    SMALL_CIRCLE("o"),
    LARGE_CIRCLE("O"),
    DOTS("."),
    STARS("*");

    private String hatch;

    private HatchType(String hatch){
        this.hatch = hatch;
    }

    public String getHacth() {
        return this.hatch;
    }
}
