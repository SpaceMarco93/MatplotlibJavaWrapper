package com.github.sh0nk.matplotlib4j.pyplot.builder;

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
public interface SaveFigBuilder extends Builder {

    // If format is set, it determines the output format, and the file is saved as fname.
    SaveFigBuilder fName(String arg);

    // If True, the Axes patches will all be transparent;
    SaveFigBuilder transparent(boolean arg);

    // The resolution in dots per inch. If 'figure', use the figure's dpi value.
    SaveFigBuilder dpi(double arg);

    // The file format, e.g. 'png', 'pdf', 'svg',
    SaveFigBuilder format(FormatType arg);

    // The facecolor of the figure
    SaveFigBuilder faceColor(ColorType arg);

    // The edgecolor of the figure.
    SaveFigBuilder edgeColor(ColorType arg);

    // Currently only supported by the postscript backend.
    SaveFigBuilder orientation(OrientationType arg);

    // One of 'letter', 'legal', 'executive', 'ledger', 'a0' through 'a10', 'b0' through 'b10'.
    SaveFigBuilder paperType(PaperType arg);

}
