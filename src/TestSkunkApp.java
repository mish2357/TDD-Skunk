import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSkunkApp {
	private SkunkApp game;

	@Before
	public void setup() {

		game = new SkunkApp();
	}

	@Test

	public void testGetPlayersInfo() {
		game.getPlayerInfo();
		assertEquals(2,game.getNumberOfPlayers());
		assertEquals("Player1",game.getPlayerName(1));
		assertEquals("Player1",game.getPlayerName(1));
	}
	@Test
	 public void canCreateRoll(){
		Roll roll = new Roll();
		assertTrue(roll.getLastTotal()<=12);
		assertTrue(roll.getLastTotal()>=2);
	}

}
