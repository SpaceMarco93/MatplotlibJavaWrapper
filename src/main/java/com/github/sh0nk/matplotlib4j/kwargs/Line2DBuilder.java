package com.github.sh0nk.matplotlib4j.kwargs;

import com.github.sh0nk.matplotlib4j.builder.Builder;
import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.LineStyleType;
import com.github.sh0nk.matplotlib4j.enums.MarkerStyleType;
import com.github.sh0nk.matplotlib4j.enums.ParametrizedLineStyleType;

public interface Line2DBuilder<T extends Builder> extends KwargsBuilder {

    T linestyle(String arg);

    T linestyle(LineStyleType arg);

    T linestyle(ParametrizedLineStyleType arg);

    T ls(String arg);

    T ls(LineStyleType arg);

    T ls(ParametrizedLineStyleType arg);

    T linewidth(double arg);

    T lw(double arg);

    T label(String arg);

    T color(String arg);

    T color(ColorType arg);

    T marker(String arg);

    T marker(MarkerStyleType arg);

    T markerColor(String arg);

    T markerColor(ColorType arg);

    T mec(String arg);

    T mec(ColorType arg);

    T markerSize(double arg);

    T ms(double arg);
    
}
