package com.github.sh0nk.matplotlib4j.kwargs;

import com.github.sh0nk.matplotlib4j.enums.ColorType;
import com.github.sh0nk.matplotlib4j.enums.DrawStyleType;
import com.github.sh0nk.matplotlib4j.enums.LineStyleType;
import com.github.sh0nk.matplotlib4j.enums.MarkerStyleType;
import com.github.sh0nk.matplotlib4j.enums.ParametrizedLineStyleType;
import com.github.sh0nk.matplotlib4j.pyplot.builder.Builder;

public interface Line3DBuilder<T extends Builder> extends KwargsBuilder {

    T alpha(double arg);

    T drawStyle(String arg);

    T drawStyle(DrawStyleType arg);

    T lineStyle(String arg);

    T lineStyle(LineStyleType arg);

    T lineStyle(ParametrizedLineStyleType arg);

    T ls(String arg);

    T ls(LineStyleType arg);

    T ls(ParametrizedLineStyleType arg);

    T lineWidth(double arg);

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

    T markEvery(int arg);
    
}
