package AbstractFactory;

/**
 * Created by dvsta on 23.11.2017.
 */
public interface DeviceFactory {
    Mouse getMouse();
    Touchpad getTouchpad();
    Keyboard getKeyboard();
}
