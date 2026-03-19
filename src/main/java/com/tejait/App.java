package com.tejait;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Welcome ...");
       
       // constructor injection
       // Car car = new Car(new PetrolEngine());
       // car.drive();
       
       // Car car = new Car(new DieselEngine());
       // car.drive();
       
        Car car = new Car();
		// setter injection
        car.setEngine(new DieselEngine());
        car.drive();

	}

}
