package net.blogsv.oop.model;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void soud() {
        System.out.println("Gau gau");
    }

}
