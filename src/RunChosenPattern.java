import CreationalPatterns.AbstractFactory.Factory.DeviceFactory;
import CreationalPatterns.AbstractFactory.Factory.EnDeviceFactory;
import CreationalPatterns.AbstractFactory.Factory.RuDeviceFactory;
import CreationalPatterns.AbstractFactory.Products.Keyboard;
import CreationalPatterns.AbstractFactory.Products.Mouse;
import CreationalPatterns.AbstractFactory.Products.Touchpad;
import CreationalPatterns.Builder.Director;
import CreationalPatterns.Builder.FordBuilder;
import CreationalPatterns.FactoryMethod.Creator.DagitalWatchMaker;
import CreationalPatterns.FactoryMethod.Creator.RomeWatchMaker;
import CreationalPatterns.FactoryMethod.Creator.WatchMaker;
import CreationalPatterns.FactoryMethod.Product.Watch;
import CreationalPatterns.Prototype.Human;
import CreationalPatterns.Prototype.HumanFactory;
import CreationalPatterns.SimpleBuilder.CarBuilder;
import CreationalPatterns.SimpleBuilder.SimpleCar;
import CreationalPatterns.Singleton.R;
import CreationalPatterns.Singleton.Singleton;

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
    public void runSimpleBuilder() {
        SimpleCar car = new CarBuilder()
                .buildMaker("BMW")
                .buildMaxSpeed(300)
                .buildTransmission(SimpleCar.Transmission.AUTO)
                .build();
        System.out.println(car.toString());
    }

    /**
     * The instance of Builder
     */
    public void runBuilder() {
        Director director = new Director();
        director.setBuilder(new FordBuilder());
        director.buildCar();
        System.out.println(director.getCar().toString());
    }

    /**
     * The instance of Prototype
     */
    public void runPrototype(){
        Human human = new Human(20, "John");
        HumanFactory humanFactory = new HumanFactory(human);
        Human human1 = humanFactory.makeCopy();
        System.out.println(human);
        System.out.println(human1);
    }

    /**
     * The instance of Singleton
     */
    public void runSingleton()  {
        Thread thread = new Thread(new R());
        thread.start();
        Thread thread1 = new Thread(new R());
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(Singleton.counter);
    }
}
