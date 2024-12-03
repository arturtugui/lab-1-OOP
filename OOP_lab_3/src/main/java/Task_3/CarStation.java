package Task_3;

import Task_2.CarsProcessing.Car;
import Task_2.Dineables.Dineable;
import Task_2.Refuelables.Refuelable;

public class CarStation {
    private Dineable diningService;
    private Refuelable refuelingService;
    private CarsQueue queue;

    public CarStation(Dineable diningService, Refuelable refuelingService) {
        this.diningService = diningService;
        this.refuelingService = refuelingService;
        this.queue = new CarsQueue();
    }

    public void serveCars(){
        while(!queue.isEmpty()){
            Car car = queue.dequeue();

            if(car.isDining()) {
                diningService.serveDinner(car);
            }

            refuelingService.refuel(car);
        }
    }

    public void addCar(Car car){
        queue.enqueue(car);
    }
}
