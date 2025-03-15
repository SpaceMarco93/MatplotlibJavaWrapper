package com.github.sh0nk.matplotlib4j.pyplot.builder;

/**
 * This interface is defining all the *args associated to the "xlim" method and
 * the "ylim" method defined in pyplot. 
 * 
 * matplotlib.pyplot.xlim(*args, **kwargs)
 * matplotlib.pyplot.xlim(*args, **kwargs)
 */
public interface LimitBuilder extends Builder2D {

    /**
     * Set the x limits of the current Axes.
     * 
     * @param left      lower boundary of the x-axis
     * @param right     upper boundary of the x-axis
     * @return  the instance of {@link LimitBuilder} for method chain  
     */
    LimitBuilder xLim(Number left, Number right);

    /**
     * Set the y limits of the current Axes.
     * 
     * @param left      lower boundary of the y-axis
     * @param right     upper boundary of the y-axis
     * @return  the instance of {@link LimitBuilder} for method chain  
     */
    LimitBuilder yLim(Number left, Number right);
}
