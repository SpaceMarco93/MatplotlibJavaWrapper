package com.github.sh0nk.matplotlib4j.pyplot;

import com.github.sh0nk.matplotlib4j.PythonConfig;
import com.github.sh0nk.matplotlib4j.PythonExecutionException;
import com.github.sh0nk.matplotlib4j.enums.ScaleType;
import com.github.sh0nk.matplotlib4j.pyplot.builder.AxesBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.ContourBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.FigureBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.GridBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.HistBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.LabelBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.LegendBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.LimitBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.LogLogBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.PlotBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.SaveFigBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.ScaleBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.SemiLogXBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.SemiLogYBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.SubplotBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.TextBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.TicksBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.TitleBuilder;

import java.io.IOException;
import java.util.List;

/**
 * This interface contains all the methods that are listed in the left part
 * of the following page. The name of this class "plot" is not related to the 
 * matplotlib package named plot but it is only a way to an arbitrary name. The
 * method "plot" is the one introduced in the builder and it is named PlotBuilder.
 * 
 * https://matplotlib.org/stable/api/pyplot_summary.html
 */
public interface Plot {

    /**
     * This static method is used to create an instance of the plot object that 
     * is used to call all the other higher order method using the default implementation
     * of the {@link PythonConfig} instance.
     */
    static PlotImpl create() {
        return new PlotImpl(PythonConfig.systemDefaultPythonConfig(), false);
    }
    
    /**
     * This static method is used to create an instance of the plot object that 
     * is used to call all the other higher order method using the user instance
     * of the {@link PythonConfig}.
     */
    static PlotImpl create(PythonConfig pythonConfig) {
        return new PlotImpl(pythonConfig, false);
    }

    /**
     * Create a new figure.
     * <p>Make sure that this has to be put before adding plots.
     * Unless that, a new figure window will be open.</p>
     * <p>Use additional options provided by the **kwargs to change the legend
     * location and other settings. </p>
     * 
     * @param windowTitle       a string representing the title of the window
     * @return  an instance of the {@link FigureBuilder} class
     */
    FigureBuilder figure(String windowTitle);

    /**
     * Create a new figure.
     * <p>This renews a figure. Make sure that this has to be put before adding plots.
     * Unless that, a new figure window will be open.</p> 
     * <p>Moreover, this method is used to call also the additional arguments 
     * and kwargs of the "figure" method. </p>
     * 
     * @return  an instance of the {@link FigureBuilder} class
     */
    FigureBuilder setFigure();

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
     * Set a {@link TitleBuilder} instance inside the {@link FigureBuilder} instance.
     * This method is used to set the title of the window containing the figure.
     * It is used also to set the additional arguments and kwargs contained in the
     * "title" method.
     * 
     *  @return  an instance of the {@link TitleBuilder}
     */
    TitleBuilder setTitle();

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
     * Set a {@link LabelBuilder} instance inside the {@link FigureBuilder} instance.
     * <p>This method is used to set the labels for the axes contained in the figure.
     * It is used also to set the additional arguments and kwargs contained in the
     * "xlabel" and "ylabel" methods.</p>
     * 
     * @return  an instance of the {@link LabelBuilder}.
     */
    LabelBuilder setLabel();

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
     * Set a {@link GridBuilder} instance inside the {@link FigureBuilder} instance.
     * <p>This method is used to set the labels to set a grid inside axes associated 
     * to the {@link FigureBuilder} instance.</p>
     * 
     * @return  an instance of the {@link GridBuilder}.
     */
    GridBuilder setGrid();

    /**
     * Set the scale for the "x-axis" inside the {@link FigureBuilder}.
     * <p>This method is used to set the scale for the x-axis related to the plot
     * or to the multiple plots. The scale is unique because there is a single
     * set of axes defined for each figure instance.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *   
     * @param value     the type of scale to be used for the x-axis
     * @return  an instance of the {@link ScaleBuilder}. 
     */
    ScaleBuilder setXScale(ScaleType value);

