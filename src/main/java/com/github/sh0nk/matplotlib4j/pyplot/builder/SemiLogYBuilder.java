package com.github.sh0nk.matplotlib4j.pyplot.builder;

import java.util.List;

import com.github.sh0nk.matplotlib4j.enums.NonPositiveType;
import com.github.sh0nk.matplotlib4j.pyplot.kwargs.Line2DBuilder;

/**
 * This interface is defining all the *args associated to the "semilogy" method
 * defined in pyplot. 
 * 
 * matplotlib.pyplot.semilogy(*args, **kwargs)
 */
public interface SemiLogYBuilder extends Builder2D, Line2DBuilder<SemiLogYBuilder>{

    /**
     * Add the y-coordinates to the semi-logarithmic plot.
     * 
     * @param nums  the vertical coordinates to be added to the semi-logarithmic plot
     * @return  the instance of {@link SemiLogYBuilder} for method chain
     */
    SemiLogYBuilder add(List<? extends Number> nums);

    /**
     * Add both x-coordinates and y-coordinates to the semi-logarithmic plot.
     * 
     * @param x     the set of x-coordinates to be added to the semi-logarithmic plot
     * @param y     the set of y-coordinates to be added to the semi-logarithmic plot
     * @return  the instance of {@link SemiLogYBuilder} for method chain
     */
    SemiLogYBuilder add(List<? extends Number> x, List<? extends Number> y);

    /**
     * Add both x-coordinates and y-coordinates of the data points together with
     * the string to provide a fast way to set the color and linestyle.
     * 
     * @param x     the set of x-coordinates to be added to the semi-logarithmic plot
     * @param y     the set of y-coordinates to be added to the semi-logarithmic plot
     * @param fmt   the string to select the color and linestyle
     * @return  the instance of {@link SemiLogYBuilder} for method chain
     */
    SemiLogYBuilder add(List<? extends Number> x, List<? extends Number> y, String fmt);

    /**
     * Set the base of the logarithm
     * 
     * @param arg   base of the logarithm
     * @return  the instance of {@link SemiLogYBuilder} for method chain
     */
    SemiLogYBuilder base(double arg);

    /**
     * Set how to display negative values.
     * <p>Non-positive values can be masked as invalid, or clipped to a very 
     * small positive number.</p>
     * 
     * @param arg   an instance of the {@link NonPositiveType} enum defining the 
     *              convention for negative values 
     * @return  the instance of {@link SemiLogYBuilder} for method chain
     */
    SemiLogYBuilder nonPositive(NonPositiveType arg);

}
