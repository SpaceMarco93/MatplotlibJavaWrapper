package com.github.sh0nk.matplotlib4j.kwargs;

import com.github.sh0nk.matplotlib4j.builder.Builder;
import com.github.sh0nk.matplotlib4j.builder.CompositeBuilder;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.LineStyleType;
import com.github.sh0nk.matplotlib4j.enums.MarkerStyleType;
import com.github.sh0nk.matplotlib4j.enums.ParametrizedLineStyleType;


public class Line2DBuilderImpl<T extends Builder> implements Line2DBuilder<T> {

    private final CompositeBuilder<T> innerBuilder;

    public Line2DBuilderImpl(CompositeBuilder<T> innerBuilder) {
        this.innerBuilder = innerBuilder;
    }

    @Override
    public T linestyle(String arg) {
        return ls(arg);
    }

    @Override
    public T linestyle(LineStyleType arg) {
        return ls(arg.getLineStyle());
    }

    @Override
    public T linestyle(ParametrizedLineStyleType arg) {
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
    public T linewidth(double arg) {
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
        return innerBuilder.addToKwargs("markeredgewidth", arg);
    }

    @Override
    public T ms(double arg) {
        return innerBuilder.addToKwargs("markeredgewidth", arg);
    }

}
