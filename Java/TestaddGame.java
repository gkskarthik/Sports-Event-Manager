import static org.junit.Assert.*;

import org.junit.Test;


public class TestaddGame {
	   
	@Test
	public void test_maxplayer() {
		
		SportsEventManager sp = new SportsEventManager();
		assertEquals(100, sp.addGame("Cricket", -1));
	}
    
	@Test
	public void test_null() {
		
		SportsEventManager sp = new SportsEventManager();
		assertEquals(99, sp.addGame(null,50));
	}

	@Test
	public void test_gamecounter() {
		
		SportsEventManager sp = new SportsEventManager();
		
		sp.addGame("Kamal", 11);
		sp.addGame("Karthik", 10);
		sp.addGame("Prasanna", 9);
		sp.addGame("Prabhu", 8);
		sp.addGame("Ramki", 7);
		sp.addGame("Abbas", 6);
		sp.addGame("Prashanth", 5);
		sp.addGame("Rajini", 4);
		sp.addGame("Mohan", 3);
		sp.addGame("MGR", 2);
		sp.addGame("Sivaji", 1);
		sp.addGame("Vikram", 1);
		sp.addGame("Vijay", 1);
		sp.addGame("Ajith", 1);
		sp.addGame("Ram", 1);
		sp.addGame("Mohamed", 1);
		sp.addGame("Das", 1);
		sp.addGame("Sachin", 1);
		sp.addGame("Dhoni", 1);
		sp.addGame("Srini", 1);
		
		assertEquals(98, sp.addGame("Dhirish",1));
	}
	
	@Test
	public void test_zero() {
		
		SportsEventManager sp = new SportsEventManager();
		
		assertEquals(0, sp.addGame("Cricket",50));	
	}
	
   @Test
   public void test(){

	   SportsEventManager sp = new SportsEventManager();
	   sp.addGame("Cricket", 50);
	   assertEquals(101,sp.addGame("Cricket", 50));
   }

}
