package com.sitric.patterns.creational.factoryMethod;

import com.sitric.patterns.creational.factoryMethod.logistics.Logistics;
import com.sitric.patterns.creational.factoryMethod.logistics.RoadLogistics;

/**
 * Фабричный метод — порождающий паттерн
 * определяет общий интерфейс для создания объектов в суперклассе,
 * позволяя подклассам изменять тип создаваемых объектов.
 * <p>
 * Применимость:
 * <p>
 * 1. Если заранее неизвестны типы и зависимости объектов, с которыми должен работать ваш код.
 * 2. Если нужно  дать возможность пользователям расширять части фреймворка или библиотеки.
 * 3. Для экономии системных ресурсов, повторно используя уже созданные объекты, вместо порождения новых.
 */
public class FactoryTest {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        logistics.planDelivery();
    }
}
