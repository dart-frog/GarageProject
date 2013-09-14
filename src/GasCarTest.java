import static org.junit.Assert.*;

import org.junit.Test;

public class GasCarTest {
	@Test
	public void canCreateTest(){
		//public GasCar (double myMpg, double myTank, int myDoors, int myRange, int myRadius, String myMake, String myModel, int myYear){
		GasCar t = createTestCar();
		assertEquals(50.0,t.getTank(),0.0);
		assertEquals(20.0,t.getMpg(),0.0);
		assertEquals("doors expected to be 4", 4, t.getDoors());
		assertEquals("make expected to be tesla","tesla", t.getMake());
		assertEquals("model expected to be model S", "model S", t.getModel());
		assertEquals("year expected to be 2012", 2012, t.getYear());
		assertEquals("range expected to be 8", 8, t.getRange());
		assertEquals("radius expected to be 360", 360, t.getRadius());
	}
	private GasCar createTestCar(){
		double tank = 50.0;
		double mpg = 20.0;
		int doors = 4;
		String make = "tesla";
		String model = "model S";
		int year = 2012;
		int range  = 8;
		int radius = 360;
		GasCar t = new GasCar(mpg , tank, doors, range, radius, make, model, year);
		return t;
	}
	@Test
	public void settersTest(){
		GasCar t = createTestCar();
		int newDoors = 2;
		String newMake = "honda";
		String newModel = "civic";
		int newYear = 1900;
		int newRange  = 20;
		int newRadius = 720;
		
		t.setDoors(newDoors);
		t.setMake(newMake);
		t.setModel(newModel);
		t.setYear(newYear);
		t.setRadius(newRadius);
		t.setRange(newRange);
		
		assertEquals("doors expected to be 2", newDoors, t.getDoors());
		assertEquals("make expected to be honda", newMake, t.getMake());
		assertEquals("model expected to be civiv", newModel, t.getModel());
		assertEquals("year expected to be 1900", newYear, t.getYear());
		assertEquals("radius expected to be 720", newRadius, t.getRadius());
		assertEquals(" range expected to be 20", newRange, t.getRange());
		
	}
	
	
	
}
