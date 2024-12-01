package Task_2.Refuelables;

public class ElectricStation implements Refuelable {
    @Override
    public void refuel(String carId) {
        System.out.println("Recharging car " + carId + ".");
    }
}

