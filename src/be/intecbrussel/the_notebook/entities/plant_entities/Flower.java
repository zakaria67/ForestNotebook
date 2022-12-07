package be.intecbrussel.the_notebook.entities.plant_entities;

public class Flower extends Plant{

    private Scent scent;

    public Flower(String name) {
        super(name);
    }

    public Flower(String name, double height, Scent scent) {
        super(name, height);
        this.scent = scent;
    }

    public Scent getScent() {
        return scent;
    }

    public void setScent(Scent scent) {
        this.scent = scent;
    }

    @Override
    public String toString() {
        return "type= Flower" +
                ", name= " + getName() +
                ", height= " + getHeight() +
                ", scent= " + scent;
    }
}
