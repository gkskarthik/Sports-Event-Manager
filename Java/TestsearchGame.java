import static org.junit.Assert.*;

import org.junit.Test;

public class TestsearchGame {

	
	@Test
	public void test_game() {
		
		SportsEventManager se = new SportsEventManager();
		Game[] g= new Game[2];
		g[0] = new Game("Cricket",30);
		
		se.addGame("Cricket", 31);
		Game ga = se.gameList[0];
		assertEquals(ga,se.searchGame("Cricket"));
	}

	
	@Test
	public void test_null() {
		
		SportsEventManager se = new SportsEventManager();
		Game[] g= new Game[2];
		g[0] = new Game("Cricket",30);
		
		se.addGame(null, 31);
		Game ga = se.gameList[0];
		assertEquals(ga,se.searchGame("Cricket"));
	}

}

