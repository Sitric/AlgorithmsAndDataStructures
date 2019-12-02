package com.sitric.patterns.creational.factoryMethod.logistics;

import com.sitric.patterns.creational.factoryMethod.transport.Transport;

public abstract class Logistics {
    abstract Transport createTransport();
    public void planDelivery() {
        Transport t = createTransport();
        t.deliver();
    }
}
