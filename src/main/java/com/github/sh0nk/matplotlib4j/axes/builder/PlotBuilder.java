package com.github.sh0nk.matplotlib4j.axes.builder;

import java.util.List;

import com.github.sh0nk.matplotlib4j.axes.kwargs.Line3DBuilder;

/**
 * This interface is defining all the *args associated to the "plot" method
 * defined in Axes. 
 * 
 * matplotlib.axes.Axes.plot(*args, scalex=True, scaley=True, data=None, **kwargs)
 */
public interface PlotBuilder extends Builder3D, Line3DBuilder<PlotBuilder> {

    // Set the vertical coordinates of the data points.
    PlotBuilder add(List<? extends Number> nums);

    // Set the The horizontal / vertical coordinates of the data points.
    PlotBuilder add(List<? extends Number> x, List<? extends Number> y);

    /**
     * Set the The horizontal / vertical coordinates of the data points, and the
     * optional parameter fmt that is a convenient way for defining basic formatting 
     * like color, marker and linestyle.
     */
    PlotBuilder add(List<? extends Number> x, List<? extends Number> y, String fmt);

    // Set the The horizontal / vertical and z coordinates of the data points.
    PlotBuilder add(List<? extends Number> x, List<? extends Number> y, List<? extends Number> z);

    /**
     * Set the The horizontal / vertical and z coordinates of the data points, and the
     * optional parameter fmt that is a convenient way for defining basic formatting 
     * like color, marker and linestyle.
     */
    PlotBuilder add(List<? extends Number> x, List<? extends Number> y, List<? extends Number> z, String fmt);

}
