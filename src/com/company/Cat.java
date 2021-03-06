package com.company;

public class Cat extends Animal{

    public String breed;
    public String gender;

    public Cat(String type, String name, String color, int weight, int quantity, String breed, String gender) {
        super(type, name, color, weight, quantity);
        this.breed = breed;
        this.gender = gender;
    }

    @Override
    public void makeSound() {
        System.out.println("I say meow");
    }

    @Override
    public void eat() {

        System.out.println("I eat meat");
    }


    public void hunting (String s, int i){
        System.out.println("I caught"  + " " + i + " " + s);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", quantity=" + quantity +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cat cat = (Cat) o;

        if (!breed.equals(cat.breed)) return false;
        return gender.equals(cat.gender);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + breed.hashCode();
        result = 31 * result + gender.hashCode();
        return result;
    }
}
