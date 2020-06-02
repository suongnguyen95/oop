package net.blogsv.oop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import net.blogsv.oop.abstracts.Animal;
import net.blogsv.oop.abstracts.Cat;
import net.blogsv.oop.interfaces.Action;

public class MainActivity extends AppCompatActivity implements Action {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //
        Cat cat = new Cat("Meo1");
        cat.eat();
//        cat.meow();
    }


    @Override
    public void eat() {

    }

    @Override
    public void speed() {

    }
}
