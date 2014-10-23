package FactoryPattern;

/**
 *
 * @author Black
 */
public class SpeedFerrariCarFactory implements CarFactory {

    @Override
    public CEngine addEngine() {
        return new CSFEngine();
    }

    @Override
    public CWheels addWheels() {
        return new CSFWheels();
    }
    
}
