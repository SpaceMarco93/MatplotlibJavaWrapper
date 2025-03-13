package com.github.sh0nk.matplotlib4j.axes.builder;

import java.util.List;

import com.github.sh0nk.matplotlib4j.axes.kwargs.TextArgsBuilder;

/**
 * This interface is defining all the *args associated to the "set_xticks",
 * "set_yticks", and "set_zticks" defined in Axes. 
 * 
 * matplotlib.axes.Axes.set_xticks(ticks, labels=None, *, minor=False, **kwargs)
 * matplotlib.axes.Axes.set_yticks(ticks, labels=None, *, minor=False, **kwargs)
 * matplotlib.axes.Axes.set_zticks(ticks, labels=None, *, minor=False, **kwargs)
 */
public interface TicksBuilder extends Builder3D, TextArgsBuilder<TicksBuilder> {

    // Set the list of xtick locations. Passing an empty list removes all xticks.
    TicksBuilder xTicks(List<? extends Number> ticks);

    // Set the list of ytick locations. Passing an empty list removes all xticks.
    TicksBuilder yTicks(List<? extends Number> ticks);

    // Set the list of ztick locations. Passing an empty list removes all xticks.
    TicksBuilder zTicks(List<? extends Number> ticks);

    /**
     * The labels to place at the given ticks locations. This argument can only 
     * be passed if ticks is passed as well.
     */
    TicksBuilder labels(List<String> labels);
    
}
