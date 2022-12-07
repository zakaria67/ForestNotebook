package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.service.ForestNotebook;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;


public class NatureApp {
    public static void main(String[] args) {

        ForestNotebook bookOfNature = new ForestNotebook();

        //Adding 5 plants to my book, 2 trees, 1 flower, 1 weed (LOTR reference), 1 bush.
        Plant birch = new Tree("Birch" , 17.0, LeafType.SPEAR);
        bookOfNature.addPlant(birch);

        Plant pineTree = new Tree("Pine tree", 25.0, LeafType.NEEDLE);
        bookOfNature.addPlant(pineTree);

        Plant dandelion = new Flower("Dandelion", 0.1, Scent.SWEET);
        bookOfNature.addPlant(dandelion);

        Plant athelas = new Weed("Athelas", 0.2, 3, true);
        bookOfNature.addPlant(athelas);

        Plant raspberry = new Bush("Raspberry", 1.0, "Raspberry", LeafType.HEART);
        bookOfNature.addPlant(raspberry);

        //Adding 9 animals, 2 omnivores, 3 herbivores and 4 carnivores

        //4 carnivores,no duplicates.

        Animal lion = new Carnivore("Lion",190, 1.2, 1.9);
        lion.setMaxFoodSize(5);
        bookOfNature.addAnimal(lion);

        Animal honeyBadger = new Carnivore("Honey Badger", 12, 0.26, 60);
        honeyBadger.setMaxFoodSize(.3);
        bookOfNature.addAnimal(honeyBadger);

        Animal tiger = new Carnivore("Tiger",210, 130, 3.4);
        tiger.setMaxFoodSize(5);
        bookOfNature.addAnimal(tiger);

        Animal elephantSeal = new Carnivore("Elephant Seal", 3450, 4.5, 3.5);
        elephantSeal.setMaxFoodSize(10);
        bookOfNature.addAnimal(elephantSeal);

        //All omnivores and herbivores have the same diet apparently.

        Set<Plant> plantDiet = new LinkedHashSet<>();

        plantDiet.add(birch);
        plantDiet.add(raspberry);

        //2 omnivores, no duplicates.
        Animal chicken = new Omnivore("Chicken", 0.85, 0.7, 0.4);
        chicken.setPlantDiet(plantDiet);
        bookOfNature.addAnimal(chicken);

        Animal bear = new Omnivore("Bear", 300, 1.05, 1.9);
        bear.setPlantDiet(plantDiet);
        bookOfNature.addAnimal(bear);

        //4 herbivores with 1 duplicate.
        Animal cow = new Herbivore("Cow", 720, 1.4, 2.4);
        cow.setPlantDiet(plantDiet);
        bookOfNature.addAnimal(cow);

        Animal duplicateCow = new Herbivore("Cow", 720, 1.4, 2.4);
        duplicateCow.setPlantDiet(plantDiet);
        bookOfNature.addAnimal(duplicateCow);

        Animal elk = new Herbivore("Elk", 350, 1.5, 2.4);
        elk.setPlantDiet(plantDiet);
        bookOfNature.addAnimal(elk);

        Animal buffalo = new Herbivore("Buffalo", 700, 2.5, 2.8);
        buffalo.setPlantDiet(plantDiet);
        bookOfNature.addAnimal(buffalo);


        System.out.println("Amount of plants seen and registered: " + bookOfNature.getPlantCount());
        System.out.println("Amount of animals encountered and registered: " + bookOfNature.getAnimalCount());
        System.out.println();

        bookOfNature.printNotebook();
        System.out.println();

        //list of carnivores
        System.out.println("Printing list of carnivores.");

        for (Animal carnivore: bookOfNature.getCarnivores()) {
            System.out.println(carnivore);
        }
        System.out.println();

        //list of omnivores
        System.out.println("Printing list of omnivores.");

        for (Animal omnivore: bookOfNature.getOmnivores()){
            System.out.println(omnivore);
        }
        System.out.println();


        //list of herbivores
        System.out.println("Printing list of herbivores.");

        for (Animal herbivore: bookOfNature.getHerbivores()) {
            System.out.println(herbivore);
        }
        System.out.println();
        //end list
        System.out.println("__________________________________________________________");

        //Sorting animals and plants by name.

        bookOfNature.sortAnimalsByName();
        bookOfNature.sortPlantByName();

        System.out.println("Printing animals and plants sorted by name.");

        bookOfNature.printNotebook();
        System.out.println();

        //Sorting animals and plants by height.

        bookOfNature.sortAnimalsByHeight();
        bookOfNature.sortPlantsByHeight();

        System.out.println("Printing animals and plants sorted by height.");
        bookOfNature.printNotebook();
        System.out.println();










    }
}
