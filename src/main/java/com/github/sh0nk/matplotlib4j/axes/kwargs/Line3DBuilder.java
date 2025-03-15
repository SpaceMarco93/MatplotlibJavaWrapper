package com.github.sh0nk.matplotlib4j.axes.kwargs;

import com.github.sh0nk.matplotlib4j.axes.builder.Builder3D;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.DrawStyleType;
import com.github.sh0nk.matplotlib4j.enums.LineStyleType;
import com.github.sh0nk.matplotlib4j.enums.MarkerStyleType;
import com.github.sh0nk.matplotlib4j.enums.ParametrizedLineStyleType;
import com.github.sh0nk.matplotlib4j.pyplot.builder.PlotBuilder;

/**
 * 
 * This interface is defining all the **kwargs associated to the "plot" method
 * defined in axes. This interface is supporting the interface {@link PlotBuilder}
 * where the main arguments *args are defined.
 * 
 * matplotlib.axes.Axes.plot(fig, *args, **kwargs)
 *
 * https://matplotlib.org/stable/api/_as_gen/matplotlib.lines.Line2D.html#matplotlib.lines.Line2D
 */
public interface Line3DBuilder<T extends Builder3D> extends KwargsBuilder {

    /**
     * Set the alpha value used for blending
     * 
     * @param arg       the alpha value used for blending   
     * @return  the instance of {@link T} builder for method chain
     */
    T alpha(double arg);

    /**
     * Set the drawstyle of the plot. 
     * <p>The drawstyle determines how the points are connected.</p>
     * 
     * @param arg   a string providing the line drawstyle
     * @return  the instance of {@link T} builder for method chain
     */
    T drawStyle(String arg);

    /**
     * Set the drawstyle of the plot. 
     * <p>The drawstyle determines how the points are connected.</p>
     * 
     * @param arg   an instance of the {@link DrawStyleType} enum providing the 
     *              line drawstyle
     * @return  the instance of {@link T} builder for method chain
     */
    T drawStyle(DrawStyleType arg);

    /**
     * Set the linestyle of the line.
     * 
     * @param arg   a string defining the line linestyle
     * @return  the instance of {@link T} builder for method chain
     */
    T lineStyle(String arg);

    /**
     * Set the linestyle of the line.
     * 
     * @param arg   an instance of the {@link LineStyleType} enum providing the 
     *              line linestyle
     * @return  the instance of {@link T} builder for method chain
     */
    T lineStyle(LineStyleType arg);

    /**
     * Set the linestyle of the line.
     * 
     * @param arg   an instance of the {@link ParametrizedLineStyleType} enum 
     *              providing the line linestyle
     * @return  the instance of {@link T} builder for method chain
     */
    T lineStyle(ParametrizedLineStyleType arg);

    /**
     * Set the linestyle of the line.
     * 
     * @param arg   a string defining the line linestyle
     * @return  the instance of {@link T} builder for method chain
     */
    T ls(String arg);

    /**
     * Set the linestyle of the line.
     * 
     * @param arg   an instance of the {@link LineStyleType} enum providing the 
     *              line linestyle
     * @return  the instance of {@link T} builder for method chain
     */
    T ls(LineStyleType arg);

    /**
     * Set the linestyle of the line.
     * 
     * @param arg   an instance of the {@link ParametrizedLineStyleType} enum 
     *              providing the line linestyle
     * @return  the instance of {@link T} builder for method chain
     */
    T ls(ParametrizedLineStyleType arg);

    /**
     * Set the line width in points.
     * 
     * @param arg   the line width in points
     * @return  the instance of {@link T} builder for method chain
     */
    T lineWidth(double arg);

    /**
     * Set the line width in points.
     * 
     * @param arg   the line width in points
     * @return  the instance of {@link T} builder for method chain
     */
    T lw(double arg);

    /**
     * Set a label that will be displayed in the legend.
     * 
     * @param arg   the text that will be displayed in the legend
     * @return  the instance of {@link T} builder for method chain
     */
    T label(String arg);

    /**
     * Set the color of the line.
     * 
     * @param arg   a string providing the color line
     * @return  the instance of {@link T} builder for method chain
     */
    T color(String arg);

    /**
     * Set the color of the line.
     * 
     * @param arg   an instance of the {@link ColorType} enum providing the 
     *              color line
     * @return  the instance of {@link T} builder for method chain
     */
    T color(ColorType arg);

    /**
     * Set the line marker.
     * 
     * @param arg   a string providing the type of marker to be used
     * @return  the instance of {@link T} builder for method chain
     */
    T marker(String arg);

    /**
     * Set the line marker.
     * 
     * @param arg   an instance of the {@link MarkerStyleType} enum providing the 
     *              type of marker to be used
     * @return  the instance of {@link T} builder for method chain
     */
    T marker(MarkerStyleType arg);

    /**
     * Set the marker edge color.
     * 
     * @param arg   a string providing the color to be used for the markers
     * @return  the instance of {@link T} builder for method chain
     */
    T markerColor(String arg);

    /**
     * Set the marker edge color.
     * 
     * @param arg   an instance of the {@link ColorType} enum providing the 
     *              color to be used for the markers
     * @return  the instance of {@link T} builder for method chain
     */
    T markerColor(ColorType arg);

    /**
     * Set the marker edge color.
     * 
     * @param arg   a string providing the color to be used for the markers
     * @return  the instance of {@link T} builder for method chain
     */
    T mec(String arg);

    /**
     * Set the marker edge color.
     * 
     * @param arg   an instance of the {@link ColorType} enum providing the 
     *              color to be used for the markers
     * @return  the instance of {@link T} builder for method chain
     */
    T mec(ColorType arg);

    /**
     * Set the marker size in points.
     * 
     * @param arg   the marker size in points
     * @return  the instance of {@link T} builder for method chain
     */
    T markerSize(double arg);

    /**
     * Set the marker size in points.
     * 
     * @param arg   the marker size in points
     * @return  the instance of {@link T} builder for method chain
     */
    T ms(double arg);

    /**
     * Set the markevery property to subsample the plot when using markers.
     * 
     * @param arg   the number of steps between each marker to be displayed
     * @return  the instance of {@link T} builder for method chain
     */
    T markEvery(int arg);
    
}
