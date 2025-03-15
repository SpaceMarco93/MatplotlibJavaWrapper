package com.github.sh0nk.matplotlib4j.axes.kwargs;

import java.util.List;

import com.github.sh0nk.matplotlib4j.axes.builder.Builder3D;
import com.github.sh0nk.matplotlib4j.enums.AdjustableType;
import com.github.sh0nk.matplotlib4j.enums.AnchorType;
import com.github.sh0nk.matplotlib4j.enums.AspectType;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.ScaleType;
import com.github.sh0nk.matplotlib4j.pyplot.builder.SubplotBuilder;

/**
 * This interface is defining all the **kwargs associated to the "Axes" method
 * defined in axes. This interface is supporting the interface {@link SubplotBuilder}
 * where the main arguments *args are defined.
 * 
 * matplotlib.axes.Axes(fig, *args, **kwargs)
 *
 */
public interface AxesArgsBuilder<T extends Builder3D> extends KwargsBuilder {

    /**
     * Set how the Axes adjusts to achieve the required aspect ratio.
     * 
     * @param arg   an instance of the {@link AdjustableType} enum providing the
     *              aspect ratio convention
     *              
     * @return  the instance of {@link T} builder for method chain  
     */
    T adjustable(AdjustableType arg);

    /**
     * Set the alpha value used for blending - not supported on all backends.
     * 
     * @param arg   the alpha value used for blending
     * @return  the instance of {@link T} builder for method chain  
     */
    T alpha(double arg);

    /**
     * Set the anchor location
     * <p>The anchor defines where the drawing area will be located within the 
     * available space.</p>
     * 
     * @param arg   an instance of the {@link AnchorType} enum providing the anchor
     *              position
     * @return  the instance of {@link T} builder for method chain  
     */
    T anchor(AnchorType arg);

    /**
     * Set the aspect ratio of the Axes scaling, i.e. y/x-scale.
     * 
     * @param arg   an instance of the {@link AspectType} enum providing the aspect
     *              ratio scaling
     * @return  the instance of {@link T} builder for method chain  
     */
    T aspect(AspectType arg);

    /**
     * Set whether autoscaling is applied to each axis on the next draw
     * 
     * @param arg   boolean variable to set if autoscaling is applied or not
     * @return  the instance of {@link T} builder for method chain   
     */
    T autoScaleOn(boolean arg);

    /**
     * Set whether axis ticks and gridlines are above or below most artists.
     * 
     * @param arg   boolean variable to set where ticks and gridlines are placed
     * @return  the instance of {@link T} builder for method chain
     */
    T axisBelow(boolean arg);

    /**
     * Set the Axes box aspect, i.e. the ratio of height to width.
     * 
     * @param arg   the aspect ratio value
     * @return  the instance of {@link T} builder for method chain
     */
    T boxAspect(double arg);

    /**
     * Set the facecolor of the Axes.
     * 
     * @param arg   an instance of the {@link ColorType} enum providing the axes
     *              facecolor
     * @return  the instance of {@link T} builder for method chain
     */
    T faceColor(ColorType arg);

    /**
     * Set the Figure or SubFigure instance the artist belongs to.
     * 
     * @param arg   the figure instance
     * @return  the instance of {@link T} builder for method chain
     */
    T figure(String arg);

    /**
     * Set whether the Axes rectangle patch is drawn.
     * 
     * @param arg   boolean variable to set if the axes rectangle patch is drawn
     * @return  the instance of {@link T} builder for method chain
     */
    T frameOn(boolean arg);

    /**
     * Set if artist is to be included in layout calculations
     * 
     * @param arg   boolean variable to set if artist is included in layout calculations
     * @return  the instance of {@link T} builder for method chain
     */
    T inLayout(boolean arg);

    /**
     * Set a label that will be displayed in the legend.
     * 
     * @param arg   the text to be displayed as label in the legend
     * @return  the instance of {@link T} builder for method chain
     */
    T label(String arg);

    /**
     * Set a title for the Axes.
     * 
     * @param arg   a string providing the title of the axes
     * @return  the instance of {@link T} builder for method chain
     */
    T title(String arg);

    /**
     * Set the artist's visibility.
     * 
     * @param arg   boolean variable to set the artist's visibility
     * @return  the instance of {@link T} builder for method chain
     */
    T visible(boolean arg);

