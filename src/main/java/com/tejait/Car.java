package com.tejait;

public class Car {
 private IEngine engine;
 
    // Default Constructor 
	public Car() {
	    
	}

    // Constructor Injection
	public Car(IEngine engine) {
     this.engine = engine;
     
	}
	
	// Setter Injection 
	public void setEngine(IEngine engine) {
		this.engine = engine;
	}
	
	public void drive() {
		
		boolean status = this.engine.started();
		
		if(status) {
			System.out.println("Driving started...");
		} else {
			System.out.println("Driving not started");
		}
	}

}
