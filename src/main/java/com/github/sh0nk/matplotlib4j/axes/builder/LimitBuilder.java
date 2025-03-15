package com.github.sh0nk.matplotlib4j.axes.builder;

/**
 * This interface is defining all the *args associated to the "set_xlim", "set_ylim",
 * and "set_zlim" methods defined in Axes. 
 * 
 * matplotlib.axes.Axes.set_xlim(left=None, right=None, *, emit=True, auto=False, xmin=None, xmax=None)
 * matplotlib.axes.Axes.set_ylim(left=None, right=None, *, emit=True, auto=False, xmin=None, xmax=None)
 * matplotlib.axes.Axes.set_zlim(left=None, right=None, *, emit=True, auto=False, xmin=None, xmax=None)
 */
public interface LimitBuilder extends Builder3D {

    /**
     * Set the x limits of the current Axes.
     * 
     * @param left      lower boundary of the x-axis
     * @param right     upper boundary of the x-axis
     * @return  the instance of {@link LimitBuilder} for method chain  
     */
    LimitBuilder xLim(Number left, Number right);

    /**
     * Set the y limits of the current Axes.
     * 
     * @param left      lower boundary of the y-axis
     * @param right     upper boundary of the y-axis
     * @return  the instance of {@link LimitBuilder} for method chain  
     */
    LimitBuilder yLim(Number left, Number right);

    /**
     * Set the z limits of the current Axes.
     * 
     * @param left      lower boundary of the z-axis
     * @param right     upper boundary of the z-axis
     * @return  the instance of {@link LimitBuilder} for method chain  
     */
    LimitBuilder zLim(Number left, Number right);
}
