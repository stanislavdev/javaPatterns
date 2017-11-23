package AbstractFactory.Products;

/**
 * Created by dvsta on 23.11.2017.
 */
public class EnMouse implements Mouse{
    @Override
    public void click() {
        System.out.println("Mouse click");
    }
}
