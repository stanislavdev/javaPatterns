package CreationalPatterns.Builder;

/**
 * Created by dvsta on 23.11.2017.
 */
public class FordBuilder extends CarBuilder {
    @Override
    void buildMaker() {
        car.setMaker("Ford");
    }

    @Override
    void buildTransmission() {
        car.setTransmission(Car.Transmission.AUTO);
    }

    @Override
    void buildMaxSpeed() {
        car.setMaxSpeed(260);
    }
}
