package com.github.sh0nk.matplotlib4j.enums;

public enum AdjutableType {

    // List of enum constants representing the adjustable options
    BOX("box"),
    DATALIM("datalim");

    private String adjustable;

    private AdjutableType(String adjustable){
        this.adjustable = adjustable;
    }

    public String getAdjustable() {
        return this.adjustable;
    }

}
