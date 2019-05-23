import static org.junit.Assert.*;

import org.junit.Test;

public class TestdisplayDayWiseSchedule {

	@Test
	public void test_Day() {
		String[] g = new String[1];
		g[0] = "Cricket";
		SportsEventManager v = new SportsEventManager();
		v.addGame("Cricket", 50);
		v.addPlayer("Karthik", g);
		v.addSchedule("Wednesday", g);
		assertEquals("Game = Cricket Karthik\n",v.displayDayWiseSchedule("Wednesday"));
	}

	@Test
	public void test_null() {
		String[] g = new String[1];
		g[0] = "Cricket";
		SportsEventManager v = new SportsEventManager();
		v.addGame("Cricket", 50);
		v.addPlayer("Karthik", g);
		v.addSchedule("Tuesday", g);
		assertEquals("Error : This day is not valid",v.displayDayWiseSchedule("Wednesday"));
	}
}
