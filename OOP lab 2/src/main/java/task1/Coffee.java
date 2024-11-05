package task1;

public class Coffee {
    final String name; //final can be initialized with constructor
    Intensity intensity;

    Coffee(String name, Intensity intensity) {
        this.name = name;
        this.intensity = intensity;
    }
}

enum Intensity {
    LIGHT,
    NORMAL,
    STRONG
}
