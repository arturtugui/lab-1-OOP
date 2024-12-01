package Task_2.Dineables;

public interface Dineable {
    static int peopleServedCount = 0;
    static int robotsServedCount = 0;

    void serveDinner(String carId);
}
