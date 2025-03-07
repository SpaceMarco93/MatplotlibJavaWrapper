package com.github.sh0nk.matplotlib4j.enums;

public enum ColorType {

    // List of enum constants representing the colors
    BLUE("b"),
    GREEN("g"),
    RED("r"),
    CYAN("c"),
    MAGENTA("m"),
    YELLOW("y"),
    BLACK("k"),
    WHITE("w"),
    AQUAMARINE("aquamarine"),
    MEDIUM_SEA_GREEN("mediumseagreen"),
    SKY_BLUE("xkcd:sky blue"),
    EGG_SHELL("xkcd:eggshell"),
    TAB_BLUE("tab:blue"),
    TAB_ORANGE("tab:orange"),
    TAB_GREEN("tab:green"),
    TAB_RED("tab:red"),
    TAB_PURPLE("tab:purple"),
    TAB_BROWN("tab:brown"),
    TAB_PINK("tab:pink"),
    TAB_GRAY("tab:gray"),
    TAB_OLIVE("tab:olive"),
    TAB_CYAN("tab:cyan");

    private String color;

    private ColorType(String color){
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

}
