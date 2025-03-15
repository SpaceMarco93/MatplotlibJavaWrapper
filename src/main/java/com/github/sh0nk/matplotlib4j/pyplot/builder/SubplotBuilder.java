package com.github.sh0nk.matplotlib4j.pyplot.builder;

import com.github.sh0nk.matplotlib4j.enums.ProjectionType;
import com.github.sh0nk.matplotlib4j.pyplot.kwargs.AxesArgsBuilder;

/**
 * This interface is defining all the *args associated to the "subplot" method
 * defined in pyplot. 
 * 
 * matplotlib.pyplot.subplot(*args, **kwargs)
 */
public interface SubplotBuilder extends Builder2D, AxesArgsBuilder<SubplotBuilder> {

    /**
     * Add the grid dimension and positional index.
     * <p>This method is used to set the grid number of rows and columns and also
     * to specify the grid entry where next plot will be displayed.</p>
     * 
     * @param nRows     the grid rows number
     * @param nCols     the grid columns number
     * @param index     the grid entry where next plot is displayed
     * @return  the instance of {@link SubplotBuilder} for method chain
     */
    SubplotBuilder add(int nRows, int nCols, int index);

    /**
     * Set the projection type of the subplot
     * 
     * @param arg   an instance of the {@link ProjectionType} enum defining the 
     *              projection type of the subplot
     * @return  the instance of {@link SubplotBuilder} for method chain
     */
    SubplotBuilder projection(ProjectionType arg);

}
