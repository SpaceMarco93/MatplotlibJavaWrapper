package com.github.sh0nk.matplotlib4j.enums;

public enum HistType {

    // List of enum constants representing the histograms types
    BAR("bar"),
    BARSTACKED("barstacked"),
    STEP("step"),
    STEPFILLED("stepfilles");

    private String hist;

    private HistType(String hist){
        this.hist = hist;
    }

    public String getHist() {
        return this.hist;
    }

}
