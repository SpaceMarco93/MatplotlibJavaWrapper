package com.github.sh0nk.matplotlib4j.axes.builder;

import com.github.sh0nk.matplotlib4j.enums.ScaleType;

/**
 * This interface is defining all the *args associated to the "set_xscale", 
 * "set_yscale", and "set_zscale" methods defined in Axes. 
 * 
 * matplotlib.axes.Axes.set_xscale(value, **kwargs)
 * matplotlib.axes.Axes.set_yscale(value, **kwargs)
 * matplotlib.axes.Axes.set_zscale(value, **kwargs)
 */
public interface ScaleBuilder extends Builder3D {

    /**
     * Set the x-axis' scale.
     * 
     * @param arg   an instance of the {@link ScaleType} enum defining the axis 
     *              scale
     * @return  the instance of {@link ScaleBuilder} for method chain
     */
    ScaleBuilder xScale(ScaleType arg);

    /**
     * Set the y-axis' scale.
     * 
     * @param arg   an instance of the {@link ScaleType} enum defining the axis
     *              scale
     * @return  the instance of {@link ScaleBuilder} for method chain
     */
    ScaleBuilder yScale(ScaleType arg);

    /**
     * Set the z-axis' scale.
     * 
     * @param arg   an instance of the {@link ScaleType} enum defining the axis
     *              scale
     * @return  the instance of {@link ScaleBuilder} for method chain
     */
    ScaleBuilder zScale(ScaleType arg);

}
