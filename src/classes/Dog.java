package classes;

import inter.Speak;

/**
 * Created by SACHIN on 28-Jun-16.
 */
public class Dog implements Speak {
    @Override
    public void speak() {

        System.out.println("Bark!!");

    }
}
