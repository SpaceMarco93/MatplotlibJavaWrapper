package com.github.sh0nk.matplotlib4j.axes.kwargs;

import com.github.sh0nk.matplotlib4j.axes.builder.Builder3D;
import com.github.sh0nk.matplotlib4j.axes.builder.CompositeAxesBuilder;
import com.github.sh0nk.matplotlib4j.enums.AdjustableType;
import com.github.sh0nk.matplotlib4j.enums.AnchorType;
import com.github.sh0nk.matplotlib4j.enums.AspectType;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.ScaleType;

/**
 * This class is implementing all the methods defined in the relative interface
 * {@link AxesArgsBuilder}.
 */
public class AxesArgsBuilderImpl<T extends Builder3D> implements AxesArgsBuilder<T> {

    // Define the instance of the CompositeBuilder 
    private final CompositeAxesBuilder<T> innerBuilder;

    // Public constructor accepting any method using Axes objects as **kwargs
    public AxesArgsBuilderImpl(CompositeAxesBuilder<T> innerBuilder) {
        this.innerBuilder = innerBuilder;
    }

    @Override
    public T adjustable(AdjustableType arg) {
        return innerBuilder.addToKwargs("adjustable", arg.getAdjustable());
    }

    @Override
    public T alpha(double arg) {
        return innerBuilder.addToKwargs("alpha", arg);
    }

    @Override
    public T anchor(AnchorType arg) {
        return innerBuilder.addToKwargs("anchor", arg.getAnchor());
    }

    @Override
    public T aspect(AspectType arg) {
        return innerBuilder.addToKwargs("aspect", arg.getAspect());
    }

    @Override
    public T autoScaleOn(boolean arg) {
        return innerBuilder.addToKwargs("autoscale_on", arg);
    }

    @Override
    public T axisBelow(boolean arg) {
        return innerBuilder.addToKwargs("axisbelow", arg);
    }

    @Override
    public T boxAspect(double arg) {
        return innerBuilder.addToKwargs("box_aspect", arg);
    }

    @Override
    public T faceColor(ColorType arg) {
        return innerBuilder.addToKwargs("facecolor", arg.getColor());
    }

    @Override
    public T figure(String arg) {
        return innerBuilder.addToKwargs("figure", arg);
    }

    @Override
    public T frameOn(boolean arg) {
        return innerBuilder.addToKwargs("frame_on", arg);
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
    public T title(String arg) {
        return innerBuilder.addToKwargs("title", arg);
    }

    @Override
    public T visible(boolean arg) {
        return innerBuilder.addToKwargs("visible", arg);
    }

    @Override
    public T xBound(double left, double right) {
        String string = "(left = " + left + ",right= " + right + ")";
        return innerBuilder.addToKwargs("xbound", string);
    }

    @Override
    public T xLabel(String arg) {
        return innerBuilder.addToKwargs("xlabel", arg);
    }

    @Override
    public T xLim(double left, double right) {
        String string = "(left = " + left + ",right= " + right + ")";
        return innerBuilder.addToKwargs("xlim", string);
    }

    @Override
    public T xScale(ScaleType arg) {
        return innerBuilder.addToKwargs("xscale", arg.getScale());
    }

    @Override
    public T xTicks(String arg) {
        return innerBuilder.addToKwargs("xticks", arg);
    }

    @Override
    public T yBound(double left, double right) {
        String string = "(left = " + left + ",right= " + right + ")";
        return innerBuilder.addToKwargs("ybound", string);
    }

    @Override
    public T yLabel(String arg) {
        return innerBuilder.addToKwargs("xlabel", arg);
    }

    @Override
    public T yLim(double left, double right) {
        String string = "(left = " + left + ",right= " + right + ")";
        return innerBuilder.addToKwargs("ylim", string);
    }

    @Override
    public T yScale(ScaleType arg) {
        return innerBuilder.addToKwargs("ysclae", arg.getScale());
    }

    @Override
    public T yTicks(String arg) {
        return innerBuilder.addToKwargs("yticks", arg);
    }

    

}
