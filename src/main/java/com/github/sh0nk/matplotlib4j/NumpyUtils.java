package com.github.sh0nk.matplotlib4j;

import com.google.common.base.Preconditions;
import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;

import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Class defining some of the useful functionalities provided by Numpy package.
 * This is not a wrapping to the Python Numpy package but it is just a Java 
 * implementation to get the same results.
 */
public class NumpyUtils {

    // TODO: more options from numpy
    
    /**
     * Linspace method.
     * <p> This method is used to get the same result of Numpy "linspace". It creates
     * creates an array of evenly spaced values within a specified interval limited
     * by {@code start} and {@code end} specifying the total number of points 
     * {@code num}.</p>
     * 
     * @param start         starting value of the interval range
     * @param end           ending value of the interval range
     * @param num           total number of points
     * @return              a list of values representing the equally spaced array
     */
    public static List<Double> linspace(double start, double end, int num) {
        Preconditions.checkArgument(num >= 0);
        return ContiguousSet.create(Range.closedOpen(0, num), DiscreteDomain.integers())
                .stream().map(x -> (x  * (end - start)) / (num - 1) + start).collect(Collectors.toList());
    }

    /**
     * Arange method.
     * <p> This method is used to get the same result of Numpy "arange". It creates
     * creates an array of evenly spaced values within a specified interval limited
     * by {@code start} and {@code end} specifying the step size {@code step}.</p>
     * 
     * @param start         starting value of the interval range
     * @param end           ending value of the interval range
     * @param step          step size
     * @return              a list of values representing the equally spaced array
     */
    public static List<Double> arange(double start, double end, double step) {
        double scaledStart = start / step;
        double scaledEnd = end / step;
        double floorGap = scaledStart - (int) scaledStart;
        return ContiguousSet.create(Range.closed((int) scaledStart, (int) scaledEnd), DiscreteDomain.integers())
                .stream().map(x -> (x + floorGap) * step).collect(Collectors.toList());
    }

    /**
     * Meshgrid method.
     * <p> This method is used to get the same result of Numpy meshgrid. This 
     * function is used to create a rectangular grid of {@code x} and {@code y} 
     * values. It generates coordinate matrices from coordinate vectors, allowing 
     * for vectorized evaluations of scalar/vector fields over N-D grids.</p>
     * 
     * @param <T>       generic parameter identifying the type of number
     * @param x         list of x-values defining the rectangular grid
     * @param y         list of y-values defining the rectangular grid
     * @return  a {@link Grid} object representing a rectangular grid useful for 
     * evaluation of two-dimensional functions.
     */
    public static <T extends Number> Grid<T> meshgrid(List<T> x, List<T> y) {
        Grid<T> grid = new Grid<>();
        grid.x = IntStream.range(0, y.size()).mapToObj(i -> x).collect(Collectors.toList());
        grid.y = y.stream().map(t -> (IntStream.range(0, x.size()).mapToObj(i -> t).collect(Collectors.toList()))).collect(Collectors.toList());
        return grid;
    }

    /**
     * Static internal class used to define an object of type {@link Grid}. This
     * class represents a rectangular grid useful for the evaluation of two-dimensional
     * functions.
     */
    public static class Grid<T extends Number> {

        // Interval class variable identifying the x-coordinates of the rectangular grid
        public List<List<T>> x;

        // Interval class variable identifying the y-coordinates of the rectangular grid
        public List<List<T>> y;

        /**
         * Compute a two-dimensional function.
         * <p>This method is used to compute the z-coordinate of a two-dimensional
         * function over a rectangular grid. </p>
         * 
         * @param <R>           generic type specifying the type for the z-coordinate
         * @param biFunction    biFunction instance representing the f(x, y)
         * @return  the value of the z-coordinates over the rectangular grid.
         */
        public <R> List<List<R>> calcZ(BiFunction<T, T, R> biFunction) {
            return IntStream.range(0, x.size()).mapToObj(i ->
                IntStream.range(0, x.get(i).size()).mapToObj(j ->
                    biFunction.apply(x.get(i).get(j), y.get(i).get(j))
                ).collect(Collectors.toList())
            ).collect(Collectors.toList());
        }
    }

}
