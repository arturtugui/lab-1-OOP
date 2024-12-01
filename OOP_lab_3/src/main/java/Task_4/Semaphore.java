package Task_4;

import Task_2.CarsProcessing.Car;
import Task_3.CarStation;
import Task_3.CarsQueue;

import java.util.Objects;

public class Semaphore {
    private CarsQueue queue;
    private CarStation PeopleElectricService;
    private CarStation PeopleGasService;
    private CarStation RobotElectricService;
    private CarStation RobotGasService;

    public Semaphore(CarsQueue queue, CarStation PeopleElectricService, CarStation PeopleGasService, CarStation RobotElectricService, CarStation RobotGasService) {
        this.queue = queue;
        this.PeopleElectricService = PeopleElectricService;
        this.PeopleGasService = PeopleGasService;
        this.RobotElectricService = RobotElectricService;
        this.RobotGasService = RobotGasService;
    }

    public void routeCars() {
        while (!queue.isEmpty()) {
            Car car = queue.dequeue();

            if(Objects.equals(car.getPassengers(), "PEOPLE")) {
                if(Objects.equals(car.getType(), "ELECTRIC")) {
                    PeopleElectricService.addCar(car);
                    System.out.println("Car " + car.getId() + " is heading to PeopleElectricService");
                }
                else{
                    PeopleGasService.addCar(car);
                    System.out.println("Car " + car.getId() + " is heading to PeopleGasService");
                }
            }
            else{
                if(Objects.equals(car.getType(), "ELECTRIC")) {
                    RobotElectricService.addCar(car);
                    System.out.println("Car " + car.getId() + " is heading to RobotElectricService");
                }
                else{
                    RobotGasService.addCar(car);
                    System.out.println("Car " + car.getId() + " is heading to RobotGasService");
                }
            }
        }
    }
}
