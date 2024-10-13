package oop.lab1;

import java.util.ArrayList;
import java.util.List;

public class Individual {
    //attributes
    private int id;
    private boolean isHumanoid;
    private String planet;
    private int age;
    private List<String> traits;


    //constructor
    public Individual() {
        traits = new ArrayList<>();
    }


    //setters and getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public boolean isHumanoid() {
        return isHumanoid;
    }

    public void setHumanoid(boolean humanoid) {
        isHumanoid = humanoid;
    }


    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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

