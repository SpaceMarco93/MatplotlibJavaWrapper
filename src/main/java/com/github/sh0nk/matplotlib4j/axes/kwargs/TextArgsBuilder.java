package com.github.sh0nk.matplotlib4j.axes.kwargs;

import com.github.sh0nk.matplotlib4j.axes.builder.Builder3D;
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

/**
 * This interface is defining all the **kwargs associated to the "text" method
 * defined in pyplot. This interface is supporting several interfaces implemented
 * in the builder subpackage.
 * 
 * matplotlib.pyplot.text(*args, **kwargs)
 *
 */
public interface TextArgsBuilder<T extends Builder3D> extends KwargsBuilder {

    // Set the alpha value used for blending
    T alpha(double arg);

    // Set the background color of the text by updating the bbox.
    T backGroundColor(ColorType arg);

    // Set the foreground color of the text
    T color(ColorType arg);

    // Set the font size.
    T fontSize(FontSizeType arg);

    // Alias for set_fontfamily. Set the font family.
    T fontName(FontNameType arg);

    // Set the font stretch (horizontal condensation or expansion).
    T fontStretch(FontStretchType arg);

    // Set the font style.
    T fontStyle(FontStyleType arg);

    // Set the font variant.
    T fontVariant(FontVariantType arg);

    // Set the font weight.
    T fontWeight(FontWeightType arg);

    // Set the horizontal alignment relative to the anchor point.
    T horizontalAlignment(HorizonalAlighmentType arg);

    // Set a label that will be displayed in the legend.
    T label(String arg);

    // Set the line spacing as a multiple of the font size.
    T lineSpacing(double arg);

    // Override switch to disable any mathtext parsing for this Text.
    T parseMath(boolean arg);

    // Set the (x, y) position of the text.
    T position(double x, double y);

    // Set the rotation of the text.
    T rotation(RotationType arg);

    // Set text rotation mode.
    T rotationMode(RotationModeType arg);

    // Set the text string s. It may contain newlines (\n) or math in LaTeX syntax.
    T text(String arg);

    // Whether to render using TeX
    T useTex(boolean arg);

    // Set the vertical alignment relative to the anchor point.
    T verticalAlignment(VerticalAlignmentType arg);

    // Set the x position of the text.
    T x(double arg);

    // Set the y position of the text.
    T y(double arg);

}
