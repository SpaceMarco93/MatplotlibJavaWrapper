package com.github.sh0nk.matplotlib4j.axes.builder;

import com.github.sh0nk.matplotlib4j.TypeConversion;
import com.google.common.base.Joiner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * {@link CompositeAxesBuilder} handles positional arguments and keyword arguments to 
 * methods by {@link #build()} call on behalf of the ownerBuilder with a common way.
 *
 * @param <T> Owner builder class
 */
public class CompositeAxesBuilder<T extends Builder3D> implements Builder3D {

    // Unique instance of the logger
    private final static Logger LOGGER = LoggerFactory.getLogger(CompositeAxesBuilder.class);

    // Instance variable containing a list collecting all the arguments
    private List<Object> args = new LinkedList<>();

    // Instance variable containing a map connecting keys with their argument
    private Map<String, Object> kwargs = new HashMap<>();

    /**
     * Instance variable containing the name of a method to be used before the one
     * related to the builder. For example, if I pass a "stop()" string, the build
     * method will generate two lines in this way:
     * 
     * stop()
     * plt.ownerBuilder.getMethodName()
     */
    private String beforeMethodOutput = null;

    /**
     * Instance variable containing the name of a method to be used after the one
     * related to the builder. For example, if I pass a "stop()" string, the build
     * method will generate two lines in this way:
     * 
     * plt.ownerBuilder.getMethodName()
     * stop()
     */
    private String afterMethodOutput = null;

    // Variable containing the instance of the builder to be built
    private final T ownerBuilder;

    // Variable defining a unique string to instantiate a specific builder
    private String retName = "ret_" + UUID.randomUUID().toString().replace('-', '_');

    // Public constructor
    public CompositeAxesBuilder(T ownerBuilder) {
        this.ownerBuilder = ownerBuilder;
    }

    // Method to convert the numerical data in a numpy array
    private String wrapWithNdArray(String listAsStr) {
        // Change all the array_like arguments from python list to np.array because .shape is called in pcolor
        return "np.array(" + listAsStr + ")";
    }

    // Method to add a list of arguments without keys to the builder instance
    public T addToArgs(List<?> objs) {
        args.add(wrapWithNdArray(TypeConversion.INSTANCE.typeSafeList(objs).toString()));
        return ownerBuilder;
    }

    // Method to add bi-dimensional arguments (list of list arguments) without keys to the builder instance
    public T add2DimListToArgs(List<? extends List<? extends Number>> numbers) {
        args.add(wrapWithNdArray(
                numbers.stream().map(TypeConversion.INSTANCE::typeSafeList).collect(Collectors.toList()).toString()
        ));
        return ownerBuilder;
    }

    // Method to add a single "string" argument without the key to the builder
    public T addToArgs(String v) {
        // TODO: Do it with StringBuilder on join
        args.add("\"" + v + "\"");
        return ownerBuilder;
    }

    // Method to add a single "string" argument without the key and quotes to the builder
    public T addToArgsWithoutQuoting(String v) {
        args.add(v);
        return ownerBuilder;
    }

    // Method to add a numerical argument without the key to the builder
    public T addToArgs(Number n) {
        args.add(n);
        return ownerBuilder;
    }

    // Method to add a string couple keyword-argument to the builder
    public T addToKwargs(String k, String v) {
        // TODO: Do it with StringBuilder on join
        kwargs.put(k, "\"" + v + "\"");
        return ownerBuilder;
    }

    // Method to add a string couple keyword-argument to the builder without quotes
    public T addToKwargsWithoutQuoting(String k, String v) {
        kwargs.put(k, v);
        return ownerBuilder;
    }

    // Method to add a couple string keyword-numerical argument to the builder
    public T addToKwargs(String k, Number n) {
        kwargs.put(k, n);
        return ownerBuilder;
    }

    // Method to add a couple string keyword-list of number argument to the builder
    public T addToKwargs(String k, List<? extends Number> v) {
        kwargs.put(k, v);
        return ownerBuilder;
    }

    // Method to add a couple string keyword-boolean argument to the builder
    public T addToKwargs(String k, boolean v) {
        kwargs.put(k, v ? "True" : "False");
        return ownerBuilder;
    }

    // Method to set the method to be called before the one related to the builder
    public void setBeforeMethodOutput(String arg) {
        beforeMethodOutput = arg;
    }

    // Method to set the method to be called after the one related to the builder
    public void setAfterMethodOutput(String arg) {
        afterMethodOutput = arg;
    }

    // Implementation of the build method
    @Override
    public String build() {
        StringBuilder sb = new StringBuilder();
        if (beforeMethodOutput != null) {
            sb.append(beforeMethodOutput);
        }

        // retName
        if (ownerBuilder instanceof FigureBuilder || ownerBuilder instanceof SaveFigBuilder){
            sb.append("plt.");
        } else {
            sb.append("ax.");
        }
        sb.append(ownerBuilder.getMethodName());
        sb.append("(");

        // Args
        // TODO: type conversion
        Joiner.on(',').appendTo(sb, args);

        // Kwargs
        if (!kwargs.isEmpty()) {
            if (!args.isEmpty()) {
                sb.append(',');
            }
            Joiner.on(',').withKeyValueSeparator("=").appendTo(sb, kwargs);
        }

        sb.append(")");

        if (afterMethodOutput != null) {
            sb.append(afterMethodOutput);
        }

        String str = sb.toString();
        LOGGER.debug(".plot command: {}", str);
        return str;
    }

    // Throw an exception because this builder is not associated to a real method
    @Override
    public String getMethodName() {
        throw new UnsupportedOperationException("CompositeBuilder doesn't have any real method.");
    }

    // Get the instance identifier
    public String getRetName() {
        return retName;
    }

}

