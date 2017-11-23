package AbstractFactory.Factory;

import AbstractFactory.Products.Keyboard;
import AbstractFactory.Products.Mouse;
import AbstractFactory.Products.Touchpad;

/**
 * Created by dvsta on 23.11.2017.
 */
public interface DeviceFactory {
    Mouse getMouse();
    Touchpad getTouchpad();
    Keyboard getKeyboard();
}
