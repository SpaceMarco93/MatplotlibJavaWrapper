package com.github.sh0nk.matplotlib4j.axes.kwargs;

import com.github.sh0nk.matplotlib4j.axes.builder.Builder3D;
import com.github.sh0nk.matplotlib4j.axes.builder.CompositeAxesBuilder;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.DrawStyleType;
import com.github.sh0nk.matplotlib4j.enums.LineStyleType;
import com.github.sh0nk.matplotlib4j.enums.MarkerStyleType;
import com.github.sh0nk.matplotlib4j.enums.ParametrizedLineStyleType;

public class Line3DBuilderImpl<T extends Builder3D> implements Line3DBuilder<T> {

    private final CompositeAxesBuilder<T> innerBuilder;

    public Line3DBuilderImpl(CompositeAxesBuilder<T> innerBuilder) {
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
        return innerBuilder.addToKwargs("markeredgewidth", arg);
    }

    @Override
    public T ms(double arg) {
        return innerBuilder.addToKwargs("markeredgewidth", arg);
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
