package com.github.sh0nk.matplotlib4j.pyplot.kwargs;

import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.LineStyleType;
import com.github.sh0nk.matplotlib4j.pyplot.builder.Builder2D;
import com.github.sh0nk.matplotlib4j.pyplot.builder.CompositeBuilder;

/**
 * This class is implementing all the methods defined in the relative interface
 * {@link PatchBuilder}.
 */
public class PatchBuilderImpl<T extends Builder2D> implements PatchBuilder<T> {

    // Define the instance of the CompositeBuilder
    private final CompositeBuilder<T> innerBuilder;

    // Public constructor accepting any method using Patch objects as **kwargs
    public PatchBuilderImpl(CompositeBuilder<T> innerBuilder) {
        this.innerBuilder = innerBuilder;
    }

    @Override
    public T alpha(double arg) {
        return innerBuilder.addToKwargs("alpha", arg);
    }

    @Override
    public T color(ColorType arg) {
        return innerBuilder.addToKwargs("color", arg.getColor());
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
    public T lineStyle(String arg) {
        return innerBuilder.addToKwargs("linestyle", arg);
    }
    
    @Override
    public T lineStyle(LineStyleType arg) {
        return innerBuilder.addToKwargs("linestyle", arg.getLineStyle());
    }

    @Override
    public T lineWidth(double arg) {
        return innerBuilder.addToKwargs("linewidth", arg);
    }

    @Override
    public T label(String arg) {
        return innerBuilder.addToKwargs("label", arg);
    }

}
