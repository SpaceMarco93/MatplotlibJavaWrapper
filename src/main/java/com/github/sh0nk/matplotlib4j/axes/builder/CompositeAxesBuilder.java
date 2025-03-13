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
 * {@link CompositeAxesBuilder} handles positional arguments and keyword arguments to methods
 * by {@link #build()} call on behalf of the ownerBuilder with a common way.
 *
 * @param <T> Owner builder class
 */
public class CompositeAxesBuilder<T extends Builder3D> implements Builder3D {

    private final static Logger LOGGER = LoggerFactory.getLogger(CompositeAxesBuilder.class);

    private List<Object> args = new LinkedList<>();
    private Map<String, Object> kwargs = new HashMap<>();
    private String beforeMethodOutput = null;
    private String afterMethodOutput = null;

    private final T ownerBuilder;

    // get unique return value
    private String retName = "ret_" + UUID.randomUUID().toString().replace('-', '_');

    public CompositeAxesBuilder(T ownerBuilder) {
        this.ownerBuilder = ownerBuilder;
    }

    private String wrapWithNdArray(String listAsStr) {
        // Change all the array_like arguments from python list to np.array because .shape is called in pcolor
        return "np.array(" + listAsStr + ")";
    }

    public T addToArgs(List<?> objs) {
        args.add(wrapWithNdArray(TypeConversion.INSTANCE.typeSafeList(objs).toString()));
        return ownerBuilder;
    }

    public T add2DimListToArgs(List<? extends List<? extends Number>> numbers) {
        args.add(wrapWithNdArray(
                numbers.stream().map(TypeConversion.INSTANCE::typeSafeList).collect(Collectors.toList()).toString()
        ));
        return ownerBuilder;
    }

    public T addToArgs(String v) {
        // TODO: Do it with StringBuilder on join
        args.add("\"" + v + "\"");
        return ownerBuilder;
    }

    public T addToArgsWithoutQuoting(String v) {
        args.add(v);
        return ownerBuilder;
    }

    public T addToArgs(Number n) {
        args.add(n);
        return ownerBuilder;
    }

    public T addToKwargs(String k, String v) {
        // TODO: Do it with StringBuilder on join
        kwargs.put(k, "\"" + v + "\"");
        return ownerBuilder;
    }

    public T addToKwargsWithoutQuoting(String k, String v) {
        kwargs.put(k, v);
        return ownerBuilder;
    }

    public T addToKwargs(String k, Number n) {
        kwargs.put(k, n);
        return ownerBuilder;
    }

    public T addToKwargs(String k, List<? extends Number> v) {
        kwargs.put(k, v);
        return ownerBuilder;
    }

    public T addToKwargs(String k, boolean v) {
        kwargs.put(k, v ? "True" : "False");
        return ownerBuilder;
    }

    public void setBeforeMethodOutput(String arg) {
        beforeMethodOutput = arg;
    }

    public void setAfterMethodOutput(String arg) {
        afterMethodOutput = arg;
    }

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

    @Override
    public String getMethodName() {
        throw new UnsupportedOperationException("CompositeBuilder doesn't have any real method.");
    }

    public String getRetName() {
        return retName;
    }

}

