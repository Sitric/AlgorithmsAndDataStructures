package com.sitric.patterns.creational.abstractFactory.impl.factory;

import com.sitric.patterns.creational.abstractFactory.api.Chair;
import com.sitric.patterns.creational.abstractFactory.api.FurnitureFactory;
import com.sitric.patterns.creational.abstractFactory.api.Table;
import com.sitric.patterns.creational.abstractFactory.impl.ardeco.ArDecoChair;
import com.sitric.patterns.creational.abstractFactory.impl.ardeco.ArDecoTable;

public class ArDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArDecoChair();
    }

    @Override
    public Table createTable() {
        return new ArDecoTable();
    }
}
