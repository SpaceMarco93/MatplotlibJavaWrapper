package com.github.sh0nk.matplotlib4j.axes.kwargs;

import com.github.sh0nk.matplotlib4j.axes.builder.Builder3D;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.LayoutType;
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
public interface FigureArgsBuilder<T extends Builder3D> extends KwargsBuilder {

    /**
     * Set the alpha value used for blending
     * 
     * @param arg       the alpha value used for blending   
     * @return  the instance of {@link T} builder for method chain
     */
    T alpha(double arg);

    /**
     * Set whether the artist uses clipping.
     * 
     * @param arg   boolean variable to set if the artist uses clipping
     * @return  the instance of {@link T} builder for method chain
     */
    T clipOn(boolean arg);

    /**
     * Set the edge color of the Figure rectangle.
     * 
     * @param arg   an instance of the {@link ColorType} enum providing the 
     *              rectangle edgecolor
     * @return  the instance of {@link T} builder for method chain
     */
    T edgeColor(ColorType arg);

    /**
     * Set the face color of the Figure rectangle.
     * 
     * @param arg   an instance of the {@link ColorType} enum providing the 
     *              rectangle facecolor
     * @return  the instance of {@link T} builder for method chain
     */
    T faceColor(ColorType arg);

    /**
     * Set the resolution of the figure in dots-per-inch.
     * 
     * @param arg   the figure resolution in dots-per-inch
     * @return  the instance of {@link T} builder for method chain
     */
    T dpi(double arg);

    /**
     * Set the height of the figure in inches.
     * 
     * @param arg   the figure height in inches
     * @return  the instance of {@link T} builder for method chain
     */
    T figHeight(double arg);

    /**
     * Set the width of the figure in inches.
     * 
     * @param arg   the figure width in inches
     * @return  the instance of {@link T} builder for method chain
     */
    T figWidth(double arg);

    /**
     * Set the figure's background patch visibility, i.e. whether the figure 
     * background will be drawn.
     * 
     * @param arg   boolean variable to set the background visibility
     * @return  the instance of {@link T} builder for method chain 
     */
    T frameOn(boolean arg);

    /**
     * Set if artist is to be included in layout calculations
     * 
     * @param arg   boolean variable to set if artist is included in layout calculations
     * @return  the instance of {@link T} builder for method chain 
     */
    T inLayout(boolean arg);

    /**
     * Set the label that will be displayed in the legend.
     * 
     * @param arg   the text label that will be displayed in the legend
     * @return  the instance of {@link T} builder for method chain 
     */
    T label(String arg);

    /**
     * Set the layout engine for this figure.
     * 
     * @param arg   an instance of the {@link LayoutType} enum providing the 
     *              layout engine
     * @return
     */
    T layoutEngine(LayoutType arg);

    /**
     * Set the line width of the Figure rectangle.
     * 
     * @param arg   the line width of the figure rectangle
     * @return  the instance of {@link T} builder for method chain
     */
    T lineWidth(Number arg);

    /**
     * Set the artist's visibility.
     * 
     * @param arg   boolean variable to set artist's visibility
     * @return  the instance of {@link T} builder for method chain 
     */
    T visible(boolean arg);

}
