package com.github.sh0nk.matplotlib4j.pyplot.builder;

import com.github.sh0nk.matplotlib4j.enums.GridAxisType;
import com.github.sh0nk.matplotlib4j.enums.GridWhichType;
import com.github.sh0nk.matplotlib4j.pyplot.kwargs.Line2DBuilder;

/**
 * This interface is defining all the *args associated to the "grid" method
 * defined in pyplot. 
 * 
 * matplotlib.pyplot.grid(visible=None, which='major', axis='both', **kwargs)
 */
public interface GridBuilder extends Builder2D, Line2DBuilder<GridBuilder> {

    /**
     * Set the visibility of the grid lines.
     * <p>This method is used whether to show the grid lines. If any kwargs are 
     * supplied, it is assumed you want the grid on and visible will be set to True.
     * If visible is None and there are no kwargs, this toggles the visibility of 
     * the lines.</p>
     * 
     * @param flag      boolean value to set the visibility of the grid lines.
     * @return  the instance of {@link GridBuilder} for method chain   
     */
    GridBuilder visible(boolean flag);

    /**
     * Set the grid lines to apply the changes on.
     * <p>This method is used to set the grid lines to apply the changes on.</p>
     * 
     * @param arg   an instance of the {@link GridWhichType} enum 
     * @return  the instance of {@link GridBuilder} for method chain 
     */
    GridBuilder which(GridWhichType arg);

    /**
     * Set the axis to apply the changes on.
     * <p>This method is used to check if the grid lines are to be applied only
     * for a particular axis.</p>
     * 
     * @param arg   an instance of the {@link GridAxisType} enum 
     * @return  the instance of {@link GridBuilder} for method chain 
     */
    GridBuilder axis(GridAxisType arg);

}
