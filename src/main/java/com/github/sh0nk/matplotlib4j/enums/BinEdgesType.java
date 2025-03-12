package com.github.sh0nk.matplotlib4j.enums;

public enum BinEdgesType {

    // List of enum constants representing the alignments types
    AUTO("auto"),
    FD("fd"),
    DOANE("doane"),
    SCOTT("scott"),
    STONE("stone"),
    RICE("rice"),
    STURGES("sturges"),
    SQRT("sqrt");

    private String binEdges;

    private BinEdgesType(String binEdges){
        this.binEdges = binEdges;
    }

    public String getBinEdges() {
        return this.binEdges;
    }

}
