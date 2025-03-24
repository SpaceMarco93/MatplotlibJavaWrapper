package com.github.sh0nk.matplotlib4j.pyplot;

import com.github.sh0nk.matplotlib4j.PyCommand;
import com.github.sh0nk.matplotlib4j.PythonConfig;
import com.github.sh0nk.matplotlib4j.PythonExecutionException;
import com.github.sh0nk.matplotlib4j.enums.ScaleType;
import com.github.sh0nk.matplotlib4j.pyplot.builder.ArgsBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.AxesBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.AxesBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.Builder2D;
import com.github.sh0nk.matplotlib4j.pyplot.builder.ContourBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.ContourBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.FigureBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.FigureBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.GridBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.GridBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.HistBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.HistBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.LabelBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.LabelBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.LegendBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.LegendBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.LimitBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.LimitBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.LogLogBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.LogLogBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.PlotBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.PlotBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.QuiverBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.QuiverBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.SaveFigBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.SaveFigBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.ScaleBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.ScaleBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.SemiLogXBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.SemiLogXBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.SemiLogYBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.SemiLogYBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.SubplotBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.SubplotBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.TextBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.TextBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.TicksBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.TicksBuilderImpl;
import com.github.sh0nk.matplotlib4j.pyplot.builder.TitleBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.TitleBuilderImpl;
import com.google.common.base.Joiner;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * This class implements the relative interface {@link Plot}. All the higher order
 * methods defined in the linked documentation are implemented both in the generic
 * or simplified way.
 * 
 * https://matplotlib.org/stable/api/pyplot_summary.html
 */
public class PlotImpl implements Plot {

    // Define the list storing all the builders invoked
    protected List<Builder2D> registeredBuilders = new LinkedList<>();

    // Boolean variable to check if the default configuration is to be used
    private final boolean dryRun;

    // Instance of the PythonConfiguration provided by the user
    private final PythonConfig pythonConfig;

    // Constructor for the default configuration
    public PlotImpl(boolean dryRun) {
        this(PythonConfig.systemDefaultPythonConfig(), dryRun);
    }

    // Public full constructor
    public PlotImpl(PythonConfig pythonConfig, boolean dryRun) {
        this.pythonConfig = pythonConfig;
        this.dryRun = dryRun;
    }

    // Public method to add only the registered builders coming from another instance
    public void addRegisteredBuilders(PlotImpl plotImpl){
        this.registeredBuilders.addAll(plotImpl.registeredBuilders);
    }

