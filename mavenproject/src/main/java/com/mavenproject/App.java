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
        double gasConsumptions, Currentgas;
        
        Scanner inputsc = new Scanner(System.in);


        Bike vehicle1 = new Bike(2, "no engine", 2, "", "125");
        Car vehicle2 = new Car(4, "1200 horsepower", 2, "", "125");

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
                person.Travel();
                gasConsumptions = (person.getTravelDistance() / 15.5);
                Currentgas = vehicle1.gas - gasConsumptions;
                vehicle1.setGas(Currentgas);
                if(gasConsumptions > vehicle1.getGas()){
                    System.out.println("YOU DONT HAVE ENOUGH GAS");
                }
                else{
                vehicle1.setGas(vehicle1.getGas() - gasConsumptions );
                System.out.println("Name: " + person.firstName +person.lastName + " traveled to: "+ person.getLocation() + " Using: " + person.getTravelVehicle() + " Current Gass Available: " + vehicle1.gas);
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
