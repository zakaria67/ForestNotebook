package be.intecbrussel.the_notebook.entities.plant_entities;

public class Bush extends Plant {

    private String fruit;
    private LeafType leafType;

    public Bush(String name) {
        super(name);
    }

    public Bush(String name, double height, String fruit, LeafType leafType) {
        super(name, height);
        this.fruit = fruit;
        this.leafType = leafType;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "type= Bush" +
                ", name= " + getName() +
                ", height= " + getHeight() +
                ", fruit= " + fruit +
                ", leafType= " + leafType;
    }
}
