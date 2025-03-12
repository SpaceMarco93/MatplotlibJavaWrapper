package com.github.sh0nk.matplotlib4j.enums;

public enum LayoutType {

    // List of enum constants representing the layouts
    CONSTRAINED("constrained"),
    COMPRESSED("compressed"),
    TIGHT("tight"),
    NONE("none");

    private String layout;

    private LayoutType(String layout){
        this.layout = layout;
    }

    public String getLayout() {
        return this.layout;
    }

}
