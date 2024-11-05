package task4_failed_casting_attempt;

import enums.Intensity;

public class Americano extends Coffee {
    protected int mlOfWater;

    protected Americano(String name, Intensity intensity, int mlOfWater) {
        super(name, intensity);
        setMlOfWater(mlOfWater);
    }

    protected void setMlOfWater (int mlOfWater) {
        this.mlOfWater = mlOfWater;
    }

    public int getMlOfWater() {
        return mlOfWater;
    }



    @Override
    protected void printDetails(){
        super.printDetails();
        System.out.println("Americano water: " + getMlOfWater() + " ml");
    }

    protected static Americano makeAmericano(String name, Intensity intensity, int mlOfWater) {
        Coffee coffee = makeCoffee(name, intensity);
        Americano americano = (Americano) coffee;
        americano.setMlOfWater(mlOfWater);

        System.out.println("Adding " + americano.getMlOfWater() + " mls of water");

        return americano;
    }
}
