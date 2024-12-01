package Task_2.Refuelables;

public class RefuelableStats {
    private static int gasCarsServedCount = 0;
    private static int electricCarsServedCount = 0;

    public static int getGasCarsServedCount() {
        return gasCarsServedCount;
    }

    public static void setGasCarsServedCount(int gasCarsServedCount) {
        RefuelableStats.gasCarsServedCount = gasCarsServedCount;
    }

    public static int getElectricCarsServedCount() {
        return electricCarsServedCount;
    }

    public static void setElectricCarsServedCount(int electricCarsServedCount) {
        RefuelableStats.electricCarsServedCount = electricCarsServedCount;
    }
}
