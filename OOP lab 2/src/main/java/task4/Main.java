package task4;

import enums.Intensity;
import enums.SyrupType;

public class Main {
    public static void main(String[] args){
        Coffee c1 = Coffee.makeCoffee("Coffee", Intensity.LIGHT);
        Americano c2 = Americano.makeAmericano("Americano", Intensity.NORMAL, 100);
        Cappuccino c3 = Cappuccino.makeCappuccino("Cappuccino", Intensity.STRONG, 50);
        PumpkinSpiceLatte c4 = PumpkinSpiceLatte.makePumpkinSpiceLatte("Pumpkin Spice Latte", Intensity.LIGHT, 30, 5);
        SyrupCappuccino c5 = SyrupCappuccino.makeSyrupCappuccino("Syrup Cappuccino", Intensity.NORMAL, 80, SyrupType.CARAMEL);
    }
}
