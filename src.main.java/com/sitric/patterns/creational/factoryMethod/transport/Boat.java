package com.sitric.patterns.creational.factoryMethod.transport;

public class Boat extends Transport {
    @Override
    public void deliver() {
        System.out.println("Доставим на судне по морю");
    }
}
