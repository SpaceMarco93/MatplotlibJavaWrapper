package com.github.sh0nk.matplotlib4j.pyplot.builder;

import com.github.sh0nk.matplotlib4j.enums.HorizonalAlighmentType;
import com.github.sh0nk.matplotlib4j.kwargs.TextArgsBuilder;


/**
 * This interface is defining all the *args associated to the "xlabel" method and
 * "ylabel" method defined in pyplot. 
 * 
 * matplotlib.pyplot.xlabel(xlabel, fontdict=None, labelpad=None, *, loc=None, **kwargs)
 * matplotlib.pyplot.ylabel(xlabel, fontdict=None, labelpad=None, *, loc=None, **kwargs)
 */
public interface LabelBuilder extends Builder, TextArgsBuilder<LabelBuilder> {

    // Set the x-axis label text.
    LabelBuilder xLabel(String arg);

    // Set the y-axis label text.
    LabelBuilder yLabel(String arg);

    // Set the label position.
    LabelBuilder loc(HorizonalAlighmentType arg);

}