    // Implementation of the higher level methods
    @Override
    public FigureBuilder figure(String windowTitle) {
        FigureBuilder builder = new FigureBuilderImpl();
        builder.figureTitle(windowTitle);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public FigureBuilder setFigure() {
        FigureBuilder builder = new FigureBuilderImpl();
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
    public TitleBuilder setTitle(String title) {
        TitleBuilder builder = new TitleBuilderImpl();
        builder.add(title);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public TitleBuilder setTitle() {
        TitleBuilder builder = new TitleBuilderImpl();
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public LabelBuilder setXLabel(String label) {
        LabelBuilder builder = new LabelBuilderImpl("xlabel");
        builder.xLabel(label);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public LabelBuilder setYLabel(String label) {
        LabelBuilder builder = new LabelBuilderImpl("ylabel");
        builder.yLabel(label);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public LabelBuilder setLabel() {
        LabelBuilder builder = new LabelBuilderImpl();
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
    public GridBuilder setGrid() {
        GridBuilder builder = new GridBuilderImpl();
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public ScaleBuilder setXScale(ScaleType scale) {
        ScaleBuilder builder = new ScaleBuilderImpl("xscale");
        builder.xScale(scale);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public ScaleBuilder setYScale(ScaleType scale) {
        ScaleBuilder builder = new ScaleBuilderImpl("yscale");
        builder.yScale(scale);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public LimitBuilder setXLim(Number xmin, Number xmax) {
        LimitBuilder builder = new LimitBuilderImpl("xlim");
        builder.xLim(xmin, xmax);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public LimitBuilder setYLim(Number ymin, Number ymax) {
        LimitBuilder builder = new LimitBuilderImpl("ylim");
        builder.yLim(ymin, ymax);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public TicksBuilder setXTicks(List<Number> xticks) {
        TicksBuilder builder = new TicksBuilderImpl("xticks");
        builder.xTicks(xticks);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public TicksBuilder setXTicksAndLabels(List<Number> xticks, List<String> labels) {
        TicksBuilder builder = new TicksBuilderImpl("xticks");
        builder.xTicks(xticks);
        builder.labels(labels);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public TicksBuilder setYTicks(List<Number> yticks) {
        TicksBuilder builder = new TicksBuilderImpl("yticks");
        builder.yTicks(yticks);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public TicksBuilder setYTicksAndLabels(List<Number> yticks, List<String> labels) {
        TicksBuilder builder = new TicksBuilderImpl("yticks");
        builder.yTicks(yticks);
        builder.labels(labels);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public TicksBuilder setTicks() {
        TicksBuilder builder = new TicksBuilderImpl();
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public TextBuilder setText(double x, double y, String s) {
        TextBuilder builder = new TextBuilderImpl();
        builder.add(x, y, s);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public TextBuilder setText() {
        TextBuilder builder = new TextBuilderImpl();
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
    public PlotBuilder plot(List<? extends Number> x, List<? extends Number> y) {
        PlotBuilder builder = new PlotBuilderImpl();
        builder.add(x, y);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public PlotBuilder plot(List<? extends Number> x, List<? extends Number> y, String fmt) {
        PlotBuilder builder = new PlotBuilderImpl();
        builder.add(x, y, fmt);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public QuiverBuilder quiver(List<Number> u, List<Number> v) {
        QuiverBuilder builder = new QuiverBuilderImpl();
        builder.add(u, v);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public QuiverBuilder quiver(List<Number> x, List<Number> y, List<Number> u, List<Number> v) {
        QuiverBuilder builder = new QuiverBuilderImpl();
        builder.add(x, y, u, v);
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
    public ContourBuilder contour(List<? extends List<? extends Number>> Z) {
        ContourBuilder builder = new ContourBuilderImpl();
        builder.add(Z);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public ContourBuilder contour(List<? extends Number> X, List<? extends Number> Y, List<? extends List<? extends Number>> Z) {
        ContourBuilder builder = new ContourBuilderImpl();
        builder.add(X, Y, Z);
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
    public HistBuilder histSingleSet(List<? extends Number> nums) {
        HistBuilder builder = new HistBuilderImpl();
        builder.addSingleSet(nums);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public HistBuilder histMultipleSets(List<? extends List<? extends Number>> nums) {
        HistBuilder builder = new HistBuilderImpl();
        builder.addMultipleSets(nums);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public LogLogBuilder logLog() {
        LogLogBuilder builder = new LogLogBuilderImpl();
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public LogLogBuilder logLog(List<? extends Number> x, List<? extends Number> y) {
        LogLogBuilder builder = new LogLogBuilderImpl();
        builder.add(x, y);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public LogLogBuilder logLog(List<? extends Number> x, List<? extends Number> y, String fmt) {
        LogLogBuilder builder = new LogLogBuilderImpl();
        builder.add(x, y, fmt);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public SemiLogXBuilder semiLogX() {
        SemiLogXBuilder builder = new SemiLogXBuilderImpl();
        registeredBuilders.add(builder);
        return builder;
    }
   
    @Override
    public SemiLogXBuilder semiLogX(List<? extends Number> x, List<? extends Number> y) {
        SemiLogXBuilder builder = new SemiLogXBuilderImpl();
        builder.add(x, y);
        registeredBuilders.add(builder);
        return builder;
    }
 
    @Override
    public SemiLogXBuilder semiLogX(List<? extends Number> x, List<? extends Number> y, String fmt) {
        SemiLogXBuilder builder = new SemiLogXBuilderImpl();
        builder.add(x, y, fmt);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public SemiLogYBuilder semiLogY() {
        SemiLogYBuilder builder = new SemiLogYBuilderImpl();
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public SemiLogYBuilder semiLogY(List<? extends Number> x, List<? extends Number> y) {
        SemiLogYBuilder builder = new SemiLogYBuilderImpl();
        builder.add(x, y);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public SemiLogYBuilder semiLogY(List<? extends Number> x, List<? extends Number> y, String fmt) {
        SemiLogYBuilder builder = new SemiLogYBuilderImpl();
        builder.add(x, y, fmt);
        registeredBuilders.add(builder);
        return builder;
    }

    @Override
    public SaveFigBuilder saveFig() {
        SaveFigBuilder builder = new SaveFigBuilderImpl();
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
    public SubplotBuilder subplot(int nrows, int ncols, int index) {
        SubplotBuilder builder = new SubplotBuilderImpl();
        builder.add(nrows, ncols, index);
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
    public AxesBuilder gca() {
        AxesBuilder builder = new AxesBuilderImpl();
        registeredBuilders.add(builder);
        return builder;
    }

    // Methods to wrap the Java code in the Python script
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
        registeredBuilders.forEach(b -> scriptLines.add(b.build()));

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
