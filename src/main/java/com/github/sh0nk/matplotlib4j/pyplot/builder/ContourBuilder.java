package com.github.sh0nk.matplotlib4j.pyplot.builder;

import java.util.List;

import com.github.sh0nk.matplotlib4j.enums.AlgorithmType;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.ExtendType;
import com.github.sh0nk.matplotlib4j.enums.LineStyleType;
import com.github.sh0nk.matplotlib4j.enums.OriginType;
import com.github.sh0nk.matplotlib4j.enums.ScaleType;

public interface ContourBuilder extends Builder {

    /**
     * Equivalent to {@code pyplot.contour(Z)}
     *
     * @param Z array Z
     * @return ContourBuilder for method chain
     */
    ContourBuilder add(List<? extends List<? extends Number>> Z);

    /**
     * Equivalent to {@code pyplot.contour(X, Y, Z)}
     *
     * @param X the x coordinate of the surface
     * @param Y the y coordinate of the surface
     * @param Z array Z
     * @return ContourBuilder for method chain
     */
    ContourBuilder add(List<? extends Number> X, List<? extends Number> Y, List<? extends List<? extends Number>> Z);

    // TODO: support V and N

    /**
     * Determines the number and positions of the contour lines / regions.
     * If an int n, use MaxNLocator, which tries to automatically choose no more 
     * than n+1 "nice" contour levels between minimum and maximum numeric values 
     * of Z.
     */
    ContourBuilder levels(int arg);

    /**
     * Determines the number and positions of the contour lines / regions.
     * If array-like, draw contour lines at the specified levels. The values 
     * must be in increasing order.
     */
    ContourBuilder levels(List<? extends Number> arg);

    // The colors of the levels, i.e. the lines
    ContourBuilder colors(ColorType arg);

    // The alpha blending value, between 0 (transparent) and 1 (opaque).
    ContourBuilder alpha(double arg);

    /**
     * The normalization method used to scale scalar data to the [0, 1] range 
     * before mapping to colors using cmap.
     */
    ContourBuilder norm(ScaleType arg);

    /**
     * When using scalar data and no explicit norm, vmin and vmax define the 
     * data range that the colormap covers.
     */
    ContourBuilder vMin(double arg);

    /**
     * When using scalar data and no explicit norm, vmin and vmax define the 
     * data range that the colormap covers.
     */
    ContourBuilder vMax(double arg);

    // Determines the orientation and exact position of Z by specifying the position
    ContourBuilder origin(OriginType arg);

    // Determines the contourf-coloring of values that are outside the levels range.
    ContourBuilder extend(ExtendType arg);

    // The line width of the contour lines.
    ContourBuilder lineWidths(double arg);

    // If linestyles is None, the default is 'solid' unless the lines are monochrome. 
    ContourBuilder lineStyles(LineStyleType arg);

    // If linestyles is None and the lines are monochrome.
    ContourBuilder negativeLineStyles(LineStyleType arg);

    // Which contouring algorithm to use to calculate the contour lines and polygons.
    ContourBuilder algorithm(AlgorithmType arg);

}
