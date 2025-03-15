package com.github.sh0nk.matplotlib4j.pyplot.builder;

import com.github.sh0nk.matplotlib4j.pyplot.kwargs.TextArgsBuilder;

/**
 * This interface is defining all the *args associated to the "text" method
 * defined in pyplot. 
 * 
 * matplotlib.pyplot.text(x, y, s, fontdict=None, **kwargs)
 */
public interface TextBuilder extends Builder2D, TextArgsBuilder<TextBuilder> {

    /**
     * Add the text position coordinates and content.
     * 
     * @param x     x-coordinate of the text position
     * @param y     y-coordinate of the text position
     * @param text  the text content
     * @return  the instance of {@link TextBuilder} for method chain
     */
    TextBuilder add(Number x, Number y, String text);

}
