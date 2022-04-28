
package com.Person;

import java.util.Scanner;

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
Scanner inputsc = new Scanner(System.in);


    public Person(String firstName, String lastName, int age, String location, String travelVehicle ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.location =location;
        this.travelVehicle=travelVehicle;
    }

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
      
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
    

    public void Travel(){
                inputsc.nextLine(); 
                System.out.println("Please input Car name");
                travelVehicle = inputsc.nextLine();
                System.out.println("Please input Travel Location");
                location = inputsc.nextLine();
                System.out.println("Please input Travel Distances");
                travelDistance = inputsc.nextDouble();
                
    }

 
}
