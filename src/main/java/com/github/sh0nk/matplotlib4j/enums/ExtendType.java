package com.github.sh0nk.matplotlib4j.enums;

public enum ExtendType {

    // List of enum constants representing the extend types
    NEITHER("neither"),
    BOTH("both"),
    MIN("min"),
    MAX("max");

    private String extend;

    private ExtendType(String extend) {
        this.extend = extend;
    }

    public String getExtend() {
        return this.extend;
    }

}
