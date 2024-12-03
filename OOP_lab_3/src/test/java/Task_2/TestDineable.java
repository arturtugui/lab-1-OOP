package Task_2;

import Task_2.CarsProcessing.Car;
import Task_2.Dineables.PeopleDinner;
import Task_2.Dineables.RobotDinner;
import org.junit.Test;

public class TestDineable {
    @Test
    public void testDineable() {
        RobotDinner rd = new RobotDinner();
        PeopleDinner pd = new PeopleDinner();

        Car car1 = new Car(1, "ELECTRIC", "ROBOTS", true, 11);
        Car car2 = new Car(2, "ELECTRIC", "PEOPLE", false, 23);

        rd.serveDinner(car1);
        pd.serveDinner(car2);
    }
}
