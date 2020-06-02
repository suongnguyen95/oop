package net.blogsv.oop.model;

public abstract class Animal implements Action {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void soud();
    public void eat(){
        System.out.println("eating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }
}
