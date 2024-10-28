package oop.lab1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Universe hitchhiker = new Universe("hitchhiker");
        Universe marvel = new Universe("marvel");
        Universe rings = new Universe("rings");
        Universe starwars = new Universe("starwars");
        Universe unknown = new Universe("unknown");

        //I decided to use a hash map since I do not want to pass 5 lists in a method and the return them
        Map<String, Universe> universeMap = new HashMap<>();
        universeMap.put("hitchhiker", hitchhiker);
        universeMap.put("marvel", marvel);
        universeMap.put("rings", rings);
        universeMap.put("starwars", starwars);
        universeMap.put("unknown", unknown);

        ReadJSON reader = new ReadJSON();
        List<Individual> individuals = reader.readJSON();

        Filter.filter(individuals, universeMap);

        OutputJSON.outputJSON(hitchhiker);
        OutputJSON.outputJSON(marvel);
        OutputJSON.outputJSON(rings);
        OutputJSON.outputJSON(starwars);


//        //direct attempt
//        ObjectMapper mapper = new ObjectMapper();
//        try {
//            mapper.writeValue(new File("C:/Users/Admin/Desktop/OOP/oop-course-repo/lab-papers-please/output/hitchhiker.json"), hitchHiker);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }








//        //printing individuals based on planet, Day 3 (and Day 4)
//        System.out.println("From HH:\n");
//        for(Individual ind : hitchhiker.inhabitants) {
//            ind.showIndividual();
//            System.out.println("-------");
//        }
//        System.out.println("********");
//        System.out.println("\n");
//
//        System.out.println("From marvel:\n");
//        for(Individual ind : marvel.inhabitants) {
//            ind.showIndividual();
//            System.out.println("-------");
//        }
//        System.out.println("********");
//        System.out.println("\n");
//
//        System.out.println("From LOTR:\n");
//        for(Individual ind : rings.inhabitants) {
//            ind.showIndividual();
//            System.out.println("-------");
//        }
//        System.out.println("********");
//        System.out.println("\n");
//
//        System.out.println("From SW:\n");
//        for(Individual ind : starwars.inhabitants) {
//            ind.showIndividual();
//            System.out.println("-------");
//        }
//        System.out.println("********");
//        System.out.println("\n");
//
//        System.out.println("From ???:\n");
//        for(Individual ind : unknown.inhabitants) {
//            ind.showIndividual();
//            System.out.println("-------");
//        }
//        System.out.println("********");
//        System.out.println("\n");






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
