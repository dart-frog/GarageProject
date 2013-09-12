import static org.junit.Assert.*;

import org.junit.Test;

public class GasCarTest {
	@Test
	public void canCreateTest(){
		double tank = 50.0;
		double mpg = 20.0;
		int doors = 4;
		String make = "Tesla";
		String model = "model S";
		int year = 2012;
		int range  = 8;
		int radius = 360;
		//public GasCar (double myMpg, double myTank, int myDoors, int myRange, int myRadius, String myMake, String myModel, int myYear){
		GasCar t = new GasCar(mpg,tank,doors,range,radius,make,model,year); 
		assertEquals(tank,t.getTank(),0.0);
		assertEquals(mpg,t.getMpg(),0.0);
		assertEquals("doors expected to be 4", doors, t.getDoors());
		assertEquals("make expected to be tesla",make, t.getMake());
		assertEquals("model expected to be model S", model, t.getModel());
		assertEquals("year expected to be 2012", year, t.getYear());
		assertEquals("range expected to be 8", range, t.getRange());
		assertEquals("radius expected to be 360", radius, t.getRadius());
	}
	
}
