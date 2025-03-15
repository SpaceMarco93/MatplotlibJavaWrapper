package com.github.sh0nk.matplotlib4j.axes.builder;

import java.util.LinkedList;
import java.util.List;

import com.google.common.base.Joiner;

/*
 * Class that is born to define a builder for the functions that have been not
 * wrapped in a dedicated builder. 
 */
public class AdditionalBuilderImpl implements Builder3D {

    // Variable storing the higher level function to be wrapped
    private final String method;

    // Variable containing the list of arguments required by the method
    List<Object> args = new LinkedList<>();

    // Public constructor providing method name, key and argument
    public AdditionalBuilderImpl(String method, String key, String arg) {
        this.method = method;
        addStringToArgs(key, arg);
    }

    // Public constructor providing method name, key and argument, and axis name
    public AdditionalBuilderImpl(String method, String axisName, String key, double arg) {
        this.method = method;
        addLabelNameFont(axisName, key, arg);
    }

    // Public constructor providing method name, key and boolean variable
    public AdditionalBuilderImpl(String method, String key, boolean arg) {
        this.method = method;
        addStringToArgs(key, arg);
    }

    // Private method to add a keyword and its argument
    private AdditionalBuilderImpl addStringToArgs(String key, String arg) {
        args.add(key + "=" + "\'" + arg + "\'");
        return this;
    }

    // Private method to add a keyword and its boolean variable
    private AdditionalBuilderImpl addStringToArgs(String key, Boolean arg) {
        String flag = (arg) ? "True" : "False";
        args.add(key + "=" + flag);
        return this;
    }

    // Private method to add a keyword, its argument and the axis is related to
    private AdditionalBuilderImpl addLabelNameFont(String axisName, String key, double arg) {
        args.add("\'" + axisName + "\'"+ "," + key + "=" + "\'" + arg + "\'");
        return this;
    }

    // Interface methods implementation
    @Override
    public String build() {
        StringBuilder sb = new StringBuilder();
        sb.append(".");
        sb.append(method);
        sb.append("(");
        Joiner.on(",").appendTo(sb, args);
        sb.append(")");

        String str = sb.toString();
        return str;

    }

    @Override
    public String getMethodName() {
        return method;
    }

}
