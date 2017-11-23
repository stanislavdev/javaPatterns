package CreationalPatterns.Builder;

/**
 * Created by dvsta on 23.11.2017.
 */
abstract class CarBuilder {
    Car car;

    void createCar() {
        car = new Car();
    }

    abstract void buildMaker();
    abstract void buildTransmission();
    abstract void buildMaxSpeed();

    Car getCar(){
        return car;
    }

}
