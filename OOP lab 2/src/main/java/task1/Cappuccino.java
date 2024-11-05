package task1;

public class Cappuccino  extends Coffee{
    int mlOfMilk;

    Cappuccino(String name, Intensity intensity, int mlOfMilk){
        super(name, intensity);
        this.mlOfMilk = mlOfMilk;
    }
}
