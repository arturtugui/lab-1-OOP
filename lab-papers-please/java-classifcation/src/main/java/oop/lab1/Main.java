package oop.lab1;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Universe hitchHiker = new Universe("hitchHiker");
        Universe marvel = new Universe("marvel");
        Universe rings = new Universe("rings");
        Universe starWars = new Universe("starWars");
        Universe unknown = new Universe("unknown");

        //I decided to use a hash map since I do not want to pass 5 lists in a method and the return them
        Map<String, Universe> universeMap = new HashMap<>();
        universeMap.put("hitchHiker", hitchHiker);
        universeMap.put("marvel", marvel);
        universeMap.put("rings", rings);
        universeMap.put("starWars", starWars);
        universeMap.put("unknown", unknown);

        ReadJSON reader = new ReadJSON();
        List<Individual> individuals = reader.readJSON();

        Filter.filter(individuals, universeMap);


        //printing individuals based on planet, Day 3
        System.out.println("From HH:\n");
        for(Individual ind : hitchHiker.inhabitants) {
            ind.showIndividual();
            System.out.println("-------");
        }
        System.out.println("********");
        System.out.println("\n");

        System.out.println("From marvel:\n");
        for(Individual ind : marvel.inhabitants) {
            ind.showIndividual();
            System.out.println("-------");
        }
        System.out.println("********");
        System.out.println("\n");

        System.out.println("From LOTR:\n");
        for(Individual ind : rings.inhabitants) {
            ind.showIndividual();
            System.out.println("-------");
        }
        System.out.println("********");
        System.out.println("\n");

        System.out.println("From SW:\n");
        for(Individual ind : starWars.inhabitants) {
            ind.showIndividual();
            System.out.println("-------");
        }
        System.out.println("********");
        System.out.println("\n");

        System.out.println("From ???:\n");
        for(Individual ind : unknown.inhabitants) {
            ind.showIndividual();
            System.out.println("-------");
        }
        System.out.println("********");
        System.out.println("\n");






//        //printing all individuals from JSON, Day 2
//        for(Individual ind : individuals) {
//            ind.showIndividual();
//            System.out.println("\n");
//        }

//        //testing the Individuals class, Day 1
//        Individual ind1 = new Individual();
//        ind1.setId(1);
//        ind1.setHumanoid(true);
//        ind1.setPlanet("Asgard");
//        ind1.setAge(2034);
//        ind1.setTraits(Arrays.asList("BLONDE", "TALL"));
//
//        ind1.showIndividual();


    }
}
