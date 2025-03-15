package com.github.sh0nk.matplotlib4j.pyplot.kwargs;

import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.LineStyleType;
import com.github.sh0nk.matplotlib4j.pyplot.builder.Builder2D;
import com.github.sh0nk.matplotlib4j.pyplot.builder.HistBuilder;

/**
 * This interface is defining all the **kwargs associated to the "patch" method
 * defined in patches. This interface is supporting the interface {@link HistBuilder}
 * where the main arguments *args are defined.
 * 
 * matplotlib.patches.Patch(*args, **kwargs)
 * matplotlib.pyplot.hist(*args, **kwargs)
 *
 */
public interface PatchBuilder<T extends Builder2D> extends KwargsBuilder {

    /**
     * Set the alpha value used for blending
     * 
     * @param arg       the alpha value used for blending   
     * @return  the instance of {@link T} builder for method chain
     */
    T alpha(double arg);

    /**
     * Set both the patch edgecolor and the facecolor.
     * 
     * @param arg   an instance of the {@link ColorType} enum providing the 
     *              color to be used for edgecolor and facecolor
     * @return  the instance of {@link T} builder for method chain
     */    
    T color(ColorType arg);

    /**
     * Set both the patch edge color.
     * 
     * @param arg   an instance of the {@link ColorType} enum providing the 
     *              color to be used for edge color
     * @return  the instance of {@link T} builder for method chain
     */    
    T edgeColor(ColorType arg);

    /**
     * Set both the patch face color.
     * 
     * @param arg   an instance of the {@link ColorType} enum providing the 
     *              color to be used for face color
     * @return  the instance of {@link T} builder for method chain
     */    
    T faceColor(ColorType arg);

    /**
     * Set the patch linestyle
     * 
     * @param arg   a string defining the patch linestyle
     * @return  the instance of {@link T} builder for method chain
     */
    T lineStyle(String arg);

    /**
     * Set the patch linestyle.
     * 
     * @param arg   an instance of the {@link LineStyleType} enum providing the 
     *              patch linestyle
     * @return  the instance of {@link T} builder for method chain
     */
    T lineStyle(LineStyleType arg);

    /**
     * Set the patch line width in points.
     * 
     * @param arg   the line width in points
     * @return  the instance of {@link T} builder for method chain
     */
    T lineWidth(double arg);

    /**
     * Set a label that will be displayed in the legend.
     * 
     * @param arg   the text that will be displayed in the legend
     * @return  the instance of {@link T} builder for method chain
     */
    T label(String arg);

}
