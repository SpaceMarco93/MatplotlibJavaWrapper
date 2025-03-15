package com.github.sh0nk.matplotlib4j.pyplot.builder;

import java.util.List;

import com.github.sh0nk.matplotlib4j.enums.AlignType;
import com.github.sh0nk.matplotlib4j.enums.BinEdgesType;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.HistOrientationType;
import com.github.sh0nk.matplotlib4j.enums.HistType;
import com.github.sh0nk.matplotlib4j.pyplot.kwargs.PatchBuilder;

/**
 * This interface is defining all the *args associated to the "hist" method
 * defined in pyplot. 
 * 
 * matplotlib.pyplot.hist(x, **kwargs)
 */
public interface HistBuilder extends Builder2D, PatchBuilder<HistBuilder> {

    /**
     * Add a single set of numerical data so the {@link HistBuilder} instance.
     * <p>This method is used to add a single data set to the histogram in case
     * data have not been passed with the direct method.</p>
     * 
     * @param nums  a list containing the dataset to be plot in the histogram
     * @return  the instance of {@link HistBuilder} for method chain
     */
    HistBuilder addSingleSet(List<? extends Number> nums);

    /**
     * Add multiple sets of numerical data so the {@link HistBuilder} instance.
     * <p>This method is used to add multiple datasets to the histogram in case
     * data have not been passed with the direct method.</p>
     * 
     * @param nums  a list containing the datasets to be plot in the histogram
     * @return  the instance of {@link HistBuilder} for method chain
     */
    HistBuilder addMultipleSets(List<? extends List<? extends Number>> nums);

    /**
     * Set the number of equal-width bins in the range.
     * <p>If bins is an integer, it defines the number of equal-width bins in the
     * range.</p>
     * 
     * @param arg   the number of equal-width bins in the range
     * @return  the instance of {@link HistBuilder} for method chain
     */
    HistBuilder bins(int arg);

    /**
     * Set the number of equal-width bins in the range.
     * <p>If bins is a sequence, it defines the bin edges, including the left edge 
     * of the first bin and the right edge of the last bin.</p>
     * 
     * @param arg   the list of bin edges
     * @return  the instance of {@link HistBuilder} for method chain   
     */
    HistBuilder bins(List<? extends Integer> nums);

    /**
     * Set the bins strategy.
     * <p> If bins is a string, it is one of the binning strategies supported.</p>
     * 
     * @param arg   an instance of the {@link BinEdgesType} enum defining the strategy
     * @return  the instance of {@link HistBuilder} for method chain     
     */
    HistBuilder bins(BinEdgesType arg);

    /**
     * Set the lower and upper range of the bins.
     * <p>This method is used to set the lower and upper range of the bins. The 
     * lower and upper range of the bins. Lower and upper outliers are ignored. </p>
     * <p>If not provided, range is (x.min(), x.max()). Range has no effect if 
     * bins is a sequence. If bins is a sequence or range is specified, autoscaling 
     * is based on the specified bin range instead of the range of x.</p>
     * 
     * @param lower     the lower range of the bins
     * @param upper     the upper range of the bins
     * @return  the instance of {@link HistBuilder} for method chain    
     */
    HistBuilder range(double lower, double upper);

    /**
     * Set if a probability density is to be drawn.
     * <p>If True, draw and return a probability density: each bin will display 
     * the bin's raw count divided by the total number of counts. </p>
     * <p>If stacked is also True, the sum of the histograms is normalized to 1.</p>
     * 
     * @param arg   boolean variable to select if a probability density is drawn
     * @return  the instance of {@link HistBuilder} for method chain    
     */
    HistBuilder density(boolean arg);

    /**
     * Set the weight for the dataset used in the histogram.
     * <p>An array of weights, of the same shape as x. Each value in x only 
     * contributes its associated weight towards the bin count (instead of 1).</p>
     * <p>If density is True, the weights are normalized, so that the integral of 
     * the density over the range remains 1.</p>
     * 
     * @param nums  the list of weight to be applied to the dataset
     * @return  the instance of {@link HistBuilder} for method chain 
     */
    HistBuilder weights(List<? extends Number> nums);

