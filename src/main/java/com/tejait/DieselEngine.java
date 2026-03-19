package com.tejait;

public class DieselEngine implements IEngine {

 @Override
 public boolean started() {
   System.out.println("Diesel Engine Started...");	 
	return true;
 }

}
