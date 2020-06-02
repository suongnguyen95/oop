package net.blogsv.oop.interfaces;

public class Bird implements Action {
    //Phai override lại tất cả method có trong Interface
    @Override
    public void eat() {
        System.out.println("......");
    }

    @Override
    public void move() {

    }
}
