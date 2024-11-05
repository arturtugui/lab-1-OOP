package task1;

public class Americano extends Coffee {
    int mlOfWater;

    Americano(String name, Intensity intensity, int mlOfWater) {
        super(name, intensity);
        this.mlOfWater = mlOfWater;
    }
}
