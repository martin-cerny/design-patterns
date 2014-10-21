package Builder;

import java.awt.Robot;

/**
 *
 * @author Black
 */
public class OldCarBuilder implements CarBuilder{
    
    private Car car;

    public OldCarBuilder() {
        this.car = new Car();
    }
    
    @Override
    public void buildCarDoors() {
        car.setCarDoors("bulletproof");
    }

    @Override
    public void buildCarWheels() {
        car.setCarWheels("with studs");
    }

    @Override
    public void buildCarEngine() {
        car.setCarEngine("V6");
    }

    @Override
    public void buildCarBoonet() {
        car.setCarBoonet("carbon");
    }

    @Override
    public Car getCar() {
        return car;
    }
    
}
