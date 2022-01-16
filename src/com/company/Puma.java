package com.company;

public class Puma extends Cat {
    public String category;

    public Puma(String type, String name, String color, int weight, int quantity, String breed, String gender, String category) {
        super(type, name, color, weight, quantity, breed, gender);
        this.category = category;
    }


    @Override
    public String toString() {
        return "Puma{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
    @Override
    public void hunting(String st, int in) {
        System.out.println("I caught very big" + " " + in + " " + st);
    }
}
