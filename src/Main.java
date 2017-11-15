import FactoryMethod.Creator.DagitalWatchMaker;
import FactoryMethod.Creator.RomeWatchMaker;
import FactoryMethod.Creator.WatchMaker;
import FactoryMethod.Product.Watch;

/**
 * Created by dvsta on 15.11.2017.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("-------Factory Method-------");
        WatchMaker digitalWatchMaker = new DagitalWatchMaker();
        WatchMaker romeWatchMaker = new RomeWatchMaker();
        Watch digitalWatch = digitalWatchMaker.createWatch();
        Watch romeWatch = romeWatchMaker.createWatch();
        digitalWatch.showTime();
        romeWatch.showTime();
    }
}
