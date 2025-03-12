package com.github.sh0nk.matplotlib4j.pyplot.builder;

import java.util.List;

import com.github.sh0nk.matplotlib4j.enums.AlgorithmType;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.ExtendType;
import com.github.sh0nk.matplotlib4j.enums.LineStyleType;
import com.github.sh0nk.matplotlib4j.enums.OriginType;
import com.github.sh0nk.matplotlib4j.enums.ScaleType;

/**
 * This class is implementing all the methods defined in the relative interface
 * {@link ContourBuilder}.
 * The first section defines the @Override of all the *args associated to this
 * method, while the second section invokes all the **kwargs which are imported
 * by the related object.
 */
public class ContourBuilderImpl implements ContourBuilder {

    // Variable defining the builder for the main method
    private final CompositeBuilder<ContourBuilder> innerBuilder = new CompositeBuilder<>(this);

    // Public constructor
    public ContourBuilderImpl() {}

    // *args section
    @Override
    public ContourBuilder add(List<? extends List<? extends Number>> Z) {
        return innerBuilder.add2DimListToArgs(Z);
    }

    @Override
    public ContourBuilder add(List<? extends Number> X, List<? extends Number> Y, List<? extends List<? extends Number>> Z) {
        innerBuilder.addToArgs(X);
        innerBuilder.addToArgs(Y);
        return innerBuilder.add2DimListToArgs(Z);
    }

    @Override
    public ContourBuilder levels(int arg) {
        return innerBuilder.addToArgs(arg);
    }

    @Override
    public ContourBuilder levels(List<? extends Number> arg) {
        return innerBuilder.addToArgs(arg);
    }

    @Override
    public ContourBuilder colors(ColorType arg) {
        return innerBuilder.addToKwargs("colors", arg.getColor());
    }

    @Override
    public ContourBuilder vMin(double arg) {
        return innerBuilder.addToKwargs("vmin", arg);
    }

    @Override
    public ContourBuilder vMax(double arg) {
        return innerBuilder.addToKwargs("vmax", arg);
    }

    @Override
    public ContourBuilder alpha(double arg) {
        return innerBuilder.addToKwargs("alpha", arg);
    }

    @Override
    public ContourBuilder norm(ScaleType arg) {
        return innerBuilder.addToKwargs("norm", arg.getScale());
    }

    @Override
    public ContourBuilder origin(OriginType arg) {
        return innerBuilder.addToKwargs("origin", arg.getOrigin());
    }

    @Override
    public ContourBuilder extend(ExtendType arg) {
        return innerBuilder.addToKwargs("extend", arg.getExtend());
    }

    @Override
    public ContourBuilder lineWidths(double arg) {
        return innerBuilder.addToKwargs("linewidths", arg);
    }

    @Override
    public ContourBuilder lineStyles(LineStyleType arg) {
        return innerBuilder.addToKwargs("linestyles", arg.getLineStyle());
    }

    @Override
    public ContourBuilder negativeLineStyles(LineStyleType arg) {
        return innerBuilder.addToKwargs("negative_linestyles", arg.getLineStyle());
    }

    @Override
    public ContourBuilder algorithm(AlgorithmType arg) {
        return innerBuilder.addToKwargs("algorithm", arg.getAlgorithm());
    }

    // Implement the builder interface methods
    @Override
    public String build() {
        return innerBuilder.build();
    }

    @Override
    public String getMethodName() {
        return "contour";
    }

}
