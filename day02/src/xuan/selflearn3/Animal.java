package xuan.selflearn3;

public abstract class Animal {
    private String name;
    private double weight;

    public Animal() {
    }

    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public abstract void eat();
}
