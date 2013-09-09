import static org.junit.Assert.*;

import org.junit.Test;


public class CatTest {

	@Test
	public void defaultConstructor() {
		Cat c = new Cat();
		assertEquals( "default", 0, c.getSpeed() );
	}
	
	@Test
	public void speedConstructor() {
		int expectedSpeed = 4;
		Cat c = new Cat(expectedSpeed);
		assertEquals( "speed constructor", expectedSpeed, c.getSpeed() );
	}
	
	@Test
	public void failingTest() {
		Cat c = new Cat();
		assertEquals( "Default constructor sets speed incorrectly", 4, c.getSpeed() );
	}

}
