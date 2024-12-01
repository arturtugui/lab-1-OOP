package Task_2;

import Task_2.Dineables.PeopleDinner;
import Task_2.Dineables.RobotDinner;
import org.junit.Test;

public class TestDineable {
    @Test
    public void testDineable() {
        RobotDinner rd = new RobotDinner();
        PeopleDinner pd = new PeopleDinner();

        rd.serveDinner("1");
        pd.serveDinner("2");
    }
}
