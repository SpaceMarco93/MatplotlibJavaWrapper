package com.github.sh0nk.matplotlib4j.pyplot.builder;

import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.FontSizeType;
import com.github.sh0nk.matplotlib4j.enums.HorizontalAlignmentType;
import com.github.sh0nk.matplotlib4j.enums.LocationType;

/**
 * This interface is defining all the *args associated to the "legend" method
 * defined in pyplot. 
 * 
 * matplotlib.pyplot.legend(*args, **kwargs)
 */
public interface LegendBuilder extends Builder2D {

    /**
     * Set the legend location.
     * 
     * @param arg   an instance of the {@link LocationType} enum providing the 
     *              location
     * @return  the instance of {@link LegendBuilder} for method chain
     */
    LegendBuilder loc(LocationType arg);

    /**
     * Set the number of columns that the legend has.
     * 
     * @param arg   the number of columns
     * @return  the instance of {@link LegendBuilder} for method chain  
     */
    LegendBuilder nCols(int arg);

    /**
     * Set the legend font size.
     * <p> String values are relative to the current default font size.</p>
     * 
     * @param arg   an instance of the {@link FontSizeType} enum providing the 
     *              font size.   
     * @return  the instance of {@link LegendBuilder} for method chain
     */
    LegendBuilder fontSize(FontSizeType arg);

    /**
     * Set the color of the text in the legend.
     * 
     * @param arg   an instance of the {@link ColorType} enum providing the legend 
     *              color
     * @return  the instance of {@link LegendBuilder} for method chain
     */
    LegendBuilder labelColor(ColorType arg);

    /**
     * Set the number of marker points.
     * <p> The number of marker points in the legend when creating a legend 
     * entry for a Line2D (line). </p>
     * 
     * @param arg   the number of marker points
     * @return  the instance of {@link LegendBuilder} for method chain
     */
    LegendBuilder numPoints(int arg);

    /**
     * Set the legend transparency.
     * <p> The alpha transparency of the legend's background.</p>
     * 
     * @param arg   the alpha transparency (value between 0 and 1)
     * @return  the instance of {@link LegendBuilder} for method chain
     */
    LegendBuilder frameAlpha(double arg);

    /**
     * Set the legend's background color.
     * 
     * @param arg   an instance of the {@link ColorType} enum providing the legend 
     *              color
     * @return  the instance of {@link LegendBuilder} for method chain
     */
    LegendBuilder faceColor(ColorType arg);

    /**
     * Set The legend's background patch edge color.
     * 
     * @param arg   an instance of the {@link ColorType} enum providing the legend 
     *              color
     * @return  the instance of {@link LegendBuilder} for method chain
     */
    LegendBuilder edgeColor(ColorType arg);

    /**
     * Set the alignment for the legend title.
     * <p>The alignment of the legend title and the box of entries. The entries 
     * are aligned as a single block, so that markers always lined up.</p>
     * 
     * @param arg   an instance of the {@link HorizontalAlignmentType} enum 
     *              providing the horizontal alignment
     * @return  the instance of {@link LegendBuilder} for method chain
     */
    LegendBuilder alignment(HorizontalAlignmentType arg);

    /**
     * Set the vertical space between the legend entries, in font-size units.
     * 
     * @param arg   the vertical space between the legend entries
     * @return  the instance of {@link LegendBuilder} for method chain
     */
    LegendBuilder labelSpacing(double arg);

    /**
     * Set the spacing between columns, in font-size units.
     * 
     * @param arg   the spacing between columns, in font-size units.
     * @return  the instance of {@link LegendBuilder} for method chain
     */
    LegendBuilder columnSpacing(double arg);

    /**
     * Set whether the legend can be dragged with the mouse.
     * 
     * @param arg   boolean flag to set if the legend can be dragged or not
     * @return  the instance of {@link LegendBuilder} for method chain
     */
    LegendBuilder draggable(boolean arg);

}
