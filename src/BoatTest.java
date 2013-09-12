import static org.junit.Assert.*;

import org.junit.Test;


public class BoatTest {
	@Test
	public void CanCreatetest() {
		String make = "bayliner";
		String model = "super boat";
		int year = 1996;
		int range  = 8;
		int radius = 360;
		//Boat(String myMake, String myModel, int myYear,int myRange, int myRadius){
		Boat t = new Boat(make, model, year, range, radius);
		assertEquals("make expected to be bayliner", make, t.getMake());
		assertEquals("model expected to be super boat", model, t.getModel());
		assertEquals("year expected to be 1996", year, t.getYear());
		assertEquals("range expected to be 8", range, t.getRange());
		assertEquals("radius expected to be 360", radius, t.getRadius());
	}
}
