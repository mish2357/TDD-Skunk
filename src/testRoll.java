import static org.junit.Assert.*;

import org.junit.Test;

public class testRoll {

	@Test
	public void canCreateRoll() {
		Roll roll = new Roll();
		assertTrue(roll.getLastTotal() <= 12);
		assertTrue(roll.getLastTotal() >= 2);
	}

}
