package task4_failed_casting_attempt;

import enums.Intensity;

public class Cappuccino  extends Coffee{
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
    protected void printDetails(){
        super.printDetails();
        System.out.println("Cappucino milk: " + getMlOfMilk() + " ml");
    }

    protected Cappuccino makeCappuccino() {
        //super.makeCoffee();
        System.out.println("Adding " + getMlOfMilk() + " mls of milk");

        return this;
    }
}
