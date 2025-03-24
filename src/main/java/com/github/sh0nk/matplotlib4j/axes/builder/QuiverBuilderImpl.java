package com.github.sh0nk.matplotlib4j.axes.builder;

import java.util.List;

import com.github.sh0nk.matplotlib4j.axes.kwargs.QuiverArgsBuilder;
import com.github.sh0nk.matplotlib4j.axes.kwargs.QuiverArgsBuilderImpl;
import com.github.sh0nk.matplotlib4j.enums.CapStyleType;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.HatchType;
import com.github.sh0nk.matplotlib4j.enums.JoinStyleType;
import com.github.sh0nk.matplotlib4j.enums.LineStyleType;
import com.github.sh0nk.matplotlib4j.enums.ParametrizedLineStyleType;
import com.github.sh0nk.matplotlib4j.enums.PivotType;

/**
 * This class is implementing all the methods defined in the relative interface
 * {@link QuiverBuilder}.
 * The first section defines the @Override of all the *args associated to this
 * method, while the second section invokes all the **kwargs which are imported
 * by the related object.
 */
public class QuiverBuilderImpl implements QuiverBuilder {

    // Variable defining the builder for the main method
    private final CompositeAxesBuilder<QuiverBuilder> innerBuilder = new CompositeAxesBuilder<>(this);

    // Variable defining the builder for all the **kwargs
    private final QuiverArgsBuilder<QuiverBuilder> kwargsBuilder = new QuiverArgsBuilderImpl<>(innerBuilder);

    // Public constructor
    public QuiverBuilderImpl() {}

    // *args section
    @Override
    public QuiverBuilder add(List<Number> u, List<Number> v, List<Number> w) {
        innerBuilder.addToArgs(u);
        innerBuilder.addToArgs(v);
        return innerBuilder.addToArgs(w);
    }

    @Override
    public QuiverBuilder add(List<Number> x, List<Number> y, List<Number> z, List<Number> u, List<Number> v, List<Number> w) {
        innerBuilder.addToArgs(x);
        innerBuilder.addToArgs(y);
        innerBuilder.addToArgs(z);
        innerBuilder.addToArgs(u);
        innerBuilder.addToArgs(v);
        return innerBuilder.addToArgs(w);
    }

    @Override
    public QuiverBuilder add(List<Number> x, List<Number> y, List<Number> z, List<Number> u, List<Number> v, List<Number> w, List<Number> c) {
        innerBuilder.addToArgs(x);
        innerBuilder.addToArgs(y);
        innerBuilder.addToArgs(z);
        innerBuilder.addToArgs(u);
        innerBuilder.addToArgs(v);
        innerBuilder.addToArgs(w);
        return innerBuilder.addToArgs(c);
    }

    @Override
    public QuiverBuilder pivot(PivotType pivotType) {
        return innerBuilder.addToKwargs("pivot", pivotType.getPivot());
    }

    @Override
    public QuiverBuilder color(ColorType colorType) {
        return innerBuilder.addToKwargs("color", colorType.getColor());
    }

    @Override
    public QuiverBuilder arrowLengthRatio(double arg) {
        return innerBuilder.addToKwargs("arrow_length_ratio", arg);
    }

    @Override
    public QuiverBuilder length(double arg) {
        return innerBuilder.addToKwargs("length", arg);
    }

    @Override
    public QuiverBuilder normalize(boolean arg) {
        return innerBuilder.addToKwargs("normalize", arg);
    }

    // **kwargs section
    @Override
    public QuiverBuilder alpha(double alpha) {
        return kwargsBuilder.alpha(alpha);
    }

    @Override
    public QuiverBuilder capStyle(CapStyleType capStyleType) {
        return kwargsBuilder.capStyle(capStyleType);
    }

    @Override
    public QuiverBuilder cLim(double vMin, double vMax) {
        return kwargsBuilder.cLim(vMin, vMax);
    }

    @Override
    public QuiverBuilder clipOn(boolean arg) {
        return kwargsBuilder.clipOn(arg);
    }

    @Override
    public QuiverBuilder edgeColor(ColorType color) {
        return kwargsBuilder.edgeColor(color);
    }

    @Override
    public QuiverBuilder faceColor(ColorType color) {
        return kwargsBuilder.faceColor(color);
    }

    @Override
    public QuiverBuilder hatch(HatchType hatchType) {
        return kwargsBuilder.hatch(hatchType);
    }

    @Override
    public QuiverBuilder hatchLineWidth(double arg) {
        return kwargsBuilder.hatchLineWidth(arg);
    }

    @Override
    public QuiverBuilder joinStyle(JoinStyleType joinStyleType) {
        return kwargsBuilder.joinStyle(joinStyleType);
    }

    @Override
    public QuiverBuilder label(String arg) {
        return kwargsBuilder.label(arg);
    }

    @Override
    public QuiverBuilder lineStyle(LineStyleType arg) {
        return kwargsBuilder.lineStyle(arg);
    }

    @Override
    public QuiverBuilder lineStyle(ParametrizedLineStyleType arg) {
        return kwargsBuilder.lineStyle(arg);
    }

    @Override
    public QuiverBuilder lineWidth(double arg) {
        return kwargsBuilder.lineWidth(arg);
    }

    // Implement the builder interface methods
    @Override
    public String build() {
        return innerBuilder.build();
    }

    @Override
    public String getMethodName() {
        return "quiver";
    }

}
