package com.github.sh0nk.matplotlib4j.enums;

public enum AdjustableType {

    // List of enum constants representing the adjustable options
    BOX("box"),
    DATALIM("datalim");

    private String adjustable;

    private AdjustableType(String adjustable){
        this.adjustable = adjustable;
    }

    public String getAdjustable() {
        return this.adjustable;
    }

}
