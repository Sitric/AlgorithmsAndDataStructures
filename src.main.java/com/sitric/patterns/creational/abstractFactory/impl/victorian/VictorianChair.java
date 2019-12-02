package com.sitric.patterns.creational.abstractFactory.impl.victorian;

import com.sitric.patterns.creational.abstractFactory.api.Chair;

public class VictorianChair implements Chair {
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public String getDescription() {
        return "Chair in victorian style";
    }
}
