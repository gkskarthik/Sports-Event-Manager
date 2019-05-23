import static org.junit.Assert.*;

import org.junit.Test;

public class TestsearchDay {

	@Test
	public void test_Day() {
		
		String[] k = new String[1];
		SportsEventManager se = new SportsEventManager();
		k[0] = "Cricket";
	
		se.addGame("Cricket", 50);
		se.addSchedule("Wednesday", k);
		DaySchedule ds = se.scheduleList[0];
		assertEquals(ds,se.searchDay("Wednesday"));
	}

	@Test
	public void test_null() {
		
		String[] k = new String[1];
		SportsEventManager se = new SportsEventManager();
		k[0] = "Cricket";
	
		se.addGame("Cricket", 50);
		se.addSchedule("Tuesday", k);
		assertEquals(null,se.searchDay("Wednesday"));
	}
}
