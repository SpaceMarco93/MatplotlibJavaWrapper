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
    static Axes create() {
        return new AxesImpl(PythonConfig.systemDefaultPythonConfig(), false);
    }

    /**
     * This static method is used to create an instance of the axes object that 
     * is used to call all the other higher order method using the user instance
     * of the {@link PythonConfig}.
     */
    static Axes create(PythonConfig pythonConfig) {
        return new AxesImpl(pythonConfig, false);
    }

    /**
     * This renews a figure. Make sure that this has to be put before adding plots.
     * Unless that, a new figure window will be open. It is used for 3D plots
     */
    FigureBuilder figure3D(String windowTitle);

    /**
     * This method is used to set the legend inside the figure instance. It detects
     * automatically the "labels" passed to the different instances of {@link PlotBuilder}.
     */
    LegendBuilder legend();

    /**
     * This method is used to set the title of the window containing the figure.
     * It is an easy way to pass only the window title.
     */
    TitleBuilder setTitle(String title);

    /**
     * This method is used to set the label for the x-axis 
     */
    LabelBuilder setXLabel(String label);

    /**
     * This method is used to set the label for the y-axis 
     */
    LabelBuilder setYLabel(String label);

    /**
     * This method is used to set the label for the z-axis 
     */
    LabelBuilder setZLabel(String label);

    /**
     * This method is used to enable/disable the grid for the plot 
     */
    GridBuilder grid(boolean arg);

    /**
     * This method is used to set the scale for the x-axis.
     */
    ScaleBuilder setXScale(ScaleType scale);

    /**
     * This method is used to set the scale for the y-axis.
     */
    ScaleBuilder setYScale(ScaleType scale);

    /**
     * This method is used to set the scale for the z-axis.
     */
    ScaleBuilder setZScale(ScaleType scale);

    /**
     * This method is used to set the boundaries for the x-axis.
     */
    LimitBuilder setXLim(Number xmin, Number xmax);

    /**
     * This method is used to set the boundaries for the y-axis.
     */
    LimitBuilder setYLim(Number ymin, Number ymax);

    /**
     * This method is used to set the boundaries for the z-axis.
     */
    LimitBuilder setZLim(Number ymin, Number ymax);

    /**
     * This method is used to set the ticks for the x-axis.
     */
    TicksBuilder setXTicks(List<? extends Number> ticks);

    /**
     * This method is used to set the ticks and labels for the x-axis. It is
     * important to use this method because if labels are to be applied it is 
     * mandatory that there are always some ticks to be provided.
     */
    TicksBuilder setXTicksAndLabels(List<Number> xTicks, List<String> labels);

    /**
     * This method is used to set the ticks for the y-axis.
     */
    TicksBuilder setYTicks(List<? extends Number> ticks);

    /**
     * This method is used to set the ticks and labels for the y-axis. It is
     * important to use this method because if labels are to be applied it is 
     * mandatory that there are always some ticks to be provided.
     */
    TicksBuilder setYTicksAndLabels(List<Number> yTicks, List<String> labels);

    /**
     * This method is used to set the ticks for the y-axis.
     */
    TicksBuilder setZTicks(List<? extends Number> ticks);

    /**
     * This method is used to set the ticks and labels for the z-axis. It is
     * important to use this method because if labels are to be applied it is 
     * mandatory that there are always some ticks to be provided.
     */
    TicksBuilder setZTicksAndLabels(List<Number> zTicks, List<String> labels);

    /**
     * This method is used to set some text specified by the string in a given
     * position which coordinates are given by (x, y, z). 
     */
    TextBuilder text(double x, double y, double z, String s);

    /**
     * This method is used to call the generic plot method. All the main arguments
     * and kwargs should be defined in a sequential way with additional calls on 
     * the same object.
     */
    PlotBuilder plot();

    /**
     * This method is used to call in a simplified way the plot function that is
     * creating the 3D plot given the x-coordinates, y-coordinates and z-coordinates.
     */
    PlotBuilder plot(List<? extends Number> x, List<? extends Number> y, List<? extends Number> z);

    /**
     * This method is used to call in a simplified way the plot function that is
     * creating the 3D plot given the x-coordinated, y-coordinates and z-coordinates. 
     * The user can also pass a string proving a simplified way to set linestyle and color.
     */
    PlotBuilder plot(List<? extends Number> x, List<? extends Number> y, List<? extends Number> z, String fmt);

    /**
     * This method is used to call the simplified savefig method passing the name
     * of the figure file that will be generated.
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
