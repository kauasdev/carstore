package br.com.carstore.model;

public class Car {

    private String name;
    private String color;
    private String model;
    private int id;

    public Car(String name) {
        this.name = name;
    }

    public Car(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
