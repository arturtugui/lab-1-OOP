package task4;

import enums.Intensity;
import task4_failed_casting_attempt.Coffee;

public class Cappuccino  extends Coffee {
    protected int mlOfMilk;

    protected Cappuccino(String name, Intensity intensity, int mlOfMilk){
        super(name, intensity);
        setMlOfMilk(mlOfMilk);
    }

    protected void setMlOfMilk(int mlOfMilk) {
        this.mlOfMilk = mlOfMilk;
    }

    public int getMlOfMilk() {
        return mlOfMilk;
    }



    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Cappucino milk: " + getMlOfMilk() + " ml");
    }

    public static Cappuccino makeCappuccino(String name, Intensity intensity, int mlOfMilk) {
        Cappuccino cappuccino = new Cappuccino(name, intensity, mlOfMilk);

        System.out.println("\nMaking: " + cappuccino.getName());
        System.out.println("Intensity set to " + cappuccino.getIntensity());
        System.out.println("Adding " + cappuccino.getMlOfMilk() + " mls of milk");

        return cappuccino;
    }
}
