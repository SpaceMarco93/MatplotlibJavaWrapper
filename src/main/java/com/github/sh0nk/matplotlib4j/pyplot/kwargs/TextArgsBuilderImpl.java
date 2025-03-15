package com.github.sh0nk.matplotlib4j.pyplot.kwargs;

import java.util.ArrayList;

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
import com.github.sh0nk.matplotlib4j.pyplot.builder.Builder2D;
import com.github.sh0nk.matplotlib4j.pyplot.builder.CompositeBuilder;

/**
 * This class is implementing all the methods defined in the relative interface
 * {@link TextArgsBuilder}.
 */
public class TextArgsBuilderImpl<T extends Builder2D> implements TextArgsBuilder<T> {

    // Define the instance of the CompositeBuilder 
    public final CompositeBuilder<T> innerBuilder;

    // Public constructor accepting any method using Text objects as **kwargs
    public TextArgsBuilderImpl(CompositeBuilder<T> innerBuilder) {
        this.innerBuilder = innerBuilder;
    }

    @Override
    public T alpha(double arg) {
        return innerBuilder.addToKwargs("alpha", arg);
    }

    @Override
    public T backGroundColor(ColorType arg) {
        return innerBuilder.addToKwargs("backgroundcolor", arg.getColor());
    }

    @Override
    public T color(ColorType arg) {
        return innerBuilder.addToKwargs("color", arg.getColor());
    }

    @Override
    public T fontSize(FontSizeType arg) {
        return innerBuilder.addToKwargs("fontsize", arg.getFontSize());
    }

    @Override
    public T fontName(FontNameType arg) {
        return innerBuilder.addToKwargs("fontname", arg.getFontName());
    }

    @Override
    public T fontStretch(FontStretchType arg) {
        return innerBuilder.addToKwargs("fontstretch", arg.getFontStretch());
    }

    @Override
    public T fontStyle(FontStyleType arg) {
        return innerBuilder.addToKwargs("fontstyle", arg.getFontStyle());
    }

    @Override
    public T fontVariant(FontVariantType arg) {
        return innerBuilder.addToKwargs("fontvariant", arg.getFontVariant());
    }

    @Override
    public T fontWeight(FontWeightType arg) {
        return innerBuilder.addToKwargs("fontweigth", arg.getFontWeight());
    }

    @Override
    public T horizontalAlignment(HorizontalAlignmentType arg) {
        return innerBuilder.addToKwargs("ha", arg.getHorizontalAlignment());
    }

    @Override
    public T label(String arg) {
        return innerBuilder.addToKwargs("label", arg);
    }

    @Override
    public T lineSpacing(double arg) {
        return innerBuilder.addToKwargs("linespacing", arg);
    }

    @Override
    public T parseMath(boolean arg) {
        return innerBuilder.addToKwargs("parse_math", arg);
    }

    @Override
    public T position(double x, double y) {
        ArrayList<Double> list = new ArrayList<Double>();
        list.add(x);
        list.add(y);
        return innerBuilder.addToKwargs("position", list);
    }

    @Override
    public T rotation(RotationType arg) {
        return innerBuilder.addToKwargs("rotation", arg.getRotation());
    }

    @Override
    public T rotationMode(RotationModeType arg) {
        return innerBuilder.addToKwargs("rotation_mode", arg.getRotationMode());
    }

    @Override
    public T text(String arg) {
        return innerBuilder.addToKwargs("text", arg);
    }

    @Override
    public T useTex(boolean arg) {
        return innerBuilder.addToKwargs("usetex", arg);
    }

    @Override
    public T verticalAlignment(VerticalAlignmentType arg) {
        return innerBuilder.addToKwargs("va", arg.getVerticalAlignment());
    }

    @Override
    public T x(double arg) {
        return innerBuilder.addToKwargs("x", arg);
    }

    @Override
    public T y(double arg) {
        return innerBuilder.addToKwargs("y", arg);
    }

}
