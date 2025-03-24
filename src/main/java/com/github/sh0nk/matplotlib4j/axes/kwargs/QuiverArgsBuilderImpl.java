package com.github.sh0nk.matplotlib4j.axes.kwargs;

import com.github.sh0nk.matplotlib4j.axes.builder.Builder3D;
import com.github.sh0nk.matplotlib4j.axes.builder.CompositeAxesBuilder;
import com.github.sh0nk.matplotlib4j.enums.CapStyleType;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.HatchType;
import com.github.sh0nk.matplotlib4j.enums.JoinStyleType;
import com.github.sh0nk.matplotlib4j.enums.LineStyleType;
import com.github.sh0nk.matplotlib4j.enums.ParametrizedLineStyleType;

/**
 * This class is implementing all the methods defined in the relative interface
 * {@link QuiverArgsBuilder}.
 */
public class QuiverArgsBuilderImpl<T extends Builder3D> implements QuiverArgsBuilder<T>{

    // Define the instance of the CompositeBuilder 
    private final CompositeAxesBuilder<T> innerBuilder;

    // Public constructor accepting any method using Axes objects as **kwargs
    public QuiverArgsBuilderImpl(CompositeAxesBuilder<T> innerBuilder) {
        this.innerBuilder = innerBuilder;
    }

    @Override
    public T alpha(double alpha) {
        return innerBuilder.addToKwargs("alpha", alpha);
    }

    @Override
    public T capStyle(CapStyleType capStyleType) {
        return innerBuilder.addToKwargs("capstyle", capStyleType.getCapStyle());
    }

    @Override
    public T cLim(double vMin, double vMax) {
        String string = "(vmin = " + vMin + ",vMax= " + vMax + ")";
        return innerBuilder.addToKwargs("clim", string);
    }

    @Override
    public T clipOn(boolean arg) {
        return innerBuilder.addToKwargs("clip_on", arg);
    }

    @Override
    public T color(ColorType color) {
        return innerBuilder.addToKwargs("color", color.getColor());
    }

    @Override
    public T edgeColor(ColorType color) {
        return innerBuilder.addToKwargs("edgecolor", color.getColor());
    }

    @Override
    public T faceColor(ColorType color) {
        return innerBuilder.addToKwargs("facecolor", color.getColor());
    }

    @Override
    public T hatch(HatchType hatchType) {
        return innerBuilder.addToKwargs("hatch", hatchType.getHacth());
    }

    @Override
    public T hatchLineWidth(double arg) {
        return innerBuilder.addToKwargs("hatch_linewidth", arg);
    }

    @Override
    public T joinStyle(JoinStyleType joinStyleType) {
        return innerBuilder.addToKwargs("joinstyle", joinStyleType.getJoinStyle());
    }

    @Override
    public T label(String arg) {
        return innerBuilder.addToKwargs("label", arg);
    }

    @Override
    public T lineStyle(LineStyleType arg) {
        return innerBuilder.addToKwargs("linestyle", arg.getLineStyle());
    }

    @Override
    public T lineStyle(ParametrizedLineStyleType arg) {
        return innerBuilder.addToKwargs("linestyle", arg.getNameStyle());
    }

    @Override
    public T lineWidth(double arg) {
        return innerBuilder.addToKwargs("linewidth", arg);
    }
}
