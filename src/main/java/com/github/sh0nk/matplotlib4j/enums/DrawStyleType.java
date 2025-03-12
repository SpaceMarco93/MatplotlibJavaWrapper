package com.github.sh0nk.matplotlib4j.enums;

public enum DrawStyleType {

    // List of enum constants representing the draw styles
    DEFAULT("default"),
    STEPS("steps"),
    STEPS_PRE("steps-pre"),
    STEPS_MID("steps-mid"),
    STEPS_POST("steps-post");

    private String drawStyle;

    private DrawStyleType(String drawStyle){
        this.drawStyle = drawStyle;
    }

    public String getDrawStyle() {
        return this.drawStyle;
    }

}
