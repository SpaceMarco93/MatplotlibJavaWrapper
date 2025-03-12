package com.github.sh0nk.matplotlib4j.enums;

public enum ScaleType {

    // List of enum constants representing the scale types
    ASINH("asinn"),
    FUNCTION("funtion"),
    FUNCTIONLOG("functionlog"),
    LINEAR("linear"),
    LOG("log"),
    LOGIT("logit"),
    SYMLOG("symlog");

    private String scale;

    private ScaleType(String scale){
        this.scale = scale;
    }

    public String getScale() {
        return this.scale;
    }

}
