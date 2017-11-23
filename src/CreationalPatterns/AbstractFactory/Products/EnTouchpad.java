package CreationalPatterns.AbstractFactory.Products;

/**
 * Created by dvsta on 23.11.2017.
 */
public class EnTouchpad implements Touchpad {
    @Override
    public void track(int deltaX, int deltaY) {
        System.out.format("Move point on %d for X and %d for Y", deltaX, deltaY);
    }
}
