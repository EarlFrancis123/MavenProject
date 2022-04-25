package com.Vehicle;
/**
 * Comment!
 */
public class Bike extends Vehicle{
    /**
 * Comment!
 */
    public String wheelPower;
    public Bike(int numberOfWheels, String engine, double gas, String vehiclename, String wheelPower) {
        super(numberOfWheels, engine,gas , vehiclename);
        this.wheelPower = wheelPower;
    }
}
