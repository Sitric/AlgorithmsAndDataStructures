package com.sitric.patterns.creational.factoryMethod.transport;

public class Truck extends Transport {
    @Override
    public void deliver() {
        System.out.println("Доставим на грузовике по суше");
    }
}
