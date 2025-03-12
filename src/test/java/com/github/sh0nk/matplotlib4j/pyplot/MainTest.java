package com.github.sh0nk.matplotlib4j.pyplot;

import com.github.sh0nk.matplotlib4j.NumpyUtils;
import com.github.sh0nk.matplotlib4j.PythonExecutionException;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.HistOrientationType;
import com.github.sh0nk.matplotlib4j.enums.LocationType;
import com.github.sh0nk.matplotlib4j.enums.ScaleType;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainTest {

    private static final boolean DRY_RUN = true;

    private final static Logger LOGGER = LoggerFactory.getLogger(MainTest.class);
    
    @Test
    @Ignore("Only for local, could be supported by CI")
    public void testPlot() throws IOException, PythonExecutionException {
        Plot plt = new PlotImpl(DRY_RUN);
        plt.plot()
           .add(Arrays.asList(1.3, 2))
           .label("label")
           .lineStyle("--");
        plt.xLabel("xlabel");
        plt.yLabel("ylabel");
        plt.text(0.5, 0.2, "text");
        plt.title("Title!");
        plt.setLegend();
        plt.show();
    }

    @Test
    @Ignore("Only for local, could be supported by CI")
    public void testPlotLogScale() throws IOException, PythonExecutionException {
        Plot plt = new PlotImpl(DRY_RUN);
        plt.plot()
           .add(Arrays.asList(1.3, 20, 200, 300, 400, 1000), Arrays.asList(1, 4, 10, 20, 100, 800))
           .label("label")
           .lineStyle("--")
           .lineWidth(2.0);
        plt.xScale(ScaleType.LOG);
        plt.yScale(ScaleType.LOG);
        plt.xLabel("xlabel");
        plt.yLabel("ylabel");
        plt.text(0.5, 0.2, "text");
        plt.title("Title!");
        plt.setLegend();
        plt.show();
    }

    @Test
    @Ignore("Only for local, could be supported by CI")
    public void testPlotSin() throws IOException, PythonExecutionException {
        List<Double> x = IntStream.range(0, 100).boxed()
                .map(Integer::doubleValue)
                .map(d -> d / 15).collect(Collectors.toList());
        List<Double> y = x.stream().map(Math::sin).collect(Collectors.toList());

        Plot plt = new PlotImpl(DRY_RUN);
        plt.plot()
                .add(x, y)
                .label("sin")
                .lineStyle("--");
        plt.xLim(1.0, 5.0);
        plt.setTicks().xTicks(Arrays.asList(Math.PI / 2, Math.PI, Math.PI * 3 / 2))
                .labels(Arrays.asList("$\\pi/2$", "$\\pi$", "$3\\pi/2$"));
        plt.title("sin curve");
        plt.setLegend().loc(LocationType.UPPER_RIGHT);
        plt.show();
    }

    @Test
    @Ignore("Only for local, could be supported by CI")
    public void testPlotScatter() throws IOException, PythonExecutionException {
        List<Double> x = NumpyUtils.linspace(-3, 3, 100);
        List<Double> y = x.stream().map(xi -> Math.sin(xi) + Math.random()).collect(Collectors.toList());

        Plot plt = new PlotImpl(DRY_RUN);
        plt.plot().add(x, y, "o").label("sin");
        plt.title("scatter");
        plt.setLegend().loc(LocationType.UPPER_RIGHT);
        plt.show();
    }

    @Test
    @Ignore("Only for local, could be supported by CI")
    public void testPlotContour() throws IOException, PythonExecutionException {
        List<Double> x = NumpyUtils.linspace(-1, 1, 100);
        List<Double> y = NumpyUtils.linspace(-1, 1, 100);
        NumpyUtils.Grid<Double> grid = NumpyUtils.meshgrid(x, y);
        LOGGER.info("grid.x {}, grid.y {}", grid.x, grid.y);

        List<List<Double>> zCalced = grid.calcZ((xi, yj) -> Math.sqrt(xi * xi + yj * yj));

        Plot plt = new PlotImpl(DRY_RUN);
        plt.contour().add(x, y, zCalced);
        plt.title("contour");
        plt.setLegend().loc(LocationType.UPPER_RIGHT);
        plt.show();
    }

    @Test
    @Ignore("Only for local, could be supported by CI")
    public void testPlotPColor() throws IOException, PythonExecutionException {
        List<Double> x = NumpyUtils.linspace(-1, 1, 100);
        List<Double> y = NumpyUtils.linspace(-1, 1, 100);
        NumpyUtils.Grid<Double> grid = NumpyUtils.meshgrid(x, y);
        LOGGER.info("grid.x {}, grid.y {}", grid.x, grid.y);

        grid.calcZ((xi, yj) -> Math.sqrt(xi * xi + yj * yj));

        Plot plt = new PlotImpl(DRY_RUN);
        plt.title("pcolor");
        plt.setLegend().loc(LocationType.UPPER_RIGHT);
        plt.show();
    }

    @Test
    @Ignore("Only for local, could be supported by CI")
    public void testPlotOneHistogram() throws IOException, PythonExecutionException {
        Random rand = new Random();
        List<Double> x = IntStream.range(0, 1000).mapToObj(i -> rand.nextGaussian())
                .collect(Collectors.toList());

        Plot plt = new PlotImpl(DRY_RUN);
        plt.hist().addSingleSet(x).orientation(HistOrientationType.HORIZONAL);
        plt.yLim(-5, 5);
        plt.title("histogram");
        plt.setLegend().loc(LocationType.UPPER_RIGHT);
        plt.show();
    }

    @Test
    @Ignore("Only for local, could be supported by CI")
    public void testPlotTwoHistogram() throws IOException, PythonExecutionException {
        Random rand = new Random();
        List<Double> x1 = IntStream.range(0, 1000).mapToObj(i -> rand.nextGaussian())
                .collect(Collectors.toList());
        List<Double> x2 = IntStream.range(0, 1000).mapToObj(i -> 4.0 + rand.nextGaussian())
                .collect(Collectors.toList());

        Plot plt = new PlotImpl(DRY_RUN);
        plt.hist().addSingleSet(x1).addSingleSet(x2).bins(20).stacked(true).color(ColorType.BLACK, ColorType.EGG_SHELL).range(3, 5);
        plt.xLim(-6, 10);
        plt.title("histogram");
        plt.setLegend().loc(LocationType.UPPER_RIGHT);
        plt.show();
    }

    @Test(expected = IllegalArgumentException.class)
    @Ignore("Only for local, could be supported by CI")
    public void testPlotHistogramNoXError() throws IOException, PythonExecutionException {

        Plot plt = new PlotImpl(DRY_RUN);
        plt.hist();
        plt.xLim(-5, 5);
        plt.title("histogram");
        plt.setLegend().loc(LocationType.UPPER_RIGHT);
        plt.show();
    }

    @Test
    @Ignore("Only for local, could be supported by CI")
    public void testBoundaryValuesCauseNoException() throws IOException, PythonExecutionException {
        Plot plt = new PlotImpl(DRY_RUN);
        plt.plot().add(Arrays.asList(1.3, 0x66, null, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY))
                .add(Arrays.asList(null, -3.2e-8, 1, Double.NaN, Double.NaN));
        plt.show();
    }

    @Test
    @Ignore("Only for local, could be supported by CI")
    public void testShowTwiceClearFirstPlot() throws IOException, PythonExecutionException {
        // TODO: Check .plot() or so is not called twice on the second run script

        Plot plt = new PlotImpl(DRY_RUN);
        plt.plot().add(Arrays.asList(1.3, 2));
        plt.title("Title!");
        plt.setLegend();
        plt.show();

        Assert.assertEquals(0, ((PlotImpl) plt).registeredBuilders.size());
        plt.show();
    }

    @Test
    @Ignore("Only for local, could be supported by CI")
    public void testSubplots() throws IOException, PythonExecutionException {
        Plot plt = new PlotImpl(DRY_RUN);

        plt.subplot(2, 1, 1);
        plt.plot()
            .add(Arrays.asList(1, 2, 3), Arrays.asList(1, 4, 9));

        plt.subplot(2, 1, 2);
        plt.plot()
            .add(Arrays.asList(1, 2, 3), Arrays.asList(1, -8, 27));

        plt.show();
    }
}
