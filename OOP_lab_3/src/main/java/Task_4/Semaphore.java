package Task_4;

import Task_2.CarsProcessing.Car;
import Task_2.Dineables.PeopleDinner;
import Task_2.Dineables.RobotDinner;
import Task_2.Refuelables.ElectricStation;
import Task_2.Refuelables.GasStation;
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

    public CarStation getPeopleElectricService() {
        return PeopleElectricService;
    }

    public CarStation getPeopleGasService() {
        return PeopleGasService;
    }

    public CarStation getRobotElectricService() {
        return RobotElectricService;
    }

    public CarStation getRobotGasService() {
        return RobotGasService;
    }

    public void addCarToQueue(Car car) {
        queue.enqueue(car);
    }


    public void routeCars() {
        while (!queue.isEmpty()) {
            Car car = queue.dequeue();

            if(Objects.equals(car.getPassengers(), "PEOPLE")) {
                PassengersStats.setPeopleTotalCount(PassengersStats.getPeopleTotalCount() + 1);

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
                PassengersStats.setRobotsTotalCount(PassengersStats.getRobotsTotalCount() + 1);

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



    public static Semaphore createSemaphore() {
        CarsQueue carsQueue = new CarsQueue();

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

        return new Semaphore(carsQueue, peopleElectricService, peopleGasService, robotElectricService, robotGasService);
    }
}
