package Task_4;

import Task_2.CarsProcessing.*;
import Task_2.Dineables.*;
import Task_2.Refuelables.*;
import Task_3.CarStation;
import Task_3.CarsQueue;

import org.junit.Test;
import java.io.File;
import java.io.IOException;
import static org.junit.Assert.*;


public class TestSemaphore {
    @Test
    public void testSemaphore1() throws IOException {
        File folderPath = new File("C:\\Users\\Admin\\Desktop\\OOP\\OOP lab 3\\lab-1-OOP\\OOP_lab_3\\src\\test\\CarsExamples\\queue");
        ReadJSON reader = new ReadJSON();


        CarsQueue carsQueue = new CarsQueue();
        for(int i = 1; i <= 10; i++) {
            File filePath = new File(folderPath.getAbsolutePath() + "\\Car" + i + ".json");
            Car car = reader.readJSON(filePath);
            carsQueue.enqueue(car);
        }

        PeopleDinner peopleDinner1 = new PeopleDinner();
        ElectricStation electricStation1 = new ElectricStation();
        CarStation peopleElectricService = new CarStation(peopleDinner1, electricStation1);

        PeopleDinner peopleDinner2 = new PeopleDinner();
        GasStation gasStation1 = new GasStation();
        CarStation peopleGasService = new CarStation(peopleDinner2, gasStation1);

        RobotDinner robotDinner1 = new RobotDinner();
        ElectricStation electricStation2 = new ElectricStation();
        CarStation robotElectricService = new CarStation(robotDinner1, electricStation2);

        RobotDinner robotDinner2 = new RobotDinner();
        GasStation gasStation2 = new GasStation();
        CarStation robotGasService = new CarStation(robotDinner2, gasStation2);


        Semaphore semaphore = new Semaphore(carsQueue, peopleElectricService, peopleGasService, robotElectricService, robotGasService);
        semaphore.routeCars();

        peopleElectricService.serveCars();
        peopleGasService.serveCars();
        robotElectricService.serveCars();
        robotGasService.serveCars();


        assertTrue(carsQueue.isEmpty());

        assertEquals(4, DineableStats.getPeopleServedCount());
        assertEquals(2, DineableStats.getRobotsServedCount());

        assertEquals(121, RefuelableStats.getElectricCarsServedCount());
        assertEquals(232, RefuelableStats.getGasCarsServedCount());

    }
}