    /**
     * Set the lower and upper numerical bounds of the x-axis.
     * 
     * @param left      lower bound of the x-axis
     * @param right     upper bound of the x-axis
     * @return  the instance of {@link T} builder for method chain
     */
    T xBound(double left, double right);

    /**
     * Set the label for the x-axis.
     * 
     * @param arg       the text to be displayed as label for the x-axis
     * @return  the instance of {@link T} builder for method chain
     */
    T xLabel(String arg);

    /**
     * Set the x-axis view limits
     * 
     * @param left      lower bound of the x-axis view
     * @param right     upper bound of the x-axis view
     * @return  the instance of {@link T} builder for method chain           
     */
    T xLim(double left, double right);

    /**
     * Set the xaxis' scale.
     * 
     * @param arg   an instance of the {@link ScaleType} enum providing the x axis
     *              scale
     * @return  the instance of {@link T} builder for method chain
     */
    T xScale(ScaleType arg);

    /**
     * Set the x-axis' ticks locations.
     * 
     * @param ticks     a list providing the ticks to be placed on the x-axis   
     * @return  the instance of {@link T} builder for method chain
     */
    T xTicks(List<Number> ticks);

    /**
     * Set the x-axis' ticks locations and tick labels instance.
     * 
     * @param ticks     a list providing the ticks to be placed on the x-axis
     * @param labels    a list providing the labels to be places at the ticks  
     * @return  the instance of {@link T} builder for method chain
     */
    T xTicks(List<Number> ticks, List<String> labels);

    /**
     * Set the lower and upper numerical bounds of the y-axis.
     * 
     * @param left      lower bound of the y-axis
     * @param right     upper bound of the y-axis
     * @return  the instance of {@link T} builder for method chain
     */
    T yBound(double left, double right);

    /**
     * Set the label for the y-axis.
     * 
     * @param arg       the text to be displayed as label for the y-axis
     * @return  the instance of {@link T} builder for method chain
     */
    T yLabel(String arg);

    /**
     * Set the y-axis view limits
     * 
     * @param left      lower bound of the y-axis view
     * @param right     upper bound of the y-axis view
     * @return  the instance of {@link T} builder for method chain           
     */
    T yLim(double left, double right);

    /**
     * Set the yaxis' scale.
     * 
     * @param arg   an instance of the {@link ScaleType} enum providing the y axis
     *              scale
     * @return  the instance of {@link T} builder for method chain
     */
    T yScale(ScaleType arg);

    /**
     * Set the y-axis' ticks locations.
     * 
     * @param ticks     a list providing the ticks to be placed on the y-axis   
     * @return  the instance of {@link T} builder for method chain
     */
    T yTicks(List<Number> ticks);

    /**
     * Set the y-axis' ticks locations and tick labels instance.
     * 
     * @param ticks     a list providing the ticks to be placed on the y-axis
     * @param labels    a list providing the labels to be places at the ticks  
     * @return  the instance of {@link T} builder for method chain
     */
    T yTicks(List<Number> ticks, List<String> labels);

    /**
     * Set the lower and upper numerical bounds of the z-axis.
     * 
     * @param left      lower bound of the z-axis
     * @param right     upper bound of the z-axis
     * @return  the instance of {@link T} builder for method chain
     */
    T zBound(double left, double right);

    /**
     * Set the label for the z-axis.
     * 
     * @param arg       the text to be displayed as label for the z-axis
     * @return  the instance of {@link T} builder for method chain
     */
    T zLabel(String arg);

    /**
     * Set the z-axis view limits
     * 
     * @param left      lower bound of the z-axis view
     * @param right     upper bound of the z-axis view
     * @return  the instance of {@link T} builder for method chain           
     */
    T zLim(double left, double right);

    /**
     * Set the zaxis' scale.
     * 
     * @param arg   an instance of the {@link ScaleType} enum providing the z axis
     *              scale
     * @return  the instance of {@link T} builder for method chain
     */
    T zScale(ScaleType arg);

    /**
     * Set the z-axis' ticks locations.
     * 
     * @param ticks     a list providing the ticks to be placed on the z-axis   
     * @return  the instance of {@link T} builder for method chain
     */
    T zTicks(List<Number> ticks);

    /**
     * Set the z-axis' ticks locations and tick labels instance.
     * 
     * @param ticks     a list providing the ticks to be placed on the z-axis
     * @param labels    a list providing the labels to be places at the ticks  
     * @return  the instance of {@link T} builder for method chain
     */
    T zTicks(List<Number> ticks, List<String> labels);
}
