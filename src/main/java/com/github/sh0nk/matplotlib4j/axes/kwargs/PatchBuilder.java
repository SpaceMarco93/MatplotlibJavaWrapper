package com.github.sh0nk.matplotlib4j.axes.kwargs;

import com.github.sh0nk.matplotlib4j.axes.builder.Builder3D;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.LineStyleType;
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
public interface PatchBuilder<T extends Builder3D> extends KwargsBuilder {

    // Set the alpha value used for blending
    T alpha(double arg);

    // Set both the edgecolor and the facecolor.    
    T color(ColorType arg);

    // Set the patch edge color.
    T edgeColor(ColorType arg);

    // Set the patch face color.
    T faceColor(ColorType arg);

    // Set the patch linestyle.
    T lineStyle(String arg);

    // Set the patch linestyle.
    T lineStyle(LineStyleType arg);

    // Set the patch linewidth in points.
    T lineWidth(double arg);

    // Set a label that will be displayed in the legend.
    T label(String arg);

}
