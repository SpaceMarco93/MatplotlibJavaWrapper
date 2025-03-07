package com.github.sh0nk.matplotlib4j.enums;

public enum LineStyleType {

    // List of enum constants representing the linestyles
    SOLID("solid"),
    DOTTED("dotted"),
    DASHED("dashed"),
    DASHDOT("dashdot");


    private String lineStyle;

    private LineStyleType(String lineStyle){
        this.lineStyle = lineStyle;
    }

    public String getLineStyle() {
        return this.lineStyle;
    }

}
