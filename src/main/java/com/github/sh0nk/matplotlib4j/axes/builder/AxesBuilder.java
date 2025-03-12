package com.github.sh0nk.matplotlib4j.axes.builder;

import java.util.List;

import com.github.sh0nk.matplotlib4j.kwargs.Line2DBuilder;
import com.github.sh0nk.matplotlib4j.pyplot.builder.Builder;

public interface AxesBuilder extends Builder, Line2DBuilder<AxesBuilder> {

    AxesBuilder add(List<? extends Number> x, List<? extends Number> y);

    AxesBuilder add(List<? extends Number> x, List<? extends Number> y, String fmt);

    AxesBuilder add(List<? extends Number> x, List<? extends Number> y, List<? extends Number> z);

    // AxesBuilder plot(List<? extends Number> x, List<? extends Number> y, List<? extends Number> z);

    // AxesBuilder grid(boolean flag);

    // AxesBuilder xLabel(String axisName);

    // AxesBuilder xLabel(String axisName, double fontSize);

    // AxesBuilder yLabel(String axisName);

    // AxesBuilder yLabel(String axisName, double fontSize);

    // AxesBuilder zLabel(String axisName);

    // AxesBuilder zLabel(String axisName, double fontSize);

}
