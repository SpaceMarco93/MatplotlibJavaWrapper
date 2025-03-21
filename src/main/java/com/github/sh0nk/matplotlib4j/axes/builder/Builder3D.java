package com.github.sh0nk.matplotlib4j.axes.builder;

/**
 * This is a generic interface that is extended by all the other interfaces
 * which represent the higher level methods that are used together with the axes
 * object.
 * 
 * axes."method"(*args, **kwargs)
 */
public interface Builder3D {

    // Build method to wrap the Java code in Python code
    String build();

    // Get the name of the method to be wrapped
    String getMethodName();
}
