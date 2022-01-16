package com.company;

public class Main {

    public static void main(String[] args) {
	Koala koala = new Koala("koala","Masha","white",20,2,"shot","plants");
    System.out.println(koala);
    System.out.println( "I cute" + " " + koala.getType() + " " + koala.getName());
    koala.eat();
    koala.makeSound();

    Cat cat = new Cat("cat","Murka","gray",5,1,"Scottish","female");
    System.out.println(cat);
    System.out.println( "I am beautifull" + " " + cat.getBreed() + " " + cat.getType() + " " + cat.getName());
    cat.eat();
    cat.makeSound();
    int i = 4;
    String s = "mice";
    cat.hunting(s,i);
    System.out.println();

    Puma puma = new Puma("puma","Lary","black",30,1,"couguar","emale","wild" );
    System.out.println(puma);
    System.out.println( "I " + " " + puma.getType() + " " + puma.getName() + " " + "wild and dangerous" );
    puma.eat();
    int in = 2;
    String st = "a rabbit";
    puma.hunting(st,in);


    System.out.println( "Cat hashCode:" + cat.hashCode());
    System.out.println("Puma hashCode:" + puma.hashCode());
    System.out.println("Equals?" + cat.equals(puma));


    }
}
