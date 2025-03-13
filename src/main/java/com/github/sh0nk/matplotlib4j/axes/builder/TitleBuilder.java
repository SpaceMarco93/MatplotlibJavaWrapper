package com.github.sh0nk.matplotlib4j.axes.builder;

import com.github.sh0nk.matplotlib4j.axes.kwargs.TextArgsBuilder;
import com.github.sh0nk.matplotlib4j.enums.LocationType;

/**
 * This interface is defining all the *args associated to the "set_title" method
 * defined in Axes. 
 * 
 * matplotlib.axes.Axes.set_title(label, fontdict=None, loc=None, pad=None, *, y=None, **kwargs)
 */
public interface TitleBuilder extends Builder3D, TextArgsBuilder<TitleBuilder> {

    // Text to use for the title
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
