package task1;

import enums.Intensity;
import enums.SyrupType;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //Task 2 using upcasting
        Coffee c1 = new Coffee("Coffee", Intensity.LIGHT);
        Americano c2 = new Americano("Americano", Intensity.NORMAL, 100);
        Cappuccino c3 = new Cappuccino("Cappuccino", Intensity.STRONG, 50);
        PumpkinSpiceLatte c4 = new PumpkinSpiceLatte("Pumpkin Spice Latte", Intensity.LIGHT, 30, 5);
        SyrupCappuccino c5 = new SyrupCappuccino("Syrup Cappuccino", Intensity.NORMAL, 80, SyrupType.CARAMEL);

        ArrayList<Coffee> coffees = new ArrayList<Coffee>();
        coffees.add(c1);
        coffees.add(c2);
        coffees.add(c3);
        coffees.add(c4);
        coffees.add(c5);

        for (Coffee coffee : coffees) {
            coffee.printDetails(); //each uses its own overridden method
        }

        c1.makeCoffee();
        c2.makeAmericano();
        c3.makeCappuccino();
        c4.makePumpkinSpiceLatte();
        c5.makeSyrupCappuccino();
    }
}
