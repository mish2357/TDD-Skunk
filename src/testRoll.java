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
		boolean ans = true;
		assertEquals(ans,roll.getHasSkunk());
		}
	@Test
	public void testHasTwoSkunk(){
		assertEquals(true,roll.getHasTwoSkunk());
		
	}
	@Test
	public void testHasSkunkandDeuce(){
		assertEquals(true,roll.getHasSkunkandDeuce());
		
	}
}
