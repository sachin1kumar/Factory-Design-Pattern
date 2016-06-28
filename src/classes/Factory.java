package classes;

import inter.Speak;

/**
 * Created by SACHIN on 28-Jun-16.
 */
public class Factory  {

  public Speak checkAnimal(int userinput){

        if(userinput == 0)
             return new Dog();
        else
            return new Cat();
    }
}