    /**
     * Set the scale for the "y-axis" inside the {@link FigureBuilder}.
     * <p>This method is used to set the scale for the y-axis related to the plot
     * or to the multiple plots. The scale is unique because there is a single
     * set of axes defined for each figure instance.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *   
     * @param value     the type of scale to be used for the y-axis
     * @return  an instance of the {@link ScaleBuilder}. 
     */
    ScaleBuilder setYScale(ScaleType value);

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
     * Set the ticks for the "x-axis" inside the {@link FigureBuilder}.
     * <p>This method is used to set the ticks for the x-axis related to 
     * the plot or to the multiple plots. The scale is unique because there is 
     * a single set of axes defined for each figure instance.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *   
     * @param xTicks     the list of ticks to be set for the x-axis
     * @return  an instance of the {@link TicksBuilder}. 
     */
    TicksBuilder setXTicks(List<Number> xTicks);

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
    TicksBuilder setYTicks(List<Number> yTicks);

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
     * Set the ticks for a single axis inside the {@link FigureBuilder}.
     * <p>This method is used to set the ticks and labels for a single axis 
     * related to the plot or to the multiple plots. The scale is unique because 
     * there is a single set of axes defined for each figure instance.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *   
     * @return  an instance of the {@link TicksBuilder}. 
     */
    TicksBuilder setTicks();

    /**
     * Set a text inside the {@link FigureBuilder} instance.
     * <p>This method is used to set some text inside the plot. The text is 
     * specified by the string {@code s}and it is place in a given position which 
     * coordinates are given by ({@code x}, {@code y}). </p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     * 
     * @param x     x-coordinate of the text to be placed
     * @param y     y-coordinate of the text to be placed
     * @param s     string to be displayed in the text box
     * @return  an instance of the {@link TextBuilder}. The text box is automatically
     * set at the given location.
     */
    TextBuilder setText(double x, double y, String s);

    /**
     * Set a text inside the {@link FigureBuilder} instance.
     * <p>This method is used to set some text inside the plot.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     * 
     * @return  an instance of the {@link TextBuilder}.
     */
    TextBuilder setText();

    /**
     * Plot a 2D line.
     * <p>This method is used to call the generic plot method. All the main arguments
     * and kwargs should be defined in a sequential way with additional calls on 
     * the same object.</p>
     * 
     * @return  an instance of the {@link PlotBuilder}
     */
    PlotBuilder plot();

    /**
     * Plot a two-dimensional line given the coordinates.
     * <p>This method is used to call in a simplified way the plot function that 
     * is creating the 2D plot given the x-coordinates and y-coordinates.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *
     * @param x     list of x-coordinates to be plotted
     * @param y     list of y-coordinates to be plotted
     * @return  an instance of the {@link PlotBuilder}
     */
    PlotBuilder plot(List<? extends Number> x, List<? extends Number> y);

    /**
     * Plot a two-dimensional line given the coordinates and a string format.
     * <p>This method is used to call in a simplified way the plot function that 
     * is creating the 2D plot given the x-coordinates and y-coordinates.</p>
     * <p>The user can also pass a string proving a simplified way to set 
     * linestyle and color.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *
     * @param x     list of x-coordinates to be plotted
     * @param y     list of y-coordinates to be plotted
     * @param fmt   string providing the color and linestyle
     * @return  an instance of the {@link PlotBuilder}
     */
    PlotBuilder plot(List<? extends Number> x, List<? extends Number> y, String fmt);

    /**
     * Plot contour lines.
     * <p>This method is used to call the generic contour plot method. All the main 
     * arguments and kwargs should be defined in a sequential way with additional 
     * calls on the same object.</p>
     * 
     * @return an instance of the {@link ContourBuilder}
     */
    ContourBuilder contour();

    /**
     * Plot contour lines.
     * <p>This method is used to call the contour plot method using only the height
     * values over which the contour is drawn.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     * 
     * @param Z     the height values over which the contour is drawn.
     * @return  an instance of the {@link ContourBuilder}
     */
    ContourBuilder contour(List<? extends List<? extends Number>> Z);

