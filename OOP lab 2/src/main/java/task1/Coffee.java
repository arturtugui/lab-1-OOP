package task1;

import enums.Intensity;

public class Coffee {
    private final String name; //final can be initialized with constructor
    private Intensity intensity;

    Coffee(String name, Intensity intensity) {
        this.name = name; //since it is final it cannot have a setter
        setIntensity(intensity);
    }

    public String getName() {
        return name;
    }

    public void setIntensity(Intensity intensity) {
        this.intensity = intensity;
    }

    public Intensity getIntensity() {
        return intensity;
    }



    public void printDetails(){
        System.out.println("\nCoffee name: " + getName());
        System.out.println("Coffee intensity: " + getIntensity());
    }
}
