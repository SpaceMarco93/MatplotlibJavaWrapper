package com.github.sh0nk.matplotlib4j.axes;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import com.github.sh0nk.matplotlib4j.PyCommand;
import com.github.sh0nk.matplotlib4j.PythonConfig;
import com.github.sh0nk.matplotlib4j.PythonExecutionException;
import com.github.sh0nk.matplotlib4j.axes.builder.AdditionalBuilderImpl;
import com.github.sh0nk.matplotlib4j.axes.builder.AxesBuilder;
import com.github.sh0nk.matplotlib4j.axes.builder.AxesBuilderImpl;
import com.github.sh0nk.matplotlib4j.axes.builder.Label3DBuilderImpl;
import com.github.sh0nk.matplotlib4j.enums.ScaleType;
import com.github.sh0nk.matplotlib4j.pyplot.builder.ArgsBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.Builder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.ContourBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.ContourBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.GridBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.GridBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.HistBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.HistBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.LabelBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.LegendBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.LegendBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.SaveFigBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.SaveFigBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.ScaleBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.ScaleBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.SubplotBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.SubplotBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.TextBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.TextBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.TicksBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.TicksBuilderImpl;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;

public class AxesImpl implements Axes {

    @VisibleForTesting
    List<Builder> registeredBuilders = new LinkedList<>();
    private List<Builder> showBuilders = new LinkedList<>();

    private final boolean dryRun;
    private final PythonConfig pythonConfig;

    AxesImpl(PythonConfig pythonConfig, boolean dryRun) {
        this.pythonConfig = pythonConfig;
        this.dryRun = dryRun;
    }

    @VisibleForTesting
    AxesImpl(boolean dryRun) {
        this(PythonConfig.systemDefaultPythonConfig(), dryRun);
    }

    @Override
    public LegendBuilder legend() {
        LegendBuilder builder = new LegendBuilderImpl();
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public GridBuilder grid() {
        GridBuilder builder = new GridBuilderImpl();
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public void figure(String windowTitle) {
        registeredBuilders.add(new ArgsBuilderImpl("figure", windowTitle));
        registeredBuilders.add(new AdditionalBuilderImpl("add_subplot", "projection", "3d"));
    }

    @Override
    public void title(String title) {
        registeredBuilders.add(new ArgsBuilderImpl("title", title));
    }

    @Override
    public LabelBuilder xlabel(String label) {
        LabelBuilder builder = Label3DBuilderImpl.xLabelBuilder(label);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public LabelBuilder ylabel(String label) {
        LabelBuilder builder = Label3DBuilderImpl.yLabelBuilder(label);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public LabelBuilder zlabel(String label) {
        LabelBuilder builder = Label3DBuilderImpl.zLabelBuilder(label);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public ScaleBuilder xscale(ScaleType scale) {
        ScaleBuilder builder = new ScaleBuilderImpl("xscale");
        registeredBuilders.add(builder.xScale(scale));
        return builder;
    }

    @Override
    public ScaleBuilder yscale(ScaleType scale) {
        ScaleBuilder builder = new ScaleBuilderImpl("yscale");
        registeredBuilders.add(builder.yScale(scale));
        return builder;
    }

    @Override
    public void xlim(Number xmin, Number xmax) {
        registeredBuilders.add(new ArgsBuilderImpl("xlim", xmin, xmax));
    }

    @Override
    public void ylim(Number ymin, Number ymax) {
        registeredBuilders.add(new ArgsBuilderImpl("ylim", ymin, ymax));
    }

    @Override
    public TicksBuilder xticks(List<? extends Number> ticks) {
        TicksBuilder builder = new TicksBuilderImpl("xticks");
        registeredBuilders.add(builder.xTicks(ticks));
        return builder;
    }

    @Override
    public TicksBuilder yticks(List<? extends Number> ticks) {
        TicksBuilder builder = new TicksBuilderImpl("yticks");
        registeredBuilders.add(builder.yTicks(ticks));
        return builder;
    }

    @Override
    public TextBuilder text(double x, double y, String s) {
        TextBuilder builder = new TextBuilderImpl();
        registeredBuilders.add(builder.add(x, y, s));
        return builder;
    }

    @Override
    public AxesBuilder plot() {
        AxesBuilder builder = new AxesBuilderImpl();
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public ContourBuilder contour() {
        ContourBuilder builder = new ContourBuilderImpl();
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public HistBuilder hist() {
        HistBuilder builder = new HistBuilderImpl();
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public SaveFigBuilder savefig(String fname) {
        SaveFigBuilder builder = new SaveFigBuilderImpl();
        registeredBuilders.add(builder.fName(fname));
        return builder;
    }

    @Override
    public SubplotBuilder subplot(int nrows, int ncols, int index) {
        SubplotBuilder builder = new SubplotBuilderImpl();
        registeredBuilders.add(builder.add(nrows, ncols, index));
        return builder;
    }

    @Override
    public void close() {
        registeredBuilders.add(new ArgsBuilderImpl("close"));
    }

    @Override
    public void close(String name) {
        registeredBuilders.add(new ArgsBuilderImpl("close", name));
    }

    @Override
    public void executeSilently() throws IOException, PythonExecutionException {
        List<String> scriptLines = new LinkedList<>();
        scriptLines.add("import numpy as np");
        scriptLines.add("import matplotlib as mpl");
        scriptLines.add("mpl.use('Agg')");
        scriptLines.add("import matplotlib.pyplot as plt");
        registeredBuilders.forEach(b -> scriptLines.add(b.build()));
        showBuilders.forEach(b -> scriptLines.add(b.build()));
        PyCommand command = new PyCommand(pythonConfig);
        command.execute(Joiner.on('\n').join(scriptLines));
    }

    /**
     * matplotlib.pyplot.show(*args, **kw)
     */
    @Override
    public void show() throws IOException, PythonExecutionException {
        List<String> scriptLines = new LinkedList<>();
        scriptLines.add("import numpy as np");
        if (dryRun) {
            // No need DISPLAY for test run
            scriptLines.add("import matplotlib as mpl");
            scriptLines.add("mpl.use('Agg')");
        }
        scriptLines.add("import matplotlib.pyplot as plt");
        scriptLines.add("ax = ".concat(registeredBuilders.get(0).build()).concat(registeredBuilders.get(1).build()));
        registeredBuilders.remove(0);
        registeredBuilders.remove(0);
        registeredBuilders.forEach(b ->  scriptLines.add(b.build()));

        // show
        if (!dryRun) {
            scriptLines.add("plt.show()");
        }

        PyCommand command = new PyCommand(pythonConfig);
        command.execute(Joiner.on('\n').join(scriptLines));

        // After showing, registered plot is cleared
        registeredBuilders.clear();
    }

}
