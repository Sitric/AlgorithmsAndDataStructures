package com.sitric.patterns.creational.abstractFactory.impl.ardeco;

import com.sitric.patterns.creational.abstractFactory.api.Table;

public class ArDecoTable implements Table {
    @Override
    public boolean isWooden() {
        return false;
    }

    @Override
    public String getDescription() {
        return "table in art deco style";
    }
}
