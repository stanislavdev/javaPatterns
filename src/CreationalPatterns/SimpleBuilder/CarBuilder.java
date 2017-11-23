package CreationalPatterns.SimpleBuilder;

/**
 * Created by dvsta on 23.11.2017.
 */
public class CarBuilder {
    String maker = "Default";
    Car.Transmission transmission = Car.Transmission.MANUAL;
    int maxSpeed = 120;

    public CarBuilder buildMaker(String maker) {
        this.maker = maker;
        return this;
    }

    public CarBuilder buildTransmission(Car.Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public CarBuilder buildMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public Car build() {
        Car car = new Car();
        car.setMaker(maker);
        car.setMaxSpeed(maxSpeed);
        car.setTransmission(transmission);
        return car;
    }
}
