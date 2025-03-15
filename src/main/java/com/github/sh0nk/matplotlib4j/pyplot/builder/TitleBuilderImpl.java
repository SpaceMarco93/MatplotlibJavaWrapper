package com.github.sh0nk.matplotlib4j.pyplot.builder;

import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.FontNameType;
import com.github.sh0nk.matplotlib4j.enums.FontSizeType;
import com.github.sh0nk.matplotlib4j.enums.FontStretchType;
import com.github.sh0nk.matplotlib4j.enums.FontStyleType;
import com.github.sh0nk.matplotlib4j.enums.FontVariantType;
import com.github.sh0nk.matplotlib4j.enums.FontWeightType;
import com.github.sh0nk.matplotlib4j.enums.HorizontalAlignmentType;
import com.github.sh0nk.matplotlib4j.enums.LocationType;
import com.github.sh0nk.matplotlib4j.enums.RotationModeType;
import com.github.sh0nk.matplotlib4j.enums.RotationType;
import com.github.sh0nk.matplotlib4j.enums.VerticalAlignmentType;
import com.github.sh0nk.matplotlib4j.pyplot.kwargs.TextArgsBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.kwargs.TextArgsBuilderImpl;

/**
 * This class is implementing all the methods defined in the relative interface
 * {@link TitleBuilder}.
 * The first section defines the @Override of all the *args associated to this
 * method, while the second section invokes all the **kwargs which are imported
 * by the related object.
 */
public class TitleBuilderImpl implements TitleBuilder {

    // Variable defining the builder for the main method
    private final CompositeBuilder<TitleBuilder> innerBuilder = new CompositeBuilder<>(this);

    // Variable defining the builder for all the **kwargs
    private final TextArgsBuilder<TitleBuilder> kwargsBuilder = new TextArgsBuilderImpl<>(innerBuilder);

    // Default constructor
    public TitleBuilderImpl() {}
    
    // *args section
    @Override
    public TitleBuilder add(String arg) {
        return innerBuilder.addToArgs(arg);
    }

    @Override
    public TitleBuilder label(String arg) {
        return innerBuilder.addToKwargs("label", arg);
    }

    @Override
    public TitleBuilder loc(LocationType arg) {
        return innerBuilder.addToKwargs("loc", arg.getLocation());
    }

    @Override
    public TitleBuilder y(double arg) {
        return innerBuilder.addToKwargs("y", arg);
    }

    @Override
    public TitleBuilder pad(double arg) {
        return innerBuilder.addToKwargs("pad", arg);
    }

    // **kwargs section
    @Override
    public TitleBuilder alpha(double arg) {
        return kwargsBuilder.alpha(arg);
    }

    @Override
    public TitleBuilder backGroundColor(ColorType arg) {
        return kwargsBuilder.backGroundColor(arg);
    }

    @Override
    public TitleBuilder color(ColorType arg) {
        return kwargsBuilder.color(arg);
    }

    @Override
    public TitleBuilder fontSize(FontSizeType arg) {
        return kwargsBuilder.fontSize(arg);
    }

    @Override
    public TitleBuilder fontName(FontNameType arg) {
        return kwargsBuilder.fontName(arg);
    }

    @Override
    public TitleBuilder fontStretch(FontStretchType arg) {
        return kwargsBuilder.fontStretch(arg);
    }

    @Override
    public TitleBuilder fontStyle(FontStyleType arg) {
        return kwargsBuilder.fontStyle(arg);
    }

    @Override
    public TitleBuilder fontVariant(FontVariantType arg) {
        return kwargsBuilder.fontVariant(arg);
    }

    @Override
    public TitleBuilder fontWeight(FontWeightType arg) {
        return kwargsBuilder.fontWeight(arg);
    }

    @Override
    public TitleBuilder horizontalAlignment(HorizontalAlignmentType arg) {
        return kwargsBuilder.horizontalAlignment(arg);
    }

    @Override
    public TitleBuilder lineSpacing(double arg) {
        return kwargsBuilder.lineSpacing(arg);
    }

    @Override
    public TitleBuilder parseMath(boolean arg) {
        return kwargsBuilder.parseMath(arg);
    }

    @Override
    public TitleBuilder position(double x, double y) {
        return kwargsBuilder.position(x, y);
    }

    @Override
    public TitleBuilder rotation(RotationType arg) {
        return kwargsBuilder.rotation(arg);
    }

    @Override
    public TitleBuilder rotationMode(RotationModeType arg) {
        return kwargsBuilder.rotationMode(arg);
    }

    @Override
    public TitleBuilder text(String arg) {
        return kwargsBuilder.text(arg);
    }

    @Override
    public TitleBuilder useTex(boolean arg) {
        return kwargsBuilder.useTex(arg);
    }

    @Override
    public TitleBuilder verticalAlignment(VerticalAlignmentType arg) {
        return kwargsBuilder.verticalAlignment(arg);
    }

    @Override
    public TitleBuilder x(double arg) {
        return kwargsBuilder.x(arg);
    }

    // Implement the builder interface methods
    @Override
    public String build() {
        return innerBuilder.build();
    }
    @Override
    public String getMethodName() {
        return "title";
    }
}

