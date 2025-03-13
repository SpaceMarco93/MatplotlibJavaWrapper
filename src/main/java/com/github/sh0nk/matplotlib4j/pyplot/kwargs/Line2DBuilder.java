package com.github.sh0nk.matplotlib4j.pyplot.kwargs;

import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.DrawStyleType;
import com.github.sh0nk.matplotlib4j.enums.LineStyleType;
import com.github.sh0nk.matplotlib4j.enums.MarkerStyleType;
import com.github.sh0nk.matplotlib4j.enums.ParametrizedLineStyleType;
import com.github.sh0nk.matplotlib4j.pyplot.builder.Builder2D;
import com.github.sh0nk.matplotlib4j.pyplot.builder.PlotBuilder;

/**
 * This interface is defining all the **kwargs associated to the "plot" method
 * defined in pyplot. This interface is supporting the interface {@link PlotBuilder}
 * where the main arguments *args are defined.
 * 
 * matplotlib.pyplot.plot(*args, **kwargs)
 *
 */
public interface Line2DBuilder<T extends Builder2D> extends KwargsBuilder {

    // Set the alpha value used for blending
    T alpha(double arg);

    // Set the drawstyle of the plot. The drawstyle determines how the points are connected.
    T drawStyle(String arg);

    // Set the drawstyle of the plot. The drawstyle determines how the points are connected.
    T drawStyle(DrawStyleType arg);

    // Set the color of the line.
    T color(String arg);

    // Set the color of the line.
    T color(ColorType arg);

    // Set a label that will be displayed in the legend.
    T label(String arg);

    // Set the linestyle of the line.
    T lineStyle(String arg);

    // Set the linestyle of the line.
    T lineStyle(LineStyleType arg);

    // Set the linestyle of the line.
    T lineStyle(ParametrizedLineStyleType arg);

    // Set the linestyle of the line.
    T ls(String arg);

    // Set the linestyle of the line.
    T ls(LineStyleType arg);

    // Set the linestyle of the line.
    T ls(ParametrizedLineStyleType arg);

    // Set the line width in points.
    T lineWidth(double arg);

    // Set the line width in points.
    T lw(double arg);

    // Set the line marker.
    T marker(String arg);

    // Set the line marker.
    T marker(MarkerStyleType arg);

    // Set the marker edge color.
    T markerColor(String arg);

    // Set the marker edge color.
    T markerColor(ColorType arg);

    // Set the marker edge color.
    T mec(String arg);

    // Set the marker edge color.
    T mec(ColorType arg);

    // Set the marker size in points.
    T markerSize(double arg);

    // Set the marker size in points.
    T ms(double arg);

    // Set the markevery property to subsample the plot when using markers.
    T markEvery(int arg);
    
}
