package com.Vehicle;
/**
 * Comment!
 */
public class Vehicle {
    /**
 * Comment!
 */
    public int numberOfWheels;
    public String engine;
    public double gas;
    public double gasConsumption;
    public String vehiclename;

      public Vehicle(int numberOfWheels, String engine){
          this.numberOfWheels = numberOfWheels;
          this.engine = engine;
      }

      
      public Vehicle(int numberOfWheels, String engine, double gas, String vehiclename){
        this.numberOfWheels = numberOfWheels;
        this.engine = engine;
        this.gas = gas;
        this.vehiclename=vehiclename;
    }
    public Vehicle(double gas){
        this.gas = gas;
    }
    public double getGas() {
        return gas;
    }
    public void setGas(double gas) {
        this.gas = gas;
    }
    
}
