package com.github.sh0nk.matplotlib4j.axes.builder;

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
 * {@link LabelBuilder}.
 * The first section defines the @Override of all the *args associated to this
 * method, while the second section invokes all the **kwargs which are imported
 * by the related object.
 */
public class LabelBuilderImpl implements LabelBuilder {

    // Variable defining the builder for the main method
    private final CompositeAxesBuilder<LabelBuilder> innerBuilder = new CompositeAxesBuilder<>(this);

    // Variable defining the builder for all the **kwargs
    private final TextArgsBuilder<LabelBuilder> kwargsBuilder = new TextArgsBuilderImpl<>(innerBuilder);

    // Variable to distinguish between the use of the "set_xlabel", "set_ylabel", "set_zlabel" methods
    private String methodName;

    // Default constructor
    public LabelBuilderImpl(String methodName) {
        this.methodName = methodName;
    }

    // *args section
    @Override
    public LabelBuilder xLabel(String arg) {
        return innerBuilder.addToArgs(arg);
    }

    @Override
    public LabelBuilder yLabel(String arg) {
        return innerBuilder.addToArgs(arg);
    }

    @Override
    public LabelBuilder zLabel(String arg) {
        return innerBuilder.addToArgs(arg);
    }

    @Override
    public LabelBuilder loc(HorizontalAlignmentType arg) {
        return innerBuilder.addToKwargs("loc", arg.getHorizontalAlignment());
    }

    // **kwargs section
    @Override
    public LabelBuilder alpha(double arg) {
        return kwargsBuilder.alpha(arg);
    }

    @Override
    public LabelBuilder backGroundColor(ColorType arg) {
        return kwargsBuilder.backGroundColor(arg);
    }

    @Override
    public LabelBuilder color(ColorType arg) {
        return kwargsBuilder.color(arg);
    }

    @Override
    public LabelBuilder fontSize(FontSizeType arg) {
        return kwargsBuilder.fontSize(arg);
    }

    @Override
    public LabelBuilder fontName(FontNameType arg) {
        return kwargsBuilder.fontName(arg);
    }

    @Override
    public LabelBuilder fontStretch(FontStretchType arg) {
        return kwargsBuilder.fontStretch(arg);
    }

    @Override
    public LabelBuilder fontStyle(FontStyleType arg) {
        return kwargsBuilder.fontStyle(arg);
    }

    @Override
    public LabelBuilder fontVariant(FontVariantType arg) {
        return kwargsBuilder.fontVariant(arg);
    }

    @Override
    public LabelBuilder fontWeight(FontWeightType arg) {
        return kwargsBuilder.fontWeight(arg);
    }

    @Override
    public LabelBuilder horizontalAlignment(HorizontalAlignmentType arg) {
        return kwargsBuilder.horizontalAlignment(arg);
    }

    @Override
    public LabelBuilder label(String arg) {
        return kwargsBuilder.label(arg);
    }

    @Override
    public LabelBuilder lineSpacing(double arg) {
        return kwargsBuilder.lineSpacing(arg);
    }

    @Override
    public LabelBuilder parseMath(boolean arg) {
        return kwargsBuilder.parseMath(arg);
    }

    @Override
    public LabelBuilder position(double x, double y, double z) {
        return kwargsBuilder.position(x, y, z);
    }

    @Override
    public LabelBuilder rotation(RotationType arg) {
        return kwargsBuilder.rotation(arg);
    }

    @Override
    public LabelBuilder rotationMode(RotationModeType arg) {
        return kwargsBuilder.rotationMode(arg);
    }

    @Override
    public LabelBuilder text(String arg) {
        return kwargsBuilder.text(arg);
    }

    @Override
    public LabelBuilder useTex(boolean arg) {
        return kwargsBuilder.useTex(arg);
    }

    @Override
    public LabelBuilder x(double arg) {
        return kwargsBuilder.x(arg);
    }

    @Override
    public LabelBuilder y(double arg) {
        return kwargsBuilder.y(arg);
    }

    @Override
    public LabelBuilder z(double arg) {
        return kwargsBuilder.z(arg);
    }

    @Override
    public LabelBuilder verticalAlignment(VerticalAlignmentType arg) {
        return kwargsBuilder.verticalAlignment(arg);
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

