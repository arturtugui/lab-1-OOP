package task4;

import enums.Intensity;

public class Coffee {
    protected final String name; //final can be initialized with constructor
    protected Intensity intensity;

    protected Coffee(String name, Intensity intensity) {
        this.name = name; //since it is final it cannot have a setter
        setIntensity(intensity);
    }

    public String getName() {
        return name;
    }

    protected void setIntensity(Intensity intensity) {
        this.intensity = intensity;
    }

    public Intensity getIntensity() {
        return intensity;
    }



    public void printDetails(){
        System.out.println("\nCoffee name: " + getName());
        System.out.println("Coffee intensity: " + getIntensity());
    }

    public static Coffee makeCoffee(String name, Intensity intensity) {
        Coffee coffee = new Coffee(name, intensity);

        System.out.println("\nMaking: " + coffee.getName());
        System.out.println("Intensity set to " + coffee.getIntensity());

        return coffee;
    }
}
