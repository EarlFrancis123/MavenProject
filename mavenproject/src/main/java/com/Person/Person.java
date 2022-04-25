package com.Person;

import java.util.Scanner;

import javax.naming.spi.DirObjectFactory;

import com.Vehicle.Vehicle;

/**
 * Comment!
 */

public class Person {
  public String firstName;
  public String lastName;
  public int age;
  public String location;
  public   String travelVehicle;
  public   double travelDistance;
  public double gasConsumption;
  
 /**
 * Comment!
 */

    public Person(String firstName, String lastName, int age, String location, String travelVehicle ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.location =location;
        this.travelVehicle=travelVehicle;
    }

    
        public double getTravelDistance() {
    return travelDistance;
}

public void setTravelDistance(double travelDistance) {
    this.travelDistance = travelDistance;
}


    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getTravelVehicle() {
        return travelVehicle;
    }
    public void setTravelVehicle(String travelVehicle) {
        this.travelVehicle = travelVehicle;
    }


 
}
