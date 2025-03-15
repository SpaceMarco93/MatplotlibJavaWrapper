package com.github.sh0nk.matplotlib4j.pyplot.builder;

import com.github.sh0nk.matplotlib4j.enums.ScaleType;

/**
 * This interface is defining all the *args associated to the "xscale" and "yscale" 
 * method defined in pyplot. 
 * 
 * matplotlib.pyplot.xscale(value, **kwargs)
 * matplotlib.pyplot.yscale(value, **kwargs)
 */
public interface ScaleBuilder extends Builder2D {

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

}
