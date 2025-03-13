package com.github.sh0nk.matplotlib4j.axes.builder;

import com.github.sh0nk.matplotlib4j.axes.kwargs.TextArgsBuilder;

/**
 * This interface is defining all the *args associated to the "text" method
 * defined in Axes. 
 * 
 * matplotlib.axes.Axes.text(x, y, s, fontdict=None, **kwargs)
 */
public interface TextBuilder extends Builder3D, TextArgsBuilder<TextBuilder> {

    // The position to place the text. By default, this is in data coordinates. 
    TextBuilder add(Number x, Number y, Number z, String fmt);

}
