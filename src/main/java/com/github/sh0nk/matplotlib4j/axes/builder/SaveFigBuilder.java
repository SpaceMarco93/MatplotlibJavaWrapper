package com.github.sh0nk.matplotlib4j.axes.builder;

import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.FormatType;
import com.github.sh0nk.matplotlib4j.enums.OrientationType;
import com.github.sh0nk.matplotlib4j.enums.PaperType;

/**
 * This interface is defining all the *args associated to the "savefig" method 
 * defined in pyplot. 
 * 
 * matplotlib.pyplot.savefig(*args, **kwargs)
 */
public interface SaveFigBuilder extends Builder3D {

    /**
     * Set the figure file name.
     * <p>A path, or a Python file-like object, or possibly some backend-dependent 
     * object.</p>
     * <p>If format is set, it determines the output format, and the file is saved 
     * as fname. Note that fname is used verbatim, and there is no attempt to make 
     * the extension, if any, of fname match format, and no extension is appended.</p>
     * <p>If format is not set, then the format is inferred from the extension of fname, 
     * if there is one. If format is not set and fname has no extension, then the file 
     * is saved with 'png' and the appropriate extension is appended to fname.
     * 
     * @param arg   the name of the file where the figure is saved
     * @return  the instance of {@link SaveFigBuilder} for method chain
     */
    SaveFigBuilder fName(String arg);

    /**
     * Set the axes transparency in the figure file.
     * <p>If True, the Axes patches will all be transparent; the Figure patch 
     * will also be transparent unless facecolor and/or edgecolor are specified 
     * via kwargs.</p>
     * <p>If False has no effect and the color of the Axes and Figure patches 
     * are unchanged (unless the Figure patch is specified via the facecolor 
     * and/or edgecolor keyword arguments in which case those colors are used).</p>
     * 
     * @param arg   boolean variable to set if the axes are transparent or not
     * @return  the instance of {@link SaveFigBuilder} for method chain
     */
    SaveFigBuilder transparent(boolean arg);

    /**
     * Set the figure resolution in dots per inch.
     * 
     * @param arg   the figure resolution in dots per inch.
     * @return  the instance of {@link SaveFigBuilder} for method chain
     */
    SaveFigBuilder dpi(double arg);

    /**
     * Set the file format
     * <p>This method is used to set the file format, e.g. 'png', 'pdf', 'svg'.
     * The behavior when this is unset is documented under fname.</p>
     * 
     * @param arg   an instance of the {@link FormatType} enum defining the file
     *              format
     * @return  the instance of {@link SaveFigBuilder} for method chain
     */
    SaveFigBuilder format(FormatType arg);

    /**
     * Set the facecolor of the figure.
     * 
     * @param arg   an instance of the {@link ColorType} enum defining the color
     *              of figure facecolor
     * @return  the instance of {@link SaveFigBuilder} for method chain
     */
    SaveFigBuilder faceColor(ColorType arg);

    /**
     * Set the edgecolor of the figure.
     * 
     * @param arg   an instance of the {@link ColorType} enum defining the color
     *              of figure edgecolor
     * @return  the instance of {@link SaveFigBuilder} for method chain
     */
    SaveFigBuilder edgeColor(ColorType arg);

    /**
     * Set the figure orientation in the file.
     * <p>Currently only supported by the postscript backend.</p>
     * 
     * @param arg   an instance of the {@link OrientationType} enum defining the 
     *              orientation of the figure
     * @return  the instance of {@link SaveFigBuilder} for method chain
     */
    SaveFigBuilder orientation(OrientationType arg);

    /**
     * Set the paper type format.
     * <p>One of 'letter', 'legal', 'executive', 'ledger', 'a0' through 'a10', 
     * 'b0' through 'b10'. Only supported for postscript output.</p>
     * 
     * @param arg   an instance of the {@link PaperType} enum defining the type
     *              of paper to be used
     * @return  the instance of {@link SaveFigBuilder} for method chain
     */
    SaveFigBuilder paperType(PaperType arg);

}
