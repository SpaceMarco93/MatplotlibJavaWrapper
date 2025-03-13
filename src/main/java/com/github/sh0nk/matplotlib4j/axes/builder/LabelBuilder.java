package com.github.sh0nk.matplotlib4j.axes.builder;

import com.github.sh0nk.matplotlib4j.axes.kwargs.TextArgsBuilder;
import com.github.sh0nk.matplotlib4j.enums.HorizonalAlighmentType;


/**
 * This interface is defining all the *args associated to the "set_xlabel" method,
 * "set_ylabel", and "set_zlabel" methods defined in Axes. 
 * 
 * matplotlib.axes.Axes.set_xlabel(xlabel, fontdict=None, labelpad=None, *, loc=None, **kwargs)
 * matplotlib.axes.Axes.set_ylabel(ylabel, fontdict=None, labelpad=None, *, loc=None, **kwargs)
 * matplotlib.axes.Axes.set_zlabel(zlabel, fontdict=None, labelpad=None, *, loc=None, **kwargs)
 */
public interface LabelBuilder extends Builder3D, TextArgsBuilder<LabelBuilder> {

    // Set the x-axis label text.
    LabelBuilder xLabel(String arg);

    // Set the y-axis label text.
    LabelBuilder yLabel(String arg);

    // Set the z-axis label text.
    LabelBuilder zLabel(String arg);

    // Set the label position.
    LabelBuilder loc(HorizonalAlighmentType arg);

}
