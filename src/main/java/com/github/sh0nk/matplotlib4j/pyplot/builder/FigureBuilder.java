package com.github.sh0nk.matplotlib4j.pyplot.builder;

import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.LayoutType;
import com.github.sh0nk.matplotlib4j.pyplot.kwargs.FigureArgsBuilder;

/**
 * This interface is defining all the *args associated to the "figure" method
 * defined in pyplot. 
 * 
 * matplotlib.pyplot.figure(*args, **kwargs)
 */
public interface FigureBuilder extends Builder2D, FigureArgsBuilder<FigureBuilder> {

    /**
     * Set the figure title.
     * <p> This method is used to et the title of the figure. It wraps the 
     * argument "num". </p>
     * 
     * @param arg   the title of the window
     * @return  the instance of {@link FigureBuilder} for method chain 
     */
    FigureBuilder figureTitle(String arg);

    /**
     * Set the figure size.
     * <p>This method is used to set the width and height in inches. </p>
     * 
     * @param width     the figure width in inches
     * @param height    the figure height in inches
     * @return  the instance of {@link FigureBuilder} for method chain 
     */
    FigureBuilder figSize(double width, double height);

    /**
     * Set the figure resolution.
     * <p>This method is used to set the resolution of the figure in dots-per-inch.</p>
     * 
     * @param arg       the figure resolution in dots-per-inch
     * @return  the instance of {@link FigureBuilder} for method chain 
     */
    FigureBuilder dpi(double arg);

    /**
     * Set the figure background color.
     * <p>This method is used to set the background color of the window.</p>
     * 
     * @param arg   an instance of the {@link ColorType} enum providing the color name
     * @return  the instance of {@link FigureBuilder} for method chain   
     */
    FigureBuilder faceColor(ColorType arg);

    /**
     * Set the figure border color.
     * <p>This method is used to set the border color of the window.</p>
     * 
     * @param arg   an instance of the {@link ColorType} enum providing the color name
     * @return  the instance of {@link FigureBuilder} for method chain   
     */
    FigureBuilder edgeColor(ColorType arg);

    /**
     * Set if the figure frame is visible or not.
     * <p>This method is used to set the visibility of the frame window. If False, 
     * suppress drawing the figure frame.</p>
     * 
     * @param arg   boolean variable to select if the figure frame is visible or not
     * @return  the instance of {@link FigureBuilder} for method chain   
     */
    FigureBuilder frameOn(boolean arg);

    /**
     * Clear the existing window.
     * <p>This method is used to set the figure drawing. If False, suppress 
     * drawing the figure frame.</p>
     * 
     * @param arg   boolean variable to select if suppress drawing the figure frame
     * @return  the instance of {@link FigureBuilder} for method chain 
     */
    FigureBuilder clear(boolean arg);

    /**
     * Set the layout mechanism.
     * <p>This method is used to set the layout mechanism for positioning of plot 
     * elements to avoid overlapping Axes decorations (labels, ticks, etc). 
     * Note that layout managers can measurably slow down figure display.</p>
     * 
     * @param arg   an instance of the {@link LayoutType} enum providing the layout name
     * @return  the instance of {@link FigureBuilder} for method chain   
     */
    FigureBuilder layout(LayoutType arg);

}
