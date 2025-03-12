package com.github.sh0nk.matplotlib4j.pyplot.builder;

import com.github.sh0nk.matplotlib4j.enums.ProjectionType;
import com.github.sh0nk.matplotlib4j.kwargs.AxesArgsBuilder;

/**
 * This interface is defining all the *args associated to the "subplot" method
 * defined in pyplot. 
 * 
 * matplotlib.pyplot.subplot(*args, **kwargs)
 */
public interface SubplotBuilder extends Builder, AxesArgsBuilder<SubplotBuilder> {

    // The position of the subplot described the three integers
    SubplotBuilder add(int x, int y, int index);

    // The projection type of the subplot
    SubplotBuilder projection(ProjectionType arg);

}
