package oop.lab1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //testing the Individuals class
        Individual ind1 = new Individual();
        ind1.setId(1);
        ind1.setHumanoid(true);
        ind1.setPlanet("Asgard");
        ind1.setAge(2034);
        ind1.setTraits(Arrays.asList("BLONDE", "TALL"));

        ind1.showIndividual();
    }
}