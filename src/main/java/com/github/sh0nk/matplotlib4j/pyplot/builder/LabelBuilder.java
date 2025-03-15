package com.github.sh0nk.matplotlib4j.pyplot.builder;

import com.github.sh0nk.matplotlib4j.enums.HorizontalAlignmentType;
import com.github.sh0nk.matplotlib4j.pyplot.kwargs.TextArgsBuilder;

/**
 * This interface is defining all the *args associated to the "xlabel" method and
 * "ylabel" method defined in pyplot. 
 * 
 * matplotlib.pyplot.xlabel(xlabel, fontdict=None, labelpad=None, *, loc=None, **kwargs)
 * matplotlib.pyplot.ylabel(xlabel, fontdict=None, labelpad=None, *, loc=None, **kwargs)
 */
public interface LabelBuilder extends Builder2D, TextArgsBuilder<LabelBuilder> {

    /**
     * Set the label text for the x-axis.
     * 
     * @param arg   the text to be displayed for the x-axis
     * @return  the instance of {@link LabelBuilder} for method chain
     */
    LabelBuilder xLabel(String arg);

    /**
     * Set the label text for the y-axis.
     * 
     * @param arg   the text to be displayed for the y-axis
     * @return  the instance of {@link LabelBuilder} for method chain
     */
    LabelBuilder yLabel(String arg);

    /**
     * Set the label text position.
     * 
     * @param arg   an instance of the {@link HorizontalAlignmentType} enum
     * @return  the instance of {@link LabelBuilder} for method chain
     */
    LabelBuilder loc(HorizontalAlignmentType arg);

}
