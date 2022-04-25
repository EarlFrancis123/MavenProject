package com.Vehicle;
/**
 * Comment!
 */
public class Car extends Vehicle {
    /**
 * Comment!
 */
    public String storageCapacity;
    public Car(int numberOfWheels, String engine, double gas, String vehiclename, String storageCapacity) {
        super(numberOfWheels, engine,gas,vehiclename);
        this.storageCapacity = storageCapacity;
    }
}
