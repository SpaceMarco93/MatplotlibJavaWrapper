package com.github.sh0nk.matplotlib4j.enums;

public enum LocationType {

    // List of enum constants representing the locations
    BEST("best"),
    UPPER_RIGHT("upper right"),
    UPPER_LEFT("upper left"),
    LOWER_LEFT("lower left"),
    LOWER_RIGHT("lower right"),
    RIGHT("right"),
    CENTER_LEFT("center left"),
    CENTER_RIGHT("center right"),
    LOWER_CENTER("lower center"),
    UPPER_CENTER("upper center"),
    CENTER("center");

    private String location;

    private LocationType(String location){
        this.location = location;
    }

    public String getLocation() {
        return this.location;
    }

}
