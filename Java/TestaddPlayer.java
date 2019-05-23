import static org.junit.Assert.*;

import org.junit.Test;

public class TestaddPlayer {

	@Test
	public void test_success() {
				
		SportsEventManager se = new SportsEventManager();
		String[] b = new String[1];
		b[0] = "Cricket";
		
		se.addGame("Cricket", 50);
		assertEquals("Karthik added successfully",se.addPlayer("Karthik"  ,b));
	}
	
	@Test
	public void test_error() {
	
		SportsEventManager se = new SportsEventManager();
		String[] b = new String[1];
		b[0] = "Cricket";
		
		se.addGame("Football", 50);
		assertEquals("Error you cannot be registered for Cricket",se.addPlayer("Karthik", b));
	}
	
	@Test
	public void test_exist() {
	
		SportsEventManager se = new SportsEventManager();
		String[] b = new String[1];
		b[0] = "Cricket";
		
		se.addGame("Cricket", 50);
		se.addPlayer("Karthik", b);
		assertEquals("Karthik already exists",se.addPlayer("Karthik", b));
	}
}
	
	
	