package task4_failed_casting_attempt;

import enums.Intensity;

public class Main {
    public static void main(String[] args){

        Coffee c1 = Coffee.makeCoffee("Coffee", Intensity.LIGHT);
        Americano c2 = Americano.makeAmericano("Americano", Intensity.NORMAL, 50);
    }

}
