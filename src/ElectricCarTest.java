import static org.junit.Assert.*;

import org.junit.Test;


public class ElectricCarTest {

	
	@Test
	public void CanCreatetest() {
		
		//double myBattery, double myMpk,int myDoors, String myMake, String myModel, int myYear,int myRange, int myRadius
		ElectricCar t = createTestCar();
		assertEquals(30.0, t.getBattery(), 0.0);
		assertEquals(40.0, t.getMpk(), 0.0);
		assertEquals("doors expected 6", 6, t.getDoors());
		assertEquals("radius expected 360", 360, t.getRadius());
		assertEquals("range expected 8", 8, t.getRange());
		assertEquals("year expected 1996", 1996, t.getYear());
		assertEquals("make expected ford", "ford", t.getMake());
		assertEquals("model expected focus", "focus", t.getModel());
	}
	private ElectricCar createTestCar() {
		double battery = 30.0;
		double mpk = 40.0;
		int doors = 6;
		String make = "ford";
		String model = "focus";
		int year = 1996;
		int range  = 8;
		int radius = 360;
		ElectricCar t = new ElectricCar(battery , mpk, doors, make, model, year, range, radius );
		return t;
	}
	@Test
	public void SettersTest(){
		int newDoors = 4;
		String newMake = "Toyota";
		String newModel = "prius";
		int newRadius = 6;
		int newYear = 2005;
		int newRange = (2);
		
		
		ElectricCar t = createTestCar();
		t.setDoors(newDoors);
		t.setMake(newMake);
		t.setModel(newModel);
		t.setRadius(newRadius);
		t.setYear(newYear);
		t.setRange(newRange);
		assertEquals("doors expected to be 4",4, t.getDoors());
		assertEquals("make expected to be toyota","Toyota", t.getMake());
		assertEquals("model expected to be prius", "prius", t.getModel());
		assertEquals("radius expected to be 6", 6, t.getRadius());
		assertEquals("year expected to be 2005", 2005, t.getYear());
		assertEquals("range expected to be 2", 2, t.getRange());
	}
	

}
