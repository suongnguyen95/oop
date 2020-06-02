package net.blogsv.oop.abstracts;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void soud();
    public abstract void move();
    public void eat(){
        System.out.println("eating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
