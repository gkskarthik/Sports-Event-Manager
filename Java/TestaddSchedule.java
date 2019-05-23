import static org.junit.Assert.*;

import org.junit.Test;

public class TestaddSchedule {

		@Test
		public void test_success() 
		{
			String[] ln = new String[1];
			SportsEventManager se = new SportsEventManager();
			ln[0] = "Cricket";
			
			se.addGame("Cricket", 50);
			assertEquals("Wednesday added successfully",se.addSchedule("Wednesday", ln));
			
		}
		
	    @Test
		public void test_error()
		{
			SportsEventManager se = new SportsEventManager();
			String[] ln = new String[1];
			ln[0] = "Cricket";
			
			se.addGame("Football", 50);
			assertEquals("Error you cannot be registered for Cricket",se.addPlayer("Wednesday", ln));
		}
	    
	    @Test
	    public void test_exists()
	    {
			String[] ln = new String[1];
			SportsEventManager sem = new SportsEventManager();
			ln[0] = "Cricket";
			
			sem.addGame("Cricket",50);
			sem.addSchedule("Wednesday", ln);
			assertEquals("Wednesday already scheduled",sem.addSchedule("Wednesday",ln));	    	
	    }
}
