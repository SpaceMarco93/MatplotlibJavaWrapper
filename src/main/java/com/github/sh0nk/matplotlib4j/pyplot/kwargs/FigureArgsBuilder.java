package com.github.sh0nk.matplotlib4j.pyplot.kwargs;

import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.LayoutType;
import com.github.sh0nk.matplotlib4j.pyplot.builder.Builder2D;
import com.github.sh0nk.matplotlib4j.pyplot.builder.FigureBuilder;

/**
 * This interface is defining all the **kwargs associated to the "figure" method
 * defined in Figure. This interface is supporting the interface {@link FigureBuilder}
 * where the main arguments *args are defined.
 * 
 * matplotlib.figure.Figure(figsize=None, dpi=None, *, facecolor=None, 
 * edgecolor=None, linewidth=0.0, frameon=None, subplotpars=None, tight_layout=None, 
 * constrained_layout=None, layout=None, **kwargs)
 *
 */
public interface FigureArgsBuilder<T extends Builder2D> extends KwargsBuilder {

    // Set the alpha value used for blending
    T alpha(double arg);

    // Set whether the artist uses clipping.
    T clipOn(boolean arg);

    // Set the edge color of the Figure rectangle.
    T edgeColor(ColorType arg);

    // Set the face color of the Figure rectangle.
    T faceColor(ColorType arg);

    // Set the resolution of the figure in dots-per-inch.
    T dpi(double arg);

    // Set the height of the figure in inches.
    T figHeight(double arg);

    // Set the width of the figure in inches.
    T figWidth(double arg);

    /**
     * Set the figure's background patch visibility, i.e. whether the figure 
     * background will be drawn.
     */
    T frameOn(boolean arg);

    // Set if artist is to be included in layout calculations
    T inLayout(boolean arg);

    // Set a label that will be displayed in the legend.
    T label(String arg);

    // Set the layout engine for this figure.
    T layoutEngine(LayoutType arg);

    // Set the line width of the Figure rectangle.
    T lineWidth(Number arg);

    // Set the artist's visibility.
    T visible(boolean arg);

}
