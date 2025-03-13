package com.github.sh0nk.matplotlib4j.axes.builder;

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
    private CompositeAxesBuilder<ScaleBuilder> innerBuilder = new CompositeAxesBuilder<>(this);

    // Variable to distinguish between the use of the "xscale" or "yscale" methods
    private String methodName;

    // Public constructor
    public ScaleBuilderImpl(String methodName) {
        this.methodName = methodName;
    }

    // public static ScaleBuilderImpl xScaleBuilder(ScaleType scale) {
    //     return new ScaleBuilderImpl(scale, "xscale");
    // }

    // public static ScaleBuilderImpl yScaleBuilder(ScaleType scale) {
    //     return new ScaleBuilderImpl(scale, "yscale");
    // }

    // *args section
    @Override
    public ScaleBuilder xScale(ScaleType arg) {
        return innerBuilder.addToArgs(arg.getScale());
    }

    @Override
    public ScaleBuilder yScale(ScaleType arg) {
        return innerBuilder.addToArgs(arg.getScale());
    }

    @Override
    public ScaleBuilder zScale(ScaleType arg) {
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
