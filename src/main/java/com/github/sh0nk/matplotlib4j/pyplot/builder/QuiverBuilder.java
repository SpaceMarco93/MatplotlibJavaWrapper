package com.github.sh0nk.matplotlib4j.pyplot.builder;

import java.util.List;

import com.github.sh0nk.matplotlib4j.enums.AnglesType;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.PivotType;
import com.github.sh0nk.matplotlib4j.enums.ScaleUnitsType;
import com.github.sh0nk.matplotlib4j.pyplot.kwargs.QuiverArgsBuilder;

/**
 * This interface is defining all the *args associated to the "loglog" method
 * defined in pyplot. 
 * 
 * matplotlib.pyplot.quiver(*args, data=None, **kwargs)
 */
public interface QuiverBuilder extends Builder2D, QuiverArgsBuilder<QuiverBuilder> {

    /**
     * Add the x-coordinates and y-coordinates of the arrows to be displayed.
     * <p> This method is used to add the arrow coordinates to the {@link QuiverBuilder}
     * instance. The two lists should have the same size. </p>
     * <p> Using this method the locations where the arrows are places will be 
     * generated as a uniform integer meshgrid based on the dimensions of U and V.
     * If X and Y are 1D but U, V are 2D, X, Y are expanded to 2D using 
     * X, Y = np.meshgrid(X, Y). In this case len(X) and len(Y) must match the 
     * column and row dimensions of U and V.</p>
     * 
     * @param u     the list of x-components of the arrow vectors
     * @param v     the list of y-components of the arrow vectors
     * @return  the instance of {@link QuiverBuilder} for method chain
     */
    QuiverBuilder add(List<Number> u, List<Number> v);

    /**
     * Add both arrow coordinates and points coordinates where arrows are placed.
     * <p> This method is used to add the arrow coordinates to the {@link QuiverBuilder}
     * instance. The two lists should have the same size. </p>
     * <p> Moreover, the user must provide also the coordinates of the points where
     * the arrows are placed. It is obvious that the size should be all the same.</p>
     * 
     * @param x     the list of x-coordinates of the points where arrows are placed
     * @param y     the list of y-coordinates of the points where arrows are placed
     * @param u     the list of x-components of the arrow vectors
     * @param v     the list of y-components of the arrow vectors
     * @return  the instance of {@link QuiverBuilder} for method chain
     */
    QuiverBuilder add(List<Number> x, List<Number> y, List<Number> u, List<Number> v);

    /**
     * Add arrow coordinates, points coordinates where arrows are placed and colors.
     * <p> This method is used to add the arrow coordinates to the {@link QuiverBuilder}
     * instance. The two lists should have the same size. </p>
     * <p> Moreover, the user must provide also the coordinates of the points where
     * the arrows are placed.</p>
     * <p> The user can set also the arrows colors via colormaspping. If the user
     * want to set colors directly, use color instead. The size of C must match 
     * the number of arrow locations.
     * 
     * @param x     the list of x-coordinates of the points where arrows are placed
     * @param y     the list of y-coordinates of the points where arrows are placed
     * @param u     the list of x-components of the arrow vectors
     * @param v     the list of y-components of the arrow vectors
     * @param c     the list that defines the arrow colors by colormapping via norm 
     *              and cmap
     * @return  the instance of {@link QuiverBuilder} for method chain
     */
    QuiverBuilder add(List<Number> x, List<Number> y, List<Number> u, List<Number> v, List<Number> c);
    
    /**
     * Method for determining the angle of the arrows.
     * <p>'uv': Arrow directions are based on display coordinates; i.e. a 45° 
     * angle will always show up as diagonal on the screen, irrespective of figure 
     * or Axes aspect ratio or Axes data ranges. This is useful when the arrows 
     * represent a quantity whose direction is not tied to the x and y data 
     * coordinates.</p>
     * <p>If U == V the orientation of the arrow on the plot is 45 degrees 
     * counter-clockwise from the horizontal axis (positive to the right).</p>
     * <p>'xy': Arrow direction in data coordinates, i.e. the arrows point from 
     * (x, y) to (x+u, y+v). This is ideal for vector fields or gradient plots 
     * where the arrows should directly represent movements or gradients in the 
     * x and y directions.</p>
     * 
     * @param anglesType    an instance of the {@link AnglesType} enum defining the 
     *                      arrow angles
     * @return  the instance of {@link QuiverBuilder} for method chain
     */
    QuiverBuilder angles(AnglesType anglesType);

    /**
     * Set the part of the arrow that is anchored to the X, Y grid. 
     * <p> This method is used to set the part of the arrow that is anchored to
     * each point. The arrow rotates about this point.</p>
     * <p>'mid' is a synonym for 'middle'.</p>
     * 
     * @param pivotType     an instance of the {@link PivotType} enum defining the 
     *                      part of the arrow that is anchored
     * @return  the instance of {@link QuiverBuilder} for method chain
     */
    QuiverBuilder pivot(PivotType pivotType);

