package com.sitric.patterns.creational.factoryMethod.logistics;

import com.sitric.patterns.creational.factoryMethod.transport.Boat;
import com.sitric.patterns.creational.factoryMethod.transport.Transport;

public class SeaLogistics extends Logistics {
    @Override
    Transport createTransport() {
        return new Boat();
    }
}
