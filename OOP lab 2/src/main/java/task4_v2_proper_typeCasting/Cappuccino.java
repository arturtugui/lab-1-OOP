package task4_v2_proper_typeCasting;

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
    public void printDetails(){
        super.printDetails();
        System.out.println("Cappucino milk: " + getMlOfMilk() + " ml");
    }

    protected static void makeCappuccinoPrint(Cappuccino cappuccino){
        makeCoffeePrint(cappuccino);
        System.out.println("Adding " + cappuccino.getMlOfMilk() + " mls of milk");

    }

    public static Cappuccino makeCappuccino(String name, Intensity intensity, int mlOfMilk) {
        Cappuccino cappuccino = new Cappuccino(name, intensity, mlOfMilk);

        makeCappuccinoPrint(cappuccino);

        return cappuccino;
    }
}