    /**
     * Plot contour lines.
     * <p>This method is used to call the contour plot method using the height
     * values over which the contour is drawn and the coordinates of the Z-values.
     * X and Y must both be ordered monotonically.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     * 
     * @param X     the list of x-coordinates associated to the heights
     * @param Y     the list of y-coordinates associated to the heights
     * @param Z     the height values over which the contour is drawn.
     * @return  an instance of the {@link ContourBuilder}
     */
    ContourBuilder contour(List<? extends Number> X, List<? extends Number> Y, List<? extends List<? extends Number>> Z);

    /**
     * Get the current Axes.
     * 
     * @return  an instance of the {@link AxesBuilder}
     */
    AxesBuilder gca();

    /**
     * Create a histogram object.
     * <p>This method is used to call the generic histogram method. All the main 
     * arguments and kwargs should be defined in a sequential way with additional 
     * calls on the same object.</p>
     * 
     * @return  an instance of the {@link HistBuilder}
     */
    HistBuilder hist();

    /**
     * Create a histogram using the given numerical values.
     * <p>This method is used to call the histogram method passing a single set of
     * data to be plotted.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     * 
     * @param nums      set of data to be plotted using the histogram
     * @return  an instance of the {@link HistBuilder}
     */
    HistBuilder histSingleSet(List<? extends Number> nums);

    /**
     * Create a histogram using multiple sets of numerical values.
     * <p>This method is used to call the histogram method passing multiple sets 
     * of data to be plotted.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     * 
     * @param nums      sets of data to be plotted using the histogram
     * @return  an instance of the {@link HistBuilder}
     */
    HistBuilder histMultipleSets(List<? extends List<? extends Number>> nums);

    /**
     * Plot some 2D lines using logarithmic scale for x-axis and y-axis.
     * <p>This method is used to call the generic plot method in logarithmic scale.
     * All the main arguments and kwargs should be defined in a sequential way 
     * with additional calls on the same object.</p>
     * 
     * @return  an instance of the {@link LogLogBuilder}
     */
    LogLogBuilder logLog();

    /**
     * Plot a two-dimensional line given the coordinates in logarithmic scale
     * for both x-axis and y-axis.
     * <p>This method is used to call in a simplified way the loglog function that 
     * is creating the 2D plot given the x-coordinates and y-coordinates using
     * a logarithmic scale for both the x-axis and y-axis.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *
     * @param x     list of x-coordinates to be plotted
     * @param y     list of y-coordinates to be plotted
     * @return  an instance of the {@link LogLogBuilder}
     */
    LogLogBuilder logLog(List<? extends Number> x, List<? extends Number> y);

    /**
     * Plot a two-dimensional line given the coordinates and a string format in
     * logarithmic scale for both x-axis and y-axis.
     * <p>This method is used to call in a simplified way the loglog function that 
     * is creating the 2D plot given the x-coordinates and y-coordinates using
     * a logarithmic scale for both the x-axis and y-axis.</p>
     * <p>The user can also pass a string proving a simplified way to set 
     * linestyle and color.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *
     * @param x     list of x-coordinates to be plotted
     * @param y     list of y-coordinates to be plotted
     * @param fmt   string providing the color and linestyle
     * @return  an instance of the {@link LogLogBuilder}
     */
    LogLogBuilder logLog(List<? extends Number> x, List<? extends Number> y, String fmt);

    /**
     * Plot some 2D lines using logarithmic scale for x-axis.
     * <p>This method is used to call the generic plot method in logarithmic scale.
     * All the main arguments and kwargs should be defined in a sequential way 
     * with additional calls on the same object.</p>
     * 
     * @return  an instance of the {@link SemiLogXBuilder}
     */
    SemiLogXBuilder semiLogX();

