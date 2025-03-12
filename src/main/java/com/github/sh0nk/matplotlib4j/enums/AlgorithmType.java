package com.github.sh0nk.matplotlib4j.enums;

public enum AlgorithmType {

    // List of enum constants representing the algorithm types
    MPL2005("mpl2005"),
    MPL2014("mpl2014"),
    SERIAL("serial"),
    THREADED("threaded");

    private String algorithm;

    private AlgorithmType(String algorithm){
        this.algorithm = algorithm;
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

}
