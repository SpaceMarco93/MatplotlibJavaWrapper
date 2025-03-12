package com.github.sh0nk.matplotlib4j.enums;

public enum FontWeightType {

    // List of enum constants representing the font weights
    ULTRALIGHT("ultralight"),
    LIGHT("light"),
    NORMAL("normal"),
    REGULAR("regular"),
    BOOK("book"),
    MEDIUM("medium"),
    ROMAN("roman"),
    SEMIBOLD("semibold"),
    DEMIBOLD("demibold"),
    DEMI("demi"),
    BOLD("bold"),
    HEAVY("heavy"),
    EXTRA_BOLD("extra bold"),
    BLACK("black");

    private String fontWeight;

    private FontWeightType(String fontWeigth){
        this.fontWeight = fontWeigth;
    }

    public String getFontWeight() {
        return this.fontWeight;
    }

}
