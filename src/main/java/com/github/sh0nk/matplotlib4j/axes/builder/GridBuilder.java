package com.github.sh0nk.matplotlib4j.axes.builder;

import com.github.sh0nk.matplotlib4j.axes.kwargs.Line3DBuilder;
import com.github.sh0nk.matplotlib4j.enums.GridAxisType;
import com.github.sh0nk.matplotlib4j.enums.GridWhichType;

/**
 * This interface is defining all the *args associated to the "grid" method
 * defined in Axes. 
 * 
 * matplotlib.axes.Axes.grid(visible=None, which='major', axis='both', **kwargs)
 */
public interface GridBuilder extends Builder3D, Line3DBuilder<GridBuilder> {

    // Whether to show the grid lines.
    GridBuilder visible(boolean flag);

    // The grid lines to apply the changes on.
    GridBuilder which(GridWhichType arg);

    // The axis to apply the changes on.
    GridBuilder axis(GridAxisType arg);

}
