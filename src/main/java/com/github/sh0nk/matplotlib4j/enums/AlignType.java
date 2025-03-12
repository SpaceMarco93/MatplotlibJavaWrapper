package com.github.sh0nk.matplotlib4j.enums;

public enum AlignType {

    // List of enum constants representing the alignments types
    LEFT("left"),
    MID("mid"),
    RIGHT("right");

    private String align;

    private AlignType(String align){
        this.align = align;
    }

    public String getAlign() {
        return this.align;
    }

}
