package AbstractFactory;

/**
 * Created by dvsta on 23.11.2017.
 */
public class RuTouchpad implements Touchpad{
    @Override
    public void track(int deltaX, int deltaY) {
        System.out.format("Смешение указателя на %d по X и на %d по Y", deltaX, deltaY);
    }
}
