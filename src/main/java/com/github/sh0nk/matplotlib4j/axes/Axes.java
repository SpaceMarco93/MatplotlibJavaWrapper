package com.github.sh0nk.matplotlib4j.axes;

import java.io.IOException;
import java.util.List;

import com.github.sh0nk.matplotlib4j.PythonConfig;
import com.github.sh0nk.matplotlib4j.PythonExecutionException;
import com.github.sh0nk.matplotlib4j.axes.builder.FigureBuilder;
import com.github.sh0nk.matplotlib4j.axes.builder.GridBuilder;
import com.github.sh0nk.matplotlib4j.axes.builder.LabelBuilder;
import com.github.sh0nk.matplotlib4j.axes.builder.LegendBuilder;
import com.github.sh0nk.matplotlib4j.axes.builder.LimitBuilder;
import com.github.sh0nk.matplotlib4j.axes.builder.PlotBuilder;
import com.github.sh0nk.matplotlib4j.axes.builder.SaveFigBuilder;
import com.github.sh0nk.matplotlib4j.axes.builder.ScaleBuilder;
import com.github.sh0nk.matplotlib4j.axes.builder.TextBuilder;
import com.github.sh0nk.matplotlib4j.axes.builder.TicksBuilder;
import com.github.sh0nk.matplotlib4j.axes.builder.TitleBuilder;
import com.github.sh0nk.matplotlib4j.enums.ScaleType;

/**
 * This interface contains all the methods that are listed in the left part
 * of the following page. The name of this class "Axes" is not related to the 
 * matplotlib package named plot but it is only a way to an arbitrary name. The
 * method "plot" is the one introduced in the builder and it is named PlotBuilder.
 * Differently from the 2D version, in this case an object of type Axes must be
 * instantiated and all the additional features are put with dedicated setters
 * 
 * https://matplotlib.org/stable/api/_as_gen/matplotlib.axes.Axes.html
 */
public interface Axes {

    /**
     * This static method is used to create an instance of the axes object that 
     * is used to call all the other higher order method using the default implementation
     * of the {@link PythonConfig} instance.
     */
    static AxesImpl create() {
        return new AxesImpl(PythonConfig.systemDefaultPythonConfig(), false);
    }

    /**
     * This static method is used to create an instance of the axes object that 
     * is used to call all the other higher order method using the user instance
     * of the {@link PythonConfig}.
     */
    static AxesImpl create(PythonConfig pythonConfig) {
        return new AxesImpl(pythonConfig, false);
    }

    /**
     * Create a new 3D figure.
     * <p>Make sure that this has to be put before adding plots.
     * Unless that, a new figure window will be open.</p>
     * <p>Use additional options provided by the **kwargs to change the legend
     * location and other settings. </p>
     * 
     * @param windowTitle       a string representing the title of the window
     * @return  an instance of the {@link FigureBuilder} class
     */
    FigureBuilder figure3D(String windowTitle);

    /**
     * Set the legend inside the {@link FigureBuilder} instance.
     * <p> This method is used to set the legend inside the figure instance. 
     * It detects automatically the "labels" passed to the different instances 
     * of {@link PlotBuilder} and displays it in the default location.</p>
     * <p>Use additional options provided by the **kwargs to change the legend
     * location and other settings. </p>
     * 
     * @return  an instance of the {@link LegendBuilder}. The legend is automatically
     * set in the window.
     */
    LegendBuilder setLegend();

    /**
     * Set a title for the plot inside the {@link FigureBuilder} instance.
     * <p>This method is used to set the title of plot inside the figure. The title
     * is just a label on top of the plot and it is different from the name of
     * the window containing the plot. </p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     * 
     * @param title     the title of the plot insider the figure
     * @return  an instance of the {@link TitleBuilder}
     */
    TitleBuilder setTitle(String title);

    /**
     * Set the label for the "x-axis" inside the {@link FigureBuilder}.
     * <p>This method is used to set the label for the x-axis related to the plot
     * or to the multiple plots. The label is unique because there is a single
     * set of axes defined for each figure instance.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *   
     * @param label     the string to be used as a label for the x-axis
     * @return  an instance of the {@link LabelBuilder}. The x-axis label is 
     * automatically set.
     */
    LabelBuilder setXLabel(String label);

    /**
     * Set the label for the "y-axis" inside the {@link FigureBuilder}.
     * <p>This method is used to set the label for the y-axis related to the plot
     * or to the multiple plots. The label is unique because there is a single
     * set of axes defined for each figure instance.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *   
     * @param label     the string to be used as a label for the y-axis
     * @return  an instance of the {@link LabelBuilder}. The y-axis label is 
     * automatically set.
     */
    LabelBuilder setYLabel(String label);

