package AbstractFactory;

/**
 * Created by dvsta on 23.11.2017.
 */
public class RuDeviceFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {
        return new RuMouse();
    }

    @Override
    public Touchpad getTouchpad() {
        return new RuTouchpad();
    }

    @Override
    public Keyboard getKeyboard() {
        return new RuKeyboard();
    }
}
