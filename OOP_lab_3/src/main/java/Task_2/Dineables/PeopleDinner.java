package Task_2.Dineables;

import Task_2.CarsProcessing.Car;

public class PeopleDinner implements Dineable {
    @Override
    public void serveDinner(Car car) {
        System.out.println("Serving dinner to people in car " + car.getId() + ".");
        DineableStats.setPeopleServedCount(DineableStats.getPeopleServedCount() + 1);
    }
}
