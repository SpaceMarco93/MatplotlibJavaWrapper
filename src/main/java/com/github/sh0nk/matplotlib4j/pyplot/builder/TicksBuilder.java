package com.github.sh0nk.matplotlib4j.pyplot.builder;

import java.util.List;

import com.github.sh0nk.matplotlib4j.pyplot.kwargs.TextArgsBuilder;

/**
 * This interface is defining all the *args associated to the "xticks" method and
 * "yticks" defined in pyplot. 
 * 
 * matplotlib.pyplot.xticks(ticks=None, labels=None, **kwargs)
 * matplotlib.pyplot.yticks(ticks=None, labels=None,  **kwargs)
 */
public interface TicksBuilder extends Builder2D, TextArgsBuilder<TicksBuilder> {

    /**
     * Set the list of xtick locations. Passing an empty list removes all xticks.
     * 
     * @param ticks   the list of xtick locations.
     * @return  the instance of {@link TicksBuilder} for method chain
     */ 
    TicksBuilder xTicks(List<? extends Number> ticks);

    /**
     * Set the list of ytick locations. Passing an empty list removes all yticks.
     * 
     * @param ticks   the list of ytick locations.
     * @return  the instance of {@link TicksBuilder} for method chain
     */ 
    TicksBuilder yTicks(List<? extends Number> ticks);

    /**
     * Set the labels to place at the given ticks locations. This argument can only 
     * be passed if ticks is passed as well.
     * 
     * @param labels    the list of labels to be placed at the given ticks
     * @return  the instance of {@link TicksBuilder} for method chain
     */
    TicksBuilder labels(List<String> labels);
    
}
