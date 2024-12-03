package Task_2.Refuelables;

import Task_2.CarsProcessing.Car;

public class ElectricStation implements Refuelable {
    @Override
    public void refuel(Car car) {
        System.out.println("Recharging car " + car.getId() + ".");
        RefuelableStats.setElectricCarsServedCountFuel(RefuelableStats.getElectricCarsServedCountFuel()  + car.getConsumption());
        RefuelableStats.setElectricCarsServedCount(RefuelableStats.getElectricCarsServedCount()  + 1);
    }
}

