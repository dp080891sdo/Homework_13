package com.sviatukhov.vehicles;

import com.sviatukhov.details.Engine;
import com.sviatukhov.professions.Driver;

public class SportCar extends Car {
    public double speed;

    public SportCar(String carClass, Engine engine, Driver driver, String marka) {
        super(carClass, engine, driver, marka);
    }

    public SportCar(String carClass, Engine engine, Driver driver, String marka, double speed) {
        super(carClass, engine, driver, marka);
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "sportCar{" +
                "carClass='" + carClass + '\'' +
                ", engine=" + engine +
                ", driver=" + driver +
                ", marka='" + marka + '\'' +
                ", speed=" + speed +
                '}';
    }
}
