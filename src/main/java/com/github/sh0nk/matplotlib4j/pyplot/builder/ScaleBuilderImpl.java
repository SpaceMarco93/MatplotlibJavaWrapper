package com.github.sh0nk.matplotlib4j.pyplot.builder;

import com.github.sh0nk.matplotlib4j.enums.ScaleType;

/**
 * This class is implementing all the methods defined in the relative interface
 * {@link ScaleBuilder}.
 * The first section defines the @Override of all the *args associated to this
 * method, while the second section invokes all the **kwargs which are imported
 * by the related object.
 */
public class ScaleBuilderImpl implements ScaleBuilder {

    // Variable defining the builder for the main method
    private final CompositeBuilder<ScaleBuilder> innerBuilder = new CompositeBuilder<>(this);

    // Variable to distinguish between the use of the "xscale" or "yscale" methods
    private final String methodName;

    // Public constructor
    public ScaleBuilderImpl(String methodName) {
        this.methodName = methodName;
    }

    // *args section
    @Override
    public ScaleBuilder xScale(ScaleType arg) {
        return innerBuilder.addToArgs(arg.getScale());
    }

    @Override
    public ScaleBuilder yScale(ScaleType arg) {
        return innerBuilder.addToArgs(arg.getScale());
    }

    // Implement the builder interface methods
    @Override
    public String build() {
        return innerBuilder.build();
    }

    @Override
    public String getMethodName() {
        return this.methodName;
    }

}
