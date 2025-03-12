package com.github.sh0nk.matplotlib4j.axes.builder;

import java.util.List;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.DrawStyleType;
import com.github.sh0nk.matplotlib4j.enums.LineStyleType;
import com.github.sh0nk.matplotlib4j.enums.MarkerStyleType;
import com.github.sh0nk.matplotlib4j.enums.ParametrizedLineStyleType;
import com.github.sh0nk.matplotlib4j.kwargs.Line3DBuilder;
import com.github.sh0nk.matplotlib4j.kwargs.Line3DBuilderImpl;

public class AxesBuilderImpl implements AxesBuilder {

    private CompositeAxesBuilder<AxesBuilder> innerBuilder = new CompositeAxesBuilder<>(this);
    private Line3DBuilder<AxesBuilder> line3DBuilder = new Line3DBuilderImpl<>(innerBuilder);

    @Override
    public AxesBuilder add(List<? extends Number> x, List<? extends Number> y) {
        innerBuilder.addToArgs(x);
        return innerBuilder.addToArgs(y);
    }

    @Override
    public AxesBuilder add(List<? extends Number> x, List<? extends Number> y, String fmt) {
        innerBuilder.addToArgs(x);
        innerBuilder.addToArgs(y);
        return innerBuilder.addToArgs(fmt);
    }

    @Override
    public AxesBuilder add(List<? extends Number> x, List<? extends Number> y, List<? extends Number> z) {
        innerBuilder.addToArgs(x);
        innerBuilder.addToArgs(y);
        return innerBuilder.addToArgs(z);
    }

    @Override
    public AxesBuilder lineStyle(String arg) {
        return line3DBuilder.lineStyle(arg);
    }

    @Override
    public AxesBuilder lineStyle(LineStyleType arg) {
        return line3DBuilder.lineStyle(arg);
    }

    @Override
    public AxesBuilder lineStyle(ParametrizedLineStyleType arg) {
        return line3DBuilder.lineStyle(arg);
    }

    @Override
    public AxesBuilder ls(String arg) {
        return line3DBuilder.ls(arg);
    }

    @Override
    public AxesBuilder ls(LineStyleType arg) {
        return line3DBuilder.ls(arg);
    }

    @Override
    public AxesBuilder ls(ParametrizedLineStyleType arg) {
        return line3DBuilder.ls(arg);
    }

    @Override
    public AxesBuilder lineWidth(double arg) {
        return line3DBuilder.lineWidth(arg);
    }

    @Override
    public AxesBuilder lw(double arg) {
        return line3DBuilder.lw(arg);
    }

    @Override
    public AxesBuilder label(String arg) {
        return line3DBuilder.label(arg);
    }

    @Override
    public AxesBuilder color(String arg) {
        return line3DBuilder.color(arg);
    }

    @Override
    public AxesBuilder color(ColorType arg) {
        return line3DBuilder.color(arg);
    }

    @Override
    public AxesBuilder marker(String arg) {
        return line3DBuilder.marker(arg);
    }

    @Override
    public AxesBuilder marker(MarkerStyleType arg) {
        return line3DBuilder.marker(arg);
    }

    @Override
    public AxesBuilder markerColor(String arg) {
        return line3DBuilder.markerColor(arg);
    }

    @Override
    public AxesBuilder markerColor(ColorType arg) {
        return line3DBuilder.markerColor(arg);
    }

    @Override
    public AxesBuilder mec(String arg) {
        return line3DBuilder.mec(arg);
    }

    @Override
    public AxesBuilder mec(ColorType arg) {
        return line3DBuilder.mec(arg);
    }

    @Override
    public AxesBuilder markerSize(double arg) {
        return line3DBuilder.markerSize(arg);
    }

    @Override
    public AxesBuilder ms(double arg) {
        return line3DBuilder.ms(arg);
    }

    @Override
    public AxesBuilder alpha(double arg) {
        return line3DBuilder.alpha(arg);
    }

    @Override
    public AxesBuilder drawStyle(String arg) {
        return line3DBuilder.drawStyle(arg);
    }

    @Override
    public AxesBuilder drawStyle(DrawStyleType arg) {
        return line3DBuilder.drawStyle(arg);
    }

    @Override
    public AxesBuilder markEvery(int arg) {
        return line3DBuilder.markEvery(arg);
    }

    @Override
    public String build() {
        return innerBuilder.build();
    }

    @Override
    public String getMethodName() {
        return "plot";
    }

}
