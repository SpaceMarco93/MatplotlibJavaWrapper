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
 * {@link SemiLogXBuilder}.
 * The first section defines the @Override of all the *args associated to this
 * method, while the second section invokes all the **kwargs which are imported
 * by the related object.
 */
public class SemiLogXBuilderImpl implements SemiLogXBuilder {

    // Variable defining the builder for the main method
    private final CompositeBuilder<SemiLogXBuilder> innerBuilder = new CompositeBuilder<>(this);

    // Variable defining the builder for all the **kwargs
    private Line2DBuilder<SemiLogXBuilder> kwargsBuilder = new Line2DBuilderImpl<>(innerBuilder);

    public SemiLogXBuilderImpl() {}

    // *args section
    @Override 
    public SemiLogXBuilder add(List<? extends Number> nums) {
        return innerBuilder.addToArgs(nums);
    }

    @Override 
    public SemiLogXBuilder add(List<? extends Number> x, List<? extends Number> y) {
        innerBuilder.addToArgs(x);
        return innerBuilder.addToArgs(y);
    }

    @Override 
    public SemiLogXBuilder add(List<? extends Number> x, List<? extends Number> y, String fmt) {
        innerBuilder.addToArgs(x);
        innerBuilder.addToArgs(y);
        return innerBuilder.addToArgs(fmt);
    }

    @Override 
    public SemiLogXBuilder base(double arg) {
        return innerBuilder.addToKwargs("base", arg);
    }

    @Override 
    public SemiLogXBuilder nonPositive(NonPositiveType arg) {
        return innerBuilder.addToKwargs("nonpositive", arg.getNonpositive());
    }

    // **kwargs section
    @Override
    public SemiLogXBuilder lineStyle(String arg) {
        return kwargsBuilder.lineStyle(arg);
    }

    @Override
    public SemiLogXBuilder lineStyle(LineStyleType arg) {
        return kwargsBuilder.lineStyle(arg);
    }

    @Override
    public SemiLogXBuilder lineStyle(ParametrizedLineStyleType arg) {
        return kwargsBuilder.lineStyle(arg);
    }

    @Override
    public SemiLogXBuilder ls(String arg) {
        return kwargsBuilder.ls(arg);
    }

    @Override
    public SemiLogXBuilder ls(LineStyleType arg) {
        return kwargsBuilder.ls(arg);
    }

    @Override
    public SemiLogXBuilder ls(ParametrizedLineStyleType arg) {
        return kwargsBuilder.ls(arg);
    }

    @Override
    public SemiLogXBuilder lineWidth(double arg) {
        return kwargsBuilder.lineWidth(arg);
    }

    @Override
    public SemiLogXBuilder lw(double arg) {
        return kwargsBuilder.lw(arg);
    }

    @Override
    public SemiLogXBuilder label(String arg) {
        return kwargsBuilder.label(arg);
    }

    @Override
    public SemiLogXBuilder color(String arg) {
        return kwargsBuilder.color(arg);
    }

    @Override
    public SemiLogXBuilder color(ColorType arg) {
        return kwargsBuilder.color(arg);
    }

    @Override
    public SemiLogXBuilder marker(String arg) {
        return kwargsBuilder.marker(arg);
    }

    @Override
    public SemiLogXBuilder marker(MarkerStyleType arg) {
        return kwargsBuilder.marker(arg);
    }

    @Override
    public SemiLogXBuilder markerColor(String arg) {
        return kwargsBuilder.markerColor(arg);
    }

    @Override
    public SemiLogXBuilder markerColor(ColorType arg) {
        return kwargsBuilder.markerColor(arg);
    }

    @Override
    public SemiLogXBuilder mec(String arg) {
        return kwargsBuilder.mec(arg);
    }

    @Override
    public SemiLogXBuilder mec(ColorType arg) {
        return kwargsBuilder.mec(arg);
    }

    @Override
    public SemiLogXBuilder markerSize(double arg) {
        return kwargsBuilder.markerSize(arg);
    }

    @Override
    public SemiLogXBuilder ms(double arg) {
        return kwargsBuilder.ms(arg);
    }

    @Override
    public SemiLogXBuilder alpha(double arg) {
        return kwargsBuilder.alpha(arg);
    }

    @Override
    public SemiLogXBuilder drawStyle(String arg) {
        return kwargsBuilder.drawStyle(arg);
    }

    @Override
    public SemiLogXBuilder drawStyle(DrawStyleType arg) {
        return kwargsBuilder.drawStyle(arg);
    }

    @Override
    public SemiLogXBuilder markEvery(int arg) {
        return kwargsBuilder.markEvery(arg);
    }

    // Implement the builder interface methods
    @Override
    public String build() {
        return innerBuilder.build();
    }

    @Override
    public String getMethodName() {
        return "semilogx";
    }

}
