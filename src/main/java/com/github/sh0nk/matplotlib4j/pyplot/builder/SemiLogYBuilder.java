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

    // Set the vertical coordinates of the data points.
    SemiLogYBuilder add(List<? extends Number> nums);

    // Set the The horizontal / vertical coordinates of the data points.
    SemiLogYBuilder add(List<? extends Number> x, List<? extends Number> y);

    /**
     * Set the The horizontal / vertical coordinates of the data points, and the
     * optional parameter fmt that is a convenient way for defining basic formatting 
     * like color, marker and linestyle.
     */
    SemiLogYBuilder add(List<? extends Number> x, List<? extends Number> y, String fmt);

    // Set the base of logarithm
    SemiLogYBuilder base(double arg);

    /**
     * Non-positive values in x can be masked as invalid, or clipped to a very 
     * small positive number.
     */
    SemiLogYBuilder nonPositive(NonPositiveType arg);

}
