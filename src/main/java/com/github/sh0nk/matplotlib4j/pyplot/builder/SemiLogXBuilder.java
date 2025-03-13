package com.github.sh0nk.matplotlib4j.pyplot.builder;

import java.util.List;

import com.github.sh0nk.matplotlib4j.enums.NonPositiveType;
import com.github.sh0nk.matplotlib4j.pyplot.kwargs.Line2DBuilder;

/**
 * This interface is defining all the *args associated to the "semilogx" method
 * defined in pyplot. 
 * 
 * matplotlib.pyplot.semilogyx(*args, **kwargs)
 */
public interface SemiLogXBuilder extends Builder2D, Line2DBuilder<SemiLogXBuilder>{

    // Set the vertical coordinates of the data points.
    SemiLogXBuilder add(List<? extends Number> nums);

    // Set the The horizontal / vertical coordinates of the data points.
    SemiLogXBuilder add(List<? extends Number> x, List<? extends Number> y);

    /**
     * Set the The horizontal / vertical coordinates of the data points, and the
     * optional parameter fmt that is a convenient way for defining basic formatting 
     * like color, marker and linestyle.
     */
    SemiLogXBuilder add(List<? extends Number> x, List<? extends Number> y, String fmt);

    // Set the base of logarithm
    SemiLogXBuilder base(double arg);

    /**
     * Non-positive values in x can be masked as invalid, or clipped to a very 
     * small positive number.
     */
    SemiLogXBuilder nonPositive(NonPositiveType arg);

}