    /**
     * Set the label for the "z-axis" inside the {@link FigureBuilder}.
     * <p>This method is used to set the label for the z-axis related to the plot
     * or to the multiple plots. The label is unique because there is a single
     * set of axes defined for each figure instance.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *   
     * @param label     the string to be used as a label for the z-axis
     * @return  an instance of the {@link LabelBuilder}. The z-axis label is 
     * automatically set.
     */
    LabelBuilder setZLabel(String label);

    /**
     * Set the grid inside the plot defined in the {@link FigureBuilder} instance.
     * <p>This method is used to set a grid inside axes associated to the {@link
     * FigureBuilder} instance.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     * 
     * @param arg   boolean variable to set the grid ({@code true}) or not ({@code false})
     * @return  an instance of the {@link GridBuilder}
     */
    GridBuilder setGrid(boolean arg);

    /**
     * Set the scale for the "x-axis" inside the {@link FigureBuilder}.
     * <p>This method is used to set the scale for the x-axis related to the plot
     * or to the multiple plots. The scale is unique because there is a single
     * set of axes defined for each figure instance.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *   
     * @param scale     the type of scale to be used for the x-axis
     * @return  an instance of the {@link ScaleBuilder}. 
     */
    ScaleBuilder setXScale(ScaleType scale);

    /**
     * Set the scale for the "y-axis" inside the {@link FigureBuilder}.
     * <p>This method is used to set the scale for the y-axis related to the plot
     * or to the multiple plots. The scale is unique because there is a single
     * set of axes defined for each figure instance.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *   
     * @param scale     the type of scale to be used for the y-axis
     * @return  an instance of the {@link ScaleBuilder}. 
     */
    ScaleBuilder setYScale(ScaleType scale);

    /**
     * Set the scale for the "z-axis" inside the {@link FigureBuilder}.
     * <p>This method is used to set the scale for the z-axis related to the plot
     * or to the multiple plots. The scale is unique because there is a single
     * set of axes defined for each figure instance.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *   
     * @param scale     the type of scale to be used for the z-axis
     * @return  an instance of the {@link ScaleBuilder}. 
     */
    ScaleBuilder setZScale(ScaleType scale);

    /**
     * Set the limits for the "x-axis" inside the {@link FigureBuilder}.
     * <p>This method is used to set the view limits for the x-axis related to 
     * the plot or to the multiple plots. The scale is unique because there is 
     * a single set of axes defined for each figure instance.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *   
     * @param xMin     the minimum view limit for the x-axis
     * @param xMax     the maximum view limit for the x-axis
     * @return  an instance of the {@link LimitBuilder}. 
     */
    LimitBuilder setXLim(Number xMin, Number xMax);

    /**
     * Set the limits for the "y-axis" inside the {@link FigureBuilder}.
     * <p>This method is used to set the view limits for the y-axis related to 
     * the plot or to the multiple plots. The scale is unique because there is 
     * a single set of axes defined for each figure instance.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *   
     * @param yMin     the minimum view limit for the y-axis
     * @param yMax     the maximum view limit for the y-axis
     * @return  an instance of the {@link LimitBuilder}. 
     */
    LimitBuilder setYLim(Number yMin, Number yMax);

    /**
     * Set the limits for the "z-axis" inside the {@link FigureBuilder}.
     * <p>This method is used to set the view limits for the z-axis related to 
     * the plot or to the multiple plots. The scale is unique because there is 
     * a single set of axes defined for each figure instance.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *   
     * @param zMin     the minimum view limit for the z-axis
     * @param zMax     the maximum view limit for the z-axis
     * @return  an instance of the {@link LimitBuilder}. 
     */
    LimitBuilder setZLim(Number zMin, Number zMax);

    /**
     * Set the ticks for the "x-axis" inside the {@link FigureBuilder}.
     * <p>This method is used to set the ticks for the x-axis related to 
     * the plot or to the multiple plots. The scale is unique because there is 
     * a single set of axes defined for each figure instance.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *   
     * @param xTicks     the list of ticks to be set for the x-axis
     * @return  an instance of the {@link TicksBuilder}. 
     */
    TicksBuilder setXTicks(List<? extends Number> xTicks);

    /**
     * Set the ticks and labels for the "x-axis" inside the {@link FigureBuilder}.
     * <p>This method is used to set the ticks and labels for the x-axis related to 
     * the plot or to the multiple plots. The scale is unique because there is 
     * a single set of axes defined for each figure instance.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *   
     * @param xTicks   the list of ticks to be set for the x-axis
     * @param labels   the list of labels associated to the ticks (they should 
     *                 have the same size of the ticks)
     * @return  an instance of the {@link TicksBuilder}. 
     */
    TicksBuilder setXTicksAndLabels(List<Number> xTicks, List<String> labels);

