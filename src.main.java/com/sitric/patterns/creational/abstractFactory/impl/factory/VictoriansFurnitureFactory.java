package com.sitric.patterns.creational.abstractFactory.impl.factory;

import com.sitric.patterns.creational.abstractFactory.api.Chair;
import com.sitric.patterns.creational.abstractFactory.api.FurnitureFactory;
import com.sitric.patterns.creational.abstractFactory.api.Table;
import com.sitric.patterns.creational.abstractFactory.impl.victorian.VictorianChair;
import com.sitric.patterns.creational.abstractFactory.impl.victorian.VictorianTable;

public class VictoriansFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }
}
