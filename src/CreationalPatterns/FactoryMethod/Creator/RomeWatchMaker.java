package CreationalPatterns.FactoryMethod.Creator;


import CreationalPatterns.FactoryMethod.Product.RomeWatch;
import CreationalPatterns.FactoryMethod.Product.Watch;

/**
 * Created by dvsta on 15.11.2017.
 */
public class RomeWatchMaker implements WatchMaker {
    @Override
    public Watch createWatch() {
        return new RomeWatch();
    }
}
