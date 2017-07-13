import static org.junit.Assert.*;

import org.junit.Test;

public class testRoll {
	Roll roll = new Roll();
	@Test
	public void canCreateRoll() {
		
		assertTrue(roll.getLastTotal() <= 12);
		assertTrue(roll.getLastTotal() >= 2);
	}
	@Test
	public boolean testHasSkunk(){
		assertEquals(1,roll.getRoll);
	}

}