    /**
     * Scales the length of the arrow inversely.
     * <p>Number of data values represented by one unit of arrow length on the plot. 
     * For example, if the data represents velocity in meters per second (m/s), 
     * the scale parameter determines how many meters per second correspond to 
     * one unit of arrow length relative to the width of the plot. Smaller scale 
     * parameter makes the arrow longer.</p>
     * <p>By default, an autoscaling algorithm is used to scale the arrow length 
     * to a reasonable size, which is based on the average vector length and the 
     * number of vectors. The arrow length unit is given by the scale_units parameter.</p>
     * 
     * @param scale     the scale of the arrow in an inverse way
     * @return  the instance of {@link QuiverBuilder} for method chain
     */
    QuiverBuilder scale(double scale);

    /**
     * Set the arrow scale unit
     * <p>The physical image unit, which is used for rendering the scaled arrow 
     * data U, V.</p>
     * <p>'width' or 'height': The arrow length is scaled relative to the width 
     * or height of the Axes. For example, scale_units='width', scale=1.0, will 
     * result in an arrow length of width of the Axes.</p>
     * <p>'dots': The arrow length of the arrows is in measured in display dots 
     * (pixels).</p>
     * <p>'inches': Arrow lengths are scaled based on the DPI (dots per inch) of 
     * the figure. This ensures that the arrows have a consistent physical size 
     * on the figure, in inches, regardless of data values or plot scaling. 
     * For example, (u, v) = (1, 0) with scale_units='inches', scale=2 results 
     * in a 0.5 inch-long arrow.</p>
     * <p>'x' or 'y': The arrow length is scaled relative to the x or y axis units.
     * For example, (u, v) = (0, 1) with scale_units='x', scale=1 results in a 
     * vertical arrow with the length of 1 x-axis unit.</p>
     * <p>'xy': Arrow length will be same as 'x' or 'y' units. This is useful for 
     * creating vectors in the x-y plane where u and v have the same units as x and y.
     * 
     * @param scaleUnitsType    an instance of the {@link ScaleUnitsType} enum 
     *                          defining the arrow scale unit
     * @return  the instance of {@link QuiverBuilder} for method chain
     */
    QuiverBuilder scaleUnits(ScaleUnitsType scaleUnitsType);

    /**
     * Set the arrows size.
     * <p>Affects the arrow size (except for the length). In particular, the 
     * shaft width is measured in multiples of this unit. Supported values are:</p>
     * <p>'width', 'height': The width or height of the Axes.</p>
     * <p>'dots', 'inches': Pixels or inches based on the figure dpi.</p>
     * <p>'x', 'y', 'xy': X, Y or in data units.<p>
     * 
     * @param unitsType         an instance of the {@link ScaleUnitsType} enum 
     *                          defining the arrow size
     * @return  the instance of {@link QuiverBuilder} for method chain
     */
    QuiverBuilder units(ScaleUnitsType unitsType);

    /**
     * Set shaft width in arrow units.
     * 
     * @param width     shaft width in arrow units
     * @return  the instance of {@link QuiverBuilder} for method chain
     */
    QuiverBuilder width(double width);

    /**
     * Set the head width as multiple of shaft width. 
     * 
     * @param headwidth     head width as multiple of shaft width. 
     * @return  the instance of {@link QuiverBuilder} for method chain
     */
    QuiverBuilder headWidth(double headWidth);

    /**
     * Set the head length as multiple of shaft width
     * 
     * @param headLenght    head length as multiple of shaft width
     * @return  the instance of {@link QuiverBuilder} for method chain
     */
    QuiverBuilder headLength(double headLength);

    /**
     * Set the head length at shaft intersection as multiple of shaft width
     * 
     * @param headAxisLength    head length at shaft intersection as multiple of 
     *                          shaft width
     * @return  the instance of {@link QuiverBuilder} for method chain
     */
    QuiverBuilder headAxisLength(double headAxisLength);

    /**
     * Set the length below which arrow scales, in units of head length. 
     * <p> Do not set this to less than 1, or small arrows will look terrible!</p>
     * 
     * @param minShaft  the length below which arrow scales, in units of head length
     * @return  the instance of {@link QuiverBuilder} for method chain
     */
    QuiverBuilder minShaft(double minShaft);

    /**
     * Set the minimum length as a multiple of shaft width.
     * <p>If an arrow length is less than this, plot a dot (hexagon) of this diameter 
     * instead.</p>
     * 
     * @param minLength     the minimum length as a multiple of shaft width
     * @return  the instance of {@link QuiverBuilder} for method chain
     */
    QuiverBuilder minLength(double minLength);

    /**
     * Set the explicit color for the arrows.
     * <p>If C has been set, color has no effect. This is a synonym for the 
     * PolyCollection facecolor parameter.</p>
     * 
     * @param colorType         an instance of the {@link ColorType} enum 
     *                          defining the same color for all the arrows
     * @return  the instance of {@link QuiverBuilder} for method chain
     */
    QuiverBuilder color(ColorType colorType);

}
