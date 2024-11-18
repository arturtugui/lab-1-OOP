package task4_v2_proper_typeCasting;

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
    public void printDetails(){
        super.printDetails();
        System.out.println("Americano water: " + getMlOfWater() + " ml");
    }

    protected static void makeAmericanoPrint(Americano americano){
        makeCoffeePrint(americano);
        System.out.println("Adding " + americano.getMlOfWater() + " mls of water");
    }

    public static Americano makeAmericano(String name, Intensity intensity, int mlOfWater) {
        Americano americano = new Americano(name, intensity, mlOfWater);

        makeAmericanoPrint(americano);

        return americano;
    }
}
//