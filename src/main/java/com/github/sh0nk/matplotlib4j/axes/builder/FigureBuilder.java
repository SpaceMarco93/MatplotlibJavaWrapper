package com.github.sh0nk.matplotlib4j.axes.builder;

import com.github.sh0nk.matplotlib4j.axes.kwargs.FigureArgsBuilder;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.LayoutType;

/**
 * This interface is defining all the *args associated to the "figure" method
 * defined in pyplot. 
 * 
 * matplotlib.pyplot.figure(*args, **kwargs)
 */
public interface FigureBuilder extends Builder3D, FigureArgsBuilder<FigureBuilder> {

    // Set the title of the figure. It wraps the argument "num".
    FigureBuilder figureTitle(String arg);

    // Set the width, height in inches.
    FigureBuilder figSize(double width, double height);

    // Set the resolution of the figure in dots-per-inch.
    FigureBuilder dpi(double arg);

    // Set the background color.
    FigureBuilder faceColor(ColorType arg);

    // Set the border color.
    FigureBuilder edgeColor(ColorType arg);

    // If False, suppress drawing the figure frame.
    FigureBuilder frameOn(boolean arg);

    // If True and the figure already exists, then it is cleared.
    FigureBuilder clear(boolean arg);

    /**
     * The layout mechanism for positioning of plot elements to avoid overlapping 
     * Axes decorations (labels, ticks, etc).
     */
    FigureBuilder layout(LayoutType arg);

}
