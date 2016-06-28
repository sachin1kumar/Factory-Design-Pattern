import classes.Factory;
import inter.Speak;

public class Main {

    public static void main(String[] args) {

        Factory factory = new Factory();

        Speak speak = factory.checkAnimal(0);
        
        speak.speak();
    }
}
