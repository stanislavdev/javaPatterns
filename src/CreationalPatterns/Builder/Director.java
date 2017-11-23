package CreationalPatterns.Builder;

/**
 * Created by dvsta on 23.11.2017.
 */
public class Director {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    public Car buildCar() {
        builder.createCar();
        builder.buildMaker();
        builder.buildMaxSpeed();
        builder.buildTransmission();
        return builder.getCar();
    }
}
