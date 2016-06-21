package com.ibm.anderson.model;

public class Truck extends Vehicle {

	@Override
	public String ignition() {
		return "Truck ignition!";
	}

	@Override
	public String accelerate() {
		return "Truck accelerate!";
	}

	@Override
	public String shiftGear() {
		return "Truck gear shift!";
	}


}
