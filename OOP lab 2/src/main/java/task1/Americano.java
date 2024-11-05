package task1;

import enums.Intensity;

public class Americano extends Coffee {
    private int mlOfWater;

    Americano(String name, Intensity intensity, int mlOfWater) {
        super(name, intensity);
        setMlOfWater(mlOfWater);
    }

    public void setMlOfWater (int mlOfWater) {
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
}
