package be.intecbrussel.the_notebook.entities.plant_entities;

public class Weed extends Plant{

    private double area;
    private boolean healing;

    public Weed(String name) {
        super(name);
    }

    public Weed(String name, double height, double area, boolean healing) {
        super(name, height);
        this.area = area;
        this.healing = healing;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "type= Weed" +
                ", name= " + getName() +
                ", height= " + getHeight() +
                ", area= " + area+
                ", healing= " + healing;
    }
}
