package task4;

import enums.Intensity;

public class Americano extends task4_v2_proper_typeCasting.Coffee {
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

    public static Americano makeAmericano(String name, Intensity intensity, int mlOfWater) {
        Americano americano = new Americano(name, intensity, mlOfWater);

        System.out.println("\nMaking: " + americano.getName());
        System.out.println("Intensity set to " + americano.getIntensity());
        System.out.println("Adding " + americano.getMlOfWater() + " mls of water");

        return americano;
    }
}
