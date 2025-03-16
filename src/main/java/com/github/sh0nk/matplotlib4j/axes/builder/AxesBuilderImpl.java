package com.github.sh0nk.matplotlib4j.axes.builder;

import com.github.sh0nk.matplotlib4j.enums.AspectType;

/**
 * This class is implementing all the methods defined in the relative interface
 * {@link AxesBuilder}.
 * The first section defines the @Override of all the *args associated to this
 * method, while the second section invokes all the **kwargs which are imported
 * by the related object.
 */
public class AxesBuilderImpl implements AxesBuilder {

    // Variable defining the builder for the main method
    private final CompositeAxesBuilder<AxesBuilder> innerBuilder = new CompositeAxesBuilder<>(this);

    // Public constructor
    public AxesBuilderImpl() {}

    @Override
    public AxesBuilder setAspect(AspectType arg) {
        return innerBuilder.addToArgs(arg.getAspect());
    }

    // Implement the builder interface methods
    @Override
    public String build() {
        return innerBuilder.build();
    }

    @Override
    public String getMethodName() {
        return "set_aspect";
    }

    

}
