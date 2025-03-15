package com.github.sh0nk.matplotlib4j.pyplot.builder;

import com.github.sh0nk.matplotlib4j.enums.AlignType;
import com.github.sh0nk.matplotlib4j.enums.BinEdgesType;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.HistOrientationType;
import com.github.sh0nk.matplotlib4j.enums.HistType;
import com.github.sh0nk.matplotlib4j.enums.LineStyleType;
import com.github.sh0nk.matplotlib4j.pyplot.kwargs.PatchBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.kwargs.PatchBuilderImpl;
import com.google.common.base.Joiner;
import java.util.List;

/**
 * This class is implementing all the methods defined in the relative interface
 * {@link HistBuilder}.
 * The first section defines the @Override of all the *args associated to this
 * method, while the second section invokes all the **kwargs which are imported
 * by the related object.
 */
public class HistBuilderImpl implements HistBuilder {

    // Variable defining the builder for the main method
    private final CompositeBuilder<HistBuilder> innerBuilder = new CompositeBuilder<>(this);

    // Variable defining the builder for all the **kwargs
    private final PatchBuilder<HistBuilder> kwargsBuilder = new PatchBuilderImpl<>(innerBuilder);

    // Public constructor
    public HistBuilderImpl() {}

    // *args section
    @Override
    public HistBuilder addSingleSet(List<? extends Number> nums) {
        return innerBuilder.addToArgs(nums);
    }

    @Override
    public HistBuilder addMultipleSets(List<? extends List<? extends Number>> nums) {
        return innerBuilder.addToArgsWithoutQuoting("[np.array(" + Joiner.on("),np.array(").join(nums) + ")]");
    }

    @Override
    public HistBuilder bins(int arg) {
        return innerBuilder.addToKwargs("bins", arg);
    }

    @Override
    public HistBuilder bins(List<? extends Integer> nums) {
        return innerBuilder.addToKwargs("bins", nums);
    }

    @Override
    public HistBuilder bins(BinEdgesType arg) {
        return innerBuilder.addToKwargs("bins", arg.getBinEdges());
    }

    @Override
    public HistBuilder range(double lower, double upper) {
        return innerBuilder.addToKwargsWithoutQuoting("range", String.format("(%f, %f)", lower, upper));
    }

    @Override
    public HistBuilder density(boolean arg) {
        return innerBuilder.addToKwargs("density", arg);
    }

    @Override
    public HistBuilder weights(List<? extends Number> nums) {
        return innerBuilder.addToKwargs("weights", nums);
    }

    @Override
    public HistBuilder cumulative(boolean arg) {
        return innerBuilder.addToKwargs("cumulative", arg);
    }

    @Override
    public HistBuilder bottom(double arg) {
        return innerBuilder.addToKwargs("bottom", arg);
    }

    @Override
    public HistBuilder bottom(List<? extends Number> nums) {
        return innerBuilder.addToKwargs("bottom", nums);
    }

    @Override
    public HistBuilder histType(HistType arg) {
        return innerBuilder.addToKwargs("histtype", arg.getHist());
    }

    @Override
    public HistBuilder align(AlignType arg) {
        return innerBuilder.addToKwargs("align", arg.getAlign());
    }

    @Override
    public HistBuilder orientation(HistOrientationType arg) {
        return innerBuilder.addToKwargs("orientation", arg.getOrientation());
    }

    @Override
    public HistBuilder rWidth(double arg) {
        return innerBuilder.addToKwargs("rwidth", arg);
    }

    @Override
    public HistBuilder log(boolean arg) {
        return innerBuilder.addToKwargs("log", arg);
    }

    @Override 
    public HistBuilder color(ColorType arg) {
        return innerBuilder.addToKwargs("color", arg.getColor());
    }

    @Override 
    public HistBuilder color(ColorType... args) {
        return innerBuilder.addToKwargsWithoutQuoting("color", "[\"" + Joiner.on("\", \"").join(args) + "\"]");
    }

    @Override
    public HistBuilder label(String arg) {
        return innerBuilder.addToKwargs("label", arg);
    }

    @Override
    public HistBuilder label(String... args) {
        return innerBuilder.addToKwargsWithoutQuoting("label", "[\"" + Joiner.on("\", \"").join(args) + "\"]");
    }

    @Override
    public HistBuilder stacked(boolean arg) {
        return innerBuilder.addToKwargs("stacked", arg);
    }

    // **kwargs section
    @Override
    public HistBuilder lineStyle(String arg) {
        return kwargsBuilder.lineStyle(arg);
    }

    @Override
    public HistBuilder lineWidth(double arg) {
        return kwargsBuilder.lineWidth(arg);
    }

    @Override
    public HistBuilder alpha(double arg) {
        return kwargsBuilder.alpha(arg);
    }

    @Override
    public HistBuilder edgeColor(ColorType arg) {
        return kwargsBuilder.edgeColor(arg);
    }

    @Override
    public HistBuilder faceColor(ColorType arg) {
        return kwargsBuilder.faceColor(arg);
    }

    @Override
    public HistBuilder lineStyle(LineStyleType arg) {
        return kwargsBuilder.lineStyle(arg);
    }

    // Implement the builder interface methods
    @Override
    public String build() {
        return innerBuilder.build();
    }

    @Override
    public String getMethodName() {
        return "hist";
    }

}
