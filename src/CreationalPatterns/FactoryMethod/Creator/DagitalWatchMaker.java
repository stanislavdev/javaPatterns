package CreationalPatterns.FactoryMethod.Creator;


import CreationalPatterns.FactoryMethod.Product.DigitalWatch;
import CreationalPatterns.FactoryMethod.Product.Watch;

/**
 * Created by dvsta on 15.11.2017.
 */
public class DagitalWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
