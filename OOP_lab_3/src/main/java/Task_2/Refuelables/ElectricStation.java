package Task_2.Refuelables;

import Task_2.CarsProcessing.Car;

public class ElectricStation implements Refuelable {
    @Override
    public void refuel(Car car) {
        System.out.println("Recharging car " + car.getId() + ".");
        RefuelableStats.setElectricCarsServedCount(RefuelableStats.getElectricCarsServedCount()  + car.getConsumption());
    }
}

