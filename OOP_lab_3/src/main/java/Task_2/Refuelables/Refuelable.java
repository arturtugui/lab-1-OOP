package Task_2.Refuelables;

public interface Refuelable {
    static int gasCarsServedCount = 0;
    static int electricCarsServedCount = 0;

    void refuel(String carId);
}
