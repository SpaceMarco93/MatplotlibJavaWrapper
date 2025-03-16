package com.github.sh0nk.matplotlib4j.axes;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import com.github.sh0nk.matplotlib4j.PyCommand;
import com.github.sh0nk.matplotlib4j.PythonConfig;
import com.github.sh0nk.matplotlib4j.PythonExecutionException;
import com.github.sh0nk.matplotlib4j.axes.builder.ArgsBuilderImpl;
import com.github.sh0nk.matplotlib4j.axes.builder.AxesBuilder;
import com.github.sh0nk.matplotlib4j.axes.builder.AxesBuilderImpl;
import com.github.sh0nk.matplotlib4j.axes.builder.Builder3D;
import com.github.sh0nk.matplotlib4j.axes.builder.FigureBuilder;
import com.github.sh0nk.matplotlib4j.axes.builder.FigureBuilderImpl;
import com.github.sh0nk.matplotlib4j.axes.builder.GridBuilder;
import com.github.sh0nk.matplotlib4j.axes.builder.GridBuilderImpl;
import com.github.sh0nk.matplotlib4j.axes.builder.LabelBuilder;
import com.github.sh0nk.matplotlib4j.axes.builder.LabelBuilderImpl;
import com.github.sh0nk.matplotlib4j.axes.builder.LegendBuilder;
import com.github.sh0nk.matplotlib4j.axes.builder.LegendBuilderImpl;
import com.github.sh0nk.matplotlib4j.axes.builder.LimitBuilder;
import com.github.sh0nk.matplotlib4j.axes.builder.LimitBuilderImpl;
import com.github.sh0nk.matplotlib4j.axes.builder.PlotBuilder;
import com.github.sh0nk.matplotlib4j.axes.builder.PlotBuilderImpl;
import com.github.sh0nk.matplotlib4j.axes.builder.SaveFigBuilder;
import com.github.sh0nk.matplotlib4j.axes.builder.SaveFigBuilderImpl;
import com.github.sh0nk.matplotlib4j.axes.builder.ScaleBuilder;
import com.github.sh0nk.matplotlib4j.axes.builder.ScaleBuilderImpl;
import com.github.sh0nk.matplotlib4j.axes.builder.TextBuilder;
import com.github.sh0nk.matplotlib4j.axes.builder.TextBuilderImpl;
import com.github.sh0nk.matplotlib4j.axes.builder.TicksBuilder;
import com.github.sh0nk.matplotlib4j.axes.builder.TicksBuilderImpl;
import com.github.sh0nk.matplotlib4j.axes.builder.TitleBuilder;
import com.github.sh0nk.matplotlib4j.axes.builder.TitleBuilderImpl;
import com.github.sh0nk.matplotlib4j.enums.AspectType;
import com.github.sh0nk.matplotlib4j.enums.ScaleType;
import com.google.common.base.Joiner;

/**
 * This class implements the relative interface {@link Axes}. All the higher order
 * methods defined in the linked documentation are implemented both in the generic
 * or simplified way.
 * 
 * https://matplotlib.org/stable/api/_as_gen/matplotlib.axes.Axes.html
 */
public class AxesImpl implements Axes {

    // Define the list storing all the builders invoked
    protected List<Builder3D> registeredBuilders = new LinkedList<>();

    // Boolean variable to check if the default configuration is to be used
    private final boolean dryRun;

    // Instance of the PythonConfiguration provided by the user
    private final PythonConfig pythonConfig;

    // Constructor for the default configuration
    public AxesImpl(PythonConfig pythonConfig, boolean dryRun) {
        this.pythonConfig = pythonConfig;
        this.dryRun = dryRun;
    }

    // Public full constructor
    public AxesImpl(boolean dryRun) {
        this(PythonConfig.systemDefaultPythonConfig(), dryRun);
    }

    // Public method to add only the registered builders coming from another instance
    public void addRegisteredBuilders(AxesImpl axesImpl){
        this.registeredBuilders.addAll(axesImpl.registeredBuilders);
    }

