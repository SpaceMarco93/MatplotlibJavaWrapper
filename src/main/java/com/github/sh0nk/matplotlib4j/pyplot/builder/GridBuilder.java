package com.github.sh0nk.matplotlib4j.pyplot.builder;

import com.github.sh0nk.matplotlib4j.enums.GridAxisType;
import com.github.sh0nk.matplotlib4j.enums.GridWhichType;
import com.github.sh0nk.matplotlib4j.kwargs.Line2DBuilder;

/**
 * This interface is defining all the *args associated to the "grid" method
 * defined in pyplot. 
 * 
 * matplotlib.pyplot.grid(visible=None, which='major', axis='both', **kwargs)
 */
public interface GridBuilder extends Builder, Line2DBuilder<GridBuilder> {

    // Whether to show the grid lines.
    GridBuilder visible(boolean flag);

    // The grid lines to apply the changes on.
    GridBuilder which(GridWhichType arg);

    // The axis to apply the changes on.
    GridBuilder axis(GridAxisType arg);

}
