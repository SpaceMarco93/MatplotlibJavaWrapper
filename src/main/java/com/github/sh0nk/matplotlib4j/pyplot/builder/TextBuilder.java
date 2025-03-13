package com.github.sh0nk.matplotlib4j.pyplot.builder;

import com.github.sh0nk.matplotlib4j.pyplot.kwargs.TextArgsBuilder;

/**
 * This interface is defining all the *args associated to the "text" method
 * defined in pyplot. 
 * 
 * matplotlib.pyplot.text(x, y, s, fontdict=None, **kwargs)
 */
public interface TextBuilder extends Builder2D, TextArgsBuilder<TextBuilder> {

    // The position to place the text. By default, this is in data coordinates. 
    TextBuilder add(Number x, Number y, String fmt);

}
