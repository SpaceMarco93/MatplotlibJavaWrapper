package com.github.sh0nk.matplotlib4j.pyplot.builder;

import java.util.List;

import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.DrawStyleType;
import com.github.sh0nk.matplotlib4j.enums.LineStyleType;
import com.github.sh0nk.matplotlib4j.enums.MarkerStyleType;
import com.github.sh0nk.matplotlib4j.enums.NonPositiveType;
import com.github.sh0nk.matplotlib4j.enums.ParametrizedLineStyleType;
import com.github.sh0nk.matplotlib4j.kwargs.Line2DBuilder;
import com.github.sh0nk.matplotlib4j.kwargs.Line2DBuilderImpl;

/**
 * This class is implementing all the methods defined in the relative interface
 * {@link SemiLogYBuilder}.
 * The first section defines the @Override of all the *args associated to this
 * method, while the second section invokes all the **kwargs which are imported
 * by the related object.
 */
public class SemiLogYBuilderImpl implements SemiLogYBuilder {

    // Variable defining the builder for the main method
    private final CompositeBuilder<SemiLogYBuilder> innerBuilder = new CompositeBuilder<>(this);

    // Variable defining the builder for all the **kwargs
    private Line2DBuilder<SemiLogYBuilder> kwargsBuilder = new Line2DBuilderImpl<>(innerBuilder);

    public SemiLogYBuilderImpl() {}

    // *args section
    @Override 
    public SemiLogYBuilder add(List<? extends Number> nums) {
        return innerBuilder.addToArgs(nums);
    }

    @Override 
    public SemiLogYBuilder add(List<? extends Number> x, List<? extends Number> y) {
        innerBuilder.addToArgs(x);
        return innerBuilder.addToArgs(y);
    }

    @Override 
    public SemiLogYBuilder add(List<? extends Number> x, List<? extends Number> y, String fmt) {
        innerBuilder.addToArgs(x);
        innerBuilder.addToArgs(y);
        return innerBuilder.addToArgs(fmt);
    }

    @Override 
    public SemiLogYBuilder base(double arg) {
        return innerBuilder.addToKwargs("base", arg);
    }

    @Override 
    public SemiLogYBuilder nonPositive(NonPositiveType arg) {
        return innerBuilder.addToKwargs("nonpositive", arg.getNonpositive());
    }

    // **kwargs section
    @Override
    public SemiLogYBuilder lineStyle(String arg) {
        return kwargsBuilder.lineStyle(arg);
    }

    @Override
    public SemiLogYBuilder lineStyle(LineStyleType arg) {
        return kwargsBuilder.lineStyle(arg);
    }

    @Override
    public SemiLogYBuilder lineStyle(ParametrizedLineStyleType arg) {
        return kwargsBuilder.lineStyle(arg);
    }

    @Override
    public SemiLogYBuilder ls(String arg) {
        return kwargsBuilder.ls(arg);
    }

    @Override
    public SemiLogYBuilder ls(LineStyleType arg) {
        return kwargsBuilder.ls(arg);
    }

    @Override
    public SemiLogYBuilder ls(ParametrizedLineStyleType arg) {
        return kwargsBuilder.ls(arg);
    }

    @Override
    public SemiLogYBuilder lineWidth(double arg) {
        return kwargsBuilder.lineWidth(arg);
    }

    @Override
    public SemiLogYBuilder lw(double arg) {
        return kwargsBuilder.lw(arg);
    }

    @Override
    public SemiLogYBuilder label(String arg) {
        return kwargsBuilder.label(arg);
    }

    @Override
    public SemiLogYBuilder color(String arg) {
        return kwargsBuilder.color(arg);
    }

    @Override
    public SemiLogYBuilder color(ColorType arg) {
        return kwargsBuilder.color(arg);
    }

    @Override
    public SemiLogYBuilder marker(String arg) {
        return kwargsBuilder.marker(arg);
    }

    @Override
    public SemiLogYBuilder marker(MarkerStyleType arg) {
        return kwargsBuilder.marker(arg);
    }

    @Override
    public SemiLogYBuilder markerColor(String arg) {
        return kwargsBuilder.markerColor(arg);
    }

    @Override
    public SemiLogYBuilder markerColor(ColorType arg) {
        return kwargsBuilder.markerColor(arg);
    }

    @Override
    public SemiLogYBuilder mec(String arg) {
        return kwargsBuilder.mec(arg);
    }

    @Override
    public SemiLogYBuilder mec(ColorType arg) {
        return kwargsBuilder.mec(arg);
    }

    @Override
    public SemiLogYBuilder markerSize(double arg) {
        return kwargsBuilder.markerSize(arg);
    }

    @Override
    public SemiLogYBuilder ms(double arg) {
        return kwargsBuilder.ms(arg);
    }

    @Override
    public SemiLogYBuilder alpha(double arg) {
        return kwargsBuilder.alpha(arg);
    }

    @Override
    public SemiLogYBuilder drawStyle(String arg) {
        return kwargsBuilder.drawStyle(arg);
    }

    @Override
    public SemiLogYBuilder drawStyle(DrawStyleType arg) {
        return kwargsBuilder.drawStyle(arg);
    }

    @Override
    public SemiLogYBuilder markEvery(int arg) {
        return kwargsBuilder.markEvery(arg);
    }

    // Implement the builder interface methods
    @Override
    public String build() {
        return innerBuilder.build();
    }

    @Override
    public String getMethodName() {
        return "semilogy";
    }

}
