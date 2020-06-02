package net.blogsv.oop.model;

public class Student implements Action {
    private String name;
    private int age;
    private String phone;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }
}
