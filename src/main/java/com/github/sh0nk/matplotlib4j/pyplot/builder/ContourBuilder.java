package com.github.sh0nk.matplotlib4j.pyplot.builder;

import java.util.List;

import com.github.sh0nk.matplotlib4j.enums.AlgorithmType;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.ExtendType;
import com.github.sh0nk.matplotlib4j.enums.LineStyleType;
import com.github.sh0nk.matplotlib4j.enums.OriginType;
import com.github.sh0nk.matplotlib4j.enums.ScaleType;

/**
 * This interface is defining all the *args associated to the "contour" method
 * defined in pyplot. 
 * 
 * matplotlib.pyplot.contour(*args, **kwargs)
 */
public interface ContourBuilder extends Builder2D {

    // TODO: support V and N

    /**
     * Add the height values to the contour plots.
     * <p>This is equivalent to {@code pyplot.contour(Z)} and it is used in case 
     * data have not been passed before to the {@link ContourBuilder} instance.</p>
     *
     * @param Z     the height values over which the contour is drawn
     * @return the instance of {@link ContourBuilder} for method chain
     */
    ContourBuilder add(List<? extends List<? extends Number>> Z);

    /**
     * Add the height values and the surface coordinates to the contour plots.
     * <p>This is equivalent to {@code pyplot.contour(X, Y, Z)} and it is used in 
     * case data have not been passed before to the {@link ContourBuilder} instance.</p>
     *
     * @param X     the x coordinate of the surface
     * @param Y     the y coordinate of the surface
     * @param Z     the height values over which the contour is drawn
     * @return the instance of {@link ContourBuilder} for method chain
     */
    ContourBuilder add(List<? extends Number> X, List<? extends Number> Y, List<? extends List<? extends Number>> Z);

    /**
     * Set the number and positions of the contour lines / regions.
     * <p>If an int n, use MaxNLocator, which tries to automatically choose no 
     * more than n+1 "nice" contour levels between minimum and maximum numeric 
     * values of Z. </p>
     * 
     * @param arg   the number of desired levels
     * @return  the instance of {@link ContourBuilder} for method chain
     */
    ContourBuilder levels(int arg);

    /**
     * Set the number and positions of the contour lines / regions.
     * <p>If array-like, draw contour lines at the specified levels. The values 
     * must be in increasing order.</p>
     * 
     * @param arg   the list of desired levels to be displayed
     * @return  the instance of {@link ContourBuilder} for method chain  
     */
    ContourBuilder levels(List<? extends Number> arg);

    /**
     * Set the colors of the contour lines.
     * <p> This method is used to set the colors for the contour lines/levels</p>
     * 
     * @param arg   an instance of the {@link ColorType} enum providing the color name
     * @return  the instance of {@link ContourBuilder} for method chain  
     */
    ContourBuilder colors(ColorType arg);

    /**
     * Set the transparency.
     * <p> This method is used to set the alpha blending value, between 0 
     * (transparent) and 1 (opaque). </p>
     * 
     * @param arg   the blending value 
     * @return  the instance of {@link ContourBuilder} for method chain  
     */
     ContourBuilder alpha(double arg);

    /**
     * Set the normalization method.
     * <p> This method is used to set the normalization method used to scale 
     * scalar data to the [0, 1] range before mapping to colors using cmap. </p>
     * 
     * @param arg   an instance of the {@link ScaleType} enum providing the type 
     *              of normalization type
     * @return  the instance of {@link ContourBuilder} for method chain   
     */
    ContourBuilder norm(ScaleType arg);

    /**
     * Set the minimum value for the data range that the colormap covers.
     * <p> This method is used to set define the minimum extreme of the data 
     * range that the colormap covers.</p>
     * 
     * @param arg   minimum value for the data range that the colormap covers
     * @return  the instance of {@link ContourBuilder} for method chain  
     */
    ContourBuilder vMin(double arg);

    /**
     * Set the maximum value for the data range that the colormap covers.
     * <p> This method is used to set define the maximum extreme of the data 
     * range that the colormap covers.</p>
     * 
     * @param arg   maximum value for the data range that the colormap covers
     * @return  the instance of {@link ContourBuilder} for method chain  
     */
    ContourBuilder vMax(double arg);

    /**
     * Set the origin.
     * <p> This method determines the orientation and exact position of Z by 
     * specifying the position of Z[0, 0]. This is only relevant, if X, Y are 
     * not given.</p>
     * 
     * @param arg   an instance of {@link OriginType} providing the origin position
     * @return  the instance of {@link ContourBuilder} for method chain  
     */
    ContourBuilder origin(OriginType arg);

    /**
     * Set if the levels outside the boundaries are colored or not.
     * <p>Determines the contourf-coloring of values that are outside the levels 
     * range. If 'neither', values outside the levels range are not colored. 
     * If 'min', 'max' or 'both', color the values below, above or below and above 
     * the levels range. </p>
     * <p>Values below min(levels) and above max(levels) are mapped to the 
     * under/over values of the Colormap. Note that most colormaps do not have 
     * dedicated colors for these by default, so that the over and under values 
     * are the edge values of the colormap. </p>
     * 
     * @param arg   an instance of {@link ExtendType} providing the extend philosophy   
     * @return  the instance of {@link ContourBuilder} for method chain 
     */
    ContourBuilder extend(ExtendType arg);

    /**
     * Set the contour lines width.
     * <p>This method is used to set the line width of the contour lines. If a 
     * number, all levels will be plotted with this linewidth.</p>
     * @param arg   the value of all the contour lines width
     * @return  the instance of {@link ContourBuilder} for method chain 
     */
    ContourBuilder lineWidths(double arg);

    /**
     * Set the contour lines style.
     * <p>If linestyles is None, the default is 'solid' unless the lines are 
     * monochrome. In that case, negative contours will instead take their 
     * linestyle from the negative_linestyles argument. </p>
     * 
     * @param arg   an instance of {@link LineStyleType} providing the linestyle     
     * @return  the instance of {@link ContourBuilder} for method chain    
     */ 
    ContourBuilder lineStyles(LineStyleType arg);

    /**
     * Set the contour lines style for negative values.
     * <p>If linestyles is None and the lines are monochrome, this argument specifies 
     * the line style for negative contours.</p>
     * <p>If negative_linestyles is None, the default is taken 'dashed'. </p>
     * 
     * @param arg   an instance of {@link LineStyleType} providing the linestyle
     * @return  the instance of {@link ContourBuilder} for method chain 
     */
    ContourBuilder negativeLineStyles(LineStyleType arg);

    /**
     * Set the algorithm to compute the polygons.
     * <p>Which contouring algorithm to use to calculate the contour lines and 
     * polygons. The algorithms are implemented in ContourPy, consult the 
     * ContourPy documentation for further information. </p>
     * 
     * @param arg   an instance of {@link AlgorithmType} providing the algorithm
     * @return  the instance of {@link ContourBuilder} for method chain 
     */
    ContourBuilder algorithm(AlgorithmType arg);

}
