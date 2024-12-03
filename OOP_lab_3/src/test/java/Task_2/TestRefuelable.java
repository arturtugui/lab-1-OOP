package Task_2;

import Task_2.CarsProcessing.Car;
import Task_2.Refuelables.*;
import org.junit.Test;

public class TestRefuelable {
    @Test
    public void testRefuelable() {
        ElectricStation es = new ElectricStation();
        GasStation gs = new GasStation();

        Car car1 = new Car(1, "ELECTRIC", "ROBOTS", true, 11);
        Car car2 = new Car(2, "GAS", "ROBOTS", false, 23);

        es.refuel(car1);
        gs.refuel(car2);
    }
}
