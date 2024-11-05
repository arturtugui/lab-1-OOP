package task1;

import enums.Intensity;

public class Cappuccino  extends Coffee{
    private int mlOfMilk;

    Cappuccino(String name, Intensity intensity, int mlOfMilk){
        super(name, intensity);
        setMlOfMilk(mlOfMilk);
    }

    public void setMlOfMilk(int mlOfMilk) {
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
}
