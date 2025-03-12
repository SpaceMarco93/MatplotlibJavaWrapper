package com.github.sh0nk.matplotlib4j.enums;

public enum FormatType {

    // List of enum constants representing the format types
    PNG("png"),
    PDF("pdf"),
    SVG("svg");

    private String format;

    private FormatType(String format){
        this.format = format;
    }

    public String getFormat() {
        return this.format;
    }

}
