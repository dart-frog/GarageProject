import static org.junit.Assert.*;

import org.junit.Test;


public class ElectricCarTest {

	
	@Test
	public void CanCreatetest() {
		double battery = 30.0;
		double mpk = 40.0;
		int doors = 6;
		String make = "ford";
		String model = "focus";
		int year = 1996;
		int range  = 8;
		int radius = 360;
		//double myBattery, double myMpk,int myDoors, String myMake, String myModel, int myYear,int myRange, int myRadius
		ElectricCar t = createTestCar(battery, mpk, doors, make, model, year,
				range, radius);
		assertEquals(battery, t.getBattery(), 0.0);
		assertEquals(mpk, t.getMpk(), 0.0);
		assertEquals("doors expected 6", doors, t.getDoors());
		assertEquals("radius expected 360", radius, t.getRadius());
		assertEquals("range expected 8", range, t.getRange());
		assertEquals("year expected 1996", year, t.getYear());
		assertEquals("make expected ford", make, t.getMake());
		assertEquals("model expected focus", model, t.getModel());
	}
	private ElectricCar createTestCar(double battery, double mpk, int doors,
			String make, String model, int year, int range, int radius) {
		ElectricCar t = new ElectricCar(battery , mpk, doors, make, model, year, range, radius );
		return t;
	}
	@Test
	public void SettersTest(){
		
	}
	

}
