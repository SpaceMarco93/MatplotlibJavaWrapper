package com.github.sh0nk.matplotlib4j.axes.builder;

import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.FontSizeType;
import com.github.sh0nk.matplotlib4j.enums.HorizontalAlignmentType;
import com.github.sh0nk.matplotlib4j.enums.LocationType;

/**
 * This interface is defining all the *args associated to the "legend" method
 * defined in Axes. 
 * 
 * matplotlib.axes.Axes.legend(*args, **kwargs)
 */
public interface LegendBuilder extends Builder3D {

    // The location of the legend.
    LegendBuilder loc(LocationType arg);

    // The number of columns that the legend has.
    LegendBuilder nCols(int arg);

    // The font size of the legend.
    LegendBuilder fontSize(FontSizeType arg);

    // The color of the text in the legend.
    LegendBuilder labelColor(ColorType arg);

    // The number of marker points in the legend
    LegendBuilder numPoints(int arg);

    // The alpha transparency of the legend's background.
    LegendBuilder frameAlpha(double arg);

    // The legend's background color
    LegendBuilder faceColor(ColorType arg);

    // The legend's background patch edge color.
    LegendBuilder edgeColor(ColorType arg);

    // The alignment of the legend title and the box of entries.
    LegendBuilder alignment(HorizontalAlignmentType arg);

    // The vertical space between the legend entries
    LegendBuilder labelSpacing(double arg);

    // The spacing between columns
    LegendBuilder columnSpacing(double arg);

    // Whether the legend can be dragged with the mouse
    LegendBuilder draggable(boolean arg);

}
