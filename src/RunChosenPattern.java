import AbstractFactory.Factory.DeviceFactory;
import AbstractFactory.Factory.EnDeviceFactory;
import AbstractFactory.Factory.RuDeviceFactory;
import AbstractFactory.Products.Keyboard;
import AbstractFactory.Products.Mouse;
import AbstractFactory.Products.Touchpad;
import FactoryMethod.Creator.DagitalWatchMaker;
import FactoryMethod.Creator.RomeWatchMaker;
import FactoryMethod.Creator.WatchMaker;
import FactoryMethod.Product.Watch;

/**
 * Created by dvsta on 23.11.2017.
 */
public class RunChosenPattern {
    /**
     * The instance of Factory method pattern.
     */
    public void runFactoryMethod() {
        System.out.println("-------Factory Method-------");
        WatchMaker digitalWatchMaker = new DagitalWatchMaker();
        WatchMaker romeWatchMaker = new RomeWatchMaker();
        Watch digitalWatch = digitalWatchMaker.createWatch();
        Watch romeWatch = romeWatchMaker.createWatch();
        digitalWatch.showTime();
        romeWatch.showTime();
    }

    /**
     * The instance of Abstract Factory
     */
    public void runAbstractFactory(String language) {
        DeviceFactory deviceFactory;
        switch (language) {
            case "EN":
                deviceFactory = new EnDeviceFactory();
                break;
            case "RU":
                deviceFactory = new RuDeviceFactory();
                break;
            default:
                throw new RuntimeException("Sorry, without language " + language);
        }

        Mouse mouse = deviceFactory.getMouse();
        Keyboard keyboard = deviceFactory.getKeyboard();
        Touchpad touchpad = deviceFactory.getTouchpad();

        mouse.click();
        keyboard.print();
        touchpad.track(10,15);
    }
}
