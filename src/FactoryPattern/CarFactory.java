package FactoryPattern;

/**
 *
 * @author Black
 */
public interface CarFactory {

    public CEngine addEngine();
    public CWheels addWheels();
}
