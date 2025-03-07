package com.github.sh0nk.matplotlib4j.enums;

public enum ParametrizedLineStyleType {

    // List of enum constants representing the linestyles
    LOOSELY_DOTTED("(0, (1, 10))"),
    DOTTED("(0, (1, 5))"),
    DENSELY_DOTTED("(0, (1, 1))"),
    LONG_DASH_WITH_OFFSET("(5, (10, 3))"),
    LOOSELY_DASHED("(0, (5, 10))"),
    DASHED("(0, (5, 5))"),
    DENSELY_DASHED("(0, (5, 1))"),
    LOOSELY_DASHDOTTED("(0, (3, 10, 1, 10))"),
    DASHDOTTED("(0, (3, 5, 1, 5))"),
    DENSELY_DASHDOTTED("(0, (3, 1, 1, 1))"),
    DASHDOTDOTTED("(0, (3, 5, 1, 5, 1, 5))"),
    LOOSELY_DASHDOTDOTTED("(0, (3, 10, 1, 10, 1, 10))"),
    DENSELY_DASHDOTDOTTED("(0, (3, 1, 1, 1, 1, 1))");

    private String nameStyle;

    private ParametrizedLineStyleType(String nameStyle) {
        this.nameStyle = nameStyle;

    }

    public String getNameStyle() {
        return this.nameStyle;
    }

}
