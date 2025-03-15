package com.github.sh0nk.matplotlib4j.pyplot.builder;

import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.FormatType;
import com.github.sh0nk.matplotlib4j.enums.OrientationType;
import com.github.sh0nk.matplotlib4j.enums.PaperType;

/**
 * This class is implementing all the methods defined in the relative interface
 * {@link SaveFigBuilder}.
 * The first section defines the @Override of all the *args associated to this
 * method, while the second section invokes all the **kwargs which are imported
 * by the related object.
 */
public class SaveFigBuilderImpl implements SaveFigBuilder {

    // Variable defining the builder for the main method
    private final CompositeBuilder<SaveFigBuilder> innerBuilder = new CompositeBuilder<>(this);

    // Public constructor
    public SaveFigBuilderImpl() {}

    // *args section
    @Override
    public SaveFigBuilder dpi(double arg) {
        return innerBuilder.addToKwargs("dpi", arg);
    }

    @Override
    public SaveFigBuilder orientation(OrientationType arg) {
        return innerBuilder.addToKwargs("orientation", arg.getOrientation());
    }

    @Override
    public SaveFigBuilder paperType(PaperType arg) {
        return innerBuilder.addToKwargs("papertype", arg.getPaper());
    }

    @Override
    public SaveFigBuilder format(FormatType arg) {
        return innerBuilder.addToKwargs("format", arg.getFormat());
    }

    @Override
    public SaveFigBuilder transparent(boolean arg) {
        return innerBuilder.addToKwargs("transparent", arg);
    }
 
    @Override
    public SaveFigBuilder fName(String arg) {
        return innerBuilder.addToArgs(arg);
    }

    @Override
    public SaveFigBuilder faceColor(ColorType arg) {
        return innerBuilder.addToKwargs("facecolor", arg.getColor());
    }

    @Override
    public SaveFigBuilder edgeColor(ColorType arg) {
        return innerBuilder.addToKwargs("edgecolor", arg.getColor());
    }

    // Implement the builder interface methods
    @Override
    public String build() {
        return innerBuilder.build();
    }

    @Override
    public String getMethodName() {
        return "savefig";
    }

}
