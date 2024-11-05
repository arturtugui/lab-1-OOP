package task1;

public class PumpkinSpiceLatte extends Cappuccino{
    int mgOfPumpkinSpice;

    PumpkinSpiceLatte(String name, Intensity intensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super(name, intensity, mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }
}
