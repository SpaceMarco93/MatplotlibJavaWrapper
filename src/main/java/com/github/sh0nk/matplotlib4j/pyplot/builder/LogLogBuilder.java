package com.github.sh0nk.matplotlib4j.pyplot.builder;

import java.util.List;

import com.github.sh0nk.matplotlib4j.enums.NonPositiveType;
import com.github.sh0nk.matplotlib4j.kwargs.Line2DBuilder;

/**
 * This interface is defining all the *args associated to the "loglog" method
 * defined in pyplot. 
 * 
 * matplotlib.pyplot.loglog(*args, **kwargs)
 */
public interface LogLogBuilder extends Builder, Line2DBuilder<LogLogBuilder>{

    // Set the vertical coordinates of the data points.
    LogLogBuilder add(List<? extends Number> nums);

    // Set the The horizontal / vertical coordinates of the data points.
    LogLogBuilder add(List<? extends Number> x, List<? extends Number> y);

    /**
     * Set the The horizontal / vertical coordinates of the data points, and the
     * optional parameter fmt that is a convenient way for defining basic formatting 
     * like color, marker and linestyle.
     */
    LogLogBuilder add(List<? extends Number> x, List<? extends Number> y, String fmt);

    // Set the base of logarithm
    LogLogBuilder base(double arg);

    /**
     * Non-positive values in x can be masked as invalid, or clipped to a very 
     * small positive number.
     */
    LogLogBuilder nonPositive(NonPositiveType arg);

}
