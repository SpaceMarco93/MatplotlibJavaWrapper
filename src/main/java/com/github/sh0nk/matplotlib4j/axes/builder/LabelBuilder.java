package com.github.sh0nk.matplotlib4j.axes.builder;

import com.github.sh0nk.matplotlib4j.axes.kwargs.TextArgsBuilder;
import com.github.sh0nk.matplotlib4j.enums.HorizontalAlignmentType;


/**
 * This interface is defining all the *args associated to the "set_xlabel" method,
 * "set_ylabel", and "set_zlabel" methods defined in Axes. 
 * 
 * matplotlib.axes.Axes.set_xlabel(xlabel, fontdict=None, labelpad=None, *, loc=None, **kwargs)
 * matplotlib.axes.Axes.set_ylabel(ylabel, fontdict=None, labelpad=None, *, loc=None, **kwargs)
 * matplotlib.axes.Axes.set_zlabel(zlabel, fontdict=None, labelpad=None, *, loc=None, **kwargs)
 */
public interface LabelBuilder extends Builder3D, TextArgsBuilder<LabelBuilder> {

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
     * Set the label text for the z-axis.
     * 
     * @param arg   the text to be displayed for the z-axis
     * @return  the instance of {@link LabelBuilder} for method chain
     */
    LabelBuilder zLabel(String arg);

    /**
     * Set the label text position.
     * 
     * @param arg   an instance of the {@link HorizontalAlignmentType} enum
     * @return  the instance of {@link LabelBuilder} for method chain
     */
    LabelBuilder loc(HorizontalAlignmentType arg);

}
