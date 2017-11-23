package CreationalPatterns.SimpleBuilder;

/**
 * Created by dvsta on 23.11.2017.
 */
public class CarBuilder {
    String maker = "Default";
    SimpleCar.Transmission transmission = SimpleCar.Transmission.MANUAL;
    int maxSpeed = 120;

    public CarBuilder buildMaker(String maker) {
        this.maker = maker;
        return this;
    }

    public CarBuilder buildTransmission(SimpleCar.Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public CarBuilder buildMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public SimpleCar build() {
        SimpleCar simpleCar = new SimpleCar();
        simpleCar.setMaker(maker);
        simpleCar.setMaxSpeed(maxSpeed);
        simpleCar.setTransmission(transmission);
        return simpleCar;
    }
}
