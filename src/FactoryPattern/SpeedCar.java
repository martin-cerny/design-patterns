package FactoryPattern;

/**
 *
 * @author Black
 */
public class SpeedCar extends Car{

    CarFactory carFactory;

    public SpeedCar(CarFactory carFactory) {
        this.carFactory = carFactory;
    }
    
    @Override
    void makeCar() {
        System.out.print("Making car " + getName());
        
        engine = carFactory.addEngine();
        wheels = carFactory.addWheels();
    }

}
