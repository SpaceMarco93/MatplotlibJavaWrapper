package com.github.sh0nk.matplotlib4j.axes.builder;

import java.util.ArrayList;

import com.github.sh0nk.matplotlib4j.axes.kwargs.FigureArgsBuilder;
import com.github.sh0nk.matplotlib4j.axes.kwargs.FigureArgsBuilderImpl;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.LayoutType;

/**
 * This class is implementing all the methods defined in the relative interface
 * {@link FigureBuilder}.
 * The first section defines the @Override of all the *args associated to this
 * method, while the second section invokes all the **kwargs which are imported
 * by the related object.
 */
public class FigureBuilderImpl implements FigureBuilder {

    // Variable defining the builder for the main method
    private final CompositeAxesBuilder<FigureBuilder> innerBuilder = new CompositeAxesBuilder<>(this);

    // Variable defining the builder for all the **kwargs
    private final FigureArgsBuilder<FigureBuilder> kwargsBuilder = new FigureArgsBuilderImpl<>(innerBuilder);

    // Default constructor
    public FigureBuilderImpl() {}

    // Public constructor with only the beforeMethodOutput
    public FigureBuilderImpl(String beforeMethodOutput) {
        innerBuilder.setBeforeMethodOutput(beforeMethodOutput);
    }

    // Public constructor with both beforeMethodOutput and afterMethodOutput
    public FigureBuilderImpl(String beforeMethodOutput, String afterMethodOutput) {
        innerBuilder.setBeforeMethodOutput(beforeMethodOutput);
        innerBuilder.setAfterMethodOutput(afterMethodOutput);
    }

    // *args section
    @Override
    public FigureBuilder figureTitle(String arg) {
        return innerBuilder.addToKwargs("num", arg);
    }

    @Override
    public FigureBuilder figSize(double width, double height) {
        ArrayList<Number> list = new ArrayList<>();
        list.add(width);
        list.add(height);
        return innerBuilder.addToKwargs("figsize", list);
    }

    @Override
    public FigureBuilder dpi(double arg) {
        return innerBuilder.addToKwargs("dpi", arg);
    }

    @Override
    public FigureBuilder faceColor(ColorType arg) {
        return innerBuilder.addToKwargs("facecolor", arg.getColor());
    }

    @Override
    public FigureBuilder edgeColor(ColorType arg) {
        return innerBuilder.addToKwargs("edgecolor", arg.getColor());
    }

    @Override
    public FigureBuilder frameOn(boolean arg) {
        return innerBuilder.addToKwargs("frameon", arg);
    }

    @Override
    public FigureBuilder clear(boolean arg) {
        return innerBuilder.addToKwargs("clear", arg);
    }

    @Override
    public FigureBuilder layout(LayoutType arg) {
        return innerBuilder.addToKwargs("layout", arg.getLayout());
    }

    // **kwargs section
    @Override
    public FigureBuilder alpha(double arg) {
        return kwargsBuilder.alpha(arg);
    }

    @Override
    public FigureBuilder clipOn(boolean arg) {
        return kwargsBuilder.clipOn(arg);
    }

    @Override
    public FigureBuilder figHeight(double arg) {
        return kwargsBuilder.figHeight(arg);
    }

    @Override
    public FigureBuilder figWidth(double arg) {
        return kwargsBuilder.figWidth(arg);
    }

    @Override
    public FigureBuilder inLayout(boolean arg) {
        return kwargsBuilder.inLayout(arg);
    }

    @Override
    public FigureBuilder label(String arg) {
        return kwargsBuilder.label(arg);
    }

    @Override
    public FigureBuilder layoutEngine(LayoutType arg) {
        return kwargsBuilder.layoutEngine(arg);
    }

    @Override
    public FigureBuilder lineWidth(Number arg) {
        return kwargsBuilder.lineWidth(arg);
    }

    @Override
    public FigureBuilder visible(boolean arg) {
        return kwargsBuilder.visible(arg);
    }

    // Implement the builder interface methods
    @Override
    public String build() {
        return innerBuilder.build();
    }

    @Override
    public String getMethodName() {
        return "figure";
    }

}
