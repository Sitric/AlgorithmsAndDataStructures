package com.sitric.patterns.creational.factoryMethod.logistics;

import com.sitric.patterns.creational.factoryMethod.transport.Transport;
import com.sitric.patterns.creational.factoryMethod.transport.Truck;

public class RoadLogistics extends Logistics {
    @Override
    Transport createTransport() {
        return new Truck();
    }
}
