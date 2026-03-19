package com.tejait;

public class PetrolEngine implements IEngine {

	@Override
	public boolean started() {
	  System.out.println("Petrol Engine Started...");	 
		return true;
	}

}
