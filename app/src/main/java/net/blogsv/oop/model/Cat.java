package net.blogsv.oop.model;

public class Cat extends Animal implements Action {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void soud() {
        System.out.println("Meo meo");
    }

}
