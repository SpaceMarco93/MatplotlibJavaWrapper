package com.github.sh0nk.matplotlib4j.pyplot.builder;

import com.github.sh0nk.matplotlib4j.enums.AdjutableType;
import com.github.sh0nk.matplotlib4j.enums.AnchorType;
import com.github.sh0nk.matplotlib4j.enums.AspectType;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.ProjectionType;
import com.github.sh0nk.matplotlib4j.enums.ScaleType;
import com.github.sh0nk.matplotlib4j.pyplot.kwargs.AxesArgsBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.kwargs.AxesArgsBuilderImpl;

/**
 * This class is implementing all the methods defined in the relative interface
 * {@link SubplotBuilder}.
 * The first section defines the @Override of all the *args associated to this
 * method, while the second section invokes all the **kwargs which are imported
 * by the related object.
 */
public class SubplotBuilderImpl implements SubplotBuilder {

    // Variable defining the builder for the main method
    private final CompositeBuilder<SubplotBuilder> innerBuilder = new CompositeBuilder<>(this);

    // Variable defining the builder for all the **kwargs
    private final AxesArgsBuilder<SubplotBuilder> kwargsBuilder = new AxesArgsBuilderImpl<>(innerBuilder);

    public SubplotBuilderImpl() {}

    // *args section
    @Override
    public SubplotBuilder add(int x, int y, int index) {
        innerBuilder.addToArgs(x);
        innerBuilder.addToArgs(y);
        return innerBuilder.addToArgs(index);
    }

    @Override
    public SubplotBuilder projection(ProjectionType arg) {
        return innerBuilder.addToKwargs("projection", arg.getProjection());
    }

    // **kwargs section
    @Override
    public SubplotBuilder adjustable(AdjutableType arg) {
        return kwargsBuilder.adjustable(arg);
    }

    @Override
    public SubplotBuilder alpha(double arg) {
        return kwargsBuilder.alpha(arg);
    }

    @Override
    public SubplotBuilder anchor(AnchorType arg) {
        return kwargsBuilder.anchor(arg);
    }

    @Override
    public SubplotBuilder aspect(AspectType arg) {
        return kwargsBuilder.aspect(arg);
    }

    @Override
    public SubplotBuilder autoScaleOn(boolean arg) {
        return kwargsBuilder.autoScaleOn(arg);
    }

    @Override
    public SubplotBuilder axisBelow(boolean arg) {
        return kwargsBuilder.axisBelow(arg);
    }

    @Override
    public SubplotBuilder boxAspect(double arg) {
        return kwargsBuilder.boxAspect(arg);
    }

    @Override
    public SubplotBuilder faceColor(ColorType arg) {
        return kwargsBuilder.faceColor(arg);
    }

    @Override
    public SubplotBuilder figure(String arg) {
        return kwargsBuilder.figure(arg);
    }

    @Override
    public SubplotBuilder frameOn(boolean arg) {
        return kwargsBuilder.frameOn(arg);
    }

    @Override
    public SubplotBuilder inLayout(boolean arg) {
        return kwargsBuilder.inLayout(arg);
    }

    @Override
    public SubplotBuilder label(String arg) {
        return kwargsBuilder.label(arg);
    }

    @Override
    public SubplotBuilder title(String arg) {
        return kwargsBuilder.title(arg);
    }

    @Override
    public SubplotBuilder visible(boolean arg) {
        return kwargsBuilder.visible(arg);
    }

    @Override
    public SubplotBuilder xBound(double left, double right) {
        return kwargsBuilder.xBound(left, right);
    }

    @Override
    public SubplotBuilder xLabel(String arg) {
        return kwargsBuilder.xLabel(arg);
    }

    @Override
    public SubplotBuilder xLim(double left, double right) {
        return kwargsBuilder.xLim(left, right);
    }

    @Override
    public SubplotBuilder xScale(ScaleType arg) {
        return kwargsBuilder.xScale(arg);
    }

    @Override
    public SubplotBuilder xTicks(String arg) {
        return kwargsBuilder.xTicks(arg);
    }

    @Override
    public SubplotBuilder yBound(double left, double right) {
        return kwargsBuilder.yBound(left, right);
    }

    @Override
    public SubplotBuilder yLabel(String arg) {
        return kwargsBuilder.yLabel(arg);
    }

    @Override
    public SubplotBuilder yLim(double left, double right) {
        return kwargsBuilder.yLim(left, right);
    }

    @Override
    public SubplotBuilder yScale(ScaleType arg) {
        return kwargsBuilder.yScale(arg);
    }

    @Override
    public SubplotBuilder yTicks(String arg) {
        return kwargsBuilder.yTicks(arg);
    }

    // Implement the builder interface methods
    @Override
    public String build() {
        return innerBuilder.build();
    }

    @Override
    public String getMethodName() {
        return "subplot";
    }

}
