package FactoryPattern;

/**
 *
 * @author Black
 */
public class SpeedCarFactory implements CarFactory{

    @Override
    public CEngine addEngine() {
        return new CSEngine();
    }

    @Override
    public CWheels addWheels() {
        return new CSWheels();
    }   
}
