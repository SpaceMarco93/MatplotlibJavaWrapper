package com.github.sh0nk.matplotlib4j.pyplot.builder;

/**
 * This interface is defining all the *args associated to the "xlim" method and
 * the "ylim" method defined in pyplot. 
 * 
 * matplotlib.pyplot.xlim(*args, **kwargs)
 * matplotlib.pyplot.xlim(*args, **kwargs)
 */
public interface LimitBuilder extends Builder {

    // Set the x-axis boundaries.
    LimitBuilder xLim(Number left, Number right);

    // Set the y-axis boundaries.
    LimitBuilder yLim(Number left, Number right);
}
