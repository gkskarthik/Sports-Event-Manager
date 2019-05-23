import static org.junit.Assert.*;

import org.junit.Test;

public class TestsearchPlayer {

	@Test
	public void test_player() {
		
		String[] s = new String[1];
		SportsEventManager sm = new SportsEventManager();
		s[0] = "Cricket";

		sm.addGame("Cricket",50);
		sm.addPlayer("Karthik",s);
		Player pl = sm.playerList[0];
		assertEquals(pl,sm.searchPlayer("Karthik"));
	}

	@Test
	public void test_null() {
		
		String[] s = new String[1];
		SportsEventManager sm = new SportsEventManager();
		s[0] = "Cricket";

		sm.addGame("Cricket",50);
		sm.addPlayer("Prasanna",s);
		assertEquals(null,sm.searchPlayer("Karthik"));
	}

}
