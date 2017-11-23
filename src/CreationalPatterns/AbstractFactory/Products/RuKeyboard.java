package CreationalPatterns.AbstractFactory.Products;

/**
 * Created by dvsta on 23.11.2017.
 */
public class RuKeyboard implements Keyboard {
    @Override
    public void print() {
        System.out.println("Русская раскладка");
    }
}
