package com.github.sh0nk.matplotlib4j.pyplot;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.github.sh0nk.matplotlib4j.PythonExecutionException;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class SaveFigTest {

    private static final boolean DRY_RUN = true;

    @Test
    @Ignore("Only for local, could be supported by CI")
    public void testSaveFig() throws IOException, PythonExecutionException {
        File tmpFile = File.createTempFile("savefig", ".png");
        tmpFile.deleteOnExit();

        Plot plt = new PlotImpl(DRY_RUN);
        plt.plot().add(Arrays.asList(1.3, 2));
        plt.title("Title!");
        plt.saveFig(tmpFile.getAbsolutePath());
        plt.executeSilently();

        Assert.assertTrue(tmpFile.exists());
    }

    @Test
    @Ignore("Only for local, could be supported by CI")
    public void testSaveFigTwice() throws IOException, PythonExecutionException {
        File tmpFile = File.createTempFile("savefig", ".png");
        File tmpFile2 = File.createTempFile("savefig2", ".png");
        tmpFile.deleteOnExit();
        tmpFile2.deleteOnExit();

        Plot plt = new PlotImpl(DRY_RUN);
        plt.plot().add(Arrays.asList(1.3, 2));
        plt.title("Title!");
        plt.saveFig(tmpFile.getAbsolutePath());
        plt.saveFig(tmpFile2.getAbsolutePath());
        plt.executeSilently();

        Assert.assertTrue(tmpFile.exists());
        Assert.assertTrue(tmpFile2.exists());
    }

    @Test
    @Ignore("Only for local, could be supported by CI")
    public void testSaveFigTwiceWithClose() throws IOException, PythonExecutionException {
        File tmpFile = File.createTempFile("savefig", ".png");
        File tmpFile2 = File.createTempFile("savefig2", ".png");
        tmpFile.deleteOnExit();
        tmpFile2.deleteOnExit();

        Plot plt = new PlotImpl(DRY_RUN);
        plt.plot().add(Arrays.asList(1.3, 2));
        plt.title("Title1");
        plt.saveFig(tmpFile.getAbsolutePath());
        plt.close();

        plt.plot().add(Arrays.asList(1.3, -2));
        plt.title("Title2");
        plt.saveFig(tmpFile2.getAbsolutePath());
        plt.executeSilently();

        Assert.assertTrue(tmpFile.exists());
        Assert.assertTrue(tmpFile2.exists());
    }

    @Test
    @Ignore("Only for local, could be supported by CI")
    public void testCallExecuteTwice() throws IOException, PythonExecutionException {
        File tmpFile = File.createTempFile("savefig", ".png");
        tmpFile.deleteOnExit();

        Plot plt = new PlotImpl(DRY_RUN);
        plt.plot().add(Arrays.asList(1.3, 2));
        plt.title("Title!");
        plt.saveFig(tmpFile.getAbsolutePath());
        plt.executeSilently();
        plt.executeSilently();

        Assert.assertTrue(tmpFile.exists());
    }

    @Test
    @Ignore("Only for local, could be supported by CI")
    public void testSaveFigNoImpactToShow() throws IOException, PythonExecutionException {
        File tmpFile = File.createTempFile("savefig", ".png");
        tmpFile.deleteOnExit();

        Plot plt = new PlotImpl(DRY_RUN);
        plt.plot().add(Arrays.asList(1.3, 2));
        plt.title("Title!");
        plt.saveFig(tmpFile.getAbsolutePath());
        plt.executeSilently();
        plt.show();

        Assert.assertTrue(tmpFile.exists());
    }

    @Test
    @Ignore("Only for local, could be supported by CI")
    public void testSaveFigAfterShowHasNoFigure() throws IOException, PythonExecutionException {
        File tmpFile = File.createTempFile("savefig", ".png");
        tmpFile.deleteOnExit();

        Plot plt = new PlotImpl(DRY_RUN);
        plt.plot().add(Arrays.asList(1.3, 2));
        plt.title("Title!");
        plt.saveFig(tmpFile.getAbsolutePath());
        plt.show();

        Assert.assertEquals(0, ((PlotImpl) plt).registeredBuilders.size());
        plt.executeSilently();

        Assert.assertTrue(tmpFile.exists());
    }


}
