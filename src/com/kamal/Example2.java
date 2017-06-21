package com.kamal;

public class Example2 {

	
	
	public void m1() {
		System.out.println(Vehicle.Aeroplane.Display());
		System.out.println(Vehicle.Cars.Display());
		System.out.println(Vehicle.Trains.Display());
		System.out.println(Vehicle.Boat.Display());
	}

	public void ordinalvalues() {
		for (Vehicle v : Vehicle.values()) {
			System.out.println(v.ordinal());
		}
	}
	
	public void comparetovalue(){
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 e2 = new Example2();
		e2.m1();
		e2.ordinalvalues();
		
		Vehicle v1,v2,v3;
		v1=Vehicle.Boat;
		v2=Vehicle.Trains;
		v3=Vehicle.Boat;
		
		if(v1.compareTo(v3)==0){
			System.out.println("They are equal");
		}
		if(v2.compareTo(v3)<0){
			System.out.println("They are less");
		}
		if(v1.compareTo(v2)>0){
			System.out.println("They are more");
		}
		
		if(v1==v3){
			System.out.println("== method is used");
		}
		if(v1.equals(v3)){
			System.out.println("equals method is used");
		}
		System.out.println(v1.ordinal());
		System.out.println(v2.ordinal());
		System.out.println(v3.ordinal());
		
	}

}
