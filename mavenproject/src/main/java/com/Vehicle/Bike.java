package com.Vehicle;
/**
 * Comment!
 */
public class Bike extends Vehicle{
    /**
 * Comment!
 */
    public String wheeliePower;
    public Bike(int numberOfWheels, String engine, double gas, String vehiclename, String wheeliePower) {
        super(numberOfWheels, engine,gas , vehiclename);
        this.wheeliePower = wheeliePower;
    }
}