    /**
     * Plot a two-dimensional line given the coordinates in logarithmic scale
     * for the x-axis.
     * <p>This method is used to call in a simplified way the semilogx function 
     * that is creating the 2D plot given the x-coordinates and y-coordinates using
     * a logarithmic scale the x-axis.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *
     * @param x     list of x-coordinates to be plotted
     * @param y     list of y-coordinates to be plotted
     * @return  an instance of the {@link SemiLogXBuilder}
     */
    SemiLogXBuilder semiLogX(List<? extends Number> x, List<? extends Number> y);

    /**
     * Plot a two-dimensional line given the coordinates and a string format in
     * logarithmic scale for the x-axis.
     * <p>This method is used to call in a simplified way the semilogx function 
     * that is creating the 2D plot given the x-coordinates and y-coordinates 
     * using a logarithmic scale for the x-axis.</p>
     * <p>The user can also pass a string proving a simplified way to set 
     * linestyle and color.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *
     * @param x     list of x-coordinates to be plotted
     * @param y     list of y-coordinates to be plotted
     * @param fmt   string providing the color and linestyle
     * @return  an instance of the {@link SemiLogXBuilder}
     */
    SemiLogXBuilder semiLogX(List<? extends Number> x, List<? extends Number> y, String fmt);

    /**
     * Plot some 2D lines using logarithmic scale for y-axis.
     * <p>This method is used to call the generic plot method in logarithmic scale.
     * All the main arguments and kwargs should be defined in a sequential way 
     * with additional calls on the same object.</p>
     * 
     * @return  an instance of the {@link SemiLogYBuilder}
     */
    SemiLogYBuilder semiLogY();

    /**
     * Plot a two-dimensional line given the coordinates in logarithmic scale
     * for the y-axis.
     * <p>This method is used to call in a simplified way the semilogy function 
     * that is creating the 2D plot given the x-coordinates and y-coordinates using
     * a logarithmic scale the y-axis.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *
     * @param x     list of x-coordinates to be plotted
     * @param y     list of y-coordinates to be plotted
     * @return  an instance of the {@link SemiLogYBuilder}
     */
    SemiLogYBuilder semiLogY(List<? extends Number> x, List<? extends Number> y);

    /**
     * Plot a two-dimensional line given the coordinates and a string format in
     * logarithmic scale for the y-axis.
     * <p>This method is used to call in a simplified way the semilogy function 
     * that is creating the 2D plot given the x-coordinates and y-coordinates 
     * using a logarithmic scale for the y-axis.</p>
     * <p>The user can also pass a string proving a simplified way to set 
     * linestyle and color.</p>
     * <p>Use additional call on this instance to set the **kwargs. </p>
     *
     * @param x     list of x-coordinates to be plotted
     * @param y     list of y-coordinates to be plotted
     * @param fmt   string providing the color and linestyle
     * @return  an instance of the {@link SemiLogYBuilder}
     */
    SemiLogYBuilder semiLogY(List<? extends Number> x, List<? extends Number> y, String fmt);

    /**
     * Save the figure in a file.
     * <p> This method is used to call the generic savefig method. All the main 
     * arguments and kwargs should be defined in a sequential way with additional 
     * calls on the same object.</p>
     * 
     * @return an instance of the {@link SaveFigBuilder}
     */
    SaveFigBuilder saveFig();

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
     * Create a subplot.
     * <p>This method is used to call the subfig method passing the size of the
     * grid to be generated and the index relative to the "box" to be occupied
     * by next plot.</p> 
     * <p>This method should be called after the definition of a figure and 
     * should be called anytime before the call to the "plot" method. Indeed,
     * the method returns an instance of the axes occupying the specific slot 
     * in the grid.</p>
     * <p>Additional kwargs can be called on the same instance.</p>
     * 
     * @param nRows     number of rows of the subplot grid
     * @param nCols     number of columns of the subplot grid
     * @param index     index specifying the position of next plot in the grid
     * @return  an instance of {@link SubplotBuilder}
     */
    SubplotBuilder subplot(int nRows, int nCols, int index);

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
     * Show the plots and figures all together.
     */
    void show() throws IOException, PythonExecutionException;

}
