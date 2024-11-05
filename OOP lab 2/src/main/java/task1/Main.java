package task1;

import enums.Intensity;
import enums.SyrupType;

public class Main {
    public static void main(String[] args){
        Coffee c1 = new Coffee("Coffee", Intensity.LIGHT);
        Americano c2 = new Americano("Americano", Intensity.NORMAL, 100);
        Cappuccino c3 = new Cappuccino("Cappucino", Intensity.STRONG, 50);

        c1.printDetails();
        c2.printDetails();
        c3.printDetails();

        PumpkinSpiceLatte c4 = new PumpkinSpiceLatte("Pumpkin Spice Latte", Intensity.LIGHT, 30, 5);
        SyrupCappuccino c5 = new SyrupCappuccino("Syrup Cappucino", Intensity.NORMAL, 80, SyrupType.CARAMEL);


        c4.printDetails();
        c5.printDetails();
    }
}
