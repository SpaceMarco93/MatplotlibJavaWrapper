package com.github.sh0nk.matplotlib4j.pyplot;

import com.github.sh0nk.matplotlib4j.PythonConfig;
import com.github.sh0nk.matplotlib4j.PythonExecutionException;
import com.github.sh0nk.matplotlib4j.enums.ScaleType;
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
    static Plot create() {
        return new PlotImpl(PythonConfig.systemDefaultPythonConfig(), false);
    }

    /**
     * This static method is used to create an instance of the plot object that 
     * is used to call all the other higher order method using the user instance
     * of the {@link PythonConfig}.
     */
    static Plot create(PythonConfig pythonConfig) {
        return new PlotImpl(pythonConfig, false);
    }

    /**
     * This renews a figure. Make sure that this has to be put before adding plots.
     * Unless that, a new figure window will be open.
     */
    FigureBuilder figure(String windowTitle);

    /**
     * This renews a figure. Make sure that this has to be put before adding plots.
     * Unless that, a new figure window will be open. Moreover, this method is
     * used to call also the additional arguments and kwargs of the "figure" method.
     */
    FigureBuilder setFigure();

    /**
     * This method is used to set the legend inside the figure instance. It detects
     * automatically the "labels" passed to the different instances of {@link PlotBuilder}.
     */
    LegendBuilder setLegend();

    /**
     * This method is used to set the title of the window containing the figure.
     * It is an easy way to pass only the window title.
     */
    TitleBuilder title(String title);

    /**
     * This method is used to set the title of the window containing the figure.
     * It is used also to set the additional argument and kwargs contained in the
     * "title" method.
     */
    TitleBuilder setTitle();

    /**
     * This method is used to set the label for the x-axis 
     */
    LabelBuilder xLabel(String label);

    /**
     * This method is used to set the label for the y-axis 
     */
    LabelBuilder yLabel(String label);

    /**
     * This method is used to set the labels for the two axes and also to call 
     * the additional arguments and kwargs related to the "xlabel" and "ylabel" 
     * functions. 
     */
    LabelBuilder setLabel();

    /**
     * This method is used to enable/disable the grid for the plot 
     */
    GridBuilder grid(boolean arg);

    /**
     * This method is used to enable/disable the grid for the plot, but also to
     * access the additional arguments and kwargs related to the "grid" method.
     */
    GridBuilder setGrid();

    /**
     * This method is used to set the scale for the x-axis.
     */
    ScaleBuilder xScale(ScaleType value);

    /**
     * This method is used to set the scale for the y-axis.
     */
    ScaleBuilder yScale(ScaleType value);

    /**
     * This method is used to set the boundaries for the x-axis.
     */
    LimitBuilder xLim(Number xmin, Number xmax);

    /**
     * This method is used to set the boundaries for the y-axis.
     */
    LimitBuilder yLim(Number ymin, Number ymax);

    /**
     * This method is used to set the ticks for the x-axis.
     */
    TicksBuilder setXTicks(List<Number> xticks);

    /**
     * This method is used to set the ticks and labels for the x-axis. It is
     * important to use this method because if labels are to be applied it is 
     * mandatory that there are always some ticks to be provided.
     */
    TicksBuilder setXTicksAndLabels(List<Number> xticks, List<String> labels);

    /**
     * This method is used to set the ticks for the y-axis.
     */
    TicksBuilder setYTicks(List<Number> yticks);

    /**
     * This method is used to set the ticks and labels for the y-axis. It is
     * important to use this method because if labels are to be applied it is 
     * mandatory that there are always some ticks to be provided.
     */
    TicksBuilder setYTicksAndLabels(List<Number> yticks, List<String> labels);

    /**
     * This method is used to set the ticks for both the x-axis and y-axis. This
     * method is also used to access the additional arguments and kwargs related
     * to the "xticks" and "yticks" function.
     */
    TicksBuilder setTicks();

    /**
     * This method is used to set some text specified by the string in a given
     * position which coordinates are given by (x, y). 
     */
    TextBuilder text(double x, double y, String s);

    /**
     * This method is used to set a text box in a specified position. This
     * method is also used to access the additional arguments and kwargs related
     * to the "text" function.
     */
    TextBuilder setText();

    /**
     * This method is used to call the generic plot method. All the main arguments
     * and kwargs should be defined in a sequential way with additional calls on 
     * the same object.
     */
    PlotBuilder plot();

    /**
     * This method is used to call in a simplified way the plot function that is
     * creating the 2D plot given the x-coordinated and y-coordinates.
     */
    PlotBuilder plot(List<? extends Number> x, List<? extends Number> y);

    /**
     * This method is used to call in a simplified way the plot function that is
     * creating the 2D plot given the x-coordinated and y-coordinates. The user
     * can also pass a string proving a simplified way to set linestyle and color.
     */
    PlotBuilder plot(List<? extends Number> x, List<? extends Number> y, String fmt);

    /**
     * This method is used to call the generic contour plot method. All the main 
     * arguments and kwargs should be defined in a sequential way with additional 
     * calls on the same object.
     */
    ContourBuilder contour();

    /**
     * This method is used to call the contour plot method using only the height
     * values over which the contour is drawn. Color-mapping is controlled by 
     * cmap, norm, vmin, and vmax.
     */
    ContourBuilder contour(List<? extends List<? extends Number>> Z);

    /**
     * This method is used to call the contour plot method using the height
     * values over which the contour is drawn and the oordinates of the values in Z. 
     * Color-mapping is controlled by cmap, norm, vmin, and vmax.
     */
    ContourBuilder contour(List<? extends Number> X, List<? extends Number> Y, List<? extends List<? extends Number>> Z);

    /**
     * This method is used to call the generic histogram method. All the main 
     * arguments and kwargs should be defined in a sequential way with additional 
     * calls on the same object.
     */
    HistBuilder hist();

    /**
     * This method is used to call the histogram method passing a single set of
     * data to be plotted.
     */
    HistBuilder histSingleSet(List<? extends Number> nums);

    /**
     * This method is used to call the histogram method passing multiple set of
     * data to be plotted.
     */
    HistBuilder histMultipleSets(List<? extends List<? extends Number>> nums);

    /**
     * This method is used to call the generic loglog method. All the main 
     * arguments and kwargs should be defined in a sequential way with additional 
     * calls on the same object.
     */
    LogLogBuilder logLog();

    /**
     * This method is used to call in a simplified way the loglog function that is
     * creating the 2D plot given the x-coordinated and y-coordinates.
     */
    LogLogBuilder logLog(List<? extends Number> x, List<? extends Number> y);

    /**
     * This method is used to call in a simplified way the loglog function that is
     * creating the 2D plot given the x-coordinated and y-coordinates. The user
     * can also pass a string proving a simplified way to set linestyle and color.
     */
    LogLogBuilder logLog(List<? extends Number> x, List<? extends Number> y, String fmt);

    /**
     * This method is used to call the generic semilogx method. All the main 
     * arguments and kwargs should be defined in a sequential way with additional 
     * calls on the same object.
     */
    SemiLogXBuilder semiLogX();

    /**
     * This method is used to call in a simplified way the semilogx function that is
     * creating the 2D plot given the x-coordinated and y-coordinates.
     */
    SemiLogXBuilder semiLogX(List<? extends Number> x, List<? extends Number> y);

    /**
     * This method is used to call in a simplified way the semilogx function that is
     * creating the 2D plot given the x-coordinated and y-coordinates. The user
     * can also pass a string proving a simplified way to set linestyle and color.
     */
    SemiLogXBuilder semiLogX(List<? extends Number> x, List<? extends Number> y, String fmt);

    /**
     * This method is used to call the generic semilogy method. All the main 
     * arguments and kwargs should be defined in a sequential way with additional 
     * calls on the same object.
     */
    SemiLogYBuilder semiLogY();

    /**
     * This method is used to call in a simplified way the semilogy function that is
     * creating the 2D plot given the x-coordinated and y-coordinates.
     */
    SemiLogYBuilder semiLogY(List<? extends Number> x, List<? extends Number> y);

    /**
     * This method is used to call in a simplified way the semilogy function that is
     * creating the 2D plot given the x-coordinated and y-coordinates. The user
     * can also pass a string proving a simplified way to set linestyle and color.
     */
    SemiLogYBuilder semiLogY(List<? extends Number> x, List<? extends Number> y, String fmt);

    /**
     * This method is used to call the generic savefig method. All the main 
     * arguments and kwargs should be defined in a sequential way with additional 
     * calls on the same object.
     */
    SaveFigBuilder saveFig();

    /**
     * This method is used to call the simplified savefig method passing the name
     * of the figure file that will be generated.
     */
    SaveFigBuilder saveFig(String fname);

    /**
     * This method is used to call the subfig method passing the dimension of the
     * grid to be generated and the index relative to the "box" to be occupied
     * by next plot. This method should be contained in a figure and should be
     * called anytime before the call to the "plot" method because it is required
     * to get the instance of the axes occupying the specific slot in the grid.
     * Additional kwargs can be called on the same instance.
     */
    SubplotBuilder subplot(int nrows, int ncols, int index);

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
     * Show the plots and figures all together,
     */
    void show() throws IOException, PythonExecutionException;

}
