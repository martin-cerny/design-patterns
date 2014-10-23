package FactoryPattern;

/**
 *
 * @author Black
 */
public abstract class CarBuilding {

    protected abstract Car makeCar(String typeOfCar);
    
    public Car orderTheCar(String typeOfCar){
    
        Car theCar = makeCar(typeOfCar);
        
        theCar.makeCar();
        theCar.displayCar();
        theCar.folowFirstCar();
        theCar.overtakeCar();
            
        return theCar;
    }
}
