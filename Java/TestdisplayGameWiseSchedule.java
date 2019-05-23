import static org.junit.Assert.*;

import org.junit.Test;

public class TestdisplayGameWiseSchedule {

	@Test
	public void test_display() {
		String[] ln = new String[2];
		SportsEventManager se = new SportsEventManager();
		ln[0] = "Cricket";
		ln[1] = "Hockey";
		
		se.addGame("Cricket", 50);
		se.addPlayer("Karthik", ln);
		se.addSchedule("Wednesday", ln);
		assertEquals("Players Names: Karthik\nDay Names: Wednesday",se.displayGameWiseSchedule("Cricket"));
	}

	@Test
	public void test_null() {
		String[] ln = new String[2];
		SportsEventManager se = new SportsEventManager();
		ln[0] = "Cricket";
		
		se.addGame("Cricket", 50);
		se.addPlayer("Karthik", ln);
		se.addSchedule("Tuesday", ln);
		assertEquals("Error : This game is not valid",se.displayGameWiseSchedule("Football"));
	}

}
