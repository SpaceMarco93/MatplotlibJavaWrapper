package com.github.sh0nk.matplotlib4j.axes.builder;

import com.github.sh0nk.matplotlib4j.axes.kwargs.TextArgsBuilder;

/**
 * This interface is defining all the *args associated to the "text" method
 * defined in Axes. 
 * 
 * matplotlib.axes.Axes.text(x, y, s, fontdict=None, **kwargs)
 */
public interface TextBuilder extends Builder3D, TextArgsBuilder<TextBuilder> {

    /**
     * Add the text position coordinates and content.
     * 
     * @param x     x-coordinate of the text position
     * @param y     y-coordinate of the text position
     * @param z     z-coordinate of the text position
     * @param text  the text content
     * @return  the instance of {@link TextBuilder} for method chain
     */
    TextBuilder add(Number x, Number y, Number z, String fmt);

}
