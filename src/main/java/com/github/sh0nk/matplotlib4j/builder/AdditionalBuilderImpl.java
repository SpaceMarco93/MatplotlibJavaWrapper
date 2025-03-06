package com.github.sh0nk.matplotlib4j.builder;

import java.util.LinkedList;
import java.util.List;

import com.google.common.base.Joiner;

/*
 * 
 */
public class AdditionalBuilderImpl implements Builder {

    private final String method;
    List<Object> args = new LinkedList<>();

    public AdditionalBuilderImpl(String method, String key, String arg) {
        this.method = method;
        addStringToArgs(key, arg);
    }

    public AdditionalBuilderImpl(String method, String key, boolean arg) {
        this.method = method;
        addStringToArgs(key, arg);
    }

    private AdditionalBuilderImpl addStringToArgs(String key, String arg) {
        args.add(key + "=" + "\'" + arg + "\'");
        return this;
    }

    private AdditionalBuilderImpl addStringToArgs(String key, Boolean arg) {
        String flag = (arg) ? "True" : "False";
        args.add(key + "=" + flag);
        return this;
    }

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
