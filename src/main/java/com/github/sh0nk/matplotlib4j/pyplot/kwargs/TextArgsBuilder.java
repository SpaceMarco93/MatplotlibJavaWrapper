package com.github.sh0nk.matplotlib4j.pyplot.kwargs;

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

/**
 * This interface is defining all the **kwargs associated to the "text" method
 * defined in pyplot. This interface is supporting several interfaces implemented
 * in the builder subpackage.
 * 
 * matplotlib.pyplot.text(*args, **kwargs)
 *
 */
public interface TextArgsBuilder<T extends Builder2D> extends KwargsBuilder {

    /**
     * Set the alpha value used for blending
     * 
     * @param arg       the alpha value used for blending   
     * @return  the instance of {@link T} builder for method chain
     */
    T alpha(double arg);

    /**
     * Set the background color of the text by updating the bbox.
     * 
     * @param arg   an instance of the {@link ColorType} enum providing the 
     *              background color
     * @return  the instance of {@link T} builder for method chain
     */
    T backGroundColor(ColorType arg);

    /**
     * Set the foreground color of the text by updating the bbox.
     * 
     * @param arg   an instance of the {@link ColorType} enum providing the 
     *              foreground color
     * @return  the instance of {@link T} builder for method chain
     */
    T color(ColorType arg);

    /**
     * Set the font size.
     * 
     * @param arg   an instance of the {@link FontSyzeType} enum providing the 
     *              type of font size   
     * @return  the instance of {@link T} builder for method chain
     */
    T fontSize(FontSizeType arg);

    /**
     * Set the font family. Alias for set_fontfamily. 
     * 
     * @param arg   an instance of the {@link FontNameType} enum providing the 
     *              font family
     * @return  the instance of {@link T} builder for method chain
     */
    T fontName(FontNameType arg);

    /**
     * Set the font stretch (horizontal condensation or expansion).
     * 
     * @param arg   an instance of the {@link FontNameType} enum providing the 
     *              font stretch
     * @return  the instance of {@link T} builder for method chain
     */
    T fontStretch(FontStretchType arg);

    /**
     * Set the font style.
     * 
     * @param arg   an instance of the {@link FontStyleType} enum providing the 
     *              font style
     * @return  the instance of {@link T} builder for method chain
     */
    T fontStyle(FontStyleType arg);

    /**
     * Set the font variant.
     * 
     * @param arg   an instance of the {@link FontVariantType} enum providing the 
     *              font variant
     * @return  the instance of {@link T} builder for method chain
     */
    T fontVariant(FontVariantType arg);

    /**
     * Set the font weight.
     * 
     * @param arg   an instance of the {@link FontWeightType} enum providing the 
     *              font weight
     * @return  the instance of {@link T} builder for method chain
     */
    T fontWeight(FontWeightType arg);

    /**
     * Set the horizontal alignment relative to the anchor point.
     * 
     * @param arg   an instance of the {@link HorizontalAlignmentType} enum 
     *              providing the anchor point
     * @return  the instance of {@link T} builder for method chain
     */
    T horizontalAlignment(HorizontalAlignmentType arg);

    /**
     * Set a label that will be displayed in the legend.
     * 
     * @param arg   the text that will be displayed in the legend
     * @return  the instance of {@link T} builder for method chain
     */
    T label(String arg);

    /**
     * Set the line spacing as a multiple of the font size.
     * 
     * @param arg   the line spacing as a multiple of the font size
     * @return  the instance of {@link T} builder for method chain
     */
    T lineSpacing(double arg);

    /**
     * Set an override switch to disable any mathtext parsing for this Text.
     * 
     * @param arg   boolean variable to override any math text parsing
     * @return  the instance of {@link T} builder for method chain
     */
    T parseMath(boolean arg);

    /**
     * Set the (x, y) position of the text.
     * 
     * @param x     x-coordinate for the text position
     * @param y     y-coordinate for the text position
     * @return  the instance of {@link T} builder for method chain
     */
    T position(double x, double y);

    /**
     * Set the rotation of the text.
     * @param arg   an instance of the {@link RotationType} enum providing the 
     *              type of text rotation   
     * @return  the instance of {@link T} builder for method chain
     */
    T rotation(RotationType arg);

    /**
     * Set text rotation mode.
     * 
     * @param arg   an instance of the {@link RotationModeType} enum providing the 
     *              rotation mode for the text
     * @return  the instance of {@link T} builder for method chain
     */
    T rotationMode(RotationModeType arg);

    /**
     * Set the text string {@code arg}. It may contain newlines (\n) or math in LaTeX syntax.
     * 
     * @param arg   the text string to be used
     * @return  the instance of {@link T} builder for method chain
     */
    T text(String arg);

    /**
     * Set whether to render using TeX
     * 
     * @param arg   boolean variable to set if TeX should be used to render text
     * @return  the instance of {@link T} builder for method chain
     */
    T useTex(boolean arg);

    /**
     * Set the vertical alignment relative to the anchor point.
     * 
     * @param arg   an instance of the {@link VarticalAlignmentType} enum providing 
     *              the vertical alignment relative to the anchor point
     * @return
     */
    T verticalAlignment(VerticalAlignmentType arg);

    /**
     * Set the x position of the text.
     * 
     * @param arg   x-coordinate of the text position
     * @return  the instance of {@link T} builder for method chain
     */
    T x(double arg);

    /**
     * Set the y position of the text.
     * 
     * @param arg   y-coordinate of the text position
     * @return  the instance of {@link T} builder for method chain
     */
    T y(double arg);

}
