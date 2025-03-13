package com.github.sh0nk.matplotlib4j.axes.builder;

import java.util.ArrayList;

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

public class LabelBuilderImpl implements LabelBuilder {

    private CompositeAxesBuilder<LabelBuilder> innerBuilder = new CompositeAxesBuilder<>(this);
    private String methodName;

    public LabelBuilderImpl(String methodName) {
        this.methodName = methodName;
    }

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
    public LabelBuilder alpha(double arg) {
        return innerBuilder.addToKwargs("alpha", arg);
    }

    @Override
    public LabelBuilder backGroundColor(ColorType arg) {
        return innerBuilder.addToKwargs("background", arg.getColor());
    }

    @Override
    public LabelBuilder color(ColorType arg) {
        return innerBuilder.addToKwargs("color", arg.getColor());
    }

    @Override
    public LabelBuilder fontSize(FontSizeType arg) {
        return innerBuilder.addToKwargs("fontsize", arg.getFontSize());
    }

    @Override
    public LabelBuilder fontName(FontNameType arg) {
        return innerBuilder.addToKwargs("fontname", arg.getFontName());
    }

    @Override
    public LabelBuilder fontStretch(FontStretchType arg) {
        return innerBuilder.addToKwargs("fontstretch", arg.getFontStretch());
    }

    @Override
    public LabelBuilder fontStyle(FontStyleType arg) {
        return innerBuilder.addToKwargs("fontstyle", arg.getFontStyle());
    }

    @Override
    public LabelBuilder fontVariant(FontVariantType arg) {
        return innerBuilder.addToKwargs("fontvariant", arg.getFontVariant());
    }

    @Override
    public LabelBuilder fontWeight(FontWeightType arg) {
        return innerBuilder.addToKwargs("fontweight", arg.getFontWeight());
    }

    @Override
    public LabelBuilder horizontalAlignment(HorizonalAlighmentType arg) {
        return innerBuilder.addToKwargs("ha", arg.getHorizontalAlignment());
    }

    @Override
    public LabelBuilder label(String arg) {
        return innerBuilder.addToKwargs("label", arg);
    }

    @Override
    public LabelBuilder lineSpacing(double arg) {
        return innerBuilder.addToKwargs("linespacing", arg);
    }

    @Override
    public LabelBuilder parseMath(boolean arg) {
        return innerBuilder.addToKwargs("parse_math", arg);
    }

    @Override
    public LabelBuilder position(double x, double y) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        return innerBuilder.addToKwargs("position", list);
    }

    @Override
    public LabelBuilder rotation(RotationType arg) {
        return innerBuilder.addToKwargs("rotation", arg.getRotation());
    }

    @Override
    public LabelBuilder rotationMode(RotationModeType arg) {
        return innerBuilder.addToKwargs("rotationmode", arg.getRotationMode());
    }

    @Override
    public LabelBuilder text(String arg) {
        return innerBuilder.addToKwargs("text", arg);
    }

    @Override
    public LabelBuilder useTex(boolean arg) {
        return innerBuilder.addToKwargs("usetext", arg);
    }

    @Override
    public LabelBuilder x(double arg) {
        return innerBuilder.addToKwargs("x", arg);
    }

    @Override
    public LabelBuilder y(double arg) {
        return innerBuilder.addToKwargs("y", arg);
    }

    @Override
    public LabelBuilder loc(HorizonalAlighmentType arg) {
        return innerBuilder.addToKwargs("loc", arg.getHorizontalAlignment());
    }

    @Override
    public LabelBuilder verticalAlignment(VerticalAlignmentType arg) {
        return innerBuilder.addToKwargs("va", arg.getVerticalAlignment());
    }

    @Override
    public String build() {
        return innerBuilder.build();
    }

    @Override
    public String getMethodName() {
        return this.methodName;
    }

}

