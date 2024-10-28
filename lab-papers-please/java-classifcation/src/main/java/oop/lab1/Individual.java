package oop.lab1;

import java.util.ArrayList;
import java.util.List;

public class Individual {

    //attributes, changed the types so you can initialize as null
    private Integer id;
    private Boolean isHumanoid;
    private String planet;
    private Integer age;
    private List<String> traits;


    //constructor
    public Individual() {
        id = null;
        isHumanoid = null;
        planet = null;
        age = null;
        traits = new ArrayList<>();
    }


    //setters and getters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Boolean isHumanoid() {
        return isHumanoid;
    }

    public void setHumanoid(Boolean humanoid) {
        isHumanoid = humanoid;
    }


    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public List<String> getTraits() {
        return traits;
    }

    public void setTraits(List<String> traits) {
        this.traits = traits;
    }

    //output method for testing
    public void showIndividual() {
        System.out.println("Individual ID: " + id);
        System.out.println("Individual isHumanoid: " + isHumanoid);
        System.out.println("Individual planet: " + planet);
        System.out.println("Individual age: " + age);
        System.out.println("Individual traits: " + traits);
    }
}

