package com.sitric.patterns.creational.builder;

import com.sitric.patterns.creational.builder.director.Director;
import com.sitric.patterns.creational.builder.impl.CarBuilder;
import com.sitric.patterns.creational.builder.impl.CarManualBuilder;
import com.sitric.patterns.creational.builder.product.Car;
import com.sitric.patterns.creational.builder.product.Manual;

/**
 * Builder — это порождающий паттерн проектирования, который позволяет создавать объекты пошагово.
 * позволяет производить различные продукты, используя один и тот же процесс строительства
 */
public class BuilderTest {
    public static void main(String[] args) {
        Director director = new Director();

        // Директор получает объект конкретного строителя от клиента
        // (приложения). Приложение само знает какой строитель использовать,
        // чтобы получить нужный продукт.
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        // Готовый продукт возвращает строитель, так как Директор чаще всего не
        // знает и не зависит от конкретных классов строителей и продуктов.
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getType());


        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Директор может знать больше одного рецепта строительства.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
