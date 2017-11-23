package AbstractFactory.Products;

/**
 * Created by dvsta on 23.11.2017.
 */
public class RuMouse implements Mouse {
    @Override
    public void click() {
        System.out.println("Клик мыши");
    }
}
