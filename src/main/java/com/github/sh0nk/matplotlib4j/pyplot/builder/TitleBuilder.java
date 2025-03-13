package com.github.sh0nk.matplotlib4j.pyplot.builder;

import com.github.sh0nk.matplotlib4j.enums.LocationType;
import com.github.sh0nk.matplotlib4j.pyplot.kwargs.TextArgsBuilder;

/**
 * This interface is defining all the *args associated to the "title" method
 * defined in pyplot. 
 * 
 * matplotlib.pyplot.title(*args, **kwargs)
 */
public interface TitleBuilder extends Builder2D, TextArgsBuilder<TitleBuilder> {

    // Add the title
    TitleBuilder add(String arg);

    // Text to use for the label
    TitleBuilder label(String arg);

    // Which title to set.
    TitleBuilder loc(LocationType arg);

    // Set the vertical Axes location for the title (1.0 is the top).
    TitleBuilder y(double arg);

    // The offset of the title from the top of the Axes, in points.
    TitleBuilder pad(double arg);

}
