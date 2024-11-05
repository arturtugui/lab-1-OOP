package task1;

public class SyrupCappuccino extends Cappuccino {
    SyrupType syrup;

    SyrupCappuccino(String name, Intensity intensity, int mlOfMilk, SyrupType syrup) {
        super(name, intensity, mlOfMilk);
        this.syrup = syrup;
    }
}

enum SyrupType {
    MACADAMIA,
    VANILLA,
    COCONUT,
    CARAMEL,
    CHOCOLATE,
    POPCORN
}