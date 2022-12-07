package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.Objects;
import java.util.Set;

public class Animal {

    private String name;
    private double weight;
    private double height;
    private double length;

    public Animal(String name) {
        this.name = name;
    }
    public Animal(String name, double weight, double height, double length) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.length = length;

    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setPlantDiet(Set<Plant> plantDiet){

    }
    public void setMaxFoodSize(double maxFoodSize) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(getName(), animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
}
