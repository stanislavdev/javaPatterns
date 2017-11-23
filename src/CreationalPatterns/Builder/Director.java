package CreationalPatterns.Builder;

/**
 * Created by dvsta on 23.11.2017.
 */
public class Director {
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    public Car getCar() {
        return builder.getCar();
    }

    public void buildCar() {
        builder.createCar();
        builder.buildMaker();
        builder.buildMaxSpeed();
        builder.buildTransmission();
    }
}
