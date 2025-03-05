package com.github.sh0nk.matplotlib4j.builder;

public class GridBuilderImpl implements GridBuilder {

    private CompositeBuilder<GridBuilder> innerBuilder = new CompositeBuilder<>(this);

    public GridBuilderImpl(boolean flag) {
        setGrid(flag);
    }

    @Override
    public String build() {
        return innerBuilder.build();
    }

    @Override
    public String getMethodName() {
        return "grid";
    }

    @Override
    public GridBuilder setGrid(boolean flag) {

        if (flag) {
            return innerBuilder.addToKwargsWithoutQuoting("visible", "True");
        } else {
            return innerBuilder.addToKwargsWithoutQuoting("visible", "False");
        }
    }

}
