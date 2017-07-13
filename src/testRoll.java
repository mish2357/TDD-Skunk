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
	public void testHasSkunk(){
		assertTrue(roll.getHasSkunk());
		
	}
	@Test
	public void testHasTwoSkunk(){
		assertEquals(2,roll.getLastTotal());
		
	}
	@Test
	public void testHasSkunkandDeuce(){
		assertEquals(1,roll.getHasSkunkandDeuce());
		
	}
}
