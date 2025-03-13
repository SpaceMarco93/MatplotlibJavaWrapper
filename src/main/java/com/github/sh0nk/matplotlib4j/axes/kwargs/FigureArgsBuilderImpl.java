package com.github.sh0nk.matplotlib4j.axes.kwargs;

import com.github.sh0nk.matplotlib4j.axes.builder.Builder3D;
import com.github.sh0nk.matplotlib4j.axes.builder.CompositeAxesBuilder;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.LayoutType;

/**
 * This class is implementing all the methods defined in the relative interface
 * {@link FigureArgsBuilder}.
 */
public class FigureArgsBuilderImpl <T extends Builder3D> implements FigureArgsBuilder<T>{

    // Define the instance of the CompositeBuilder 
    private final CompositeAxesBuilder<T> innerBuilder;

    // Public constructor accepting any method using Axes objects as **kwargs
    public FigureArgsBuilderImpl(CompositeAxesBuilder<T> innerBuilder) {
        this.innerBuilder = innerBuilder;
    }

    @Override
    public T alpha(double arg) {
        return innerBuilder.addToKwargs("alpha", arg);
    }

    @Override
    public T clipOn(boolean arg) {
        return innerBuilder.addToKwargs("clip_on", arg);
    }

    @Override
    public T edgeColor(ColorType arg) {
        return innerBuilder.addToKwargs("edgecolor", arg.getColor());
    }

    @Override
    public T faceColor(ColorType arg) {
        return innerBuilder.addToKwargs("facecolor", arg.getColor());
    }

    @Override
    public T dpi(double arg) {
        return innerBuilder.addToKwargs("dpi", arg);
    }

    @Override
    public T figHeight(double arg) {
        return innerBuilder.addToKwargs("figheight", arg);
    }

    @Override
    public T figWidth(double arg) {
        return innerBuilder.addToKwargs("figwidth", arg);
    }

    @Override
    public T frameOn(boolean arg) {
        return innerBuilder.addToKwargs("frameon", arg);
    }

    @Override
    public T inLayout(boolean arg) {
        return innerBuilder.addToKwargs("in_layout", arg);
    }

    @Override
    public T label(String arg) {
        return innerBuilder.addToKwargs("label", arg);
    }

    @Override
    public T layoutEngine(LayoutType arg) {
        return innerBuilder.addToKwargs("layout_engine", arg.getLayout());
    }

    @Override
    public T lineWidth(Number arg) {
        return innerBuilder.addToKwargs("linewidth", arg);
    }

    @Override
    public T visible(boolean arg) {
        return innerBuilder.addToKwargs("visible", arg);
    }

}
