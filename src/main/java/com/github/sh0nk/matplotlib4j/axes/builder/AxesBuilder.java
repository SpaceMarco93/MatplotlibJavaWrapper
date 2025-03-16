package com.github.sh0nk.matplotlib4j.axes.builder;

import com.github.sh0nk.matplotlib4j.enums.AspectType;

/**
 * This interface is defining all the *args associated to the "Axes" method
 * defined in Axes. 
 * 
 * matplotlib.axes.Axes(fig, *args, facecolor=None, frameon=True, sharex=None, 
 * sharey=None, label='', xscale=None, yscale=None, box_aspect=None, 
 * forward_navigation_events='auto', **kwargs)
 */
public interface AxesBuilder extends Builder3D{

    /**
     * Set the axes aspect ratio.
     * 
     * @param arg   an instance of the enum {@link AspectType} to set the aspect
     *              ratio
     * @return  an instance of the {@link AxesBuilder} for method chain
     */
    AxesBuilder setAspect(AspectType arg);

}
