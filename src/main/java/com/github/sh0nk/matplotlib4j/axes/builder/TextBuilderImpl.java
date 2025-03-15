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
 * {@link TextBuilder}.
 * The first section defines the @Override of all the *args associated to this
 * method, while the second section invokes all the **kwargs which are imported
 * by the related object.
 */
public class TextBuilderImpl implements TextBuilder {

    // Variable defining the builder for the main method
    private final CompositeAxesBuilder<TextBuilder> innerBuilder = new CompositeAxesBuilder<>(this);

    // Variable defining the builder for all the **kwargs
    private final TextArgsBuilder<TextBuilder> kwargsBuilder = new TextArgsBuilderImpl<>(innerBuilder);

    public TextBuilderImpl() {}

    // *args section
    @Override
    public TextBuilder add(Number x, Number y, Number z, String fmt){
        innerBuilder.addToArgs(x);
        innerBuilder.addToArgs(y);
        innerBuilder.addToArgs(z);
        return innerBuilder.addToArgs(fmt);
    }

    // **kwargs section
    @Override
    public TextBuilder alpha(double arg) {
        return kwargsBuilder.alpha(arg);
    }

    @Override
    public TextBuilder backGroundColor(ColorType arg) {
        return kwargsBuilder.backGroundColor(arg);
    }

    @Override
    public TextBuilder color(ColorType arg) {
        return kwargsBuilder.color(arg);
    }

    @Override
    public TextBuilder fontSize(FontSizeType arg) {
        return kwargsBuilder.fontSize(arg);
    }

    @Override
    public TextBuilder fontName(FontNameType arg) {
        return kwargsBuilder.fontName(arg);
    }

    @Override
    public TextBuilder fontStretch(FontStretchType arg) {
        return kwargsBuilder.fontStretch(arg);
    }

    @Override
    public TextBuilder fontStyle(FontStyleType arg) {
        return kwargsBuilder.fontStyle(arg);
    }

    @Override
    public TextBuilder fontVariant(FontVariantType arg) {
        return kwargsBuilder.fontVariant(arg);
    }

    @Override
    public TextBuilder fontWeight(FontWeightType arg) {
        return kwargsBuilder.fontWeight(arg);
    }

    @Override
    public TextBuilder horizontalAlignment(HorizontalAlignmentType arg) {
        return kwargsBuilder.horizontalAlignment(arg);
    }

    @Override
    public TextBuilder label(String arg) {
        return kwargsBuilder.label(arg);
    }

    @Override
    public TextBuilder lineSpacing(double arg) {
        return kwargsBuilder.lineSpacing(arg);
    }

    @Override
    public TextBuilder parseMath(boolean arg) {
        return kwargsBuilder.parseMath(arg);
    }

    @Override
    public TextBuilder position(double x, double y) {
        return kwargsBuilder.position(x, y);
    }

    @Override
    public TextBuilder rotation(RotationType arg) {
        return kwargsBuilder.rotation(arg);
    }

    @Override
    public TextBuilder rotationMode(RotationModeType arg) {
        return kwargsBuilder.rotationMode(arg);
    }

    @Override
    public TextBuilder text(String arg) {
        return kwargsBuilder.text(arg);
    }

    @Override
    public TextBuilder useTex(boolean arg) {
        return kwargsBuilder.useTex(arg);
    }

    @Override
    public TextBuilder verticalAlignment(VerticalAlignmentType arg) {
        return kwargsBuilder.verticalAlignment(arg);
    }

    @Override
    public TextBuilder x(double arg) {
        return kwargsBuilder.x(arg);
    }

    @Override
    public TextBuilder y(double arg) {
        return kwargsBuilder.y(arg);
    }

    // Implement the builder interface methods
    @Override
    public String build() {
        return innerBuilder.build();
    }

    @Override
    public String getMethodName() {
        return "text";
    }

}
