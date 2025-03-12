package com.github.sh0nk.matplotlib4j.pyplot.builder;

import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.FontSizeType;
import com.github.sh0nk.matplotlib4j.enums.HorizonalAlighmentType;
import com.github.sh0nk.matplotlib4j.enums.LocationType;

/**
 * This class is implementing all the methods defined in the relative interface
 * {@link LegendBuilder}.
 * The first section defines the @Override of all the *args associated to this
 * method, while the second section invokes all the **kwargs which are imported
 * by the related object.
 */
public class LegendBuilderImpl implements LegendBuilder {

    // Variable defining the builder for the main method
    private CompositeBuilder<LegendBuilder> innerBuilder = new CompositeBuilder<>(this);

    // Public constructor
    public LegendBuilderImpl() {}

    // *args section
    @Override
    public LegendBuilder loc(LocationType arg) {
        return innerBuilder.addToKwargs("loc", arg.getLocation());
    }

    @Override
    public LegendBuilder nCols(int arg) {
        return innerBuilder.addToKwargs("ncols", arg);
    }

    @Override
    public LegendBuilder fontSize(FontSizeType arg) {
        return innerBuilder.addToKwargs("fontsize", arg.getFontSize());
    }

    @Override
    public LegendBuilder labelColor(ColorType arg) {
        return innerBuilder.addToKwargs("labelcolor", arg.getColor());
    }

    @Override
    public LegendBuilder numPoints(int arg) {
        return innerBuilder.addToKwargs("numpoints", arg);
    }

    @Override
    public LegendBuilder frameAlpha(double arg) {
        return innerBuilder.addToKwargs("framealpha", arg);
    }

    @Override
    public LegendBuilder edgeColor(ColorType arg) {
        return innerBuilder.addToKwargs("edgecolor", arg.getColor());
    }

    @Override
    public LegendBuilder faceColor(ColorType arg) {
        return innerBuilder.addToKwargs("facecolor", arg.getColor());
    }

    @Override
    public LegendBuilder alignment(HorizonalAlighmentType arg) {
        return innerBuilder.addToKwargs("alignment", arg.getHorizontalAlignment());
    }

    @Override
    public LegendBuilder labelSpacing(double arg) {
        return innerBuilder.addToKwargs("labelspacing", arg);
    }

    @Override
    public LegendBuilder columnSpacing(double arg) {
        return innerBuilder.addToKwargs("columnspacing", arg);
    }

    @Override
    public LegendBuilder draggable(boolean arg) {
        return innerBuilder.addToKwargs("draggable", arg);
    }

    // Implement the builder interface methods
    @Override
    public String build() {
        return innerBuilder.build();
    }

    @Override
    public String getMethodName() {
        return "legend";
    }

}
