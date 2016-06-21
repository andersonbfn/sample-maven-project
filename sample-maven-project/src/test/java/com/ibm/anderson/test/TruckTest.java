package com.ibm.anderson.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.ibm.anderson.model.Sedan;
import com.ibm.anderson.model.Truck;
import com.ibm.anderson.model.Vehicle;

public class TruckTest {

	private static Vehicle vehicle;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		vehicle = new Truck();
		vehicle.setId(1L);
		vehicle.setPlate("3456EDF");
		vehicle.setBrand("FORD");
		vehicle.setYear(2015);
	}

	@Test
	public void testIgnition() {
		assertTrue(vehicle.accelerate().startsWith("Truck"));
	}

	@Test
	public void testAccelerate() {
		assertTrue(vehicle.accelerate().startsWith("Truck"));
	}

	@Test
	public void testShiftGear() {
		assertTrue(vehicle.accelerate().startsWith("Truck"));
	}

}
