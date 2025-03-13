package com.github.sh0nk.matplotlib4j.pyplot.kwargs;

import com.github.sh0nk.matplotlib4j.enums.AdjutableType;
import com.github.sh0nk.matplotlib4j.enums.AnchorType;
import com.github.sh0nk.matplotlib4j.enums.AspectType;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.ScaleType;
import com.github.sh0nk.matplotlib4j.pyplot.builder.Builder2D;
import com.github.sh0nk.matplotlib4j.pyplot.builder.SubplotBuilder;

/**
 * This interface is defining all the **kwargs associated to the "Axes" method
 * defined in axes. This interface is supporting the interface {@link SubplotBuilder}
 * where the main arguments *args are defined.
 * 
 * matplotlib.axes.Axes(fig, *args, **kwargs)
 *
 */
public interface AxesArgsBuilder<T extends Builder2D> extends KwargsBuilder {

    // Set how the Axes adjusts to achieve the required aspect ratio.
    T adjustable(AdjutableType arg);

    // Set the alpha value used for blending
    T alpha(double arg);

    // Define the anchor location.
    T anchor(AnchorType arg);

    // Set the aspect ratio of the Axes scaling, i.e. y/x-scale.
    T aspect(AspectType arg);

    // Set whether autoscaling is applied to each axis on the next draw
    T autoScaleOn(boolean arg);

    // Set whether axis ticks and gridlines are above or below most artists.
    T axisBelow(boolean arg);

    // Set the Axes box aspect, i.e. the ratio of height to width.
    T boxAspect(double arg);

    // Set the facecolor of the Axes.
    T faceColor(ColorType arg);

    // Set the Figure or SubFigure instance the artist belongs to.
    T figure(String arg);

    // Set whether the Axes rectangle patch is drawn.
    T frameOn(boolean arg);

    // Set if artist is to be included in layout calculations
    T inLayout(boolean arg);

    // Set a label that will be displayed in the legend.
    T label(String arg);

    // Set a title for the Axes.
    T title(String arg);

    // Set the artist's visibility.
    T visible(boolean arg);

    // Set the lower and upper numerical bounds of the x-axis.
    T xBound(double left, double right);

    // Set the label for the x-axis.
    T xLabel(String arg);

    // Set the x-axis view limits
    T xLim(double left, double right);

    // Set the xaxis' scale.
    T xScale(ScaleType arg);

    // Set the xaxis' tick locations and optionally tick labels instance (to be verified).
    T xTicks(String arg);

    // Set the lower and upper numerical bounds of the y-axis.
    T yBound(double left, double right);

    // Set the label for the y-axis.
    T yLabel(String arg);

    // Set the y-axis view limits.
    T yLim(double left, double right);

    // Set the yaxis' scale.
    T yScale(ScaleType arg);

    // Set the yaxis' tick locations and optionally tick labels instance (to be verified)..
    T yTicks(String arg);

}
