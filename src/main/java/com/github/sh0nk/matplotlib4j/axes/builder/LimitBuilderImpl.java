package com.github.sh0nk.matplotlib4j.axes.builder;

/**
 * This class is implementing all the methods defined in the relative interface
 * {@link LimitBuilder}.
 * The first section defines the @Override of all the *args associated to this
 * method, while the second section invokes all the **kwargs which are imported
 * by the related object.
 */
public class LimitBuilderImpl implements LimitBuilder {

    // Variable defining the builder for the main method
    private CompositeAxesBuilder<LimitBuilder> innerBuilder = new CompositeAxesBuilder<>(this);

    // Variable to distinguish between the use of the "xlim" or "ylim" methods
    private String methodName;

    // Public constructor
    public LimitBuilderImpl(String methodName) {
        this.methodName = methodName;
    }

    // *args section
    @Override
    public LimitBuilder xLim(Number left, Number right) {
        innerBuilder.addToArgs(left);
        return innerBuilder.addToArgs(right);
    }

    @Override
    public LimitBuilder yLim(Number left, Number right) {
        innerBuilder.addToArgs(left);
        return innerBuilder.addToArgs(right);
    }

    @Override
    public LimitBuilder zLim(Number left, Number right) {
        innerBuilder.addToArgs(left);
        return innerBuilder.addToArgs(right);
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
