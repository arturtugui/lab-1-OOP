package Task_2.Refuelables;

public class RefuelableStats {
    private static int gasCarsServedCountFuel = 0;
    private static int electricCarsServedCountFuel = 0;
    private static int gasCarsServedCount = 0;
    private static int electricCarsServedCount = 0;

    public static int getGasCarsServedCountFuel() {
        return gasCarsServedCountFuel;
    }

    public static void setGasCarsServedCountFuel(int gasCarsServedCountFuel) {
        RefuelableStats.gasCarsServedCountFuel = gasCarsServedCountFuel;
    }

    public static int getElectricCarsServedCountFuel() {
        return electricCarsServedCountFuel;
    }

    public static void setElectricCarsServedCountFuel(int electricCarsServedCountFuel) {
        RefuelableStats.electricCarsServedCountFuel = electricCarsServedCountFuel;
    }

    public static int getElectricCarsServedCount() {
        return electricCarsServedCount;
    }

    public static void setElectricCarsServedCount(int electricCarsServedCount) {
        RefuelableStats.electricCarsServedCount = electricCarsServedCount;
    }

    public static int getGasCarsServedCount() {
        return gasCarsServedCount;
    }

    public static void setGasCarsServedCount(int gasCarsServedCount) {
        RefuelableStats.gasCarsServedCount = gasCarsServedCount;
    }
}