    /**
     * Set the ticks for the "y-axis" inside the {@link FigureBuilder}.
     * <p>This method is used to set the ticks for the y-axis related to 
     * the plot or to the multiple plots. The scale is unique because there is 
     * a single set of axes defined for each figure instance.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *   
     * @param yTicks     the list of ticks to be set for the y-axis
     * @return  an instance of the {@link TicksBuilder}. 
     */
    TicksBuilder setYTicks(List<? extends Number> yTicks);

    /**
     * Set the ticks and labels for the "y-axis" inside the {@link FigureBuilder}.
     * <p>This method is used to set the ticks and labels for the y-axis related to 
     * the plot or to the multiple plots. The scale is unique because there is 
     * a single set of axes defined for each figure instance.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *   
     * @param yTicks   the list of ticks to be set for the y-axis
     * @param labels   the list of labels associated to the ticks (they should 
     *                 have the same size of the ticks)
     * @return  an instance of the {@link TicksBuilder}. 
     */
    TicksBuilder setYTicksAndLabels(List<Number> yTicks, List<String> labels);

    /**
     * Set the ticks for the "z-axis" inside the {@link FigureBuilder}.
     * <p>This method is used to set the ticks for the z-axis related to 
     * the plot or to the multiple plots. The scale is unique because there is 
     * a single set of axes defined for each figure instance.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *   
     * @param zTicks     the list of ticks to be set for the z-axis
     * @return  an instance of the {@link TicksBuilder}. 
     */
    TicksBuilder setZTicks(List<? extends Number> zTicks);

    /**
     * Set the ticks and labels for the "z-axis" inside the {@link FigureBuilder}.
     * <p>This method is used to set the ticks and labels for the z-axis related to 
     * the plot or to the multiple plots. The scale is unique because there is 
     * a single set of axes defined for each figure instance.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *   
     * @param zTicks   the list of ticks to be set for the z-axis
     * @param labels   the list of labels associated to the ticks (they should 
     *                 have the same size of the ticks)
     * @return  an instance of the {@link TicksBuilder}. 
     */
    TicksBuilder setZTicksAndLabels(List<Number> zTicks, List<String> labels);

    /**
     * Set a text inside the {@link FigureBuilder} instance.
     * <p>This method is used to set some text inside the plot. The text is 
     * specified by the string {@code s}and it is place in a given position which 
     * coordinates are given by ({@code x}, {@code y}, {@code} z). </p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     * 
     * @param x     x-coordinate of the text to be placed
     * @param y     y-coordinate of the text to be placed
     * @param z     z-coordinate of the text to be placed
     * @param s     string to be displayed in the text box
     * @return  an instance of the {@link TextBuilder}. The text box is automatically
     * set at the given location.
     */
    TextBuilder setText(double x, double y, double z, String s);

    /**
     * Plot a 3D line.
     * <p>This method is used to call the generic plot method. All the main arguments
     * and kwargs should be defined in a sequential way with additional calls on 
     * the same object.</p>
     * 
     * @return  an instance of the {@link PlotBuilder}
     */
    PlotBuilder plot();

    /**
     * Plot a three-dimensional line given the coordinates.
     * <p>This method is used to call in a simplified way the plot function that 
     * is creating the 3D plot given the x-coordinates, y-coordinates and z-coordinates.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *
     * @param x     list of x-coordinates to be plotted
     * @param y     list of y-coordinates to be plotted
     * @param z     list of z-coordinates to be plotted
     * @return  an instance of the {@link PlotBuilder}
     */
    PlotBuilder plot(List<? extends Number> x, List<? extends Number> y, List<? extends Number> z);

    /**
     * Plot a three-dimensional line given the coordinates and a string format.
     * <p>This method is used to call in a simplified way the plot function that 
     * is creating the 3D plot given the x-coordinates, y-coordinates and z-coordinates.</p>
     * <p>The user can also pass a string proving a simplified way to set 
     * linestyle and color.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *
     * @param x     list of x-coordinates to be plotted
     * @param y     list of y-coordinates to be plotted
     * @param z     list of z-coordinates to be plotted
     * @param fmt   string providing the color and linestyle
     * @return  an instance of the {@link PlotBuilder}
     */
    PlotBuilder plot(List<? extends Number> x, List<? extends Number> y, List<? extends Number> z, String fmt);

    /**
     * Save the figure specifying also the file name.
     * <p>This method is used to call the savefig method passing the name of the
     * figure file that will be generated.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     * 
     * @param fname     name of the file where the figure is saved
     * @return  an instance of the {@link SaveFigBuilder}
     */
    SaveFigBuilder saveFig(String fname);

    /**
     * Close a figure window.
     */
    void close();

    /**
     * Close a figure window with name label.
     */
    void close(String name);

    /**
     * Silently execute Python script until here by builders.
     * It is mostly useful to execute `plt.savefig()` without showing by window.
     */
    void executeSilently() throws IOException, PythonExecutionException;

    /**
     * matplotlib.pyplot.show(*args, **kw)
     */
    void show() throws IOException, PythonExecutionException;

}
