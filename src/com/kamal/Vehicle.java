package com.kamal;

public enum Vehicle {

	Cars("Road"),Trains("Tracks"),Aeroplane("sky"),Boat;
	
	private String ModeofTransport;//Instance variable
	
	Vehicle(String Mode){//Constructor
		ModeofTransport=Mode;
	}
	Vehicle(){//Constructor
		ModeofTransport="water";
	}
	
	public String Display(){//Method
		return ModeofTransport;
	}
	
}
