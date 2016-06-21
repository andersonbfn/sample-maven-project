package com.ibm.anderson.model;

public class Sedan extends Vehicle {

	@Override
	public String ignition() {
		return "Sedan ignition!";
	}

	@Override
	public String accelerate() {
		return "Sedan accelerate!";
	}

	@Override
	public String shiftGear() {
		return "Sedan gear shift!";
	}

}
