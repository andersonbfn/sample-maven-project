package com.ibm.anderson.test;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ibm.anderson.model.Sedan;
import com.ibm.anderson.model.Vehicle;

public class SedanTest {

	private static Vehicle vehicle;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		vehicle = new Sedan();
		vehicle.setId(1L);
		vehicle.setPlate("3456EDF");
		vehicle.setBrand("VOLKSWAGEN");
		vehicle.setYear(2015);
	}

	@Test
	public void testIgnition() {
		assertTrue(vehicle.accelerate().startsWith("Sedan"));
	}

	@Test
	public void testAccelerate() {
		assertTrue(vehicle.accelerate().startsWith("Sedan"));
	}

	@Test
	public void testShiftGear() {
		assertTrue(vehicle.accelerate().startsWith("Sedan"));
	}

}
