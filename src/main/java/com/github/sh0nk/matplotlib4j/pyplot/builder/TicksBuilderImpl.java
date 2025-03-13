package com.github.sh0nk.matplotlib4j.pyplot.builder;

import java.util.List;

import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.FontNameType;
import com.github.sh0nk.matplotlib4j.enums.FontSizeType;
import com.github.sh0nk.matplotlib4j.enums.FontStretchType;
import com.github.sh0nk.matplotlib4j.enums.FontStyleType;
import com.github.sh0nk.matplotlib4j.enums.FontVariantType;
import com.github.sh0nk.matplotlib4j.enums.FontWeightType;
import com.github.sh0nk.matplotlib4j.enums.HorizonalAlighmentType;
import com.github.sh0nk.matplotlib4j.enums.RotationModeType;
import com.github.sh0nk.matplotlib4j.enums.RotationType;
import com.github.sh0nk.matplotlib4j.enums.VerticalAlignmentType;
import com.github.sh0nk.matplotlib4j.pyplot.kwargs.TextArgsBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.kwargs.TextArgsBuilderImpl;

/**
 * This class is implementing all the methods defined in the relative interface
 * {@link TicksBuilder}.
 * The first section defines the @Override of all the *args associated to this
 * method, while the second section invokes all the **kwargs which are imported
 * by the related object.
 */
public class TicksBuilderImpl implements TicksBuilder {

    // Variable defining the builder for the main method
    private final CompositeBuilder<TicksBuilder> innerBuilder = new CompositeBuilder<>(this);

    // Variable defining the builder for all the **kwargs
    private final TextArgsBuilder<TicksBuilder> kwargsBuilder = new TextArgsBuilderImpl<TicksBuilder>(innerBuilder);

    // Variable to distinguish between the use of the "xticks" or "yticks" methods
    private String methodName;

    // Default constructor
    public TicksBuilderImpl() {}

    // Public constructor
    public TicksBuilderImpl(String methodName) {
        // Add labels without ticks causes an error, that's why made ticks as mandatory parameter
        // matplotlib.units.ConversionError: Failed to convert value(s) to axis units: ['a', 'b']
        this.methodName = methodName;
    }

    // public static TicksBuilderImpl xTicksBuilder(List<? extends Number> ticks) {
    //     return new TicksBuilderImpl(ticks, "xticks");
    // }

    // public static TicksBuilderImpl yTicksBuilder(List<? extends Number> ticks) {
    //     return new TicksBuilderImpl(ticks, "yticks");
    // }

    // *args section
    @Override
    public TicksBuilder xTicks(List<? extends Number> ticks) {
        this.methodName = "xticks";
        return innerBuilder.addToKwargs("ticks", ticks);
    }

    @Override
    public TicksBuilder yTicks(List<? extends Number> ticks) {
        this.methodName = "yticks";
        return innerBuilder.addToKwargs("ticks", ticks);
    }

    @Override
    public TicksBuilder labels(List<String> labels) {
        innerBuilder.addToArgs(labels);
        return this;
    }

    // **kwargs section
    @Override
    public TicksBuilder alpha(double arg) {
        return kwargsBuilder.alpha(arg);
    }

    @Override
    public TicksBuilder backGroundColor(ColorType arg) {
        return kwargsBuilder.backGroundColor(arg);
    }

    @Override
    public TicksBuilder color(ColorType arg) {
        return kwargsBuilder.color(arg);
    }

    @Override
    public TicksBuilder fontSize(FontSizeType arg) {
        return kwargsBuilder.fontSize(arg);
    }

    @Override
    public TicksBuilder fontName(FontNameType arg) {
        return kwargsBuilder.fontName(arg);
    }

    @Override
    public TicksBuilder fontStretch(FontStretchType arg) {
        return kwargsBuilder.fontStretch(arg);
    }

    @Override
    public TicksBuilder fontStyle(FontStyleType arg) {
        return kwargsBuilder.fontStyle(arg);
    }

    @Override
    public TicksBuilder fontVariant(FontVariantType arg) {
        return kwargsBuilder.fontVariant(arg);
    }

    @Override
    public TicksBuilder fontWeight(FontWeightType arg) {
        return kwargsBuilder.fontWeight(arg);
    }

    @Override
    public TicksBuilder horizontalAlignment(HorizonalAlighmentType arg) {
        return kwargsBuilder.horizontalAlignment(arg);
    }

    @Override
    public TicksBuilder label(String arg) {
        return kwargsBuilder.label(arg);
    }

    @Override
    public TicksBuilder lineSpacing(double arg) {
        return kwargsBuilder.lineSpacing(arg);
    }

    @Override
    public TicksBuilder parseMath(boolean arg) {
        return kwargsBuilder.parseMath(arg);
    }

    @Override
    public TicksBuilder position(double x, double y) {
        return kwargsBuilder.position(x, y);
    }

    @Override
    public TicksBuilder rotation(RotationType arg) {
        return kwargsBuilder.rotation(arg);
    }

    @Override
    public TicksBuilder rotationMode(RotationModeType arg) {
        return kwargsBuilder.rotationMode(arg);
    }

    @Override
    public TicksBuilder text(String arg) {
        return kwargsBuilder.text(arg);
    }

    @Override
    public TicksBuilder useTex(boolean arg) {
        return kwargsBuilder.useTex(arg);
    }

    @Override
    public TicksBuilder verticalAlignment(VerticalAlignmentType arg) {
        return kwargsBuilder.verticalAlignment(arg);
    }

    @Override
    public TicksBuilder x(double arg) {
        return kwargsBuilder.x(arg);
    }

    @Override
    public TicksBuilder y(double arg) {
        return kwargsBuilder.y(arg);
    }

    // Implement the builder interface methods
    @Override
    public String build() {
        return innerBuilder.build();
    }

    @Override
    public String getMethodName() {
        return this.methodName;
    }

}
