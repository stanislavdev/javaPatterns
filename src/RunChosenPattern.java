import CreationalPatterns.AbstractFactory.Factory.DeviceFactory;
import CreationalPatterns.AbstractFactory.Factory.EnDeviceFactory;
import CreationalPatterns.AbstractFactory.Factory.RuDeviceFactory;
import CreationalPatterns.AbstractFactory.Products.Keyboard;
import CreationalPatterns.AbstractFactory.Products.Mouse;
import CreationalPatterns.AbstractFactory.Products.Touchpad;
import CreationalPatterns.FactoryMethod.Creator.DagitalWatchMaker;
import CreationalPatterns.FactoryMethod.Creator.RomeWatchMaker;
import CreationalPatterns.FactoryMethod.Creator.WatchMaker;
import CreationalPatterns.FactoryMethod.Product.Watch;
import CreationalPatterns.SimpleBuilder.Car;
import CreationalPatterns.SimpleBuilder.CarBuilder;

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
        touchpad.track(10, 15);
    }

    /**
     * The instance of Simple Builder
     */
    public void runSimpleBuilder(){
        Car car = new CarBuilder()
                .buildMaker("BMW")
                .buildMaxSpeed(300)
                .buildTransmission(Car.Transmission.AUTO)
                .build();
        System.out.println(car.toString());
    }
}
