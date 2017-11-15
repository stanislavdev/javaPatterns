package Creator;


import Product.DigitalWatch;
import Product.Watch;

/**
 * Created by dvsta on 15.11.2017.
 */
public class DagitalWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new DigitalWatch();
    }
}