    @Override
    public FigureBuilder figure3D(String windowTitle) {
        FigureBuilder builder = new FigureBuilderImpl("ax = ", ".add_subplot(projection='3d')");
        builder.figureTitle(windowTitle);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public LegendBuilder setLegend() {
        LegendBuilder builder = new LegendBuilderImpl();
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public GridBuilder setGrid(boolean arg) {
        GridBuilder builder = new GridBuilderImpl();
        builder.visible(arg);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public TitleBuilder setTitle(String title) {
        TitleBuilder builder = new TitleBuilderImpl();
        builder.add(title);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public LabelBuilder setXLabel(String label) {
        LabelBuilder builder = new LabelBuilderImpl("set_xlabel");
        builder.xLabel(label);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public LabelBuilder setYLabel(String label) {
        LabelBuilder builder = new LabelBuilderImpl("set_ylabel");
        builder.yLabel(label);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public LabelBuilder setZLabel(String label) {
        LabelBuilder builder = new LabelBuilderImpl("set_zlabel");
        builder.zLabel(label);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public ScaleBuilder setXScale(ScaleType scale) {
        ScaleBuilder builder = new ScaleBuilderImpl("set_xscale");
        builder.xScale(scale);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public ScaleBuilder setYScale(ScaleType scale) {
        ScaleBuilder builder = new ScaleBuilderImpl("set_yscale");
        builder.yScale(scale);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public ScaleBuilder setZScale(ScaleType scale) {
        ScaleBuilder builder = new ScaleBuilderImpl("set_zscale");
        builder.zScale(scale);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public LimitBuilder setXLim(Number xmin, Number xmax) {
        LimitBuilder builder = new LimitBuilderImpl("set_xlim");
        builder.xLim(xmin, xmax);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public LimitBuilder setYLim(Number ymin, Number ymax) {
        LimitBuilder builder = new LimitBuilderImpl("set_ylim");
        builder.yLim(ymin, ymax);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public LimitBuilder setZLim(Number zmin, Number zmax) {
        LimitBuilder builder = new LimitBuilderImpl("set_zlim");
        builder.zLim(zmin, zmax);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public TicksBuilder setXTicks(List<? extends Number> ticks) {
        TicksBuilder builder = new TicksBuilderImpl("set_xticks");
        builder.xTicks(ticks);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public TicksBuilder setXTicksAndLabels(List<Number> xTicks, List<String> labels) {
        TicksBuilder builder = new TicksBuilderImpl("set_xticks");
        builder.xTicks(xTicks);
        builder.labels(labels);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public TicksBuilder setYTicks(List<? extends Number> ticks) {
        TicksBuilder builder = new TicksBuilderImpl("set_yticks");
        builder.yTicks(ticks);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public TicksBuilder setYTicksAndLabels(List<Number> yTicks, List<String> labels) {
        TicksBuilder builder = new TicksBuilderImpl("set_yticks");
        builder.yTicks(yTicks);
        builder.labels(labels);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public TicksBuilder setZTicks(List<? extends Number> ticks) {
        TicksBuilder builder = new TicksBuilderImpl("set_zticks");
        builder.zTicks(ticks);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public TicksBuilder setZTicksAndLabels(List<Number> zTicks, List<String> labels) {
        TicksBuilder builder = new TicksBuilderImpl("set_zticks");
        builder.zTicks(zTicks);
        builder.labels(labels);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public TextBuilder setText(double x, double y, double z, String s) {
        TextBuilder builder = new TextBuilderImpl();
        builder.add(x, y, z, s);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public PlotBuilder plot() {
        PlotBuilder builder = new PlotBuilderImpl();
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public PlotBuilder plot(List<? extends Number> x, List<? extends Number> y, List<? extends Number> z) {
        PlotBuilder builder = new PlotBuilderImpl();
        builder.add(x, y, z);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public PlotBuilder plot(List<? extends Number> x, List<? extends Number> y, List<? extends Number> z, String fmt) {
        PlotBuilder builder = new PlotBuilderImpl();
        builder.add(x, y, z, fmt);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public SaveFigBuilder saveFig(String fname) {
        SaveFigBuilder builder = new SaveFigBuilderImpl();
        builder.fName(fname);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public AxesBuilder setAspect(AspectType arg) {
        AxesBuilder builder = new AxesBuilderImpl();
        builder.setAspect(arg);
        registeredBuilders.add(builder);
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
