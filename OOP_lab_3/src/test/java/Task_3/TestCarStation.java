package Task_3;

import Task_2.CarsProcessing.Car;
import Task_2.Dineables.*;
import Task_2.Refuelables.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCarStation {
    @Test
    public void testCarStation1() {
        RobotDinner robotDinner = new RobotDinner();
        ElectricStation electricStation = new ElectricStation();
        CarStation cs = new CarStation(robotDinner, electricStation);

        Car car1 = new Car(1, "ELECTRIC", "ROBOTS", true, 11);
        Car car2 = new Car(2, "ELECTRIC", "ROBOTS", false, 23);
        Car car3 = new Car(3, "ELECTRIC", "ROBOTS", true, 10);

        cs.addCar(car1);
        cs.addCar(car2);
        cs.addCar(car3);

        cs.serveCars();

        assertEquals(2, DineableStats.getRobotsServedCount());
        assertEquals(44, RefuelableStats.getElectricCarsServedCount());
    }

    @Test
    public void testCarStation2() {
        PeopleDinner peopleDinner = new PeopleDinner();
        GasStation gasStation = new GasStation();
        CarStation cs = new CarStation(peopleDinner, gasStation);

        Car car1 = new Car(1, "GAS", "PEOPLE", false, 9);
        Car car2 = new Car(2, "GAS", "PEOPLE", false, 11);
        Car car3 = new Car(3, "GAS", "PEOPLE", true, 7);

        cs.addCar(car1);
        cs.addCar(car2);
        cs.addCar(car3);

        cs.serveCars();

        assertEquals(1, DineableStats.getPeopleServedCount());
        assertEquals(27, RefuelableStats.getGasCarsServedCount());
    }
}
