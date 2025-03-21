package com.github.sh0nk.matplotlib4j.pyplot.builder;

import java.util.List;

import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.DrawStyleType;
import com.github.sh0nk.matplotlib4j.enums.LineStyleType;
import com.github.sh0nk.matplotlib4j.enums.MarkerStyleType;
import com.github.sh0nk.matplotlib4j.enums.NonPositiveType;
import com.github.sh0nk.matplotlib4j.enums.ParametrizedLineStyleType;
import com.github.sh0nk.matplotlib4j.pyplot.kwargs.Line2DBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.kwargs.Line2DBuilderImpl;

/**
 * This class is implementing all the methods defined in the relative interface
 * {@link LogLogBuilder}.
 * The first section defines the @Override of all the *args associated to this
 * method, while the second section invokes all the **kwargs which are imported
 * by the related object.
 */
public class LogLogBuilderImpl implements LogLogBuilder {

    // Variable defining the builder for the main method
    private final CompositeBuilder<LogLogBuilder> innerBuilder = new CompositeBuilder<>(this);

    // Variable defining the builder for all the **kwargs
    private final Line2DBuilder<LogLogBuilder> kwargsBuilder = new Line2DBuilderImpl<>(innerBuilder);

    // Public constructor
    public LogLogBuilderImpl() {}

    // *args section
    @Override 
    public LogLogBuilder add(List<? extends Number> nums) {
        return innerBuilder.addToArgs(nums);
    }

    @Override 
    public LogLogBuilder add(List<? extends Number> x, List<? extends Number> y) {
        innerBuilder.addToArgs(x);
        return innerBuilder.addToArgs(y);
    }

    @Override 
    public LogLogBuilder add(List<? extends Number> x, List<? extends Number> y, String fmt) {
        innerBuilder.addToArgs(x);
        innerBuilder.addToArgs(y);
        return innerBuilder.addToArgs(fmt);
    }

    @Override 
    public LogLogBuilder base(double arg) {
        return innerBuilder.addToKwargs("base", arg);
    }

    @Override 
    public LogLogBuilder nonPositive(NonPositiveType arg) {
        return innerBuilder.addToKwargs("nonpositive", arg.getNonpositive());
    }

    // **kwargs section
    @Override
    public LogLogBuilder lineStyle(String arg) {
        return kwargsBuilder.lineStyle(arg);
    }

    @Override
    public LogLogBuilder lineStyle(LineStyleType arg) {
        return kwargsBuilder.lineStyle(arg);
    }

    @Override
    public LogLogBuilder lineStyle(ParametrizedLineStyleType arg) {
        return kwargsBuilder.lineStyle(arg);
    }

    @Override
    public LogLogBuilder ls(String arg) {
        return kwargsBuilder.ls(arg);
    }

    @Override
    public LogLogBuilder ls(LineStyleType arg) {
        return kwargsBuilder.ls(arg);
    }

    @Override
    public LogLogBuilder ls(ParametrizedLineStyleType arg) {
        return kwargsBuilder.ls(arg);
    }

    @Override
    public LogLogBuilder lineWidth(double arg) {
        return kwargsBuilder.lineWidth(arg);
    }

    @Override
    public LogLogBuilder lw(double arg) {
        return kwargsBuilder.lw(arg);
    }

    @Override
    public LogLogBuilder label(String arg) {
        return kwargsBuilder.label(arg);
    }

    @Override
    public LogLogBuilder color(String arg) {
        return kwargsBuilder.color(arg);
    }

    @Override
    public LogLogBuilder color(ColorType arg) {
        return kwargsBuilder.color(arg);
    }

    @Override
    public LogLogBuilder marker(String arg) {
        return kwargsBuilder.marker(arg);
    }

    @Override
    public LogLogBuilder marker(MarkerStyleType arg) {
        return kwargsBuilder.marker(arg);
    }

    @Override
    public LogLogBuilder markerColor(String arg) {
        return kwargsBuilder.markerColor(arg);
    }

    @Override
    public LogLogBuilder markerColor(ColorType arg) {
        return kwargsBuilder.markerColor(arg);
    }

    @Override
    public LogLogBuilder mec(String arg) {
        return kwargsBuilder.mec(arg);
    }

    @Override
    public LogLogBuilder mec(ColorType arg) {
        return kwargsBuilder.mec(arg);
    }

    @Override
    public LogLogBuilder markerSize(double arg) {
        return kwargsBuilder.markerSize(arg);
    }

    @Override
    public LogLogBuilder ms(double arg) {
        return kwargsBuilder.ms(arg);
    }

    @Override
    public LogLogBuilder alpha(double arg) {
        return kwargsBuilder.alpha(arg);
    }

    @Override
    public LogLogBuilder drawStyle(String arg) {
        return kwargsBuilder.drawStyle(arg);
    }

    @Override
    public LogLogBuilder drawStyle(DrawStyleType arg) {
        return kwargsBuilder.drawStyle(arg);
    }

    @Override
    public LogLogBuilder markEvery(int arg) {
        return kwargsBuilder.markEvery(arg);
    }

    // Implement the builder interface methods
    @Override
    public String build() {
        return innerBuilder.build();
    }

    @Override
    public String getMethodName() {
        return "loglog";
    }

}
