package com.github.sh0nk.matplotlib4j.pyplot.kwargs;

import com.github.sh0nk.matplotlib4j.enums.CapStyleType;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.HatchType;
import com.github.sh0nk.matplotlib4j.enums.JoinStyleType;
import com.github.sh0nk.matplotlib4j.enums.LineStyleType;
import com.github.sh0nk.matplotlib4j.enums.ParametrizedLineStyleType;
import com.github.sh0nk.matplotlib4j.pyplot.builder.Builder2D;
import com.github.sh0nk.matplotlib4j.pyplot.builder.QuiverBuilder;

/**
 * This interface is defining all the **kwargs associated to the "quiver" method
 * defined in patches. This interface is supporting the interface {@link QuiverBuilder}
 * where the main arguments *args are defined.
 * 
 * matplotlib.patches.quiver(*args, **kwargs)
 *
 */
public interface QuiverArgsBuilder<T extends Builder2D> extends KwargsBuilder {
    
    /**
     * Set the alpha value used for blending
     * 
     * @param alpha       the alpha value used for blending   
     * @return  the instance of {@link T} builder for method chain
     */
    T alpha(double alpha);

    /**
     * Set the CapStyle for the collection (for all its elements).
     * 
     * @param capStyleType      an instance of the {@link CapStyleType} enum 
     *                          providing the capstyle to be used for all arrows
     * @return  the instance of {@link T} builder for method chain
     */
    T capStyle(CapStyleType capStyleType);

    /**
     * Set the norm limits for image scaling.
     * 
     * @param vMin      the inferior limit of the image scaling
     * @param vMax      the upper limit of the image scaling
     * @return  the instance of {@link T} builder for method chain
     */
    T cLim(double vMin, double vMax);
    
    /**
     * Set whether the artist uses clipping.
     * 
     * @param arg   boolean variable to set if the artist uses clipping
     * @return  the instance of {@link T} builder for method chain
     */
    T clipOn(boolean arg);

    /**
     * Set the color of all the arrows
     * 
     * @param color     an instance of the {@link ColorType} enum providing the 
     *                  color 
     * @return  the instance of {@link T} builder for method chain
     */
    T color(ColorType color);
    
    /**
     * Set the arrow edge color.
     * 
     * @param color     an instance of the {@link ColorType} enum providing the 
     *                  color to be used for edge color
     * @return  the instance of {@link T} builder for method chain
     */    
    T edgeColor(ColorType color);

    /**
     * Set the arrow face color.
     * 
     * @param color     an instance of the {@link ColorType} enum providing the 
     *                  color to be used for face color
     * @return  the instance of {@link T} builder for method chain
     */    
    T faceColor(ColorType color);

    /**
     * Set the hatching pattern
     * 
     * @param hatchType     an instance of the {@link HatchType} enum providing the 
     *                      hatching pattern
     * @return  the instance of {@link T} builder for method chain
     */
    T hatch(HatchType hatchType);

    /**
     * Set the hatch linewidth.
     * 
     * @param arg   the hatch linewidth
     * @return  the instance of {@link T} builder for method chain
     */
    T hatchLineWidth(double arg);

    /**
     * Set the JoinStyle for the collection (for all its elements).
     * 
     * @param joinStyleType     an instance of the {@link JoinStyleType} enum 
     *                          providing the joinstyle for the collection
     * @return  the instance of {@link T} builder for method chain
     */
    T joinStyle(JoinStyleType joinStyleType);

    /**
     * Set a label that will be displayed in the legend.
     * 
     * @param arg   the text that will be displayed in the legend
     * @return  the instance of {@link T} builder for method chain
     */
    T label(String arg);

    /**
     * Set the linestyle of the arrow.
     * 
     * @param arg   a string defining the arrow linestyle
     * @return  the instance of {@link T} builder for method chain
     */
    T lineStyle(LineStyleType arg);

    /**
     * Set the linestyle of the arrow.
     * 
     * @param arg   a string defining the arrow linestyle
     * @return  the instance of {@link T} builder for method chain
     */
    T lineStyle(ParametrizedLineStyleType arg);

    /**
     * Set the arrow line width in points.
     * 
     * @param arg   the arrow line width in points
     * @return  the instance of {@link T} builder for method chain
     */
    T lineWidth(double arg);

}
