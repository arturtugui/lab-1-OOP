package Task_2.Dineables;

import Task_2.CarsProcessing.Car;

public class RobotDinner implements Dineable {
    @Override
    public void serveDinner(Car car) {
        System.out.println("Serving dinner to robots in car " + car.getId() + ".");
        DineableStats.setRobotsServedCount(DineableStats.getRobotsServedCount() + 1);
    }
}

