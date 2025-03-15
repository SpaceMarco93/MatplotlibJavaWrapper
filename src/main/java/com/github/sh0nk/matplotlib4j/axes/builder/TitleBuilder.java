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

    /**
     * Add the title to the arguments of the {@link TitleBuilder} instance.
     * 
     * @param arg   the plot title 
     * @return  the instance of {@link TitleBuilder} for method chain
     */
    TitleBuilder add(String arg);

    /**
     * Set the plot title.
     * 
     * @param arg   the plot title 
     * @return  the instance of {@link TitleBuilder} for method chain
     */
    TitleBuilder label(String arg);

    /**
     * Set the title location.
     * 
     * @param arg   an instance of the {@link LocationType} enum providing the 
     *              location
     * @return  the instance of {@link TitleBuilder} for method chain
     */
    TitleBuilder loc(LocationType arg);

    /**
     * Set the vertical Axes location for the title (1.0 is the top).
     * 
     * @param arg   the vertical position of the title (number between 0 and 1)
     * @return  the instance of {@link TitleBuilder} for method chain
     */
    TitleBuilder y(double arg);

    /**
     * Set the offset of the title from the top of the Axes, in points.
     * 
     * @param arg   the title offset from the top of the Axes in points.
     * @return  the instance of {@link TitleBuilder} for method chain
     */
    TitleBuilder pad(double arg);

}
