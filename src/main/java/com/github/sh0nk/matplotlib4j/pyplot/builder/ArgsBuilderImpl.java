package com.github.sh0nk.matplotlib4j.pyplot.builder;

import com.google.common.base.Joiner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;

import com.github.sh0nk.matplotlib4j.pyplot.Plot;

/**
 * This class is not implementing any specific interface. This class is only
 * implementing the generic Builder interface and it is used in case an additional
 * method wants to be added without the definition of a dedicated "interface" and
 * "implementation" class.
 * For example, the "close" method defined in the {@link Plot} interface has not
 * a "CloseBuilder" dedicated interface. This is why the only way to pass it to 
 * the {@link CompositeBuilder} class is to define this generic implementing class.
 * It is obvious that this class becomes useless in case all the methods have a 
 * corresponding "interface" and "implementation" class.
 */
public class ArgsBuilderImpl implements Builder2D {

    // The unique instance of the logger
    private final static Logger LOGGER = LoggerFactory.getLogger(ArgsBuilderImpl.class);

    // The instance variable to save the key
    private final String key;

    // The list of arguments to be passed to the builder
    List<Object> args = new LinkedList<>();

    // Public constructor defining only the key
    public ArgsBuilderImpl(String key) {
        this.key = key;
    }

    // Public constructor defining the key and the argument
    public ArgsBuilderImpl(String key, String arg) {
        this.key = key;
        addStringToArgs(arg);
    }

    // Public constructor defining the key and an additional argument builder
    public ArgsBuilderImpl(String key, ArgsBuilderImpl arg) {
        this.key = key;
        addKeyToArgs(arg);
    }

    // Public constructor defining a key and two arguments
    public ArgsBuilderImpl(String key, String arg1, String arg2) {
        this.key = key;
        addStringToArgs(arg1);
        addStringToArgs(arg2);
    }

    // Public constructor defining a key a numerical argument
    public ArgsBuilderImpl(String key, Number arg) {
        this.key = key;
        addStringToArgs(arg);
    }

    // Public constructor defining a key and two numerical arguments
    public ArgsBuilderImpl(String key, Number arg1, Number arg2) {
        this.key = key;
        addStringToArgs(arg1);
        addStringToArgs(arg2);
    }

    // Private methods for string formatting
    private ArgsBuilderImpl addStringToArgs(String v) {
        // TODO: Do it with StringBuilder on join
        args.add("\"" + v + "\"");
        return this;
    }

    private ArgsBuilderImpl addStringToArgs(Number v) {
        args.add(v);
        return this;
    }

    private ArgsBuilderImpl addKeyToArgs(ArgsBuilderImpl v) {

        // Get the list
        List<Object> list = v.args;

        // Extract the object from the list
        Object [] array = list.toArray();

        this.args.add(v.key + "={" + array[0] + "}");

        return this;
    }

    // Implementation of the Builder interface methods
    @Override
    public String build() {
        StringBuilder sb = new StringBuilder();
        sb.append("plt.");
        sb.append(key);
        sb.append('(');
        Joiner.on(',').appendTo(sb, args);
        sb.append(')');

        String str = sb.toString();
        LOGGER.debug(".plot command: {}", str);
        return str;
    }

    @Override
    public String getMethodName() {
        return key;
    }
}
