package FactoryPattern;

/**
 *
 * @author Black
 */
public class SpeedFerrariCar extends Car{

    CarFactory carFactory;

    public SpeedFerrariCar(CarFactory carFactory) {
        this.carFactory = carFactory;
    }
    
    @Override
    void makeCar() {
        System.out.println("Making car " + getName());
        
        engine = carFactory.addEngine();
        wheels = carFactory.addWheels();
    }
}
