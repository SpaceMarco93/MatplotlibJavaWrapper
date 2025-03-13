package com.github.sh0nk.matplotlib4j.pyplot.kwargs;

import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.DrawStyleType;
import com.github.sh0nk.matplotlib4j.enums.LineStyleType;
import com.github.sh0nk.matplotlib4j.enums.MarkerStyleType;
import com.github.sh0nk.matplotlib4j.enums.ParametrizedLineStyleType;
import com.github.sh0nk.matplotlib4j.pyplot.builder.Builder2D;
import com.github.sh0nk.matplotlib4j.pyplot.builder.CompositeBuilder;

/**
 * This class is implementing all the methods defined in the relative interface
 * {@link Line2DBuilder}.
 */
public class Line2DBuilderImpl<T extends Builder2D> implements Line2DBuilder<T> {

    // Define the instance of the CompositeBuilder 
    private final CompositeBuilder<T> innerBuilder;

    // Public constructor accepting any method using Line2D objects as **kwargs
    public Line2DBuilderImpl(CompositeBuilder<T> innerBuilder) {
        this.innerBuilder = innerBuilder;
    }

    @Override
    public T lineStyle(String arg) {
        return ls(arg);
    }

    @Override
    public T lineStyle(LineStyleType arg) {
        return ls(arg.getLineStyle());
    }

    @Override
    public T lineStyle(ParametrizedLineStyleType arg) {
        return innerBuilder.addToKwargsWithoutQuoting("ls", arg.getNameStyle());
    }

    @Override
    public T ls(String arg) {
        return innerBuilder.addToKwargs("ls", arg);
    }

    @Override
    public T ls(LineStyleType arg) {
        return ls(arg.getLineStyle());
    }

    @Override
    public T ls(ParametrizedLineStyleType arg) {
        return innerBuilder.addToKwargsWithoutQuoting("ls", arg.getNameStyle());
    }

    @Override
    public T lineWidth(double arg) {
        return lw(arg);
    }

    @Override
    public T lw(double arg) {
        return innerBuilder.addToKwargs("lw", arg);
    }

    @Override
    public T label(String arg) {
        return innerBuilder.addToKwargs("label", arg);
    }

    @Override
    public T color(String arg) {
        return innerBuilder.addToKwargs("color", arg);
    }

    @Override
    public T color(ColorType arg) {
        return innerBuilder.addToKwargs("color", arg.getColor());
    }

    @Override
    public T marker(String arg) {
        return innerBuilder.addToKwargs("marker", arg);
    }

    @Override
    public T marker(MarkerStyleType arg) {
        return innerBuilder.addToKwargs("marker", arg.getMarkerStyle());
    }

    @Override
    public T markerColor(String arg) {
        return innerBuilder.addToKwargs("markeredgecolor", arg);
    }

    @Override
    public T markerColor(ColorType arg) {
        return innerBuilder.addToKwargs("markeredgecolor", arg.getColor());
    }

    @Override
    public T mec(String arg) {
        return innerBuilder.addToKwargs("markeredgecolor", arg);
    }

    @Override
    public T mec(ColorType arg) {
        return innerBuilder.addToKwargs("markeredgecolor", arg.getColor());
    }

    @Override
    public T markerSize(double arg) {
        return innerBuilder.addToKwargs("markersize", arg);
    }

    @Override
    public T ms(double arg) {
        return innerBuilder.addToKwargs("markersize", arg);
    }

    @Override
    public T alpha(double arg) {
        return innerBuilder.addToKwargs("alpha", arg);
    }

    @Override
    public T drawStyle(String arg) {
        return innerBuilder.addToKwargs("drawstyle", arg);
    }

    @Override
    public T drawStyle(DrawStyleType arg) {
        return innerBuilder.addToKwargs("drawstyle", arg.getDrawStyle());
    }

    @Override
    public T markEvery(int arg) {
        return innerBuilder.addToKwargs("markevery", arg);
    }

}
