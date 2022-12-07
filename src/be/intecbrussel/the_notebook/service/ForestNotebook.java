package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.*;
import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class ForestNotebook{

    private List<Carnivore> carnivores = new LinkedList<>();
    private List<Omnivore> omnivores = new LinkedList<>();
    private List<Herbivore> herbivores = new LinkedList<>();
    private int plantCount;
    private int animalCount;
    private List<Animal> animals = new LinkedList<>();
    private List<Plant> plants = new LinkedList<>();

    public ForestNotebook() {
    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void addAnimal(Animal animal){
        if (!animals.contains(animal)) {
            animals.add(animal);
            animalCount+=1;
            if (animal instanceof Carnivore){
                carnivores.add((Carnivore) animal);
            }
            if (animal instanceof Omnivore){
                omnivores.add((Omnivore) animal);
            }
            if (animal instanceof Herbivore){
                herbivores.add((Herbivore) animal);
            }
        }
    }

    public void addPlant(Plant plant){
        if (!plants.contains(plant)){
            plants.add(plant);
            plantCount+=1;
        }

    }

    public void printNotebook() {
        System.out.println("List of all animals: ");
        for (Animal animal: animals) {
            System.out.println(animal);
        }

        System.out.println();

        System.out.println("List of carnivores: ");
        for (Animal carnivore : carnivores) {
            System.out.println(carnivore);
        }

        System.out.println();

        System.out.println("List of omnivores: ");
        for (Animal omnivore : omnivores) {
            System.out.println(omnivore);
        }

        System.out.println();

        System.out.println("List of herbivores: ");
        for (Animal herbivore: herbivores) {
            System.out.println(herbivore);
        }

        System.out.println();

        System.out.println("List of all plants: ");
        for (Plant plant: plants) {
            System.out.println(plant);
        }
        System.out.println("__________________________________________________________");

    }

    public void sortAnimalsByName(){
        animals.sort(Comparator.comparing(Animal::getName));
        carnivores.sort(Comparator.comparing(Animal::getName));
        herbivores.sort(Comparator.comparing(Animal::getName));
        omnivores.sort(Comparator.comparing(Animal::getName));
    }

    public void sortPlantByName(){
        plants.sort(Comparator.comparing(Plant::getName));

    }

    public void sortAnimalsByHeight(){
        animals.sort(Comparator.comparing(Animal::getHeight).reversed());
        carnivores.sort(Comparator.comparing(Animal::getHeight).reversed());
        herbivores.sort(Comparator.comparing(Animal::getHeight).reversed());
        omnivores.sort(Comparator.comparing(Animal::getHeight).reversed());
    }
    public void sortPlantsByHeight(){
        plants.sort(Comparator.comparing(Plant::getHeight).reversed());
    }

}
