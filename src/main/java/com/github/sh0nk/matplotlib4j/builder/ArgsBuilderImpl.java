package com.github.sh0nk.matplotlib4j.builder;

import com.google.common.base.Joiner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedList;
import java.util.List;


public class ArgsBuilderImpl implements Builder {

    private final static Logger LOGGER = LoggerFactory.getLogger(ArgsBuilderImpl.class);

    private final String key;
    List<Object> args = new LinkedList<>();

    public ArgsBuilderImpl(String key) {
        this.key = key;
    }

    public ArgsBuilderImpl(String key, String arg) {
        this.key = key;
        addStringToArgs(arg);
    }

    public ArgsBuilderImpl(String key, ArgsBuilderImpl arg) {
        this.key = key;
        addKeyToArgs(arg);
    }

    public ArgsBuilderImpl(String key, String arg1, String arg2) {
        this.key = key;
        addStringToArgs(arg1);
        addStringToArgs(arg2);
    }

    public ArgsBuilderImpl(String key, Number arg) {
        this.key = key;
        addStringToArgs(arg);
    }

    public ArgsBuilderImpl(String key, Number arg1, Number arg2) {
        this.key = key;
        addStringToArgs(arg1);
        addStringToArgs(arg2);
    }

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
