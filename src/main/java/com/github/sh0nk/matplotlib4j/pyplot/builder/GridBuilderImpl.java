package com.github.sh0nk.matplotlib4j.pyplot.builder;

import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.DrawStyleType;
import com.github.sh0nk.matplotlib4j.enums.GridAxisType;
import com.github.sh0nk.matplotlib4j.enums.GridWhichType;
import com.github.sh0nk.matplotlib4j.enums.LineStyleType;
import com.github.sh0nk.matplotlib4j.enums.MarkerStyleType;
import com.github.sh0nk.matplotlib4j.enums.ParametrizedLineStyleType;
import com.github.sh0nk.matplotlib4j.pyplot.kwargs.Line2DBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.kwargs.Line2DBuilderImpl;

/**
 * This class is implementing all the methods defined in the relative interface
 * {@link GridBuilder}.
 * The first section defines the @Override of all the *args associated to this
 * method, while the second section invokes all the **kwargs which are imported
 * by the related object.
 */
public class GridBuilderImpl implements GridBuilder {

    // Variable defining the builder for the main method
    private final CompositeBuilder<GridBuilder> innerBuilder = new CompositeBuilder<>(this);

    // Variable defining the builder for all the **kwargs
    private final Line2DBuilder<GridBuilder> kwargsBuilder = new Line2DBuilderImpl<>(innerBuilder);

    public GridBuilderImpl() {}

    // *args section
    @Override
    public GridBuilder visible(boolean flag) {
        return innerBuilder.addToKwargs("visible", flag);
    }

    @Override
    public GridBuilder which(GridWhichType arg) {
        return innerBuilder.addToKwargs("which", arg.getGridWhich());
    }

    @Override
    public GridBuilder axis(GridAxisType arg) {
        return innerBuilder.addToKwargs("axis", arg.getGridAxis());
    }

    // **kwargs section
    @Override
    public GridBuilder lineStyle(String arg) {
        return kwargsBuilder.lineStyle(arg);
    }

    @Override
    public GridBuilder lineStyle(LineStyleType arg) {
        return kwargsBuilder.lineStyle(arg);
    }

    @Override
    public GridBuilder lineStyle(ParametrizedLineStyleType arg) {
        return kwargsBuilder.lineStyle(arg);
    }

    @Override
    public GridBuilder ls(String arg) {
        return kwargsBuilder.ls(arg);
    }

    @Override
    public GridBuilder ls(LineStyleType arg) {
        return kwargsBuilder.ls(arg);
    }

    @Override
    public GridBuilder ls(ParametrizedLineStyleType arg) {
        return kwargsBuilder.ls(arg);
    }

    @Override
    public GridBuilder lineWidth(double arg) {
        return kwargsBuilder.lineWidth(arg);
    }

    @Override
    public GridBuilder lw(double arg) {
        return kwargsBuilder.lw(arg);
    }

    @Override
    public GridBuilder label(String arg) {
        return kwargsBuilder.label(arg);
    }

    @Override
    public GridBuilder color(String arg) {
        return kwargsBuilder.color(arg);
    }

    @Override
    public GridBuilder color(ColorType arg) {
        return kwargsBuilder.color(arg);
    }

    @Override
    public GridBuilder marker(String arg) {
        return kwargsBuilder.marker(arg);
    }

    @Override
    public GridBuilder marker(MarkerStyleType arg) {
        return kwargsBuilder.marker(arg);
    }

    @Override
    public GridBuilder markerColor(String arg) {
        return kwargsBuilder.markerColor(arg);
    }

    @Override
    public GridBuilder markerColor(ColorType arg) {
        return kwargsBuilder.markerColor(arg);
    }

    @Override
    public GridBuilder mec(String arg) {
        return kwargsBuilder.mec(arg);
    }

    @Override
    public GridBuilder mec(ColorType arg) {
        return kwargsBuilder.mec(arg);
    }

    @Override
    public GridBuilder markerSize(double arg) {
        return kwargsBuilder.markerSize(arg);
    }

    @Override
    public GridBuilder ms(double arg) {
        return kwargsBuilder.ms(arg);
    }

    @Override
    public GridBuilder alpha(double arg) {
        return kwargsBuilder.alpha(arg);
    }

    @Override
    public GridBuilder drawStyle(String arg) {
        return kwargsBuilder.drawStyle(arg);
    }

    @Override
    public GridBuilder drawStyle(DrawStyleType arg) {
        return kwargsBuilder.drawStyle(arg);
    }

    @Override
    public GridBuilder markEvery(int arg) {
        return kwargsBuilder.markEvery(arg);
    }

    // Implement the builder interface methods
    @Override
    public String build() {
        return innerBuilder.build();
    }

    @Override
    public String getMethodName() {
        return "grid";
    }

}
