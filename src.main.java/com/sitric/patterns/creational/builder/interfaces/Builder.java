package com.sitric.patterns.creational.builder.interfaces;

import com.sitric.patterns.creational.builder.product.Type;
import com.sitric.patterns.creational.builder.product.components.Engine;
import com.sitric.patterns.creational.builder.product.components.GPSNavigator;
import com.sitric.patterns.creational.builder.product.components.Transmission;
import com.sitric.patterns.creational.builder.product.components.TripComputer;

/**
 * Объявляет все возможные шаги конфигурации
 */
public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripcomputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