    /**
     * Set if the cumulative mode is used or not.
     * <p>If True, then a histogram is computed where each bin gives the counts 
     * in that bin plus all bins for smaller values. The last bin gives the total 
     * number of datapoints.</p>
     * If density is also True then the histogram is normalized such that the last 
     * bin equals 1. </p>
     * 
     * @param arg   boolean variable to select if the cumulative mode is enabled
     * @return  the instance of {@link HistBuilder} for method chain 
     */
    HistBuilder cumulative(boolean arg);

    /**
     * Set the location of the bottom of each bin.
     * <p>If a scalar, the bottom of each bin is shifted by the same amount.</p>
     * 
     * @param arg   the shift to be applied to the bottom of each bin
     * @return  the instance of {@link HistBuilder} for method chain
     */
    HistBuilder bottom(double arg);

    /**
     * Set the location of the bottom of each bin. 
     * <p>If an array, each bin is shifted independently and the length of 
     * bottom must match the number of bins.</p>
     * 
     * @param nums   the list of shifts to be applied to the bottom of each bin
     * @return  the instance of {@link HistBuilder} for method chain
     */
    HistBuilder bottom(List<? extends Number> nums);

    /**
     * Set the type of histogram to be drawn.
     * 
     * @param arg   an instance of the {@link HistType} enum defining the histogram type
     * @return  the instance of {@link HistBuilder} for method chain
     */
    HistBuilder histType(HistType arg);

    /**
     * Set the horizontal alignment of the histogram bars.
     * 
     * @param arg   an instance of the {@link AlignType} enum defining the alignment type
     * @return  the instance of {@link HistBuilder} for method chain
     */ 
    HistBuilder align(AlignType arg);

    /**
     * Set the histogram orientation.
     * <p>If 'horizontal', barh will be used for bar-type histograms and the 
     * bottom kwarg will be the left edges.</p>
     * 
     * @param arg   an instance of the {@link HistOrientationType} enum defining 
     *              the orientation type
     * @return  the instance of {@link HistBuilder} for method chain
     */
    HistBuilder orientation(HistOrientationType arg);

    /**
     * Set the relative width of the bars as a fraction of the bin width.
     * <p>Ignored if histtype is 'step' or 'stepfilled'.</p>
     * 
     * @param arg   the relative width of the bars
     * @return  the instance of {@link HistBuilder} for method chain
     */
    HistBuilder rWidth(double arg);

    /**
     * Set if the histogram axes have logarithmic scale.
     * <p>If True, the histogram axis will be set to a log scale. </p>
     * 
     * @param arg   boolean variable to enable/disable logarithmic scale
     * @return  the instance of {@link HistBuilder} for method chain
     */
    HistBuilder log(boolean arg);

    /**
     * Set the color for all the datasets.
     * 
     * @param arg   an instance of the {@link ColorType} enum defining the color
     *              of all the dataset 
     * @return  the instance of {@link HistBuilder} for method chain
     */
    HistBuilder color(ColorType arg);

    /**
     * Set the color for each dataset.
     * 
     * @param arg   an array of {@link ColorType} objects defining a specific color
     *              for each dataset 
     * @return  the instance of {@link HistBuilder} for method chain
     */
    HistBuilder color(ColorType... args);

    /**
     * Set the label for all the datasets.
     * 
     * @param arg   a string providing the label for all the datasets
     * @return  the instance of {@link HistBuilder} for method chain
     */
    HistBuilder label(String arg);

    /**
     * Set the labels for each dataset.
     * 
     * @param arg   an array of string defining a specific label for each dataset 
     * @return  the instance of {@link HistBuilder} for method chain
     */
    HistBuilder label(String... args);

    /**
     * Set if bars should be on top of the other or side-by-side.
     * <p>If True, multiple data are stacked on top of each other If False multiple 
     * data are arranged side by side if histtype is 'bar' or on top of each other 
     * if histtype is 'step'</p>.
     * 
     * @param arg   boolean variable to select if the bars are stacked or not
     * @return  the instance of {@link HistBuilder} for method chain
     */
    HistBuilder stacked(boolean arg);

}
