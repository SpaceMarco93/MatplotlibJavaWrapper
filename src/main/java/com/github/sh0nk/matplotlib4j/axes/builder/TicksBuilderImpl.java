package com.github.sh0nk.matplotlib4j.axes.builder;

import java.util.List;

import com.github.sh0nk.matplotlib4j.axes.kwargs.TextArgsBuilder;
import com.github.sh0nk.matplotlib4j.axes.kwargs.TextArgsBuilderImpl;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.FontNameType;
import com.github.sh0nk.matplotlib4j.enums.FontSizeType;
import com.github.sh0nk.matplotlib4j.enums.FontStretchType;
import com.github.sh0nk.matplotlib4j.enums.FontStyleType;
import com.github.sh0nk.matplotlib4j.enums.FontVariantType;
import com.github.sh0nk.matplotlib4j.enums.FontWeightType;
import com.github.sh0nk.matplotlib4j.enums.HorizontalAlignmentType;
import com.github.sh0nk.matplotlib4j.enums.RotationModeType;
import com.github.sh0nk.matplotlib4j.enums.RotationType;
import com.github.sh0nk.matplotlib4j.enums.VerticalAlignmentType;

/**
 * This class is implementing all the methods defined in the relative interface
 * {@link TicksBuilder}.
 * The first section defines the @Override of all the *args associated to this
 * method, while the second section invokes all the **kwargs which are imported
 * by the related object.
 */
public class TicksBuilderImpl implements TicksBuilder {

    // Variable defining the builder for the main method
    private final CompositeAxesBuilder<TicksBuilder> innerBuilder = new CompositeAxesBuilder<>(this);

    // Variable defining the builder for all the **kwargs
    private final TextArgsBuilder<TicksBuilder> kwargsBuilder = new TextArgsBuilderImpl<TicksBuilder>(innerBuilder);

    // Variable to distinguish between the use of the "set_xticks", "set_yticks" and "set_zticks" methods
    private String methodName;

    // Default constructor
    public TicksBuilderImpl() {}

    // Public constructor
    public TicksBuilderImpl(String methodName) {
        this.methodName = methodName;
    }

    // *args section
    @Override
    public TicksBuilder xTicks(List<? extends Number> ticks) {
        return innerBuilder.addToArgs(ticks);
    }

    @Override
    public TicksBuilder yTicks(List<? extends Number> ticks) {
        return innerBuilder.addToArgs(ticks);
    }

    @Override
    public TicksBuilder zTicks(List<? extends Number> ticks) {
        return innerBuilder.addToArgs(ticks);
    }

    @Override
    public TicksBuilder labels(List<String> labels) {
        return innerBuilder.addToArgs(labels);
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
    public TicksBuilder horizontalAlignment(HorizontalAlignmentType arg) {
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
    public TicksBuilder position(double x, double y, double z) {
        return kwargsBuilder.position(x, y, z);
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

    @Override
    public TicksBuilder z(double arg) {
        return kwargsBuilder.z(arg);
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
