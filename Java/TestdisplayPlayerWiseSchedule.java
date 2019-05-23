import static org.junit.Assert.*;

import org.junit.Test;

public class TestdisplayPlayerWiseSchedule {

	@Test
	public void test_Player() {
		
		String[] j = new String[1];
		j[0]="Cricket";
		SportsEventManager n = new SportsEventManager();
		
		n.addGame("Cricket", 50);
		n.addPlayer("Karthik",j );
		n.addSchedule("Wednesday",j);
		assertEquals("Game : Cricket Wednesday\n",n.displayPlayerWiseSchedule("Karthik"));		
	}

	@Test
	public void test_null() {
		
		String[] j = new String[1];
		j[0]="Cricket";
		SportsEventManager n = new SportsEventManager();
		
		n.addGame("Cricket", 50);
		n.addPlayer("Prasanna",j );
		n.addSchedule("Wednesday",j);
		assertEquals("Error : This player is not valid",n.displayPlayerWiseSchedule("Karthik"));		
	}
}
