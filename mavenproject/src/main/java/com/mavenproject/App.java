package com.mavenproject;

import java.util.Scanner;

import com.Person.*;

import com.Vehicle.*;

/**
 * Hello world!
 */

public final class App {
    private App() {
    }
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */

    public static void main(String[] args) {
        int option;
        double gasConsumption,travelDistance;
        Scanner inputsc = new Scanner(System.in);

        Student person1 = new Student("Earl", "Tajanlangit", 18, "4th year");
        Teacher person2 = new Teacher("Moma", "Ortega", 36, "Masters Degree");
        Bike vehicle1 = new Bike(2, "no engine", 30, "", "125");
        Car vehicle2 = new Car(4, "1200 horsepower", 20, "", "125");

        Person person = new Person("Earl ", "Tajanlangit", 30, "Cebu", "");
        
        do{
            System.out.println("Name: " + person.firstName +person.lastName + " Is Currently at "+ person.getLocation());
            System.out.println("___________________________________________________________________________________");
            System.out.println("Press [1] to Travel with Car");
            System.out.println("Press [2] to Travel with Motorcyle");
            System.out.println("Press [0] to END");
            System.out.println("___________________________________________________________________________________");
            option=inputsc.nextInt();
            inputsc.nextLine();

            if(option==1){
               
                System.out.println("Please input Car name");
                person.setTravelVehicle(inputsc.nextLine());
                System.out.println("Please input Travel Location");
                person.setLocation(inputsc.nextLine());
                System.out.println("Please input Travel Distances");
                travelDistance = inputsc.nextDouble();
                gasConsumption = travelDistance/15.5;
                if(gasConsumption > vehicle1.gas){
                    System.out.println("YOU DONT HAVE ENOUGH GAS");
                }
                else{
                vehicle1.setGas(vehicle1.getGas() - gasConsumption );
                System.out.println("Name: " + person.firstName +person.lastName + " traveled to: "+ person.getLocation() + " Using: " +person.getTravelVehicle() + " Current Gass Available: " + vehicle1.gas);
                }


            }else if(option==2){
               
                System.out.println("Please input Motorcyle name");
                person.setTravelVehicle(inputsc.nextLine());
                System.out.println("Please input Travel Location");
                person.setLocation(inputsc.nextLine());
                System.out.println("Please input Travel Distances");
                travelDistance = inputsc.nextDouble();
               gasConsumption = travelDistance/15.5;
               if(gasConsumption > vehicle2.gas){
                System.out.println("YOU DONT HAVE ENOUGH GAS");
              }
              else{
                vehicle2.setGas(vehicle2.getGas() - gasConsumption );
                System.out.println("Name: " + person.firstName +person.lastName + " traveled to: "+ person.getLocation() + " Using: " +person.getTravelVehicle() + " Current Gass Available: " + vehicle2.gas);
                 }
        }
            else {
                System.out.println("Invalid input please input again!!");

            }
        }while(option!= 0);
        System.out.println("Program End Thank you!!");
        inputsc.close();
    
    }
  
}
