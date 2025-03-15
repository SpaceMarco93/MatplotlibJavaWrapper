package com.github.sh0nk.matplotlib4j.pyplot.builder;

import java.util.List;

import com.github.sh0nk.matplotlib4j.pyplot.kwargs.Line2DBuilder;

/**
 * This interface is defining all the *args associated to the "plot" method
 * defined in pyplot. 
 * 
 * matplotlib.pyplot.plot(*args, scalex=True, scaley=True, data=None, **kwargs)
 */
public interface PlotBuilder extends Builder2D, Line2DBuilder<PlotBuilder> {

    /**
     * Add the y-coordinates to the line plot.
     * 
     * @param nums  the vertical coordinates to be added to the line plot
     * @return  the instance of {@link PlotBuilder} for method chain
     */
    PlotBuilder add(List<? extends Number> nums);

    /**
     * Add both x-coordinates and y-coordinates to the line plot.
     * 
     * @param x     the set of x-coordinates to be added to the line plot
     * @param y     the set of y-coordinates to be added to the line plot
     * @return  the instance of {@link PlotBuilder} for method chain
     */
    PlotBuilder add(List<? extends Number> x, List<? extends Number> y);

    /**
     * Add both x-coordinates and y-coordinates of the data points together with
     * the string to provide a fast way to set the color and linestyle.
     * 
     * @param x     the set of x-coordinates to be added to the line plot
     * @param y     the set of y-coordinates to be added to the line plot
     * @param fmt   the string to select the color and linestyle
     * @return  the instance of {@link PlotBuilder} for method chain
     */
    PlotBuilder add(List<? extends Number> x, List<? extends Number> y, String fmt);

}
