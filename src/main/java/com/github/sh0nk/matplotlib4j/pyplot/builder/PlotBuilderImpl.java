package com.github.sh0nk.matplotlib4j.pyplot.builder;

import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.DrawStyleType;
import com.github.sh0nk.matplotlib4j.enums.LineStyleType;
import com.github.sh0nk.matplotlib4j.enums.MarkerStyleType;
import com.github.sh0nk.matplotlib4j.enums.ParametrizedLineStyleType;
import com.github.sh0nk.matplotlib4j.kwargs.Line2DBuilder;
import com.github.sh0nk.matplotlib4j.kwargs.Line2DBuilderImpl;

import java.util.List;

/**
 * This class is implementing all the methods defined in the relative interface
 * {@link PlotBuilder}.
 * The first section defines the @Override of all the *args associated to this
 * method, while the second section invokes all the **kwargs which are imported
 * by the related object.
 */
public class PlotBuilderImpl implements PlotBuilder {

    // Variable defining the builder for the main method
    private final CompositeBuilder<PlotBuilder> innerBuilder = new CompositeBuilder<>(this);

    // Variable defining the builder for all the **kwargs
    private final Line2DBuilder<PlotBuilder> kwargsBuilder = new Line2DBuilderImpl<>(innerBuilder);

    // *args section
    @Override
    public PlotBuilder add(List<? extends Number> x) {
        return innerBuilder.addToArgs(x);
    }

    @Override
    public PlotBuilder add(List<? extends Number> x, List<? extends Number> y) {
        innerBuilder.addToArgs(x);
        return innerBuilder.addToArgs(y);
    }

    @Override
    public PlotBuilder add(List<? extends Number> x, List<? extends Number> y, String fmt) {
        innerBuilder.addToArgs(x);
        innerBuilder.addToArgs(y);
        return innerBuilder.addToArgs(fmt);
    }

    // **kwargs section
    @Override
    public PlotBuilder lineStyle(String arg) {
        return kwargsBuilder.lineStyle(arg);
    }

    @Override
    public PlotBuilder lineStyle(LineStyleType arg) {
        return kwargsBuilder.lineStyle(arg);
    }

    @Override
    public PlotBuilder lineStyle(ParametrizedLineStyleType arg) {
        return kwargsBuilder.lineStyle(arg);
    }

    @Override
    public PlotBuilder ls(String arg) {
        return kwargsBuilder.ls(arg);
    }

    @Override
    public PlotBuilder ls(LineStyleType arg) {
        return kwargsBuilder.ls(arg);
    }

    @Override
    public PlotBuilder ls(ParametrizedLineStyleType arg) {
        return kwargsBuilder.ls(arg);
    }

    @Override
    public PlotBuilder lineWidth(double arg) {
        return kwargsBuilder.lineWidth(arg);
    }

    @Override
    public PlotBuilder lw(double arg) {
        return kwargsBuilder.lw(arg);
    }

    @Override
    public PlotBuilder label(String arg) {
        return kwargsBuilder.label(arg);
    }

    @Override
    public PlotBuilder color(String arg) {
        return kwargsBuilder.color(arg);
    }

    @Override
    public PlotBuilder color(ColorType arg) {
        return kwargsBuilder.color(arg);
    }

    @Override
    public PlotBuilder marker(String arg) {
        return kwargsBuilder.marker(arg);
    }

    @Override
    public PlotBuilder marker(MarkerStyleType arg) {
        return kwargsBuilder.marker(arg);
    }

    @Override
    public PlotBuilder markerColor(String arg) {
        return kwargsBuilder.markerColor(arg);
    }

    @Override
    public PlotBuilder markerColor(ColorType arg) {
        return kwargsBuilder.markerColor(arg);
    }

    @Override
    public PlotBuilder mec(String arg) {
        return kwargsBuilder.mec(arg);
    }

    @Override
    public PlotBuilder mec(ColorType arg) {
        return kwargsBuilder.mec(arg);
    }

    @Override
    public PlotBuilder markerSize(double arg) {
        return kwargsBuilder.markerSize(arg);
    }

    @Override
    public PlotBuilder ms(double arg) {
        return kwargsBuilder.ms(arg);
    }

    @Override
    public PlotBuilder alpha(double arg) {
        return kwargsBuilder.alpha(arg);
    }

    @Override
    public PlotBuilder drawStyle(String arg) {
        return kwargsBuilder.drawStyle(arg);
    }

    @Override
    public PlotBuilder drawStyle(DrawStyleType arg) {
        return kwargsBuilder.drawStyle(arg);
    }

    @Override
    public PlotBuilder markEvery(int arg) {
        return kwargsBuilder.markEvery(arg);
    }

    // Implement the builder interface methods
    @Override
    public String build() {
        return innerBuilder.build();
    }

    @Override
    public String getMethodName() {
        return "plot";
    }

}
