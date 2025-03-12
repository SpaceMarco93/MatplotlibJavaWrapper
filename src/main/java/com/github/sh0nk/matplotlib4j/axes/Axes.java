package com.github.sh0nk.matplotlib4j.axes;

import java.io.IOException;
import java.util.List;

import com.github.sh0nk.matplotlib4j.PythonConfig;
import com.github.sh0nk.matplotlib4j.PythonExecutionException;
import com.github.sh0nk.matplotlib4j.axes.builder.AxesBuilder;
import com.github.sh0nk.matplotlib4j.enums.ScaleType;
import com.github.sh0nk.matplotlib4j.pyplot.builder.ContourBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.GridBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.HistBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.LabelBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.LegendBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.SaveFigBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.ScaleBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.SubplotBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.TextBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.TicksBuilder;

public interface Axes {

    static Axes create() {
        return new AxesImpl(PythonConfig.systemDefaultPythonConfig(), false);
    }

    static Axes create(PythonConfig pythonConfig) {
        return new AxesImpl(pythonConfig, false);
    }

    LegendBuilder legend();

    /**
     * This renews a figure. Make sure that this has to be put before adding plots.
     * Unless that, a new figure window will be open.
     */
    void figure(String windowTitle);

    void title(String title);

    LabelBuilder xlabel(String label);

    LabelBuilder ylabel(String label);

    LabelBuilder zlabel(String label);

    GridBuilder grid();

    ScaleBuilder xscale(ScaleType scale);

    ScaleBuilder yscale(ScaleType scale);

    void xlim(Number xmin, Number xmax);

    void ylim(Number ymin, Number ymax);

    TicksBuilder xticks(List<? extends Number> ticks);

    TicksBuilder yticks(List<? extends Number> ticks);

    TextBuilder text(double x, double y, String s);

    AxesBuilder plot();

    ContourBuilder contour();

    HistBuilder hist();

    SaveFigBuilder savefig(String fname);

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
     * matplotlib.pyplot.show(*args, **kw)
     */
    void show() throws IOException, PythonExecutionException;

}
