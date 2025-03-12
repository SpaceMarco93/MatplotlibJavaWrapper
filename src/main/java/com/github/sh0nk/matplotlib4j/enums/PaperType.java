package com.github.sh0nk.matplotlib4j.enums;

public enum PaperType {

    // List of enum constants representing the extend types
    LETTER("letter"),
    LEGAL("legal"),
    EXECUTIVE("executive"),
    LEDGER("ledger"),
    A0("a0"),
    A1("a1"),
    A2("a2"),
    A3("a3"),
    A4("a4"),
    A5("a5"),
    A6("a6"),
    A7("a7"),
    A8("a8"),
    A9("a9"),
    A10("a10"),
    B0("b0"),
    B1("b1"),
    B2("b2"),
    B3("b3"),
    B4("b4"),
    B5("b5"),
    B6("b6"),
    B7("b7"),
    B8("b8"),
    B9("b9"),
    B10("b10");

    private String paper;

    private PaperType(String paper) {
        this.paper = paper;
    }

    public String getPaper() {
        return this.paper;
    }

}
