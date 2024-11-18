package task4_v2_proper_typeCasting;

import enums.Intensity;
import enums.SyrupType;
import task4.PumpkinSpiceLatte;
import task4.SyrupCappuccino;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Coffee c1 = Coffee.makeCoffee("Coffee", Intensity.LIGHT);
        Americano c2 = Americano.makeAmericano("Americano", Intensity.NORMAL, 50);
        Cappuccino c3 = Cappuccino.makeCappuccino("Cappuccino", Intensity.STRONG, 80);
        PumpkinSpiceLatte c4 = PumpkinSpiceLatte.makePumpkinSpiceLatte("Pumpkin Spice Latte", Intensity.LIGHT, 30, 5);
        SyrupCappuccino c5 = SyrupCappuccino.makeSyrupCappuccino("Syrup Cappuccino", Intensity.NORMAL, 90, SyrupType.CARAMEL);

        List<Coffee> list = new ArrayList<Coffee>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);

        for(Coffee c : list){
            c.printDetails();
        }

////        how Mr. Dominic intended for us to use typecasting
//        list.forEach(
//                instanceof Americano
//                (Americano).printDetials
//        );
    }

}
