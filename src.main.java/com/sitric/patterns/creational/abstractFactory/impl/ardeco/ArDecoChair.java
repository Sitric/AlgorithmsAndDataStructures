package com.sitric.patterns.creational.abstractFactory.impl.ardeco;

import com.sitric.patterns.creational.abstractFactory.api.Chair;

public class ArDecoChair implements Chair {
    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public String getDescription() {
        return "Chair in art deco style";
    }
}
