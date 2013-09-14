import static org.junit.Assert.*;

import org.junit.Test;


public class BoatTest {
	@Test
	public void CanCreatetest() {
		//Boat(String myMake, String myModel, int myYear,int myRange, int myRadius){
		Boat t = createTestBoat();
		assertEquals("make expected to be bayliner", "bayliner", t.getMake());
		assertEquals("model expected to be super boat", "superboat", t.getModel());
		assertEquals("year expected to be 1996", 1996, t.getYear());
		assertEquals("range expected to be 8", 8, t.getRange());
		assertEquals("radius expected to be 360", 360, t.getRadius());
	}
	private Boat createTestBoat(){
		String make = "bayliner";
		String model = "superboat";
		int year = 1996;
		int range  = 8;
		int radius = 360;
		Boat t = new Boat(make,model, year, range, radius );
		return t;
	}
	@Test
	public void setterTest(){
		String newMake = "submarine";
		String newModel = "nuclear";
		int newYear = 2020;
		int newRange = 10;
		int newRadius = 120;
		Boat t = createTestBoat();
		
		t.setMake(newMake);
		t.setModel(newModel);
		t.setYear(newYear);
		t.setRange(newRange);
		t.setRadius(newRadius);
		
		assertEquals("make expected to be submarine","submarine",t.getMake());
		assertEquals("model expected to be nuclear", "nuclear", t.getModel());
		assertEquals("year expected to be 2020", 2020,t.getYear());
		assertEquals("range expected to be 10", 10, t.getRange());
		assertEquals("radius expected to be 120", 120, t.getRadius());
		
	}
}
