package com.sitric.patterns.creational.builder.impl;

import com.sitric.patterns.creational.builder.interfaces.Builder;
import com.sitric.patterns.creational.builder.product.Manual;
import com.sitric.patterns.creational.builder.product.Type;
import com.sitric.patterns.creational.builder.product.components.Engine;
import com.sitric.patterns.creational.builder.product.components.GPSNavigator;
import com.sitric.patterns.creational.builder.product.components.Transmission;
import com.sitric.patterns.creational.builder.product.components.TripComputer;

public class CarManualBuilder implements Builder {
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
