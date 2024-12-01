package Task_2.Refuelables;

import Task_2.CarsProcessing.Car;

public class GasStation implements Refuelable {
    @Override
    public void refuel(Car car) {
        System.out.println("Refueling gas car " + car.getId() + ".");
        RefuelableStats.setGasCarsServedCount(RefuelableStats.getGasCarsServedCount()  + car.getConsumption());
    }
}
