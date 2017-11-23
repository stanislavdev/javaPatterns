package AbstractFactory.Factory;

import AbstractFactory.Products.*;

/**
 * Created by dvsta on 23.11.2017.
 */
public class EnDeviceFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {
        return new EnMouse();
    }

    @Override
    public Touchpad getTouchpad() {
        return new EnTouchpad();
    }

    @Override
    public Keyboard getKeyboard() {
        return new EnKeyboard();
    }
}
