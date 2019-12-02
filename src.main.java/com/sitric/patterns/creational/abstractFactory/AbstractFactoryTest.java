package com.sitric.patterns.creational.abstractFactory;

import com.sitric.patterns.creational.abstractFactory.api.FurnitureFactory;
import com.sitric.patterns.creational.abstractFactory.api.Table;
import com.sitric.patterns.creational.abstractFactory.impl.factory.VictoriansFurnitureFactory;

/**
 * Абстрактная фабрика - порождающий паттерн
 * Для реализации необходимо:
 * 1. Выделить интерфейсы для продуктов, составляющих семейство
 * 2. Создать абстрактную фабрику - общий интерфейс, который содержит методы по созданию всех продуктов семейства
 *
 * Клиентский код должен работать как с фабриками, так и с продуктами через общие интерфейсы
 *
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        FurnitureFactory factory = new VictoriansFurnitureFactory();
        Table table = factory.createTable();
        System.out.println(table.getDescription());
    }
}
