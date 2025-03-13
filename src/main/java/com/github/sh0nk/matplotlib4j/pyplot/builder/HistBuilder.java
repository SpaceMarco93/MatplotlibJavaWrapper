package com.github.sh0nk.matplotlib4j.pyplot.builder;

import java.util.List;

import com.github.sh0nk.matplotlib4j.enums.AlignType;
import com.github.sh0nk.matplotlib4j.enums.BinEdgesType;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.HistOrientationType;
import com.github.sh0nk.matplotlib4j.enums.HistType;
import com.github.sh0nk.matplotlib4j.pyplot.kwargs.PatchBuilder;

/**
 * matplotlib.pyplot.hist(x, **kwargs)
 */
public interface HistBuilder extends Builder2D, PatchBuilder<HistBuilder> {

    // Input values, this takes either a single array
    HistBuilder addSingleSet(List<? extends Number> nums);

    // Input values, this takes either a single array sequence of arrays
    HistBuilder addMultipleSets(List<? extends List<? extends Number>> nums);

    // If bins is an integer, it defines the number of equal-width bins in the range.
    HistBuilder bins(int arg);

    /**
     * If bins is a sequence, it defines the bin edges, including the left edge 
     * of the first bin and the right edge of the last bin.
     */
    HistBuilder bins(List<? extends Integer> nums);

    /**
     * If bins is a string, it is one of the binning strategies supported.
     */
    HistBuilder bins(BinEdgesType arg);

    // The lower and upper range of the bins. It has no effect if bins is a sequence.
    HistBuilder range(double lower, double upper);

    // If True, draw and return a probability density
    HistBuilder density(boolean arg);

    // An array of weights, of the same shape as x.
    HistBuilder weights(List<? extends Number> nums);

    /**
     * If True, then a histogram is computed where each bin gives the counts in 
     * that bin plus all bins for smaller values
     */  
    HistBuilder cumulative(boolean arg);

    /**
     * Location of the bottom of each bin. If a scalar, the bottom of each bin 
     * is shifted by the same amount. 
     */
    HistBuilder bottom(double arg);

    /**
     * Location of the bottom of each bin. If an array, each bin is shifted 
     * independently and the length of bottom must match the number of bins.
     */
    HistBuilder bottom(List<? extends Number> nums);

    // The type of histogram to draw.
    HistBuilder histType(HistType arg);

    // The horizontal alignment of the histogram bars.
    HistBuilder align(AlignType arg);

    // If 'horizontal', barh will be used for bar-type histograms
    HistBuilder orientation(HistOrientationType arg);

    // The relative width of the bars as a fraction of the bin width.
    HistBuilder rWidth(double arg);

    // The relative width of the bars as a fraction of the bin width.
    HistBuilder log(boolean arg);

    // Color or sequence of colors, one per dataset.
    HistBuilder color(ColorType arg);

    // Color or sequence of colors, one per dataset.
    HistBuilder color(ColorType... args);

    // String, or sequence of strings to match multiple datasets
    HistBuilder label(String arg);

    // String, or sequence of strings to match multiple datasets
    HistBuilder label(String... args);

    /**
     * If True, multiple data are stacked on top of each other If False multiple 
     * data are arranged side by side if histtype is 'bar' or on top of each other 
     * if histtype is 'step'
     */
    HistBuilder stacked(boolean arg);

}
