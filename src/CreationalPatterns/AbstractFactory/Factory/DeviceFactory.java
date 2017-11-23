package CreationalPatterns.AbstractFactory.Factory;

import CreationalPatterns.AbstractFactory.Products.Keyboard;
import CreationalPatterns.AbstractFactory.Products.Mouse;
import CreationalPatterns.AbstractFactory.Products.Touchpad;

/**
 * Created by dvsta on 23.11.2017.
 */
public interface DeviceFactory {
    Mouse getMouse();
    Touchpad getTouchpad();
    Keyboard getKeyboard();
}
