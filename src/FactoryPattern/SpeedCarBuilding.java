package FactoryPattern;

/**
 *
 * @author Black
 */
public class SpeedCarBuilding extends CarBuilding{
    
    @Override
    protected Car makeCar(String typeOfCar) {
        Car theCar = null;
        
        if(typeOfCar.equals("Speed")) {
            CarFactory carPartsFactory = new SpeedCarFactory();
            theCar = new SpeedCar(carPartsFactory);
            theCar.setName("Speed Car");
        } else {
            if (typeOfCar.equals("Ferrari")) {
                CarFactory carPartsFactory = new SpeedFerrariCarFactory();
                theCar = new SpeedFerrariCar(carPartsFactory);
                theCar.setName("Speed Ferrari Car");                
            }
        }  
        return theCar; 
    }
}
