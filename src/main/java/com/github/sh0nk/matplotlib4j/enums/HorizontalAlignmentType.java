package com.github.sh0nk.matplotlib4j.enums;

public enum HorizontalAlignmentType {

    // List of enum constants representing the horizontal alignments
    LEFT("left"),
    CENTER("center"),
    RIGHT("right");

    private String horizontalAlignment;

    private HorizontalAlignmentType(String horizontalAlignment){
        this.horizontalAlignment = horizontalAlignment;
    }

    public String getHorizontalAlignment() {
        return this.horizontalAlignment;
    }

}
