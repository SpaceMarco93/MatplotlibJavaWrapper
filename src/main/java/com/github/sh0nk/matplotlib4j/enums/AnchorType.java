package com.github.sh0nk.matplotlib4j.enums;

public enum AnchorType {

    // List of enum constants representing the anchor types
    NORTH_WEST("NW"),
    NORTH("N"),
    NORTH_EAST("NE"),
    WEST("W"),
    CENTER("C"),
    EAST("E"),
    SOUTH_WEST("SW"),
    SOUTH("S"),
    SOUTH_EAST("SE");
    
    private String anchor;

    private AnchorType(String anchor) {
        this.anchor = anchor;
    }

    public String getAnchor() {
        return this.anchor;
    }

}
