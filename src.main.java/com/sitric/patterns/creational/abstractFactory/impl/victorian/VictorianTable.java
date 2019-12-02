package com.sitric.patterns.creational.abstractFactory.impl.victorian;

import com.sitric.patterns.creational.abstractFactory.api.Table;

public class VictorianTable implements Table {
    @Override
    public boolean isWooden() {
        return true;
    }

    @Override
    public String getDescription() {
        return "antique victorian coffee table";
    }
}
