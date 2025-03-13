package com.github.sh0nk.matplotlib4j.pyplot.builder;

/**
 * This is a generic interface that is extended by all the other interfaces
 * which represent the higher level methods that are used together with the plot
 * object.
 * 
 * plt."method"(*args, **kwargs)
 */
public interface Builder2D {

    // Build method to wrap the Java code in Python code
    String build();

    // Get the name of the method to be wrapped
    String getMethodName();
}
