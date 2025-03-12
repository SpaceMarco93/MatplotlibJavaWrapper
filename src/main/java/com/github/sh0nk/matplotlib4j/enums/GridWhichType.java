package com.github.sh0nk.matplotlib4j.enums;

public enum GridWhichType {

    // List of enum constants representing the grid which
    MAJOR("major"),
    MINOR("minor"),
    BOTH("both");

    private String gridWhich;

    private GridWhichType(String gridWhich){
        this.gridWhich = gridWhich;
    }

    public String getGridWhich() {
        return this.gridWhich;
    }
 
}
