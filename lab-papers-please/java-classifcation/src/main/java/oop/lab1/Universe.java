package oop.lab1;
import java.util.ArrayList;
import java.util.List;

public class Universe {
    String name;
    List<Individual> inhabitants;

    public Universe(String name) {
        this.name = name;
        this.inhabitants = new ArrayList<>();
    }
}
