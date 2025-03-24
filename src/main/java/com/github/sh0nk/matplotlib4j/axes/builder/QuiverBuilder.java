package com.github.sh0nk.matplotlib4j.axes.builder;

import java.util.List;

import com.github.sh0nk.matplotlib4j.axes.kwargs.QuiverArgsBuilder;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.PivotType;

/**
 * This interface is defining all the *args associated to the "loglog" method
 * defined in pyplot. 
 * 
 * matplotlib.pyplot.quiver(*args, data=None, **kwargs)
 */
public interface QuiverBuilder extends Builder3D, QuiverArgsBuilder<QuiverBuilder> {

    /**
     * Add the x-coordinates, y-coordinates and z-coordinates of the arrows to be displayed.
     * <p> This method is used to add the arrow coordinates to the {@link QuiverBuilder}
     * instance. The three lists should have the same size. </p>
     * 
     * @param u     the list of x-components of the arrow vectors
     * @param v     the list of y-components of the arrow vectors
     * @param w     the list of z-components of the arrow vectors
     * @return  the instance of {@link QuiverBuilder} for method chain
     */
    QuiverBuilder add(List<Number> u, List<Number> v, List<Number> w);

    /**
     * Add both arrow coordinates and points coordinates where arrows are placed.
     * <p> This method is used to add the arrow coordinates to the {@link QuiverBuilder}
     * instance. The three lists should have the same size. </p>
     * <p> Moreover, the user must provide also the coordinates of the points where
     * the arrows are placed. It is obvious that the size should be all the same.</p>
     * 
     * @param x     the list of x-coordinates of the points where arrows are placed
     * @param y     the list of y-coordinates of the points where arrows are placed
     * @param z     the list of z-coordinates of the points where arrows are placed
     * @param u     the list of x-components of the arrow vectors
     * @param v     the list of y-components of the arrow vectors
     * @param w     the list of z-components of the arrow vectors
     * @return  the instance of {@link QuiverBuilder} for method chain
     */
    QuiverBuilder add(List<Number> x, List<Number> y, List<Number> z, List<Number> u, List<Number> v, List<Number> w);

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
     * @param z     the list of z-coordinates of the points where arrows are placed
     * @param u     the list of x-components of the arrow vectors
     * @param v     the list of y-components of the arrow vectors
     * @param w     the list of z-components of the arrow vectors
     * @param c     the list that defines the arrow colors by colormapping via norm 
     *              and cmap
     * @return  the instance of {@link QuiverBuilder} for method chain
     */
    QuiverBuilder add(List<Number> x, List<Number> y, List<Number> z, List<Number> u, List<Number> v, List<Number> w, List<Number> c);

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
     * Set how the arrow tip is big compared to its length.
     * <p> This method is used to decrease the tip of the arrow it the scaling
     * makes it too big.</p>
     * 
     * @param arg   arrow tip ratio with respect to the length
     * @return  the instance of {@link QuiverBuilder} for method chain
     */
    QuiverBuilder arrowLengthRatio(double arg);

    /**
     * Set the total arrow length.
     * 
     * @param arg   arrow length
     * @return  the instance of {@link QuiverBuilder} for method chain
     */
    QuiverBuilder length(double arg);

    /**
     * Provide normalization.
     * 
     * @param arg   boolean variable to check if normalization is required
     * @return  the instance of {@link QuiverBuilder} for method chain
     */
    QuiverBuilder normalize(boolean arg);

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
