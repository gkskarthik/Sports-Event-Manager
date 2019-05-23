import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestaddGame.class, TestaddPlayer.class, TestaddSchedule.class, TestdisplayDayWiseSchedule.class,
		TestdisplayGameWiseSchedule.class, TestdisplayPlayerWiseSchedule.class, TestsearchDay.class,
		TestsearchGame.class, TestsearchPlayer.class })
public class AllTests {

}
