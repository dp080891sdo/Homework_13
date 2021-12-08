package com.sviatukhov.vehicles;

import com.sviatukhov.details.Engine;
import com.sviatukhov.professions.Driver;

public class Lorry extends Car {
    public int carrying;

    public Lorry(String carClass, Engine engine, Driver driver, String marka) {
        super(carClass, engine, driver, marka);
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carClass='" + carClass + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                ", marka='" + marka + '\'' +
                ", carrying=" + carrying +
                '}';
    }
}
