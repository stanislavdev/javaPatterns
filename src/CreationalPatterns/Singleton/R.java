package CreationalPatterns.Singleton;

/**
 * Created by dvsta on 05.12.2017.
 */
public class R implements Runnable {
    @Override
    public void run() {
        Singleton.getInstance();
    }
}
